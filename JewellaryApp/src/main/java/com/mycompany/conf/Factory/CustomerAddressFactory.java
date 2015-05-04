/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conf.Factory;

import com.mycompany.domain.CustomerAddress;

/**
 *
 * @author BONGANI
 */
public class CustomerAddressFactory {
    
     public static CustomerAddress createCustomerAddress (int code, String streetAddress)
    {
         CustomerAddress address = new CustomerAddress
                 .Builder(streetAddress)
                 .postalAddress(code)
                 .build();                
                     
        return address;
    }
    
}
