
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
 *         &lt;element name="AEImageItem" type="{http://www.dhcc.com.cn/emr/metaservice}EItem" minOccurs="0"/&gt;
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
    "aeImageItem"
})
@XmlRootElement(name = "Create")
public class Create {

    @XmlElement(name = "AEImageItem")
    protected EItem aeImageItem;

    /**
     * ��ȡaeImageItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EItem }
     *     
     */
    public EItem getAEImageItem() {
        return aeImageItem;
    }

    /**
     * ����aeImageItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EItem }
     *     
     */
    public void setAEImageItem(EItem value) {
        this.aeImageItem = value;
    }

}