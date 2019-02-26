
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateResult"
})
@XmlRootElement(name = "UpdateResponse")
public class UpdateResponse {

    @XmlElement(name = "UpdateResult", required = true)
    protected String updateResult;

    public String getUpdateResult() {
        return updateResult;
    }

    public void setUpdateResult(String value) {
        this.updateResult = value;
    }

}
