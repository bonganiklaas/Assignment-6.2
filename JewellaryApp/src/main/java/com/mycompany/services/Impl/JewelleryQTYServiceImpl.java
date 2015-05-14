/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.domain.Jewellery;
import com.mycompany.repository.JewelleryRepository;
import com.mycompany.services.JewelleryQTYService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BONGANI
 */
@Service
public class JewelleryQTYServiceImpl implements JewelleryQTYService {
    
    @Autowired
    private JewelleryRepository jewellaryrepository;

    @Override
    public int getAvailableJewellery(String model) {
        Iterable<Jewellery> allJewellery = jewellaryrepository.findAll();
        int qty = 0;
                
            for (Jewellery jewellary: allJewellery) {
            if (jewellary.getModel().equals(model)) {
                qty = jewellary.getQty();
            }
        }
        return qty;
    }
    
}
