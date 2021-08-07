package com.techlab.model;

public class TicTacToe {
	private Player turn;
	
	public TicTacToe(Player turn) {
		this.turn = turn;
	}
	
	public Player getTurn() {
		return this.turn;
	}
	public void changeTurn(Player p1, Player p2) {
		if(this.turn.getSymbol()==p1.getSymbol()) {
			this.turn = p2;
		}else {
			this.turn = p1;
		}
	}
}
