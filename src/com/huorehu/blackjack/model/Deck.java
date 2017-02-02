package com.huorehu.blackjack.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Deck {
    
    private List<Cards> cardsList = new ArrayList<>();
    
    private Iterator<Cards> cardPointer;
    
    public Deck () {
	for (Cards card : Cards.values()) {
	    for (int i = 0; i < 4; i++) {
		cardsList.add(card);
	    }
	}
	shuffleCards();
    }
    
    public void shuffleCards() {
	Collections.shuffle(cardsList);
	cardPointer = cardsList.iterator();
    }
    
    public Cards getCard() {
	if (cardPointer.hasNext()) {
	    return cardPointer.next();
	}
	return null;  //#1
	
    }
    
}
