package com.techlab.presentation;

import java.util.ArrayList;
import java.util.Scanner;
import com.techlab.business.Board;
import com.techlab.business.Cell;
import com.techlab.business.CellAlreadyMarkedException;
import com.techlab.business.Game;
import com.techlab.business.IBoard;
import com.techlab.business.IResultAnalyzer;
import com.techlab.business.Mark;
import com.techlab.business.Player;
import com.techlab.business.Result;
import com.techlab.business.ResultAnalyzer;

public class TicTacToeConsole {
	private Game game;
	private Player p1, p2;
	private IResultAnalyzer analyzer;
	private IBoard board;

	public TicTacToeConsole() throws CellAlreadyMarkedException {
		this.p1 = new Player(Mark.O, "omkar");
		this.p2 = new Player(Mark.X, "sagar");
		this.board = new Board();
		this.analyzer = new ResultAnalyzer(board);
		this.game = new Game(p1, p2, analyzer, board);
		startGame();
	}

	private void startGame() throws CellAlreadyMarkedException {
		printBoard();
		Result result = Result.Processing;
		Scanner sc = new Scanner(System.in);
		while (result.equals(Result.Processing)) {
			System.out.println(game.getTurn().getName() + "'s (" + this.game.getTurn().getMark().toString() + ") Turn");
			System.out.print("Enter location: ");
			result = this.game.play(sc.nextInt() - 1);
			printBoard();
		}
		sc.close();
		if (result.equals(Result.Win)) {
			System.out.println(game.getTurn().getName() + " is Winner");
		} else {
			System.out.println("Draw");
		}
	}

	private void printBoard() {
		ArrayList<Cell> gameBoard = this.board.getBoard();
		int i = 1;
		for (Cell cell : gameBoard) {
			String mark = cell.getMark().toString();
			printMark(mark, i);
			i++;
		}
	}

	private void printMark(String mark, int i) {
		if (mark.equals("EMPTY")) {
			mark = String.valueOf(i);
		}

		if (i % this.board.getSize() != 0) {
			System.out.print(mark + "|");
		} else {
			System.out.println(mark);
		}

	}
}
