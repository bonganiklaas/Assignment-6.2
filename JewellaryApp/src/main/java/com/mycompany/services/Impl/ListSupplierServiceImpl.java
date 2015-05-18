
import com.mycompany.domain.Supplier;
import com.mycompany.repository.SupplierRepository;
import com.mycompany.services.ListSupplierService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bongani
 */
@Service
public class ListSupplierServiceImpl implements ListSupplierService{

    
    @Autowired
    SupplierRepository supplierRepo;
    @Override
    public List<Supplier> getAllSuppliers() {
    return (List<Supplier>) supplierRepo.findAll();
    }
   
}
