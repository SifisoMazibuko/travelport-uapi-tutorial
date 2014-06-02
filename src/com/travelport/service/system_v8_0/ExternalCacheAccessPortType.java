package com.travelport.service.system_v8_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-04-08T10:54:07.756-06:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/system_v8_0", name = "ExternalCacheAccessPortType")
@XmlSeeAlso({com.travelport.schema.system_v8_0.ObjectFactory.class, com.travelport.schema.common_v12_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ExternalCacheAccessPortType {

    @WebResult(name = "ExternalCacheAccessRsp", targetNamespace = "http://www.travelport.com/schema/system_v8_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/ExternalCacheAccessService")
    public com.travelport.schema.system_v8_0.ExternalCacheAccessRsp service(
        @WebParam(partName = "parameters", name = "ExternalCacheAccessReq", targetNamespace = "http://www.travelport.com/schema/system_v8_0")
        com.travelport.schema.system_v8_0.ExternalCacheAccessReq parameters
    ) throws SystemFaultMessage;
}
