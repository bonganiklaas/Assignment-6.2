/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conf.Factory;

import com.mycompany.domain.JewelleryCategory;

/**
 *
 * @author BONGANI
 */
public class JewelleryCategoryFactory {
     public static JewelleryCategory createContact (String category )
    {
         JewelleryCategory jewelleryG = new JewelleryCategory
                 .Builder(category)
                 .build();
                     
        return jewelleryG;
    }
    
    
}
