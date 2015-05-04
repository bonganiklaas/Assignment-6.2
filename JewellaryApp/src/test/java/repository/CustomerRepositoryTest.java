/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository;

import com.mycompany.conf.ConnectionConfig;
import com.mycompany.domain.Customer;
import com.mycompany.domain.CustomerName;
import com.mycompany.repository.CustomerRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
    
    public static ApplicationContext ctx;
    private Long id;
    private CustomerRepository repo;
   
    
    @Test
     public void createCustomer() {
         
         CustomerName name = new CustomerName();
         name.setFirstName("Zola");
         name.setLastName("Andile");
         
         repo = ctx.getBean(CustomerRepository.class);
         Customer c = new Customer.Builder("klaasbongani22@gmail.com")
                     .name(name)
                     .build();
         repo.save(c);
         id = c.getId();
         Assert.assertNotNull(c);
   
     }

      
     @Test(dependsOnMethods = "createCustomer")
     public void readCustomer(){
         repo = ctx.getBean(CustomerRepository.class);
         Customer customer = repo.findOne(id);
         Assert.assertEquals(customer.getName().getFirstName(), "bruce");
         
     }
     
    @Test(dependsOnMethods = "readCustomer")
     private void updateCustomer(){
         CustomerName name = new CustomerName();
         name.setFirstName("Bongani");
         repo = ctx.getBean(CustomerRepository.class);
         Customer customer = repo.findOne(id);
         Customer updatedCustomer = new Customer.Builder("klaasbongani22@gmail.com")
                 .name(name)
                 .build();
        
         repo.save(updatedCustomer);
         
         Customer newCustomer = repo.findOne(id);
         Assert.assertEquals(newCustomer.getName().getFirstName(),"Bongani");
         
     }
     
     @Test(dependsOnMethods = "updateCustomer")
     private void deleteCustomer(){
         repo = ctx.getBean(CustomerRepository.class);
         Customer customer = repo.findOne(id);
         repo.delete(customer);
         
         Customer deletedCustomer = repo.findOne(id);
         
         Assert.assertNull(deletedCustomer);
      }
     
    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
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
