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
public class SupplierContact implements Serializable{
    
    private String phone;
    private int cell;
    private String supplierName;
    private String representative;
   
    // empty Contructor
    private SupplierContact()
    {
      
    }
    
    public SupplierContact(Builder builder)
    {
       phone=builder.phone;
       cell=builder.cell;
       supplierName=builder.supplierName;
       representative=builder.representative;
    
    }
    
    public static class Builder{
    
    private String phone;
    private int cell;
    private String supplierName;
    private String representative;
    
    
    public Builder cell(int cell)
    {
       this.cell = cell;
       return this;
     }
    
     public Builder supplierName(String supplierName)
    {
       this.supplierName = supplierName;
       return this;
     }
     
      public Builder representative(String representative)
    {
       this.representative = representative;
       return this;
     }
      
      
    public Builder phone(String phone)
    {
        
        this.phone=phone;
        return this;
        
    }
    
    public Builder copy( SupplierContact value)
    {
       this.supplierName=value.supplierName;
       this.representative=value.representative;
       this.phone=value.phone;
       this.cell=value.cell;
       return this;
    }
    public SupplierContact build()
    {
         return new SupplierContact(this);
    }
    
 
  }
    
    
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getRepresentative() {
        return representative;
    }
    
    
    public String getPhone() {
        return phone;
    }

    public int getCell() {
        return cell;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }
    
    
}
