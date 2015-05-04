/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conf.Factory;

import com.mycompany.domain.Jewellery;

/**
 *
 * @author BONGANI
 */
public class JewelleryFactory {
    
     public static Jewellery createContact (String make, String model, int qty, String weight, double unitprice )
    {
         Jewellery jewellery = new Jewellery
                 .Builder().make(make).model(model).qty(qty).unitPrice(unitprice).weight(weight)
                 .build();
                     
        return jewellery;
    }
    
}
