package com.huorehu.blackjack.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.huorehu.blackjack.GameTable;
import com.huorehu.blackjack.controller.ConsoleDealerListener;
import com.huorehu.blackjack.controller.ConsolePlayerListener;
import com.huorehu.blackjack.controller.DealerListener;
import com.huorehu.blackjack.controller.PlayerListener;

public class ConsoleBlackJack {
    
    public static void main(String[] args) throws IOException {
	
	BufferedReader consoleIn = new BufferedReader(new InputStreamReader(System.in));
	PlayerListener consolePlayerListener = new ConsolePlayerListener(consoleIn);
	DealerListener dealerListener = new ConsoleDealerListener();
	Show show = new ConsoleShow();
	GameTable gTable = new GameTable(consolePlayerListener, dealerListener, show);
	gTable.startGame();
	
    }

}
