/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.domain.CreditCard;
import com.mycompany.repository.CreditCardRepository;
import com.mycompany.services.CreditService;
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


public class CreditServiceTest {
    
    public static ApplicationContext ctx;
    public CreditService service;
    public CreditCardRepository repo;
    
    public CreditServiceTest() {
    }

    public void FindCredit(){
    
        
        CreditCard cNum = new CreditCard();
        Date Date =  null;
       CreditCard c = new CreditCard.Builder(12382)
                          .balance(2000)
                          .expiryDate(Date)                   
                          .build();
       repo.save(c);
   
        
          double customer = service.getCreditBalance(12382);
          Assert.assertEquals(customer,"200");
         
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
