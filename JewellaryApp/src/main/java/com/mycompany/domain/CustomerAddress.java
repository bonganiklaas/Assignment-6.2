/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.domain;

import java.io.Serializable;
import static java.rmi.server.RemoteRef.serialVersionUID;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author BONGANI
 */
@Embeddable
public class CustomerAddress implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int postalCode;
    private String streetAddress;
    private String postalAddress;
    private Long id;   
  
    
    
      public static long getSerialVersionUID() {
        return serialVersionUID;
    }
      
     private CustomerAddress(Builder builder){
           id=builder.id;
           streetAddress=builder.streetAddress;
           postalAddress=builder.postalAddress;
           postalCode=builder.postalCode;
       }
       
       public CustomerAddress(){
           
       }   
    public static class Builder{
        private Long id;
        private String streetAddress;
        private String postalAddress;
        private int postalCode;
        
        public Builder(String streetAddress){
            this.streetAddress = streetAddress;
           }
        public Builder id(Long value){
            this.id = value;
            return this;
        }
        public Builder postalAddress(int value){
            this.postalCode = value;
            return this;
        }
        
        public Builder copy(CustomerAddress customerAddress){
            id= customerAddress.getId();
            streetAddress  = customerAddress.getStreetAddress();
            postalAddress= customerAddress.getPostalAddress();
            postalCode=customerAddress.getPostalCode();
            return this;
        
        }
           public CustomerAddress build(){
            return new CustomerAddress(this);
        }
        
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    public int getPostalCode() {
        return postalCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void setStreetAddress(String physicalAddress) {
        this.streetAddress = physicalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }
    
    
}
