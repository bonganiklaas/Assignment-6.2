/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Domain;

import com.mycompany.domain.OrderItem;
import com.mycompany.repository.OrderItemRepository;
import com.mycompany.repository.OrderItemRepository;
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
 * @author Khulsum
 */
public class OrderItemRepositoryTest {
    
  
    private Long id;
    private OrderItemRepository repo;
    
    public OrderItemRepositoryTest() {
    }
    
    @Test
    public void createItem(){
    
       OrderItem item = new OrderItem.Builder(1)
                       .build();
        repo.save(item);
        id  = item.getId();
        OrderItem i = repo.findOne(id);
       Assert.assertNotNull(i);
     }
    
   
     @Test (dependsOnMethods = "createItem")
     public void readItem(){
         OrderItem i = repo.findOne(id);
         Assert.assertEquals(i.getQuantity(), 1);
         
     }
     @Test (dependsOnMethods ="readItem")
     public void updateItem(){
         OrderItem i = repo.findOne(id);
         OrderItem updateitem = new OrderItem.Builder(3)
                                .id(id)
                                .build();
         repo.save(updateitem);
         OrderItem newItem = repo.findOne(id);
         Assert.assertEquals(newItem.getQuantity(), 3);
                 
     }
     
     @Test(dependsOnMethods = "updateItem")
     public void deleteItem(){
         OrderItem i = repo.findOne(id);
         repo.delete(i);
         OrderItem deletedItem = repo.findOne(id);
         Assert.assertNull(deletedItem);
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
