/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.repository;

import com.mycompany.conf.Factory.OrderFactory;
import com.mycompany.conf.Factory.OrderItemFactory;
import com.mycompany.domain.OrderItem;
import com.mycompany.domain.Orders;
import com.mycompany.domain.Customer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Bongani
 */
public class OrderCrudTest {
  
    private  Orders o1;
    public OrderRepository repo;
    private Long id;
    
    public OrderCrudTest() {
    }

    @Test
    public void createOrder(){
        Date d = new Date();
       //bypass thefactory 
       Customer customer = new Customer.Builder("C2002").build();
       
       Orders order = new Orders.Builder(12345)
                        .invNumber("S002")
                        .build();
       //bypass thefactory 
    
       
       OrderItem orderItem1 = OrderItemFactory.createOrder(null, 4);
       OrderItem orderItem2 = OrderItemFactory.createOrder(null, 8);
       
       List<OrderItem> orderItems = new ArrayList<>();
       orderItems.add(0,orderItem1);
       orderItems.add(1,orderItem2);
       
       String invNumber = "S001";
       int orderNumber = 1001;

        o1 = OrderFactory.createOrder(orderItems, customer, invNumber, orderNumber, d);
        Assert.assertNotNull(order);
        Assert.assertTrue(o1.getOrderItems().size() == 2);
                                            
    }

       public void readOrder(){
        Orders order = repo.findOne(id);
        Assert.assertEquals(order.getOrderNumber(),12345);
        
    }
       @Test(dependsOnMethods = "createOrder")
       public void updateOrder(){
         Orders updateOrder = new Orders.Builder(12345)
                             .copy(o1)
                             .invNumber("S005")
                             .build();
          Assert.assertEquals(o1.getInvNumber(), "S001");
          Assert.assertEquals(updateOrder.getInvNumber(),"S005");
       }
}
