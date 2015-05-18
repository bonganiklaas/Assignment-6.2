/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Domain;

import com.mycompany.domain.CustomerAddress;
import org.testng.Assert;
import org.testng.annotations.Test;
/**
 *
 * @author Bongani
 */
public class CustomerAddressRepositoryTest {

    private CustomerAddress c;
  
    public CustomerAddressRepositoryTest() {
    }
    
    @Test 
    public void createCustAddress(){
         c = new CustomerAddress.Builder("7 woodburry close")
                             .postalAddress(7515)
                             .build();
         Assert.assertNotNull(c);         
     }
    
    @Test(dependsOnMethods = "createCustAddress")
    public void updateCustAddress(){
        CustomerAddress updateCustAddress = new CustomerAddress.Builder("7 woodburry close")
                                            .postalAddress(7515)
                                            .build();
       
        CustomerAddress copiedaddress = new CustomerAddress
                .Builder("7 woodburry close")
                .copy(updateCustAddress)
                .postalAddress(7515)
                .build();
 
          Assert.assertEquals("7 woodburry close",copiedaddress.getStreetAddress());
          Assert.assertEquals(7515,copiedaddress.getPostalCode());
   
    }
  }
