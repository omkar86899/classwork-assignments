package com.techlab.model;

public class Game {
	private Player p1, p2;
	private ResultAnalyzer resultAnalyzer;
	private Board board;
	private Player turn;
	
	public Game(Player p1, Player p2, ResultAnalyzer resultAnalyzer, Board board) {
		this.p1 = p1;
		this.p2 = p2;
		this.resultAnalyzer = resultAnalyzer;
		this.board = board;
		this.turn = p1;
	}
	
	private void changeTurn() {
		if(turn.getMark() == p1.getMark()) {
			this.turn = p2;
		}else {
			this.turn = p1;
		}
	}
	
	public Player play(int index) throws CellAlreadyMarkedException {
		this.board.markCell(0, turn.getMark());
		changeTurn();
		return resultAnalyzer.getResult(p1, p2);
	}
}
