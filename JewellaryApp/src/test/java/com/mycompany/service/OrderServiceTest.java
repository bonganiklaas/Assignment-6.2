/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.App;
import com.mycompany.domain.Jewellery;
import com.mycompany.domain.Orders;
import com.mycompany.repository.OrderRepository;
import com.mycompany.services.OrderService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
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
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class OrderServiceTest extends AbstractTestNGSpringContextTests{
    
    public OrderServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Autowired
    private OrderService service;
    private Long id;

    @Autowired
    private OrderRepository repository;
    private List<Jewellery> jewelleries;
    @BeforeMethod
    public void setUp() throws Exception {
        jewelleries = new ArrayList<Jewellery>();
    }
     
     @Test
    public void create() throws Exception {

        /*ContactAddress deptaddress = ContactFactory
                .createContact("dept@test.com", "7550");
        Department it = DepartmentFactory
                .createDepartment(deptaddress, "IT", null);
        Department arts = DepartmentFactory
                .createDepartment(deptaddress, "ART", null);

        ContactAddress facultyaddress = ContactFactory
                .createContact("faculty@test.com", "7550");


        departments.add(it);
        departments.add(arts);

        Faculty faculty = FacultyFactory
                .createFaculty(facultyaddress, departments, "FID");

        repository.save(faculty);
        id=faculty.getId();
        Assert.assertNotNull(faculty.getId());
                */
    }
    
    @Test
    public void testGetJewelleries() throws Exception {
        List<Orders> jewelleries = service.getJewellery(id);
        Assert.assertTrue(jewelleries.size() == 2);

    }
    
}
