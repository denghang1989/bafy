
package cn.com.dhcc.emr.metaservice;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EItem", propOrder = {
    "id",
    "code",
    "name",
    "description",
    "categoryID",
    "imageType",
    "imageData",
    "isPublish",
    "sequence"
})
public class EItem {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "CategoryID")
    protected String categoryID;
    @XmlElement(name = "ImageType")
    protected String imageType;
    @XmlElement(name = "ImageData")
    protected byte[] imageData;
    @XmlElement(name = "IsPublish")
    protected String isPublish;
    @XmlElement(name = "Sequence")
    protected String sequence;

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String value) {
        this.categoryID = value;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String value) {
        this.imageType = value;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] value) {
        this.imageData = value;
    }

    public String getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(String value) {
        this.isPublish = value;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String value) {
        this.sequence = value;
    }


    @Override
    public String toString() {
        return "EItem{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", categoryID='" + categoryID + '\'' +
                ", imageType='" + imageType + '\'' +
                ", imageData=" + Arrays.toString(imageData) +
                ", isPublish='" + isPublish + '\'' +
                ", sequence='" + sequence + '\'' +
                '}';
    }
}
