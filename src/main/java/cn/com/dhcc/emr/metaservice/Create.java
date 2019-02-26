
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aeImageItem"
})
@XmlRootElement(name = "Create")
public class Create {

    @XmlElement(name = "AEImageItem")
    protected EItem aeImageItem;

    public EItem getAEImageItem() {
        return aeImageItem;
    }

    public void setAEImageItem(EItem value) {
        this.aeImageItem = value;
    }

}
