
import com.mycompany.services.AvailableJewelleryService;
import com.mycompany.domain.Jewellery;
import com.mycompany.repository.JewelleryRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvailableJewelleryServiceImpl implements AvailableJewelleryService {

    
    @Autowired
    JewelleryRepository jewelleryrepository;

    @Override
    public List<Jewellery> getAvailableJewelleries() {
        
        
         List<Jewellery> jewellaries = new ArrayList<>();
        List<Jewellery> allMobiles = (List<Jewellery>) jewelleryrepository.findAll();
                
        for (Jewellery mobile: allMobiles) {
            if (mobile.getQty() > 0) {
                jewellaries.add(mobile);
            }
        }
        return jewellaries;
             
    }
 
}
