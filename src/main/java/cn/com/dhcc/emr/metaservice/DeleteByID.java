
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aImageItemID"
})
@XmlRootElement(name = "DeleteByID")
public class DeleteByID {

    @XmlElement(name = "AImageItemID")
    protected String aImageItemID;

    public String getAImageItemID() {
        return aImageItemID;
    }

    public void setAImageItemID(String value) {
        this.aImageItemID = value;
    }

}
