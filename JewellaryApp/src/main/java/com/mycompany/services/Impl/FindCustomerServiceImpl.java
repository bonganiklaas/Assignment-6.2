/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.domain.Customer;
import com.mycompany.repository.CustomerRepository;
import com.mycompany.services.FindCustomerService;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BONGANI
 */
@Service
public class FindCustomerServiceImpl implements FindCustomerService {
    
    @Autowired
    CustomerRepository customerRepo;

    @Override
    public Customer getCustomer(String id) {
        Customer customer = new Customer();
        List<Customer> allcustomer = (List<Customer>) customerRepo.findAll();
                
        for (Customer customers: allcustomer) {
            if (Objects.equals(customers.getCustomerNumber(), id)) {
                  customer = customers;
               }
           
        }
             return customer;  
       
    }

    @Override
    public List<Customer> getAllCustomers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


      
}
