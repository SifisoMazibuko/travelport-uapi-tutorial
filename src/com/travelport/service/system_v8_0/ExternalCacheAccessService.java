package com.travelport.service.system_v8_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-04-08T10:54:07.794-06:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "ExternalCacheAccessService", 
                  wsdlLocation = "file:/C:/Travelport/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/wsdl/system_v8_0/System.wsdl",
                  targetNamespace = "http://www.travelport.com/service/system_v8_0") 
public class ExternalCacheAccessService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/system_v8_0", "ExternalCacheAccessService");
    public final static QName ExternalCacheAccessPort = new QName("http://www.travelport.com/service/system_v8_0", "ExternalCacheAccessPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Travelport/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/wsdl/system_v8_0/System.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ExternalCacheAccessService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Travelport/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/wsdl/system_v8_0/System.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ExternalCacheAccessService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ExternalCacheAccessService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExternalCacheAccessService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ExternalCacheAccessPortType
     */
    @WebEndpoint(name = "ExternalCacheAccessPort")
    public ExternalCacheAccessPortType getExternalCacheAccessPort() {
        return super.getPort(ExternalCacheAccessPort, ExternalCacheAccessPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExternalCacheAccessPortType
     */
    @WebEndpoint(name = "ExternalCacheAccessPort")
    public ExternalCacheAccessPortType getExternalCacheAccessPort(WebServiceFeature... features) {
        return super.getPort(ExternalCacheAccessPort, ExternalCacheAccessPortType.class, features);
    }

}
