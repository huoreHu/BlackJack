package com.huorehu.blackjack;

public class Player extends GamePerson {
    
    private Double balance;
    
    public Player(String name, Double balance) {
	super(name);
	this.balance = balance;
    }
    
}
