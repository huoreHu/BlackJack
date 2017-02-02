package com.huorehu.blackjack.controller;

import com.huorehu.blackjack.GamePerson;
import com.huorehu.blackjack.model.Deck;
import com.huorehu.blackjack.view.Show;

public class ConsoleDealerListener implements DealerListener {
    
    @Override
    public boolean listenDealer(GamePerson dealer, DealerListener dealerListener, Show show, Deck deck) {
	while (!dealer.bust() && dealer.getPoints() < 17) {
	    dealer.hit(deck.getCard());
	    show.showPlayerCards(dealer.getCardInHand(), "Рука диллера:");
	} 
	return false;
    }

}
