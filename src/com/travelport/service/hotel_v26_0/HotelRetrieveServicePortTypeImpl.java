
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.hotel_v26_0;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-04-08T10:53:18.583-06:00
 * Generated source version: 2.7.10
 * 
 */

@javax.jws.WebService(
                      serviceName = "HotelService",
                      portName = "HotelRetrieveServicePort",
                      targetNamespace = "http://www.travelport.com/service/hotel_v26_0",
                      wsdlLocation = "file:/C:/Travelport/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/wsdl/hotel_v26_0/Hotel.wsdl",
                      endpointInterface = "com.travelport.service.hotel_v26_0.HotelRetrieveServicePortType")
                      
public class HotelRetrieveServicePortTypeImpl implements HotelRetrieveServicePortType {

    private static final Logger LOG = Logger.getLogger(HotelRetrieveServicePortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.hotel_v26_0.HotelRetrieveServicePortType#service(com.travelport.schema.hotel_v26_0.HotelRetrieveReq  parameters )*
     */
    public com.travelport.schema.hotel_v26_0.HotelRetrieveRsp service(com.travelport.schema.hotel_v26_0.HotelRetrieveReq parameters) throws HotelFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.hotel_v26_0.HotelRetrieveRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new HotelFaultMessage("HotelFaultMessage...");
    }

}
