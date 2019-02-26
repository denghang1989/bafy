
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aFigureID",
    "aFigureType"
})
@XmlRootElement(name = "CheckImageItemPublished")
public class CheckImageItemPublished {

    @XmlElement(name = "AFigureID")
    protected String aFigureID;
    @XmlElement(name = "AFigureType")
    protected String aFigureType;

    public String getAFigureID() {
        return aFigureID;
    }

    public void setAFigureID(String value) {
        this.aFigureID = value;
    }

    public String getAFigureType() {
        return aFigureType;
    }

    public void setAFigureType(String value) {
        this.aFigureType = value;
    }

}
