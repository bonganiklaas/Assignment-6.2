/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Domain;

import com.mycompany.domain.Customer;
import com.mycompany.domain.CustomerAddress;
import com.mycompany.repository.CustomerAddressRepository;
import com.mycompany.repository.CustomerAddressRepository;
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
public class CustomerAddressRepositoryTest {

    private Long id;
    public CustomerAddressRepository repo;
    
    
    public CustomerAddressRepositoryTest() {
    }
    
    
    @Test 
    public void createCustAddress(){
        CustomerAddress c = new CustomerAddress.Builder("7 woodburry close")
                             .postalAddress(7515)
                             .build();
        repo.save(c);
        id = c.getId();
        Assert.assertNotNull(c);         
     }
    @Test(dependsOnMethods = "createCustAddress")
     public void readCustAddress(){
     CustomerAddress c = repo.findOne(id);
     Assert.assertEquals(c.getPostalAddress(),"7 woodburry close");
     
    }
    @Test(dependsOnMethods = "readCustAddress")
    public void updateCustAddress(){
        CustomerAddress c = repo.findOne(id);
        CustomerAddress updateCustAddress = new CustomerAddress.Builder("7 woodburry close") 
                                            .customerAddress(c)
                                            .postalAddress(7515)
                                            .build();
        repo.save(updateCustAddress);
        CustomerAddress newCustAddress = repo.findOne(id);
        Assert.assertEquals(newCustAddress.getPostalAddress(),"19 2nd Avenue");
        
    }
    @Test(dependsOnMethods = "updateCustAddress")
    public void deleteCustAddress(){
        CustomerAddress cust = repo.findOne(id);
        repo.delete(cust);
        
        CustomerAddress deletedCusAddress = repo.findOne(id);
        Assert.assertNull(deletedCusAddress);
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
