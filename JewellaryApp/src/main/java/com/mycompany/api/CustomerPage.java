/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.api;

import com.mycompany.domain.Customer;
import com.mycompany.model.CustomerResource;
import com.mycompany.services.FindCustomerService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author BONGANI
 */
public class CustomerPage {
    
     @Autowired
    private FindCustomerService service;
    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public List<Customer> getCustomerNumber(@PathVariable Long id) {
        
        return (List<Customer>) service.getCustomer("100");
              
    }

    @RequestMapping(value="/customer", method=RequestMethod.GET)

    public List<CustomerResource> getCustomer() {
        List<CustomerResource> hateos = new ArrayList<>();
        List<Customer> customers = service.getAllCustomers();
        for (Customer customer : customers) {
            CustomerResource res = new CustomerResource
                    .Builder("Bongani")                    
                    .address(customer.getAddress())
                    .customer(null)
                    .resid(customer.getId())
                    .build();
            /*Link customer = new
                 Link("http://localhost:8080/customer/"+res.getResid().toString())
                    .withRel("custs");*/
           /* res.add(customer);*/
            hateos.add(res);
        }
        return hateos;
    }
    
}
