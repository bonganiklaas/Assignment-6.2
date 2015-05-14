
import com.mycompany.domain.Orders;
import com.mycompany.repository.OrderRepository;
import com.mycompany.services.OrderListServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bongani
 */
@Service
public class OrderListServiceImpl implements OrderListServices{
    
    @Autowired
    OrderRepository orderRepo;
    @Override
    public List<Orders>getAllOrders() {
    return  (List<Orders>) orderRepo.findAll();
    }
}
