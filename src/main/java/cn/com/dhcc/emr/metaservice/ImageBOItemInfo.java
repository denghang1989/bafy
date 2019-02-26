package cn.com.dhcc.emr.metaservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

@WebServiceClient(name = "ImageBOItemInfo",
                  wsdlLocation = "http://192.168.199.49:57772/dthealth/web/EMRservice.Image.BOItem.cls?wsdl",
                  targetNamespace = "http://www.dhcc.com.cn/emr/metaservice")
public class ImageBOItemInfo extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.dhcc.com.cn/emr/metaservice", "ImageBOItemInfo");
    public final static QName ImageBOItemInfoSoap = new QName("http://www.dhcc.com.cn/emr/metaservice", "ImageBOItemInfoSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.199.49:57772/dthealth/web/EMRservice.Image.BOItem.cls?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ImageBOItemInfo.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://192.168.199.49:57772/dthealth/web/EMRservice.Image.BOItem.cls?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ImageBOItemInfo(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ImageBOItemInfo(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImageBOItemInfo() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ImageBOItemInfo(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ImageBOItemInfo(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ImageBOItemInfo(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ImageBOItemInfoSoap
     */
    @WebEndpoint(name = "ImageBOItemInfoSoap")
    public ImageBOItemInfoSoap getImageBOItemInfoSoap() {
        return super.getPort(ImageBOItemInfoSoap, ImageBOItemInfoSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ImageBOItemInfoSoap
     */
    @WebEndpoint(name = "ImageBOItemInfoSoap")
    public ImageBOItemInfoSoap getImageBOItemInfoSoap(WebServiceFeature... features) {
        return super.getPort(ImageBOItemInfoSoap, ImageBOItemInfoSoap.class, features);
    }

}
