/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Domain;

//import com.mycompany.conf.ConnectionConfig;
import com.mycompany.domain.CreditCard;
import com.mycompany.repository.CreditCardRepository;
import com.mycompany.repository.CreditCardRepository;
import java.math.BigDecimal;
import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Bongani
 */
public class CreditCardRepositoryTest {
    
    public CreditCardRepositoryTest() {
    }
    
    private Long id;
    private CreditCardRepository repo;

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
   public void createCreditCard(){
      
        Date Date = null;
       CreditCard c = new CreditCard.Builder(12382)
                          .balance(BigDecimal.ZERO)
                          .expiryDate(Date)
                          .owner("clifford")
                          .build();
       repo.save(c);
       id = c.getId();
       Assert.assertNotNull(c);
   }
   
   @Test(dependsOnMethods = "createCreditCard")
   public void readCreditCard(){
         CreditCard c = repo.findOne(id);
       Assert.assertEquals(c.getCreditNumber(),12382);
   }
   @Test(dependsOnMethods = "readCreditCard")
   public void updateCreditCard(){
       CreditCard c = repo.findOne(id);
       CreditCard updateCreditCard = new CreditCard.Builder(12382)
                                     // .creditCard(c)
                                      .owner("bongani")
                                      .balance(BigDecimal.ZERO)
                                      .build();
       
       repo.save(updateCreditCard);
       CreditCard newCreditCard = repo.findOne(id);
       Assert.assertEquals(newCreditCard.getBalance(), "400");
   }
   
   @Test(dependsOnMethods = "updateCreditCard")
   public void deleteCreditCard(){
       CreditCard c = repo.findOne(id);
       repo.delete(c);
       CreditCard deleteCreditCard = repo.findOne(id);
       Assert.assertNull(deleteCreditCard);
   }
     @BeforeClass
    public static void setUpClass() throws Exception {
    
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
