/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author BONGANI
 */
@Entity
public class Orders implements Serializable {
    private static final long serialVersionUID = 1L;

    public static void add(Orders value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String invNumber;
    private int orderNumber;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date orderDate;
    @OneToOne
    private Customer customer;
    
    @OneToMany( cascade= CascadeType.ALL)
    @JoinColumn(name="order_id")
    private List<OrderItem> orderItems;

    
    public static class Builder {
        
        private Long id;
        private int orderNumber;
        private String invNumber;
        private Date date;
        private Customer customer;
        List<OrderItem>orderItems;
        
        public Builder (int orderNumber){
            this.orderNumber = orderNumber;
        }
        
        public Builder id(Long value){
            id = value;
            return this;
        }
        public Builder invNumber(String value){
            invNumber = value;
            return this;
        }
        
        public Builder date(Date value){
            date = value;
            return this;
        }
        
        public Builder customer(Customer value){
            customer = value;
            return this;
        }
        
        public Builder orders(List<OrderItem> value){
            orderItems = value;
            return this;
        }
        
        public Builder copy(Orders orders){
               this.id = orders.getId();
               this.invNumber = orders.getInvNumber();
               this.orderNumber = orders.getOrderNumber();
               this.date = orders.getOrderDate();
               this.customer = orders.getCustomer();
               this.orderItems = orders.getOrderItems();
               return this;
        }
        
        public Orders build(){
            return new Orders(this);
        }
               
    }
    
    private Orders (Builder builder){
        id = builder.id;
        invNumber =  builder.invNumber;
        orderNumber = builder.orderNumber;
        orderDate = builder.date;
        customer = builder.customer;
        orderItems = builder.orderItems;
        
    }
    
    
    public int getOrderNumber() {
        return orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }
    
     public String getInvNumber() {
        return invNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
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
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.jewellery_app.Domain.Orders[ id=" + id + " ]";
    }
    
}
