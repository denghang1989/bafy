
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetItemsByTreeIDResult" type="{http://www.dhcc.com.cn/emr/metaservice}Items"/&gt;
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
    "getItemsByTreeIDResult"
})
@XmlRootElement(name = "GetItemsByTreeIDResponse")
public class GetItemsByTreeIDResponse {

    @XmlElement(name = "GetItemsByTreeIDResult", required = true)
    protected Items getItemsByTreeIDResult;

    /**
     * ��ȡgetItemsByTreeIDResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Items }
     *     
     */
    public Items getGetItemsByTreeIDResult() {
        return getItemsByTreeIDResult;
    }

    /**
     * ����getItemsByTreeIDResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Items }
     *     
     */
    public void setGetItemsByTreeIDResult(Items value) {
        this.getItemsByTreeIDResult = value;
    }

}
