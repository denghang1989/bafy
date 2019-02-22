package cn.com.dhcc.bafy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import cn.com.dhcc.bafy.entity.EMRmetaImageItem;
import cn.com.dhcc.bafy.service.FileUploadService;
import cn.com.dhcc.emr.metaservice.EItem;
import cn.com.dhcc.emr.metaservice.ImageBOItemInfo;


@Controller
@RequestMapping("/upload")
public class FileUploadController {

    @Resource
    private FileUploadService mFileUploadService;

    @Resource
    private ImageBOItemInfo mImageBOItemInfo;

    @PostMapping("/file")
    @ResponseBody
    public void fileUpload(@RequestParam("file") MultipartFile[] files, @RequestParam("eposideId") String eposideId) {
        Arrays.stream(files).forEach(new Consumer<MultipartFile>() {
            @Override
            public void accept(MultipartFile multipartFile) {
                EItem item = mFileUploadService.handleFile(multipartFile, files.length);
                if (item.getCode() != null) {
                    String code = mImageBOItemInfo.getImageBOItemInfoSoap().create(item);
                    mFileUploadService.insert(eposideId, item.getCode());
                }
            }
        });
    }

    @RequestMapping("/fileUpload")
    public ModelAndView html(@RequestParam("eposideId") String eposideId, ModelAndView modelAndView) {
        modelAndView.addObject("eposideId", eposideId);
        modelAndView.setViewName("fileupload");
        return modelAndView;
    }

    @GetMapping("/imageList")
    @ResponseBody
    public List<EMRmetaImageItem> getImageListByEposideId(@RequestParam("eposideId") String eposideId) {
        List<EMRmetaImageItem> imageListByEposideId = mFileUploadService.findImageListByEposideId(eposideId);
        return imageListByEposideId;
    }

    @GetMapping("/image")
    @ResponseBody
    public void getImage(@RequestParam("Id") String id, HttpServletResponse response) throws IOException {
        byte[] bytes = mFileUploadService.findImageById(id);
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(bytes);
        outputStream.flush();
        outputStream.close();
    }

}
