/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conf.Factory;

import com.mycompany.domain.SupplierContact;

/**
 *
 * @author BONGANI
 */
public class SupplierContactFactory {
    public static SupplierContact createSupplierContact (String phone, int cell, String supplierName, String representative)
    {
         SupplierContact contact = new SupplierContact
                 .Builder().representative(representative)
                 .supplierName(supplierName)
                 .phone(phone)
                 .build();
                     
        return contact;
    }
    
}
