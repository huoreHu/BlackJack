package com.huorehu.blackjack;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GameTable {
    
    Settings settings;
    
    List<GamePerson> playersList;
    
    Deck deck;
    
    PointsCalculator pointsCalculator;
    
    Dealer dealer;
    
    Iterator<String> iterDeck;
    
    public GameTable(Settings settings) {
	this.settings = settings;
	this.deck = new Deck(settings.getMinCardDigitValue(), settings.getJokerStatus());
	this.pointsCalculator = new PointsCalculator(deck);
	this.playersList = settings.getGamePersons();
	this.dealer = (Dealer) playersList.get(playersList.size() - 1);
    }
    
    public void startGame() {
	prepareDeckToGame();
	dealer.handOutCards(playersList, iterDeck, pointsCalculator);
    }
    
    
//    private List<GamePerson> createPlayers(int numberPlayers, String name, Double balance) {
//	List<Player> playerslist = new ArrayList<>();
//	for (int i = 0; i < numberPlayers; i++) {
//	    playerslist.add(new Player(name, balance));
//	    
//	}
//	this.playerslist = playerslist;
//    }
    public List<GamePerson> getPlayersList() {
	return playersList;
    }
    
    private void prepareDeckToGame() {
	Collections.shuffle(deck.getDeck());
	iterDeck = deck.getDeck().iterator();
    }

    
}
