
package com.travelport.service.hotel_v26_0;

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
 * 2014-04-08T10:53:18.472-06:00
 * Generated source version: 2.7.10
 * 
 */
public final class HotelSearchAvailabilityAsynchServicePortType_HotelSearchAvailabilityAsynchServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.travelport.com/service/hotel_v26_0", "HotelService");

    private HotelSearchAvailabilityAsynchServicePortType_HotelSearchAvailabilityAsynchServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = HotelService.WSDL_LOCATION;
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
      
        HotelService ss = new HotelService(wsdlURL, SERVICE_NAME);
        HotelSearchAvailabilityAsynchServicePortType port = ss.getHotelSearchAvailabilityAsynchServicePort();  
        
        {
        System.out.println("Invoking service...");
        com.travelport.schema.hotel_v26_0.BaseHotelSearchReq _service_parameters = null;
        try {
            com.travelport.schema.hotel_v26_0.HotelSearchAvailabilityAsynchRsp _service__return = port.service(_service_parameters);
            System.out.println("service.result=" + _service__return);

        } catch (HotelFaultMessage e) { 
            System.out.println("Expected exception: HotelFaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
