/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conf.Factory;

import com.mycompany.domain.Contact;

/**
 *
 * @author BONGANI
 */
public class ContactFactory {
    
    public static Contact createContact (int phone, int cell)
    {
         Contact contact = new Contact
                 .Builder(cell)
                 .phone(phone)
                 .build();
                     
        return contact;
    }
}
