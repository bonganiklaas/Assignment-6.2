/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conf.Factory;


import com.mycompany.domain.Customer;
import com.mycompany.domain.OrderItem;
import java.util.Date;
import java.util.List;
import com.mycompany.domain.Orders;;

/**
 *
 * @author BONGANI
 */
public class OrderFactory {
    
     public static Orders createOrder (List<OrderItem> orderItems, Customer customer, String invNumber, int orderNumber, Date orderDate)
    {
         Orders order = new Orders
                 .Builder(orderNumber).invNumber(invNumber).orders(orderItems)
                 .customer(customer).date(orderDate).orders(orderItems)
                 .build();
         
         return order;
    }
    
}
