/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services.Impl;

import com.mycompany.domain.OrderItem;
import com.mycompany.domain.Orders;
import com.mycompany.repository.OrderItemRepository;
import com.mycompany.services.OrderService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author BONGANI
 */
public class OrderImpl implements OrderService{
    
    @Autowired
    private OrderItemRepository repository;

    @Override
    public List<OrderItem> getAllOrders() {
        List<OrderItem> orders= new ArrayList<>();
         Iterable<OrderItem> values = repository.findAll();
          for (OrderItem value : values) {
            OrderItem.add(value);
        }
        return orders;
    }

    @Override
    public List<Orders> getJewellery(Long id) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
}
