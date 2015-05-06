/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Domain;

import com.mycompany.domain.OrderItem;
import com.mycompany.domain.Orders;
import com.mycompany.repository.OrderRepository;
import com.mycompany.repository.OrderRepository;
import java.util.Date;
import java.util.List;
import javax.persistence.criteria.Order;
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
public class OrderRepositoryTest {
  
    private Long id;
    private OrderRepository repo;
    
    
    public OrderRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createOrder(){
        Date d = new Date();
       Orders order = new Orders.Builder(12345)
                        .invNumber("S002")
                        .build();
        
        repo.save(order);
        id = order.getId();
        Orders orders = repo.findOne(id);
        Assert.assertNotNull(orders);
                                            
    }
    @Test(dependsOnMethods = "createOrder")
       public void readOrder(){
        Orders order = repo.findOne(id);
        Assert.assertEquals(order.getOrderNumber(),12345);
        
    }
       @Test(dependsOnMethods = "readOrder")
       public void updateOrder(){
            Orders order = repo.findOne(id);
           Orders updateOrder = new Orders.Builder(12345)
                             .orders((List<OrderItem>) order)
                             .invNumber("S005")
                             .build();
          repo.save(updateOrder);
          Orders newOrder = repo.findOne(id);
          Assert.assertEquals(newOrder.getInvNumber(), "S005");
       }
       
       @Test(dependsOnMethods = "updateOrder")
       public void deleteOrder(){
            Orders order = repo.findOne(id);
            repo.delete(order);
            Orders deleteOrder = repo.findOne(id);
            Assert.assertNull(deleteOrder);
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
