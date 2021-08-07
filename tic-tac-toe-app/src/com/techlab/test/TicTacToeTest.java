package com.techlab.test;

import java.util.Scanner;
import com.techlab.model.Board;
import com.techlab.model.Player;
import com.techlab.model.Symbol;
import com.techlab.model.TicTacToe;

public class TicTacToeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 3;
		Board board = new Board(size);
		Player p1 = new Player(Symbol.O,"Omkar");
		Player p2 = new Player(Symbol.X,"Sagar");
		TicTacToe game= new TicTacToe(p1);
		System.out.println("************\nTic-Tac-Toe!\n************");
		System.out.println("Player 1 is alloted O and Player 2 is alloted X\n");
		do {
			printBoard(board.getGameBoard());
			System.out.println(game.getTurn().getName()+"'s Move ("+game.getTurn().getSymbol()+"): ");
			board.move(sc.nextLine(), game.getTurn().getSymbol());
			if(!board.isBoardFull()) {
				if(!(board.isWinner(p1, p2)==null)) {
					System.out.println(game.getTurn().getName()+" is Winner");
					break;
				}
			}else {
				System.out.println("Board is Full");
				break;
			}
			game.changeTurn(p1, p2);
		} while(true);
	}

	private static void printBoard(Symbol[][] gameBoard) {
		// TODO Auto-generated method stub
		System.out.println("   1 2 3\n");
		for (int i = 0; i < gameBoard.length; i++) {
			Symbol[] symbols = gameBoard[i];
			String[] strSymbols = new String[gameBoard.length];
			for (int j = 0; j < symbols.length; j++) {
				Symbol symbol = symbols[j];
				if(symbol == null) {
					strSymbols[j] = " ";
				}else {
					strSymbols[j] = symbol.toString();
				}
			}
			System.out.println((i+1)+" |"+strSymbols[0]+"|"+strSymbols[1]+"|"+strSymbols[2]+"|\n"
					+ "--------\n");
		}
	}

}
