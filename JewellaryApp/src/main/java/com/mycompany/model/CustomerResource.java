/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import com.mycompany.domain.Customer;
import com.mycompany.domain.CustomerAddress;
import java.util.List;
import org.springframework.hateoas.ResourceSupport;

/**
 *
 * @author BONGANI
 */
public class CustomerResource extends ResourceSupport{
    
    private Long resid;
    private String name;

    private CustomerAddress address;

    private List<Customer> customers;

    private CustomerResource() {
    }

    public Long getResid() {
        return resid;
    }

    public String getName() {
        return name;
    }

    public CustomerAddress getAddress() {
        return address;
    }

    public List<Customer> getCustomer() {
        return customers;
    }

    public CustomerResource(Builder builder) {
        this.address=builder.address;
        this.customers=builder.customers;
        this.resid=builder.resid;
        this.name=builder.name;
    }

    public static class Builder{
        private Long resid;
        private String name;
        private CustomerAddress address;
      //  private List<Customer> departments;
        private List<Customer> customers;
        private List<Customer> customer;

        public Builder(String name) {
            this.name = name;
        }

        public Builder resid(Long value){
            this.resid=value;
            return this;
        }

        public Builder address(CustomerAddress value){
            this.address=value;
            return this;
        }

        public Builder customer(List<Customer> value){
            this.customer=value;
            return this;
        }

        public Builder copy(CustomerResource value){
            this.address=value.address;
            this.customers = value.customers;
            this.resid=value.resid;
            this.name=value.name;
            return this;
        }

        public CustomerResource build(){
            return new CustomerResource(this);
        }

    }


}
