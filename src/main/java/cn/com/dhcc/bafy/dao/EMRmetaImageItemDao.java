package cn.com.dhcc.bafy.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import cn.com.dhcc.bafy.entity.EMRmetaImageItem;

@Repository
public interface EMRmetaImageItemDao {

    void insert(@Param("EposideId") String eposideId, @Param("ImageCode") String imageCode);

    List<EMRmetaImageItem> findImageListByEposideId(@Param("EposideId") String eposideId);

    EMRmetaImageItem findImageById(@Param("ID") String id);
}
