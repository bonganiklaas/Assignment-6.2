/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conf.Factory;

import com.mycompany.domain.SupplierAddress;

/**
 *
 * @author BONGANI
 */
public class SupplierAddressFactory {
    
    public static SupplierAddress createContact (String streetAddress, String postalAddress)
    {
         SupplierAddress contact = new SupplierAddress
                 .Builder().postalAddress(postalAddress)
                 .streetAddress(streetAddress)
                 .build();
                                     
        return contact;
    }
    
}
