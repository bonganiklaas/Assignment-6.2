package com.mycompany.repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.domain.CreditCard;
import com.mycompany.repository.CreditCardRepository;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 *
 * @author BONGANI
 */
public class TestCreditCard{
   
    private static ApplicationContext ctx;
    private Long id;
    private CreditCardRepository repo;
    
    public TestCreditCard() {
        
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    /**
     *
     */
        
    @Test
    public void createCreditCard(){
      repo = ctx.getBean(CreditCardRepository.class);
      CreditCard c = new CreditCard.Builder(12382)
               .balance(BigDecimal.ZERO)
               .expiryDate(null)
               .owner("bongani")
               .build();
       repo.save(c);
       id = c.getId();
       Assert.assertNotNull(c);
   }
   
   
  @Test //(dependsOnMethods = "createCreditCard")
   public void readCreditCard(){
       repo = ctx.getBean(CreditCardRepository.class);
       CreditCard c = repo.findOne(id);
       Assert.assertEquals(c.getCreditNumber(),12382);
   }
   @Test //(dependsOnMethods = "readCreditCard")
   public void updateCreditCard(){
       repo = ctx.getBean(CreditCardRepository.class);
       CreditCard c = repo.findOne(id);
       CreditCard updateCreditCard = new CreditCard.Builder(12382)
               .copy(c)
               .balance(BigDecimal.ZERO)
               .build();
                                     
       
       repo.save(updateCreditCard);
       CreditCard newCreditCard = repo.findOne(id);
       Assert.assertEquals(newCreditCard.getBalance(), "400");
   }
   
 @Test //(dependsOnMethods = "updateCreditCard")
   public void deleteCreditCard(){
       repo = ctx.getBean(CreditCardRepository.class);
       CreditCard c = repo.findOne(id);
       repo.delete(c);
       CreditCard deleteCreditCard = repo.findOne(id);
       Assert.assertNull(deleteCreditCard);
   }
    
    
     @BeforeClass
    public static void setUpClass() {
          
    }
    
     @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 }
