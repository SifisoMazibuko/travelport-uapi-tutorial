
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.vehicle_v26_0;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-04-08T10:54:46.798-06:00
 * Generated source version: 2.7.10
 * 
 */

@javax.jws.WebService(
                      serviceName = "VehicleService",
                      portName = "VehicleUpsellSearchServicePort",
                      targetNamespace = "http://www.travelport.com/service/vehicle_v26_0",
                      wsdlLocation = "file:/C:/Travelport/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/wsdl/vehicle_v26_0/Vehicle.wsdl",
                      endpointInterface = "com.travelport.service.vehicle_v26_0.VehicleUpsellSearchServicePortType")
                      
public class VehicleUpsellSearchServicePortTypeImpl implements VehicleUpsellSearchServicePortType {

    private static final Logger LOG = Logger.getLogger(VehicleUpsellSearchServicePortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.vehicle_v26_0.VehicleUpsellSearchServicePortType#service(com.travelport.schema.vehicle_v26_0.VehicleUpsellSearchAvailabilityReq  parameters )*
     */
    public com.travelport.schema.vehicle_v26_0.VehicleUpsellSearchAvailabilityRsp service(com.travelport.schema.vehicle_v26_0.VehicleUpsellSearchAvailabilityReq parameters) throws VehicleFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.vehicle_v26_0.VehicleUpsellSearchAvailabilityRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new VehicleFaultMessage("VehicleFaultMessage...");
    }

}
