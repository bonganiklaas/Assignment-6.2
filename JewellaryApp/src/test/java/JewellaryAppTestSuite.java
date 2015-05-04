/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import repository.OrderItemRepositoryTest;
import repository.SupplierRepositoryTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import repository.CreditCardRepositoryTest;
import repository.CustomerAddressRepositoryTest;
import repository.CustomerInvoiceRepositoryTest;
import repository.CustomerRepositoryTest;
import repository.CustomerTest;
import repository.OrderRepositoryTest;
import repository.TestCreditCard;

/**
 *
 * @author BONGANI
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestCreditCard.class,
    CustomerTest.class,
    CreditCardRepositoryTest.class,
    CustomerAddressRepositoryTest.class,
    CustomerInvoiceRepositoryTest.class,
    CustomerRepositoryTest.class,
    OrderItemRepositoryTest.class,
    OrderRepositoryTest.class,
    SupplierRepositoryTest.class,
    
    
    })
public class JewellaryAppTestSuite {
    
    public JewellaryAppTestSuite() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
