/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repository;
import com.mycompany.conf.Factory.CustomerFactory;;
import com.mycompany.domain.Customer;
import com.mycompany.domain.CustomerName;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author BONGANI
 */
//@SpringApplicationConfiguration(classes= App.class)
//@WebAppConfiguration
public class CustomerCrudTest{
    
    private Long id;
    private CustomerName name;
    @Autowired
    private CustomerRepository repository;
   
    @Test
    public void create() throws Exception {
        Map<String,String> values = new HashMap<String,String>();
        values.put("CustomerNumber","12345");
        values.put("Firstname", "Bongani");
        Customer customer = CustomerFactory
        .createCustomer(values, "Bongani", "12345", null, null);
        //saving....      

        repository.save(customer);
        id=customer.getId();
        //Assert.assertNotNull(customer);
        Assert.assertNotNull(customer.getId());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Customer customer = repository.findOne(id);
        Assert.assertNotNull(customer);

    }

   @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Customer customer = repository.findOne(id);

        Customer newcustomer = new Customer
                .Builder(customer.getCustomerNumber())
                .copy(customer)
                .name(name)
                .build();
        repository.save(newcustomer);

        Customer updatedCustomer = repository.findOne(id);
        Assert.assertEquals(updatedCustomer.getName(),"Abongile");

    }

   @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Customer customer = repository.findOne(id);
        repository.delete(customer);
        Customer deletedCustomer = repository.findOne(id);
        Assert.assertNull(deletedCustomer);

    }
}
