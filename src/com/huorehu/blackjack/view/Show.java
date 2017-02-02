package com.huorehu.blackjack.view;

import java.util.List;

import com.huorehu.blackjack.model.Cards;

public interface Show {
    
    void showPlayerCards(List<Cards> hand, String namePerson);

    void showWinner(boolean playerWinner);
}
