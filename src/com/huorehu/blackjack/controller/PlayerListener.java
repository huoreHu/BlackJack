package com.huorehu.blackjack.controller;

import java.io.IOException;

import com.huorehu.blackjack.GamePerson;
import com.huorehu.blackjack.model.Deck;
import com.huorehu.blackjack.view.Show;

public interface PlayerListener {
    
    boolean listenPlayer(GamePerson player, Show show, Deck deck) throws IOException;

}
