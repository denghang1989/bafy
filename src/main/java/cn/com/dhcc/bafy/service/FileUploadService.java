package cn.com.dhcc.bafy.service;

import net.coobird.thumbnailator.Thumbnails;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import cn.com.dhcc.bafy.dao.EMRmetaImageItemDao;
import cn.com.dhcc.bafy.entity.EMRmetaImageItem;
import cn.com.dhcc.emr.metaservice.EItem;

@Service
public class FileUploadService {

    private File mFileUpload;

    @Resource
    private EMRmetaImageItemDao mDao;

    @PostConstruct
    public void init() {
        mFileUpload = new File("E:\\FileUpload");
        try {
            if (mFileUpload.exists()) {
                FileUtils.cleanDirectory(mFileUpload);
            } else {
                FileUtils.forceMkdir(mFileUpload);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public EItem handleFile(MultipartFile multipartFile, int count) {
        EItem item = new EItem();
        try {
            String filename = multipartFile.getOriginalFilename();
            String contentType = multipartFile.getContentType();
            File disFile = new File(mFileUpload + File.separator + filename);
            multipartFile.transferTo(disFile);
            //图像压缩
            Thumbnails.of(disFile).size(192,108).toFile(disFile);
            //md5
            String code = DigestUtils.md5DigestAsHex(new FileInputStream(disFile));
            //base64
            byte[] fileBuffer = IOUtils.toByteArray(new FileInputStream(disFile));
            Base64 base64 = new Base64();
            byte[] encode = base64.encode(fileBuffer);
            item.setImageType(contentType);
            item.setName(filename);
            item.setDescription(filename);
            item.setCode(code);
            item.setImageData(encode);
            item.setIsPublish("1");
            item.setCategoryID("2");
            FileUtils.deleteQuietly(disFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return item;
    }

    public void insert(String eposideId, String imageCode) {
        mDao.insert(eposideId, imageCode);
    }

    public List<EMRmetaImageItem> findImageListByEposideId(@Param("EposideId") String eposideId) {
        return mDao.findImageListByEposideId(eposideId);
    }

    public byte[] findImageById(String id) {
        EMRmetaImageItem imageItem = mDao.findImageById(id);
        byte[] imageData = imageItem.getImageData();
        Base64 base64 = new Base64();
        return base64.decode(imageData);
    }

}
