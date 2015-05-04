/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.repository;

import com.mycompany.domain.Supplier;
import com.mycompany.domain.SupplierContact;
import com.mycompany.repository.SupplierRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Bongani
 */
public class SupplierRepositoryTest {
    
    public static ApplicationContext ctx;
    private Long id;
    public SupplierRepository repo;
    
    
   
    @Test 
    public void createSupplier(){
       // SupplierContact name = new SupplierContact();
       // name.setSupplierName("Gold");
       // name.setRepresentative("Lucas");
        
        repo = ctx.getBean(SupplierRepository.class);
        Supplier c = new Supplier.Builder("23423")
                            .build();
        repo.save(c);
        id = c.getId();
        Assert.assertNotNull(c);         
     }
    @Test(dependsOnMethods = "createSupplier")
     public void readSupplier(){
     repo=ctx.getBean(SupplierRepository.class);
     Supplier s = repo.findOne(id);
     Assert.assertEquals(s.getSupaddress().getSupplierName,"Neclase");
     
    }
    @Test(dependsOnMethods = "readSupplier")
    public void updateSupplier(){
       // SupplierContact name = new SupplierContact();
       // name.setSupplierName("GoldWatch");
    
        
        repo = ctx.getBean(SupplierRepository.class);
        Supplier c = repo.findOne(id);
        Supplier updateSupplier= new Supplier.Builder("23423")
                                    .supplier(c) 
                                    .build();
        repo.save(updateSupplier);
        Supplier newSupplier= repo.findOne(id);
        Assert.assertEquals(newSupplier.getSupaddress().getSupplierName,"Watch");
        
    }
    @Test(dependsOnMethods = "updateSupplier")
    public void deleteSupplier(){
        repo = ctx.getBean(SupplierRepository.class);
        Supplier s = repo.findOne(id);
        repo.delete(s);
        
        Supplier deletedSupplier = repo.findOne(id);
        Assert.assertNull(deletedSupplier);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
       
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
