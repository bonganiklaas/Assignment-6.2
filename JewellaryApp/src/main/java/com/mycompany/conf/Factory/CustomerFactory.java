/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conf.Factory;

import com.mycompany.domain.CreditCard;
import com.mycompany.domain.Customer;
import com.mycompany.domain.Orders;
import java.util.List;
import java.util.Map;

/**
 *
 * @author BONGANI
 */
public class CustomerFactory {
    
     public static Customer createCustomer(Map<String, String> values, String names,String customerNumber,List<Orders> order, List <CreditCard> creditCard) 
     {
         Customer customer = new Customer
                 .Builder(customerNumber)
                 .creditCard(creditCard)
                 .order(order)
                 .names(names)
                 .build();
         return customer;
     
      }
    
}
