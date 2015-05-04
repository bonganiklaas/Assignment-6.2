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
    private String cell;
    private String supplierName;
    private String representative;
   

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

    public String getCell() {
        return cell;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }
    
    
}
