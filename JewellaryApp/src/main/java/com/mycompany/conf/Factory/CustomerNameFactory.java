/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conf.Factory;

import com.mycompany.domain.CustomerName;

/**
 *
 * @author BONGANI
 */
public class CustomerNameFactory {
    
    
    public static CustomerName createCustomerName (String lastname, String firstname, int identirynumber)
    {
         CustomerName name = new CustomerName
                 .Builder(identirynumber).lastName(lastname).firstName(firstname)
                 .build();
                     
        return name;
    }
    
}
