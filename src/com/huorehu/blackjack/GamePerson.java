package com.huorehu.blackjack;

import java.util.ArrayList;
import java.util.List;

abstract public class GamePerson {
    
    private final String name;
    
    private Integer points = 0;
    
    List<String> cardInHand = new ArrayList<>();
    
    public GamePerson(String name) {
	this.name = name;
    }
    
    private void putCardInHand(String currentCard) {
	cardInHand.add(currentCard);
    }
    
    public void hit(String currentCard, PointsCalculator pointsCalculator) {
	this.points += pointsCalculator.getPoints(currentCard);
	putCardInHand(currentCard);
    }
    
    
    public Integer enough() {
	return points;
    }
    
    public String getName() {
	return name;
    }
    
    public List<String> getCardInHand() {
	return cardInHand;
    }

}
