
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CheckImageItemPublishedResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "checkImageItemPublishedResult"
})
@XmlRootElement(name = "CheckImageItemPublishedResponse")
public class CheckImageItemPublishedResponse {

    @XmlElement(name = "CheckImageItemPublishedResult", required = true)
    protected String checkImageItemPublishedResult;

    /**
     *
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckImageItemPublishedResult() {
        return checkImageItemPublishedResult;
    }

    /**
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckImageItemPublishedResult(String value) {
        this.checkImageItemPublishedResult = value;
    }

}
