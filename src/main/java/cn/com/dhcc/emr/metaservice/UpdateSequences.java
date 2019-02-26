
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="argStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "argStr"
})
@XmlRootElement(name = "UpdateSequences")
public class UpdateSequences {

    protected String argStr;

    /**
     *
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArgStr() {
        return argStr;
    }

    /**
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArgStr(String value) {
        this.argStr = value;
    }

}
