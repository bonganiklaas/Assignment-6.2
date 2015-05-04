/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author BONGANI
 */
@Entity
public class Jewellery implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String make;
    private double unitPrice;
    private String model;
    private int qty;
    private String weight;
    
    // empty constructor
    private Jewellery()
    {
      
    }
    
    public Jewellery(Builder builder)
    {
       make=builder.make;
       unitPrice=builder.unitPrice;
       model=builder.model;
       qty=builder.qty;
       weight=builder.weight;
    
    }
    
    public static class Builder{
    
     private String make;
     private double unitPrice;
     private String model;
     private int qty;
     private String weight;;
    
    
    public Builder make (String make)
    {
       this.make = make;
       return this;
     }
    
     public Builder model(String model)
    {
       this.model = model;
         return this;
     }
     
      public Builder qty (int qty )
    {
       this.qty = qty;
         return this;
     }
     
    public Builder unitPrice(double unitPrice)
    {
        this.unitPrice=unitPrice;
        return this;
    }
    
      public Builder weight(String weight)
    {
        this.make=weight;
        return this;
    }
    
    public Builder copy( Jewellery value)
    {
       this.make=value.make;
       this.make=value.make;
        this.unitPrice=value.unitPrice;
       this.qty=value.qty;
       this.model=value.model;
       return this;
    }
    public Jewellery build()
    {
         return new Jewellery(this);
    }
    
  }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMake() {
        return make;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getModel() {
        return model;
    }

    public int getQty() {
        return qty;
    }

    public String getWeight() {
        return weight;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setWeight(String weight) {
        this.weight = weight;
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
        if (!(object instanceof Jewellery)) {
            return false;
        }
        Jewellery other = (Jewellery) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.jewellery_app.Domain.Jewellery[ id=" + id + " ]";
    }
    
}
