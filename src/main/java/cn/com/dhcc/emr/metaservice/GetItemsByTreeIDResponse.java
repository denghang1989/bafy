
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getItemsByTreeIDResult"
})
@XmlRootElement(name = "GetItemsByTreeIDResponse")
public class GetItemsByTreeIDResponse {

    @XmlElement(name = "GetItemsByTreeIDResult", required = true)
    protected Items getItemsByTreeIDResult;

    public Items getGetItemsByTreeIDResult() {
        return getItemsByTreeIDResult;
    }

    public void setGetItemsByTreeIDResult(Items value) {
        this.getItemsByTreeIDResult = value;
    }

}
