
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetByImageTreeIDResult" type="{http://www.dhcc.com.cn/emr/metaservice}EItemDataSet"/&gt;
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
    "getByImageTreeIDResult"
})
@XmlRootElement(name = "GetByImageTreeIDResponse")
public class GetByImageTreeIDResponse {

    @XmlElement(name = "GetByImageTreeIDResult", required = true)
    protected EItemDataSet getByImageTreeIDResult;

    /**
     * 获取getByImageTreeIDResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EItemDataSet }
     *     
     */
    public EItemDataSet getGetByImageTreeIDResult() {
        return getByImageTreeIDResult;
    }

    /**
     * 设置getByImageTreeIDResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EItemDataSet }
     *     
     */
    public void setGetByImageTreeIDResult(EItemDataSet value) {
        this.getByImageTreeIDResult = value;
    }

}
