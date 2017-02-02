package com.huorehu.blackjack;

import com.huorehu.blackjack.model.Cards;
import com.huorehu.blackjack.model.Deck;

public class Dealer extends GamePerson {

    private Deck deck;
    
    Dealer(String name, Deck deck) {
	super(name);
	this.deck = deck;
    }
    
    public void handOutCards(GamePerson player) {
	for (int i = 0; i < 2; i++) {
	    player.hit(getNextCard());
	    this.hit(getNextCard());
	}
    }
    
    public Cards getNextCard() {
	return deck.getCard();
    }
    
    public boolean definitionOfWinners(GamePerson player) {
	if (player.getPoints() > this.getPoints()) {
	    return true;
	}
	return false;
    }

}
