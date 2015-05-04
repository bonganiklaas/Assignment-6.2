/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conf.Factory;

import com.mycompany.domain.CustomerInvoice;
import java.util.Date;
import javax.persistence.criteria.Order;

/**
 *
 * @author BONGANI
 */
public class CustomerInvoiceFactory {
    
    
    public static CustomerInvoice createInvoice (double orderAmount, Date invoiceDate, Order order)
    {
         CustomerInvoice contact = new CustomerInvoice
                 .Builder(orderAmount)
                 .orderAmount(orderAmount).invoiceStatus(null)
                 .invoiceDate(invoiceDate)
                 .order(null)
                 .build();                 
                     
        return contact;
    }
}
