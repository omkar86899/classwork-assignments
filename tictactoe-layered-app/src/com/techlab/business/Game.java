package com.techlab.business;

public class Game {
	private Player p1, p2;
	private IResultAnalyzer resultAnalyzer;
	private IBoard board;
	private Player turn;
	
	public Game(Player p1, Player p2, IResultAnalyzer resultAnalyzer, IBoard board) {
		this.p1 = p1;
		this.p2 = p2;
		this.resultAnalyzer = resultAnalyzer;
		this.board = board;
		this.turn = p1;
	}
	
	private void changeTurn() {
		if(this.turn.getMark() == this.p1.getMark()) {
			this.turn = p2;
		}else {
			this.turn = p1;
		}
	}
	
	public Player getTurn() {
		return this.turn;
	}

	public Result play(int index) throws CellAlreadyMarkedException {
		this.board.markCell(index, this.turn.getMark());
		if(resultAnalyzer.getResult().equals(Result.Processing)) {
			changeTurn();
			return Result.Processing;
		}
		return resultAnalyzer.getResult();
	}
}
