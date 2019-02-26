
package cn.com.dhcc.epr.metaservice.imageeitemdataset;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getByImageTreeID"
})
@XmlRootElement(name = "EItemDataSet")
public class EItemDataSet {

    @XmlElement(name = "GetByImageTreeID")
    protected List<EItemDataSet.GetByImageTreeID> getByImageTreeID;


    public List<EItemDataSet.GetByImageTreeID> getGetByImageTreeID() {
        if (getByImageTreeID == null) {
            getByImageTreeID = new ArrayList<EItemDataSet.GetByImageTreeID>();
        }
        return this.getByImageTreeID;
    }



    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "code",
        "name",
        "description",
        "categoryID",
        "sequence",
        "imageType",
        "isPublish"
    })
    public static class GetByImageTreeID {

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
        @XmlElement(name = "Sequence")
        protected String sequence;
        @XmlElement(name = "ImageType")
        protected String imageType;
        @XmlElement(name = "IsPublish")
        protected String isPublish;

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

        public String getSequence() {
            return sequence;
        }

        public void setSequence(String value) {
            this.sequence = value;
        }

        public String getImageType() {
            return imageType;
        }

        public void setImageType(String value) {
            this.imageType = value;
        }

        public String getIsPublish() {
            return isPublish;
        }

        public void setIsPublish(String value) {
            this.isPublish = value;
        }

    }

}
