
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aImgeItemID"
})
@XmlRootElement(name = "GetEntity")
public class GetEntity {

    @XmlElement(name = "AImgeItemID")
    protected String aImgeItemID;

    public String getAImgeItemID() {
        return aImgeItemID;
    }

    public void setAImgeItemID(String value) {
        this.aImgeItemID = value;
    }

}
