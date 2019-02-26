
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getByImageTreeIDResult"
})
@XmlRootElement(name = "GetByImageTreeIDResponse")
public class GetByImageTreeIDResponse {

    @XmlElement(name = "GetByImageTreeIDResult", required = true)
    protected EItemDataSet getByImageTreeIDResult;

    public EItemDataSet getGetByImageTreeIDResult() {
        return getByImageTreeIDResult;
    }

    public void setGetByImageTreeIDResult(EItemDataSet value) {
        this.getByImageTreeIDResult = value;
    }

}
