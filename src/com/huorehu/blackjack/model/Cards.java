package com.huorehu.blackjack.model;

public enum Cards {
    
    TWO   (2, "2"),
    THREE (3, "3"),
    FOUR  (4, "4"),
    FIVE  (5, "5"),
    SIX   (6, "6"),
    SEVEN (7, "7"),
    EIGHT (8, "8"),
    NINE  (9, "9"),
    TEN   (10, "10"),
    JACK  (10, "J"),
    QUEEN (10, "Q"), 
    KING  (10, "K"),
    ACE   (11, "A");
    
    private final int points;
    private final String value;
    
    Cards (int points, String value) {
	this.points = points;
	this.value = value;
    }
    
    public int getCardPoints (Cards card) {
	return points;
    }
    
    public String toString() {
	return value;
    }

}
