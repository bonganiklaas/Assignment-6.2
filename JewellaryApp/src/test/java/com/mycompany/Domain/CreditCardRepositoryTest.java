/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Domain;

import com.mycompany.conf.Factory.CreditCardFactory;
import com.mycompany.domain.CreditCard;
import java.util.Date;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Bongani
 */
public class CreditCardRepositoryTest {
    
    public CreditCardRepositoryTest() {
    }
    private CreditCard c1 ;
    private CreditCard c;
    
   @Test
   public void createCreditCard(){
      double amount = 12.56;
       Date Date = null;
        c = new CreditCard.Builder(12382).balance(20000)
                          .expiryDate(Date)
                          .owner("clifford")
                          .build();
        c1 = CreditCardFactory.createCreditCard(12369, amount, "Bee");
        Assert.assertNotNull(c1);
   }
   
   @Test(dependsOnMethods = "createCreditCard")
   public void readCreditCard(){
       Assert.assertEquals(c.getCreditNumber(),12382);
       Assert.assertEquals(c1.getCreditNumber(),12369);
   }
   @Test(dependsOnMethods = "readCreditCard")
   public void updateCreditCard(){
       double balance= 1000.00;
       CreditCard updateCreditCard = new CreditCard.Builder(12382)
                                     .copy(c)
                                      .balance(balance)
                                      .build();
       Assert.assertEquals(updateCreditCard.getBalance(), balance, 1000);
       Assert.assertEquals(c.getBalance(), 20000, 10000);
   }
}
