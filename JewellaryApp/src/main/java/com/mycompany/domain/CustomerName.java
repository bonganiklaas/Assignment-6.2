/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.domain;

import java.io.Serializable;

/**
 *
 * @author BONGANI
 */
public class CustomerName implements Serializable{
    
    private String firstName;
    private String lastName;
    private int identityNumber;

    public CustomerName(Builder builder)
    {
       firstName=builder.firstName;
       lastName=builder.lastName;
       identityNumber=builder.identityNumber;
    
    }
        
    //emplty constructor
    public CustomerName()
    {      
        
    }
    public static class Builder{
    
    private int identityNumber;
    private String lastName;
    private String firstName;
    
    
    public Builder (int identityNumber)
    {
       this.identityNumber = identityNumber;
     }
    
    public Builder lastName(String lastName)
    {
        
        this.lastName=lastName;
        return this;
        
    }
    public Builder firstName(String firstName)
    {
        
        this.firstName=firstName;
        return this;
        
    }
    
    public Builder copy( CustomerName value)
    {
       this.lastName=value.lastName;
       this.firstName=value.firstName;
       this.identityNumber=value.identityNumber;
       return this;
    }
    public CustomerName build()
    {
         return new CustomerName(this);
    }
    
    }
    //getter setters    
    public int getIdentityNumber() {
        return identityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdentityNumber(int identityNumber) {
        this.identityNumber = identityNumber;
    }

    public Long getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
}
