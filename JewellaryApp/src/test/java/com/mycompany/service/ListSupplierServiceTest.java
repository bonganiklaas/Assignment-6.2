/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.domain.Supplier;
import com.mycompany.repository.SupplierRepository;
import com.mycompany.services.ListSupplierService;
import java.util.List;
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
 * @author BONGANI
 */
public class ListSupplierServiceTest {
    
    public ListSupplierServiceTest() {
    }
    public ListSupplierService service;
    public SupplierRepository repo;

 
    @Test
    public void ListSuppliers(){
         List<Supplier> customer = service.getAllSuppliers();
         Assert.assertEquals(0, customer.size(), "Expect no Suppliers");
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
