
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateSequencesResult"
})
@XmlRootElement(name = "UpdateSequencesResponse")
public class UpdateSequencesResponse {

    @XmlElement(name = "UpdateSequencesResult", required = true)
    protected String updateSequencesResult;

    public String getUpdateSequencesResult() {
        return updateSequencesResult;
    }

    public void setUpdateSequencesResult(String value) {
        this.updateSequencesResult = value;
    }

}
