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
import org.testng.annotations.Test;

/**
 *
 * @author Bongani
 */
public class CustomerRepositoryTest {
      
    private Long id;
    private CustomerName name;
   
 
    @Autowired
    CustomerRepository repository;
   

    @Test
     public void createCustomer() {
         
         name = new CustomerName();
         name.setFirstName("Zola");
         name.setLastName("Andile");
         Customer c = new Customer.Builder("klaasbongani22@gmail.com")
                     .name(name)
                     .build();
                     Assert.assertNotNull(c);
   
     }
    
     @Test(dependsOnMethods = "createCustomer")
     public void readCustomer(){
        // Customer customer = repository.findOne(id);
         Assert.assertEquals(name.getFirstName(), "Zola");
         
     }
     
    @Test(dependsOnMethods = "readCustomer")
     private void updateCustomer(){
     
         Customer customer = new Customer.Builder("klaasbongani22@gmail.com")
                 .names("zola")
                 .build();

         Customer newcustomer = new Customer
                 .Builder("12345")
                 .names("bongani")
                 .build();
         
         Assert.assertEquals(null,customer.getName());
         Assert.assertEquals("bongani",newcustomer.getNames());

     }
}
