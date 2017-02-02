package com.huorehu.blackjack.controller;

import java.io.BufferedReader;
import java.io.IOException;

import com.huorehu.blackjack.GamePerson;
import com.huorehu.blackjack.model.Deck;
import com.huorehu.blackjack.view.Show;

public class ConsolePlayerListener implements PlayerListener {
    
    BufferedReader consoleIn;
    
    public ConsolePlayerListener(BufferedReader consoleIn) {
	this.consoleIn = consoleIn;
    }

    @Override
    public boolean listenPlayer(GamePerson player, Show show, Deck deck) throws IOException {
	while (!player.bust() && consoleIn.readLine().equalsIgnoreCase("h")) {
	    player.hit(deck.getCard());
	    show.showPlayerCards(player.getCardInHand(), "Рука игрока:");
	} 
	return false;
	
    }
}
