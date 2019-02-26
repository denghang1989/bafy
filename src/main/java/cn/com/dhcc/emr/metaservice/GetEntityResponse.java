
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getEntityResult"
})
@XmlRootElement(name = "GetEntityResponse")
public class GetEntityResponse {

    @XmlElement(name = "GetEntityResult", required = true)
    protected EItem getEntityResult;

    public EItem getGetEntityResult() {
        return getEntityResult;
    }

    public void setGetEntityResult(EItem value) {
        this.getEntityResult = value;
    }

}
