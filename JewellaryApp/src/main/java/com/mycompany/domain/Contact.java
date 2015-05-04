/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author BONGANI
 */
@Embeddable
public class Contact implements Serializable{
    
    private int cell;
    private int phone;

    
    // getters and setters
    public int getCell() {
        return cell;
    }

    public int getPhone() {
        return phone;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    // empty Contructor
    private Contact()
    {
      
    }
    
    public Contact(Builder builder)
    {
       phone=builder.phone;
       cell=builder.cell;
    
    }
    
    public static class Builder{
    
    private int phone;
    private int cell;
    
    
    public Builder (int cell)
    {
       this.cell = cell;
     }
    
    public Builder phone(int phone)
    {
        
        this.phone=phone;
        return this;
        
    }
    
    public Builder copy( Contact value)
    {
       this.phone=value.phone;
       this.cell=value.cell;
       return this;
    }
    public Contact build()
    {
         return new Contact(this);
    }
    
 
  }
}
