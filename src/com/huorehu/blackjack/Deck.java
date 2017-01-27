package com.huorehu.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    
    private final int MAX_CARD_DIGIT_VALUE = 10;
    
    private final boolean withJoker;
    
    List<String> deck = new ArrayList<>();
    
    public Deck(int minCardDigitValue, boolean withJocker) {
	this.withJoker = withJocker;
	
	List<String> value = new ArrayList<String>();
	List<String> suit = new ArrayList<String>();
	for (int i = minCardDigitValue; i <= MAX_CARD_DIGIT_VALUE; i++) {
	    value.add(Integer.toString(i));
	}
	value.add("J");
	value.add("Q");
	value.add("K");
	value.add("T");
	
	suit.add("♠");
	suit.add("♣");
	suit.add("♥");
	suit.add("♦");
	
	for (String cardValue : value) {
	    for (String cardSuit : suit) {
		deck.add(cardValue + cardSuit);
	    }
	}
	
	if (withJoker) {
	    deck.add("JokerRed");
	    deck.add("JokerBlack");
	}
    
    }
    
    public List<String> getDeck() {
	return deck;
    }
    
    public void shuffleDeck() {
	Collections.shuffle(deck);
    }
    
}
