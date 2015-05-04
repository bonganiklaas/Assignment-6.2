/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conf.Factory;

import com.mycompany.domain.JewelleryCategory;
import com.mycompany.domain.Supplier;
import java.util.List;

/**
 *
 * @author BONGANI
 */
public class SupplierFactory {
    public static Supplier createSupply (String suppNumber,List<JewelleryCategory> jewellery)
    {
         Supplier supply = new Supplier
               .Builder(suppNumber)
                 .jewellery(jewellery)
                 .supaddress(null)
                 .supcontact(null)
                 .supplier(null)
                 .build();                     
        return supply;
    }
}
