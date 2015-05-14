/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.domain.CreditCard;
import com.mycompany.repository.CreditCardRepository;
import com.mycompany.services.CreditService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditServiceImpl implements CreditService{

    @Autowired
    CreditCardRepository creditcardrepository;
    
       @Override
       public double getCreditBalance(int creditNumber) {
        
        CreditCard c = new CreditCard();
        List<CreditCard> allcards = (List<CreditCard>) creditcardrepository.findAll();
        double balance = 0;       
        for (CreditCard cards: allcards) {
            if(cards.getCreditNumber()==creditNumber) {
                
                balance = cards.getBalance();
                                       
           }
        
        }
        return balance;
   }
}