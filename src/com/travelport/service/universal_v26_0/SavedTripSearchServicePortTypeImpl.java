
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.universal_v26_0;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-04-08T11:02:25.251-06:00
 * Generated source version: 2.7.10
 * 
 */

@javax.jws.WebService(
                      serviceName = "SavedTripSearchService",
                      portName = "SavedTripSearchServicePort",
                      targetNamespace = "http://www.travelport.com/service/universal_v26_0",
                      wsdlLocation = "file:/C:/Travelport/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/wsdl/universal_v26_0/UniversalRecord.wsdl",
                      endpointInterface = "com.travelport.service.universal_v26_0.SavedTripSearchServicePortType")
                      
public class SavedTripSearchServicePortTypeImpl implements SavedTripSearchServicePortType {

    private static final Logger LOG = Logger.getLogger(SavedTripSearchServicePortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.universal_v26_0.SavedTripSearchServicePortType#service(com.travelport.schema.universal_v26_0.SavedTripSearchReq  parameters ,)com.travelport.schema.universal_v26_0.SupportedVersions  supportedVersions )*
     */
    public com.travelport.schema.universal_v26_0.SavedTripSearchRsp service(com.travelport.schema.universal_v26_0.SavedTripSearchReq parameters,com.travelport.schema.universal_v26_0.SupportedVersions supportedVersions) throws UniversalRecordFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        System.out.println(supportedVersions);
        try {
            com.travelport.schema.universal_v26_0.SavedTripSearchRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new UniversalRecordFaultMessage("UniversalRecordFaultMessage...");
    }

}
