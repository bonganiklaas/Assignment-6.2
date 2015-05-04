/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author BONGANI
 */
@Embeddable
public class SupplierAddress implements Serializable{
    
    private String physicalAddress;
    private String postalCode;
     private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String streetAddress;
    private String postalAddress;
    public Object getSupplierName;

      
     public String getPhysicalAddress() {
        return physicalAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
}
