/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conf.Factory;

import com.mycompany.domain.Jewellery;
import com.mycompany.domain.OrderItem;
import java.util.List;

/**
 *
 * @author BONGANI
 */
public class OrderItemFactory {
    
     public static OrderItem createOrder (Jewellery jewellery, int quantity)
    {
         OrderItem orders = new OrderItem
                 .Builder(quantity).Jewellery(jewellery).OrderItem(null).build();
                 
         return orders;
    }
    
}
