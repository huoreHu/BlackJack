package com.huorehu.blackjack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PointsCalculator {
    
    private static final Integer ACE_POINTS = 11;
    
    private Map<String, Integer> blackJackCardPoints = new HashMap<>();
    
    public PointsCalculator(Deck deck) {
	createBankPoints(deck);
    }
    
    private void createBankPoints(Deck deck) {
	Integer points = 2;
	Iterator<String> iter;
	String tempString;
	for (iter = deck.getDeck().iterator(); iter.hasNext(); ) {
	    for (int i = 0; i < 4 && iter.hasNext(); i++) {
		tempString = iter.next();
		if (points < 10) {
		    blackJackCardPoints.put(tempString, points);
		} else if (tempString.equals("T♠") || tempString.equals("T♣") || tempString.equals("T♥") || tempString.equals("T♦")) {
			blackJackCardPoints.put(tempString, ACE_POINTS);
		} else {
		    blackJackCardPoints.put(tempString, 10);
		}
	    }
	    points++;
	    
	}
	
    }
    
    public Integer getPoints(String card) {
	return blackJackCardPoints.get(card);
    }
    
}
