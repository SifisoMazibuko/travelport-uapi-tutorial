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
 * 2014-04-08T11:02:25.596-06:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "UniversalRecordImportService", 
                  wsdlLocation = "file:/C:/Travelport/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/wsdl/universal_v26_0/UniversalRecord.wsdl",
                  targetNamespace = "http://www.travelport.com/service/universal_v26_0") 
public class UniversalRecordImportService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/universal_v26_0", "UniversalRecordImportService");
    public final static QName UniversalRecordImportServicePort = new QName("http://www.travelport.com/service/universal_v26_0", "UniversalRecordImportServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Travelport/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/wsdl/universal_v26_0/UniversalRecord.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UniversalRecordImportService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Travelport/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/wsdl/universal_v26_0/UniversalRecord.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UniversalRecordImportService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UniversalRecordImportService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UniversalRecordImportService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns UniversalRecordImportServicePortType
     */
    @WebEndpoint(name = "UniversalRecordImportServicePort")
    public UniversalRecordImportServicePortType getUniversalRecordImportServicePort() {
        return super.getPort(UniversalRecordImportServicePort, UniversalRecordImportServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UniversalRecordImportServicePortType
     */
    @WebEndpoint(name = "UniversalRecordImportServicePort")
    public UniversalRecordImportServicePortType getUniversalRecordImportServicePort(WebServiceFeature... features) {
        return super.getPort(UniversalRecordImportServicePort, UniversalRecordImportServicePortType.class, features);
    }

}
