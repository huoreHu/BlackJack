package com.huorehu.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.huorehu.blackjack.model.Cards;

abstract public class GamePerson {
    
    private final String name;
    
    private int points;
    
    List<Cards> hand;
    
    public GamePerson(String name) {
	this.name = name;
	resetPersonFields();
    }
    
    public void resetPersonFields() {
	points = 0;
	hand = new ArrayList<>();
    }
    
    public void hit(Cards card) {
	hand.add(card);
	points += card.getCardPoints(card);	//#2
    }
    
    public boolean bust() {
	if (points > 21) {
	    return true;
	}
	return false;
    }
    
    public int getPoints() {
	return points;
    }
    
    public String getName() {
	return name;
    }
    
    public List<Cards> getCardInHand() {
	return hand;
    }

}
