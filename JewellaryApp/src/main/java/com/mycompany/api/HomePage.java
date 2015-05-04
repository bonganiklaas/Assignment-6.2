/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.api;

import com.mycompany.domain.CreditCard;
import com.mycompany.services.CreditCardService;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BONGANI
 */
@RestController
@RequestMapping("/api/**")
public class HomePage {
    @Autowired
    private CreditCardService service;
    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String Index(){
        return "This is a Home Page";
    }

    @RequestMapping(value = "/CreditCard",method = RequestMethod.GET)
    public CreditCard getCreditNumber(){
        CreditCard creditcard = new CreditCard.Builder(12345)
                .balance(BigDecimal.ZERO)
                .build();

        return creditcard;
    }

    //@RequestMapping(value = "/Credit", method = RequestMethod.GET)
    
}