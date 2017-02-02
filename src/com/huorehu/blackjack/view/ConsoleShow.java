package com.huorehu.blackjack.view;

import java.util.List;

import com.huorehu.blackjack.model.Cards;

public class ConsoleShow implements Show {

    @Override
    public void showPlayerCards(List<Cards> hand, String namePerson) {
	System.out.println(namePerson);
	for (Cards card : hand) {
	    System.out.print(card + " ");
	}
	System.out.println();
    }
    
    @Override
    public void showWinner(boolean playerWinner) {
	if (playerWinner) {
	    System.out.println("Игрок выиграл!");
	} else {
	    System.out.println("Игрок проиграл!");
	}
    }

}
