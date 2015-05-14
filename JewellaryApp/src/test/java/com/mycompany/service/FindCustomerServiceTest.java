/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.domain.Customer;
import com.mycompany.domain.CustomerName;
import com.mycompany.repository.CustomerRepository;
import com.mycompany.services.FindCustomerService;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FindCustomerServiceTest {

    public FindCustomerService service;
    public CustomerRepository repo;
    
    
    public FindCustomerServiceTest() {
    }
    
    @Test
    public void FindCustomer(){
        CustomerName name = new CustomerName();
         name.setFirstName("Justin");
         name.setLastName("Drake");
          
        Customer cust1 = new Customer.Builder("8704225065083")
                              .name(name)
                              .build();
          repo.save(cust1);
          Customer customer = service.getCustomer("8704225065083");
          Assert.assertEquals(customer.getName().getFirstName(),"Justin");
         
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

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
