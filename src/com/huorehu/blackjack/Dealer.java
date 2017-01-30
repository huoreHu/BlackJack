package com.huorehu.blackjack;

import java.util.Iterator;
import java.util.List;

public class Dealer extends GamePerson {

    private final int START_NUMBER_CARDS = 2;

    public Dealer(String name) {
	super(name);
    }
    
    public void handOutCards(List<GamePerson> playersList, Iterator<String> iterDeck, PointsCalculator pointsCalculator) {
	for (int i = 0; i < START_NUMBER_CARDS; i++) {
	    Iterator<GamePerson> iterPerson = playersList.iterator();
	    while (iterPerson.hasNext()) {
		String currentCard = iterDeck.next();
        	iterPerson.next().hit(currentCard, pointsCalculator);
        	System.out.println(currentCard + " "); //TEST STRING
	    }
	    
	}
	
    }
    
    public void giveCardToPlayer(Iterator<String> iterDeck) {
	
    }

}
