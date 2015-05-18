/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.domain;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author BONGANI
 */
@Entity
public class CreditCard implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int creditNumber;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date expiryDate;
    private String nameOnCreditCard;
    private double balance;
    private String owner;
    
         private CreditCard(Builder builder){
        id=builder.id;
        creditNumber=builder.creditNumber;
        expiryDate=builder.expiryDate;
        owner=builder.owner;
        balance=builder.balance;
        
    }
     
      public static class Builder{
        
        private Long id;
        private int creditNumber;
        private Date expiryDate;
        private String owner;
        private double balance;
        
        public Builder(int creditNumber){
            this.creditNumber = creditNumber;
        }
        
        public Builder id(Long value){
            id = value;
            return this;
        }
        
        public Builder expiryDate(Date value){
            expiryDate = value;
            return this;
        }
        public Builder owner(String value){
            owner = value;
            return this;
        }
        
        public Builder balance(double value){
            balance = value;
            return this;
        }
        
        public Builder copy(CreditCard creditCard){
            id = creditCard.getId();
            creditNumber = creditCard.getCreditNumber();
            expiryDate = creditCard.getExpiryDate();
            owner = creditCard.getOwner();
            balance= creditCard.getBalance();
            return this;
        }
        
        public CreditCard build(){
            return new CreditCard(this);
        }
     
    }
    public CreditCard(){
        
    }

    public int getCreditNumber() {
        return creditNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

   
    public void setCreditNumber(int creditNumber) {
        this.creditNumber = creditNumber;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setNameOnCreditCard(String nameOnCreditCard) {
        this.nameOnCreditCard = nameOnCreditCard;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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
        if (!(object instanceof CreditCard)) {
            return false;
        }
        CreditCard other = (CreditCard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.jewellery_app.Domain.CreditCard[ id=" + id + " ]";
    }
    
}
