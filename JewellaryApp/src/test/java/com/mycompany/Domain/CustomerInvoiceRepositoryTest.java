/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Domain;


import com.mycompany.domain.CustomerInvoice;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Bongani
 */
public class CustomerInvoiceRepositoryTest {
    
    public CustomerInvoiceRepositoryTest() {
    }
       private CustomerInvoice c;
      
    @Test 
    public void createCustInvoice(){
        
        double invoice =233.435;
       
        c = new CustomerInvoice.Builder(invoice)
                            .invoiceStatus("open")
                            .build();
        Assert.assertNotNull(c);         
     }
 
   @Test(dependsOnMethods = "createCustInvoice")
    public void updateCustInvoice(){
        double OrderAmount =234.09;
 
        CustomerInvoice updateCustomerInvoice= new CustomerInvoice.Builder(200.00) 
                                            .orderAmount(200.00)
                                            .invoiceStatus("close")
                                            .build();
           Assert.assertEquals(updateCustomerInvoice.getOrderAmount(),OrderAmount,234);
           Assert.assertEquals(c.getOrderAmount(), 200, 100);
        
    }
  }
