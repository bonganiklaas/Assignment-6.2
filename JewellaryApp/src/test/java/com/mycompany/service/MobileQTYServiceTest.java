package com.mycompany.service;


import com.mycompany.domain.Jewellery;
import com.mycompany.repository.JewelleryRepository;
import com.mycompany.services.JewelleryQTYService;
import org.springframework.context.ApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author BONGANI
 */
public class MobileQTYServiceTest {
    
    public static ApplicationContext ctx; 
    public JewelleryQTYService service;
    private JewelleryRepository mobilerepository;
    
    public MobileQTYServiceTest() {
    }
  
    @Test
        public void getAvailablePhone(){
        mobilerepository = ctx.getBean(JewelleryRepository.class);
    
        
        Jewellery j = new Jewellery.Builder().qty(3).build();
                   
        mobilerepository.save(j);
        
        int qty = service.getAvailableJewellery("9320");
        Assert.assertEquals(qty,3);
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
