/*
 * This is TerminalTetris
 * an implementation of Tetris, run from a terminal.
 * 
 * Written by David Carvosso 2021
 * created as a simple demonstration of basic Java concepts for my programming portfolio
 * 
 */

import java.util.Scanner;
import java.lang.Thread; 

public class MainTEst {

	public static void main(String[] args) {

		System.out.println("TerminalTetris");
		
		
		DisplayScreen.StartScreen();

		Scanner inputScanner = new Scanner(System.in);
		
		
		int gameWidth = 20;
		int gameHeight = 40;
		char[][] gameState = new char[gameHeight][gameWidth];

		for(int i = 0; i < gameState.length ; i++){
			for(int j = 0; j < gameState[i].length; j++){
				gameState[i][j] = 'O';
			}
		}
		
		DisplayPrinter displayPrinter = new DisplayPrinter(gameState);
		
		displayPrinter.run();

		System.out.println("TerminalTetris End");
	
	}

}
