/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conf.conf.Factory;

import com.mycompany.domain.CreditCard;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author BONGANI
 */
public class CreditCardFactory {
    
    //Create a Credit card with Name, balance, expiry date and credit Number 
     public static CreditCard getCreditCard(Map<String, String> details, BigDecimal balance, Date expiryDate) 
     {
         CreditCard creditCard = new CreditCard();
        // creditCard.setCreditNumber(details.get("number"));
         creditCard.setNameOnCreditCard(details.get("name"));
         creditCard.setBalance(balance);
         creditCard.setExpiryDate(expiryDate);
        return creditCard;
    
      }
}
