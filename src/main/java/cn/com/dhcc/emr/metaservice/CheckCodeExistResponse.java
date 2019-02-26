
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "checkCodeExistResult"
})
@XmlRootElement(name = "CheckCodeExistResponse")
public class CheckCodeExistResponse {

    @XmlElement(name = "CheckCodeExistResult", required = true)
    protected String checkCodeExistResult;

    public String getCheckCodeExistResult() {
        return checkCodeExistResult;
    }

    public void setCheckCodeExistResult(String value) {
        this.checkCodeExistResult = value;
    }

}
