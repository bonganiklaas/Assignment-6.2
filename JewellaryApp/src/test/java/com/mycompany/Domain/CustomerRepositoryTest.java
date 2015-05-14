/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Domain;

import com.mycompany.domain.Customer;
import com.mycompany.domain.CustomerName;
import com.mycompany.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Bongani
 */
public class CustomerRepositoryTest {
      
    private Long id;
 
    @Autowired
    CustomerRepository repository;
   
    /*
    @Test
     public void createCustomer() {
         
         CustomerName name = new CustomerName();
         name.setFirstName("Zola");
         name.setLastName("Andile");
         
         //repo = ctx.getBean(CustomerRepository.class);
         Customer c = new Customer.Builder("klaasbongani22@gmail.com")
                     .name(name)
                     .build();
                     repository.save(c);
                     id = c.getId();
                     Assert.assertNotNull(c);
   
     }

      
     @Test(dependsOnMethods = "createCustomer")
     public void readCustomer(){
       //  repo = ctx.getBean(CustomerRepository.class);
         Customer customer = repository.findOne(id);
         Assert.assertEquals(customer.getName().getFirstName(), "bruce");
         
     }
     
    @Test(dependsOnMethods = "readCustomer")
     private void updateCustomer(){
         CustomerName name = new CustomerName();
         name.setFirstName("Bongani");
         
         Customer customer = repository.findOne(id);
         Customer updatedCustomer = new Customer.Builder("klaasbongani22@gmail.com")
                 .name(name)
                 .build();
        
         repository.save(updatedCustomer);
          Customer newCustomer = repository.findOne(id);
         Assert.assertEquals(newCustomer.getName().getFirstName(),"Bongani");
         
     }
     
     @Test(dependsOnMethods = "updateCustomer")
     private void deleteCustomer(){
         
         Customer customer = repository.findOne(id);
         repository.delete(customer);
         
         Customer deletedCustomer = repository.findOne(id);
         
         Assert.assertNull(deletedCustomer);
      }
     
    */
    
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
