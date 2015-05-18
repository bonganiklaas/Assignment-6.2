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
     public static CreditCard createCreditCard(/*Map<String, String> values,*/ int creditNumber, double balance,String name/*, Date expiryDate ,List<Orders> order, List <CreditCard> creditCard*/) 
     {
         CreditCard creditcard = new CreditCard
                 .Builder(creditNumber)
                 .balance(balance)
                 .owner(name)
                 .build();                 
         
         return creditcard;
     
      }

    public static Object Builder(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
