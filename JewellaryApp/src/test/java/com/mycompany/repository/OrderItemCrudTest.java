/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.repository;

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
 * @author Bongani
 */
public class OrderItemCrudTest {
    
  
    private Long id;
   
    public OrderItemCrudTest() {
    }
    
    @Test
    public void createItem(){
    
       OrderItem item = new OrderItem.Builder(1)
                       .build();
           Assert.assertNotNull(item);
     }

     @Test (dependsOnMethods ="createItem")
     public void updateItem(){
        OrderItem updateitem = new OrderItem.Builder(3)
                                .id(id)
                                .build();
         Assert.assertEquals(updateitem.getQuantity(), 3);
                 
     }
     
}
