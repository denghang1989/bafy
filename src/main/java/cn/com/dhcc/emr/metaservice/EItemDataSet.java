
package cn.com.dhcc.emr.metaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EItemDataSet", propOrder = {
    "any"
})
public class EItemDataSet {

    @XmlAnyElement(lax = true)
    protected Object any;

    public Object getAny() {
        return any;
    }

    public void setAny(Object value) {
        this.any = value;
    }

}
