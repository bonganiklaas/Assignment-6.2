package com.mycompany.services;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.domain.Jewellery;
import java.util.List;

public interface AvailableJewelleryService {
    
    public List<Jewellery> getAvailableJewelleries();
    
}
