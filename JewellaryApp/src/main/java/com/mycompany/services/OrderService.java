/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services;
import com.mycompany.domain.OrderItem;
import com.mycompany.domain.Orders;
import java.util.List;


/**
 *
 * @author BONGANI
 */
public interface OrderService {
    
    List<OrderItem> getAllOrders();
    List<Orders> getJewellery(Long id);
   }
