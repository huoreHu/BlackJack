package com.huorehu.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Settings {
    
    private final String DEFAULT_USER_NAME = "Antonio";
    
    private String dealerName = "Max";
    
    private boolean jokerStatus = false;
    
    private int minCardDigitValue = 2;
    
    private int playersNumber = 1;
    
    private List<GamePerson> listGamePersons = new ArrayList<>();
    
    public Settings(boolean useDefaultSettings) {
	if (useDefaultSettings) {
	    configureDefault();
	} else {
	    configurePersonal();
	}
    }
    
    private void configureDefault() {
	listGamePersons.add(new Player(DEFAULT_USER_NAME, 1000D));
	listGamePersons.add(new Player("Murzic", 1000D));
	listGamePersons.add(new Dealer(dealerName));
    }

    public void configurePersonal() {
	//TODO
    }
    
    public List<GamePerson> getGamePersons() {
	return listGamePersons;
    }
    
    public void setJokerStatus(boolean jokerStatus) {
	this.jokerStatus = jokerStatus;
    }
    
    public boolean getJokerStatus() {
	return jokerStatus;
    }
    
    public void setMinCardDigitValue(int minCardDigitValue) {
	this.minCardDigitValue = minCardDigitValue;
    }
    
    public int getMinCardDigitValue() {
	return minCardDigitValue;
    }
    
    public int getPlayersNumber() {
        return playersNumber;
    }

    public void setPlayersNumber(int playersNumber) {
        this.playersNumber = playersNumber;
    }

}
