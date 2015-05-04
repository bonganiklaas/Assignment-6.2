/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author BONGANI
 */
@Entity
public class Supplier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String supNumber;
    @Embedded
    private SupplierContact contact;
    @OneToOne
    private SupplierAddress supaddress;
    @OneToMany
    List<JewelleryCategory> jewellery;
    
     public Supplier(){
        
    }
    
     private Supplier(Builder builder){
        id = builder.id;
        supNumber = builder.suppNumber;
        supaddress=builder.supaddress;
        contact =builder.supcontact;
        jewellery = builder.jewellery;
        
    }
      
    
    
    public static class Builder{
        
        private Long id;
        private String suppNumber;
        private SupplierContact supcontact;
        private SupplierAddress supaddress;
        List<JewelleryCategory> jewellery;
       
     
        public Builder(String suppNumber)
        {
            this.suppNumber = suppNumber;
            
        }
               
        public Builder id(Long value){
            id = value;
            return this;
        }
        
        public Builder supaddress(SupplierAddress value){
            supaddress = value;
            return this;
         }
        
        public Builder supcontact(SupplierContact value){
            supcontact = value;
            return this;
        }
        
        public Builder jewellery(List< JewelleryCategory> value){
            jewellery = value;
            return this;
        }
        
       
        
        public Builder supplier(Supplier supplier){
            id = supplier.getId();
            supaddress = supplier.getSupaddress();
            supcontact = supplier.getContact();
            jewellery = supplier.getJewellery();
            return this;
        }
        
        public Supplier build(){
            return new Supplier(this);
        }
        
    
    }

        public SupplierContact getContact() {
        return contact;
    }

    public SupplierAddress getSupaddress() {
        return supaddress;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<JewelleryCategory> getJewellery() {
        return jewellery;
    }

    public void setSupNumber(String supNumber) {
        this.supNumber = supNumber;
    }

    public void setContact(SupplierContact contact) {
        this.contact = contact;
    }

    public void setSupaddress(SupplierAddress supaddress) {
        this.supaddress = supaddress;
    }

    public void setJewellery(List<JewelleryCategory> jewellery) {
        this.jewellery = jewellery;
    }

      public String getSupNumber() {
        return supNumber;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
  
     @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Supplier)) {
            return false;
        }
        Supplier other = (Supplier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.jewellery_app.Domain.Supplier[ id=" + id + " ]";
    }
    
}
