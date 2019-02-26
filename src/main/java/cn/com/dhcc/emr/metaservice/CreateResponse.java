
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "createResult"
})
@XmlRootElement(name = "CreateResponse")
public class CreateResponse {

    @XmlElement(name = "CreateResult", required = true)
    protected String createResult;

    public String getCreateResult() {
        return createResult;
    }

    public void setCreateResult(String value) {
        this.createResult = value;
    }

}
