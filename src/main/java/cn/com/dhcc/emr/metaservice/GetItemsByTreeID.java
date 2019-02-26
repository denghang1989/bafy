
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aImageCatID"
})
@XmlRootElement(name = "GetItemsByTreeID")
public class GetItemsByTreeID {

    @XmlElement(name = "AImageCatID")
    protected String aImageCatID;

    public String getAImageCatID() {
        return aImageCatID;
    }

    public void setAImageCatID(String value) {
        this.aImageCatID = value;
    }

}
