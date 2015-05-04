/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author BONGANI
 */
@Entity
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     @Column(name = "quantity")
     private int quantity;
     @OneToOne
     private Jewellery jewellery;

       
     public OrderItem(){
     }
     
    public static class Builder{
     
      private Long id;
     private int quantity;
      private Jewellery jewellery;
      
      
       public Builder(int quantity){
            this.quantity = quantity;
        }
       
       
      public Builder id  (Long id){
          this.id = id;
          return this;
      }
     
      public Builder mobilphone(Jewellery value)
      {              
         jewellery = value;
         return this;
      }
      
      public Builder OrderItem(OrderItem orderitem){
          id = orderitem.getId();
          quantity = orderitem.getQuantity();
          jewellery = orderitem.getJewellery();
          return this;
      }
      
      public OrderItem build(){
          return new OrderItem(this);
      }
    
    }
    private OrderItem(Builder builder){
        id = builder.id;
        quantity = builder.quantity;
        jewellery = builder.jewellery;
        
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setJewellery(Jewellery jewellery) {
        this.jewellery = jewellery;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Jewellery getJewellery() {
        return jewellery;
    }
    
    
    public Long getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
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
        if (!(object instanceof OrderItem)) {
            return false;
        }
        OrderItem other = (OrderItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.jewellery_app.Domain.OrderItem[ id=" + id + " ]";
    }
    
}
