package com.huorehu.blackjack;

import java.io.IOException;

import com.huorehu.blackjack.controller.DealerListener;
import com.huorehu.blackjack.controller.PlayerListener;
import com.huorehu.blackjack.model.Deck;
import com.huorehu.blackjack.view.Show;

public class GameTable {
    
    private Deck deck = new Deck();
    
    private Dealer dealer = new Dealer("Max", deck);
    
    private GamePerson player = new Player("");
    
    private PlayerListener playerListener;
    
    private DealerListener dealerListener;
    
    private Show show;
    
    public GameTable(PlayerListener playerListener, DealerListener dealerListener, Show show) {
	this.playerListener = playerListener;
	this.dealerListener = dealerListener;
	this.show = show;
    }
    
    public void startGame() throws IOException {
	deck.shuffleCards();
	dealer.handOutCards(player);
	showHandAllPlayers();
	playerListener.listenPlayer(player, show, deck);
	if (!player.bust()) {
	    dealerListener.listenDealer(dealer, dealerListener, show, deck);
	    if (!dealer.bust()) {
		if (player.getPoints() == dealer.getPoints()) {
		    showHandAllPlayers();
		    System.out.println("Ничья!");
		} else {
		    showHandAllPlayers();
		    show.showWinner(dealer.definitionOfWinners(player));
		}
	    } else {
		showHandAllPlayers();
		System.out.println("Игрок выиграл!");
	    }
	} else {
	    showHandAllPlayers();
	    System.out.println("Игрок проиграл!");
	}
	
    }
    
    private void showHandAllPlayers() {
	show.showPlayerCards(player.getCardInHand(), "Рука игрока:");
	show.showPlayerCards(dealer.getCardInHand(), "Рука диллера:");
    }
    
}
