
import com.mycompany.domain.Customer;
import com.mycompany.repository.CustomerRepository;
import com.mycompany.services.TotalCustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BONGANI
 */
@Service
public class TotalCustomerServiceImpl implements TotalCustomerService {
    
    
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer>getTotalCustomer(){
        return  (List<Customer>) customerRepository.findAll();
    }
 
}
