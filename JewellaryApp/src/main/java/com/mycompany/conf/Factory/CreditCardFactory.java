/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conf.Factory;

import com.mycompany.domain.CreditCard;
import com.mycompany.domain.Orders;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author BONGANI
 */
public class CreditCardFactory {
    
    //Create a Credit card with Name, balance, expiry date and credit Number 
     public static CreditCard createCreditCard(Map<String, String> values, int creditNumber, double balance, Date expiryDate, List<Orders> order, List <CreditCard> creditCard) 
     {
         CreditCard creditcard = new CreditCard
                 .Builder(creditNumber)
                 .balance(balance)
                 .copy(null)
                 .build();                 
         
         return creditcard;
     
      }
}
