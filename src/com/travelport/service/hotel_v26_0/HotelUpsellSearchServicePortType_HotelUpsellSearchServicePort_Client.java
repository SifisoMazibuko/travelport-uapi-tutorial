
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
 * 2014-04-08T10:53:18.510-06:00
 * Generated source version: 2.7.10
 * 
 */
public final class HotelUpsellSearchServicePortType_HotelUpsellSearchServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.travelport.com/service/hotel_v26_0", "HotelService");

    private HotelUpsellSearchServicePortType_HotelUpsellSearchServicePort_Client() {
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
        HotelUpsellSearchServicePortType port = ss.getHotelUpsellSearchServicePort();  
        
        {
        System.out.println("Invoking service...");
        com.travelport.schema.hotel_v26_0.HotelUpsellDetailsReq _service_parameters = null;
        try {
            com.travelport.schema.hotel_v26_0.HotelUpsellDetailsRsp _service__return = port.service(_service_parameters);
            System.out.println("service.result=" + _service__return);

        } catch (HotelFaultMessage e) { 
            System.out.println("Expected exception: HotelFaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
