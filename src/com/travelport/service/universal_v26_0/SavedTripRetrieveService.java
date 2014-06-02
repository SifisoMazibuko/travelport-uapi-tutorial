package com.travelport.service.universal_v26_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-04-08T11:02:25.538-06:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "SavedTripRetrieveService", 
                  wsdlLocation = "file:/C:/Travelport/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/wsdl/universal_v26_0/UniversalRecord.wsdl",
                  targetNamespace = "http://www.travelport.com/service/universal_v26_0") 
public class SavedTripRetrieveService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/universal_v26_0", "SavedTripRetrieveService");
    public final static QName SavedTripRetrieveServicePort = new QName("http://www.travelport.com/service/universal_v26_0", "SavedTripRetrieveServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Travelport/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/wsdl/universal_v26_0/UniversalRecord.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SavedTripRetrieveService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Travelport/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/wsdl/universal_v26_0/UniversalRecord.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SavedTripRetrieveService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SavedTripRetrieveService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SavedTripRetrieveService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns SavedTripRetrieveServicePortType
     */
    @WebEndpoint(name = "SavedTripRetrieveServicePort")
    public SavedTripRetrieveServicePortType getSavedTripRetrieveServicePort() {
        return super.getPort(SavedTripRetrieveServicePort, SavedTripRetrieveServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SavedTripRetrieveServicePortType
     */
    @WebEndpoint(name = "SavedTripRetrieveServicePort")
    public SavedTripRetrieveServicePortType getSavedTripRetrieveServicePort(WebServiceFeature... features) {
        return super.getPort(SavedTripRetrieveServicePort, SavedTripRetrieveServicePortType.class, features);
    }

}
