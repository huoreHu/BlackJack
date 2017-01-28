package com.huorehu.blackjack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PointsCalculator {
    
    private static final Integer ACE_POINTS = 11;
    
    Map<String, Integer> blackJackDeck = new HashMap<>();
    
    public void createBankPoints(Deck deck) {
	Integer points = 2;
	Iterator<String> iter;
	String tempString;
	for (iter = deck.getDeck().iterator(); iter.hasNext(); ) {
	    for (int i = 0; i < 4 && iter.hasNext(); i++) {
		tempString = iter.next();
		if (points < 10) {
		    blackJackDeck.put(tempString, points);
		} else if (tempString.equals("T♠") || tempString.equals("T♣") || tempString.equals("T♥") || tempString.equals("T♦")) {
			blackJackDeck.put(tempString, ACE_POINTS);
		} else {
		    blackJackDeck.put(tempString, 10);
		}
	    }
	    points++;
	    
	}
	
    }
    
    public Integer getPoints(String card) {
	return blackJackDeck.get(card);
    }
    
}
