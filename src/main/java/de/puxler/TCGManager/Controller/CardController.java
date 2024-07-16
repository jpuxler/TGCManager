package de.puxler.TCGManager.Controller;

import de.puxler.TCGManager.model.Card;
import de.puxler.TCGManager.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardRepository cardRepository;

    @GetMapping
    public List<Card> getAllCards(){
        return cardRepository.findAll();
    }

    @PostMapping
    public Card createCard(@RequestBody Card card){
        return cardRepository.save(card);
    }
}
