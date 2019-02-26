
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aImageTreeID"
})
@XmlRootElement(name = "GetByImageTreeID")
public class GetByImageTreeID {

    @XmlElement(name = "AImageTreeID")
    protected String aImageTreeID;

    public String getAImageTreeID() {
        return aImageTreeID;
    }

    public void setAImageTreeID(String value) {
        this.aImageTreeID = value;
    }

}
