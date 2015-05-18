/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conf.Factory;

import com.mycompany.domain.Jewellery;
import com.mycompany.domain.OrderItem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author BONGANI
 */
public class OrderItemFactory {
    
     public static OrderItem createOrder (Jewellery jewellery, int value)
    {
         OrderItem orders = new OrderItem
                 .Builder(value)
                 .Jewellery(jewellery)
                 .build();

                 
         return orders;
    }
    
}
