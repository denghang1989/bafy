package cn.com.dhcc.bafy.webservice;

import cn.com.dhcc.emr.metaservice.EItem;
import cn.com.dhcc.emr.metaservice.ImageBOItemInfo;
import cn.com.dhcc.emr.metaservice.ImageBOItemInfoSoap;

//EMRservice.Image.BOItem
public class Test {

    public static void main(String[] args) {
        ImageBOItemInfo imageBOItemInfo = new ImageBOItemInfo();
        ImageBOItemInfoSoap infoSoap = imageBOItemInfo.getImageBOItemInfoSoap();
        EItem entity = infoSoap.getEntity("3");
        System.out.println(entity);
    }
}
