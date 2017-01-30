package com.huorehu.blackjack.view;

import com.huorehu.blackjack.GameTable;
import com.huorehu.blackjack.Settings;

public class ConsoleBlackJack {
    
    private void run() {
	Settings settings = new Settings(true);
	GameTable gameTable = new GameTable(settings);
	gameTable.startGame();
	
	for (int i = 0; i < settings.getGamePersons().size(); i++) {
	    System.out.println("Рука " + (i + 1) + " игрока:");
	    for (int j = 0; j < settings.getGamePersons().get(i).getCardInHand().size(); j++  ) {
		System.out.print(settings.getGamePersons().get(i).getCardInHand().get(j) + " ");
	    }
	    System.out.println();
	}
	//gameTable.showHands();
	
    }

    public static void main(String[] args) {
	ConsoleBlackJack consoleBlackJack = new ConsoleBlackJack();
	consoleBlackJack.run();
    }

}
