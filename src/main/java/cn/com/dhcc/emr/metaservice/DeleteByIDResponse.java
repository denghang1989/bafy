
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deleteByIDResult"
})
@XmlRootElement(name = "DeleteByIDResponse")
public class DeleteByIDResponse {

    @XmlElement(name = "DeleteByIDResult", required = true)
    protected String deleteByIDResult;

    public String getDeleteByIDResult() {
        return deleteByIDResult;
    }

    public void setDeleteByIDResult(String value) {
        this.deleteByIDResult = value;
    }

}
