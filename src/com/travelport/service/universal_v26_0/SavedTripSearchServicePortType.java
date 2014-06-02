package com.travelport.service.universal_v26_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-04-08T11:02:25.403-06:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/universal_v26_0", name = "SavedTripSearchServicePortType")
@XmlSeeAlso({com.travelport.schema.vehicle_v26_0.ObjectFactory.class, com.travelport.schema.hotel_v26_0.ObjectFactory.class, com.travelport.schema.universal_v26_0.ObjectFactory.class, com.travelport.schema.rail_v26_0.ObjectFactory.class, com.travelport.schema.common_v26_0.ObjectFactory.class, com.travelport.schema.air_v26_0.ObjectFactory.class, com.travelport.schema.passive_v26_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SavedTripSearchServicePortType {

    @WebResult(name = "SavedTripSearchRsp", targetNamespace = "http://www.travelport.com/schema/universal_v26_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/SavedTripSearchService")
    public com.travelport.schema.universal_v26_0.SavedTripSearchRsp service(
        @WebParam(partName = "parameters", name = "SavedTripSearchReq", targetNamespace = "http://www.travelport.com/schema/universal_v26_0")
        com.travelport.schema.universal_v26_0.SavedTripSearchReq parameters,
        @WebParam(partName = "supportedVersions", name = "SupportedVersions", targetNamespace = "http://www.travelport.com/schema/universal_v26_0", header = true)
        com.travelport.schema.universal_v26_0.SupportedVersions supportedVersions
    ) throws UniversalRecordFaultMessage;
}
