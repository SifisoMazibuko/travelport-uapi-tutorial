
package com.travelport.service.air_v26_0;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-04-08T10:46:27.992-06:00
 * Generated source version: 2.7.10
 * 
 */
public final class AirRefundQuotePortType_AirRefundQuotePort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.travelport.com/service/air_v26_0", "AirService");

    private AirRefundQuotePortType_AirRefundQuotePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AirService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        AirService ss = new AirService(wsdlURL, SERVICE_NAME);
        AirRefundQuotePortType port = ss.getAirRefundQuotePort();  
        
        {
        System.out.println("Invoking service...");
        com.travelport.schema.air_v26_0.AirRefundQuoteReq _service_parameters = null;
        try {
            com.travelport.schema.air_v26_0.AirRefundQuoteRsp _service__return = port.service(_service_parameters);
            System.out.println("service.result=" + _service__return);

        } catch (AirFaultMessage e) { 
            System.out.println("Expected exception: AirFaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
