
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.hotel_v26_0;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-04-08T10:53:18.620-06:00
 * Generated source version: 2.7.10
 * 
 */

@javax.jws.WebService(
                      serviceName = "HotelService",
                      portName = "HotelRulesServicePort",
                      targetNamespace = "http://www.travelport.com/service/hotel_v26_0",
                      wsdlLocation = "file:/C:/Travelport/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/wsdl/hotel_v26_0/Hotel.wsdl",
                      endpointInterface = "com.travelport.service.hotel_v26_0.HotelRulesServicePortType")
                      
public class HotelRulesServicePortTypeImpl implements HotelRulesServicePortType {

    private static final Logger LOG = Logger.getLogger(HotelRulesServicePortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.hotel_v26_0.HotelRulesServicePortType#service(com.travelport.schema.hotel_v26_0.HotelRulesReq  parameters )*
     */
    public com.travelport.schema.hotel_v26_0.HotelRulesRsp service(com.travelport.schema.hotel_v26_0.HotelRulesReq parameters) throws HotelFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.hotel_v26_0.HotelRulesRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new HotelFaultMessage("HotelFaultMessage...");
    }

}
