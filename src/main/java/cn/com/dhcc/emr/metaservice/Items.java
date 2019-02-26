
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Items", propOrder = {
    "item"
})
public class Items {

    @XmlElement(name = "Item")
    protected ArrayOfEItemEItem item;

    public ArrayOfEItemEItem getItem() {
        return item;
    }

    public void setItem(ArrayOfEItemEItem value) {
        this.item = value;
    }

}
