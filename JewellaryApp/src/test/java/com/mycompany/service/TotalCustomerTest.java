/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.domain.Customer;
import com.mycompany.services.TotalCustomerService;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author BONGANI
 */
public class TotalCustomerTest {
    
       
     private TotalCustomerService service;
    
    public TotalCustomerTest() {
    }
     
    //@Test
     public void TotalCustomerTest() {
     
         List<Customer> customer = service.getTotalCustomer();
         Assert.assertEquals(0, customer.size(), "Expect no Customers");
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
