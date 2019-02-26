
package cn.com.dhcc.emr.metaservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEItemEItem", propOrder = {
    "eItem"
})
public class ArrayOfEItemEItem {

    @XmlElement(name = "EItem", nillable = true)
    protected List<EItem> eItem;

    public List<EItem> getEItem() {
        if (eItem == null) {
            eItem = new ArrayList<EItem>();
        }
        return this.eItem;
    }

}
