
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
 *         &lt;element name="GetEntityResult" type="{http://www.dhcc.com.cn/emr/metaservice}EItem"/&gt;
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
    "getEntityResult"
})
@XmlRootElement(name = "GetEntityResponse")
public class GetEntityResponse {

    @XmlElement(name = "GetEntityResult", required = true)
    protected EItem getEntityResult;

    /**
     * ��ȡgetEntityResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EItem }
     *     
     */
    public EItem getGetEntityResult() {
        return getEntityResult;
    }

    /**
     * ����getEntityResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EItem }
     *     
     */
    public void setGetEntityResult(EItem value) {
        this.getEntityResult = value;
    }

}
