/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.api;
import com.mycompany.domain.Customer;
import com.mycompany.services.FindCustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BONGANI
 */
@RestController
@RequestMapping("/api/**")
public class HomePage {
    @Autowired
    private FindCustomerService service;
    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String Index(){
        return "This is a Home Page";
    }

    @RequestMapping(value = "/Customer",method = RequestMethod.GET)
    public Customer getCustomers(){
        Customer customer = new Customer.Builder("12345")
                .names("Bongani")
                .build();

        return customer;
    }

    @RequestMapping(value = "/Customer", method = RequestMethod.GET)
    public List <Customer> getCustomer()
    {
         return (List<Customer>) service.getCustomer("12345");
               
                
    }
    
}