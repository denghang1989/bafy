
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getChildCountByTreeIDResult"
})
@XmlRootElement(name = "GetChildCountByTreeIDResponse")
public class GetChildCountByTreeIDResponse {

    @XmlElement(name = "GetChildCountByTreeIDResult", required = true)
    protected String getChildCountByTreeIDResult;

    public String getGetChildCountByTreeIDResult() {
        return getChildCountByTreeIDResult;
    }

    public void setGetChildCountByTreeIDResult(String value) {
        this.getChildCountByTreeIDResult = value;
    }

}
