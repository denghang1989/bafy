package cn.com.dhcc.bafy.entity;

import lombok.Data;

@Data
public class EMRmetaImageItem {

    private int id;

    private String categoryId;

    private String code;

    private String description;

    private byte[] imageData;

    private String imageType;

    private int isPublish;

    private String name;

    private int sequence;

}
