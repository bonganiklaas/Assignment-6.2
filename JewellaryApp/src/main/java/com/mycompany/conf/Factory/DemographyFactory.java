/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conf.Factory;

import com.mycompany.domain.Demography;

/**
 *
 * @author BONGANI
 */
public class DemographyFactory {
    
    public static Demography createDemography (String race, String gender)
    {
         Demography demography = new Demography
                 .Builder(gender).race(race)
                 .build();             
                     
        return demography;
    }
    
}
