package com.huorehu.blackjack.controller;

import com.huorehu.blackjack.GamePerson;
import com.huorehu.blackjack.model.Deck;
import com.huorehu.blackjack.view.Show;

public interface DealerListener {
    
    public boolean listenDealer(GamePerson player, DealerListener dealerListener, Show show, Deck deck);

}
