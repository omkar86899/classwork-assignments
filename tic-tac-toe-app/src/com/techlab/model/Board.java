package com.techlab.model;

public class Board {
	private int boardSize;
	private Symbol[][] gameBoard;
	
	public Board(int size) {
		this.boardSize = size;
		this.gameBoard = new Symbol[this.boardSize][this.boardSize];
	}
	
	public Symbol[][] getGameBoard() {
		return this.gameBoard;
	}
	
	public boolean move(String location, Symbol symbol) {
		int[] locationInt = isMoveValid(location);
		if(!locationInt.equals(null)) {
			this.gameBoard[locationInt[0]-1][locationInt[1]-1] = symbol;
			return true;
		}else {
			return false;
		}
	}
	private int[] isMoveValid(String location) {
		String[] locations = location.split(",");
		int[] locationsInt = new int[2];
		try {
			locationsInt[0] = Integer.parseInt(locations[0]);
			locationsInt[1] = Integer.parseInt(locations[1]);
		}catch(Exception e) {
			return null;
		}
		return locationsInt;
	}
	public boolean isBoardFull() {
		if(this.gameBoard == null) {
			return true;
		}
		return false;
	}
	public Player isWinner(Player p1,Player p2) {
		Symbol winnerSymbol = null;
		for (int i = 0; i < gameBoard.length; i++) {
			if(gameBoard[i][0]==gameBoard[i][1]&&gameBoard[i][1]==gameBoard[i][2]&&gameBoard[i][0]!=null) {
				winnerSymbol = gameBoard[i][0];
				break;
			}else if(gameBoard[0][i]==gameBoard[1][i]&&gameBoard[1][i]==gameBoard[2][i]&&gameBoard[0][i]!=null) {
				winnerSymbol = gameBoard[0][i];
				break;
			}
		}
		if(gameBoard[0][0]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[2][2]||gameBoard[0][2]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[2][0]&&gameBoard[1][1]!=null) {
			winnerSymbol = gameBoard[1][1];
		}
		
		if(winnerSymbol == p1.getSymbol()) {
			return p1;
		}else if(winnerSymbol == p2.getSymbol()) {
			return p2;
		}else {
			return null;
		}
	}
}
