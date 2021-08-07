package com.techlab.business;

import java.util.ArrayList;

public class ResultAnalyzer implements IResultAnalyzer {
	private IBoard board;
	
	public ResultAnalyzer(IBoard board) {
		this.board = board;
	}
	
	@Override
	public Result getResult() {
		ArrayList<Cell> gameBoard = this.board.getBoard();
		if(horizontalCheck(gameBoard)||verticalCheck(gameBoard)||diagonalCheck(gameBoard)) {
			return Result.Win;
		}else if(checkBoardisFull(gameBoard)) {
			return Result.Draw;
		}else {
			return Result.Processing;
		}
	}

	private boolean diagonalCheck(ArrayList<Cell> gameBoard) {
		if(((gameBoard.get(0).getMark()==gameBoard.get(4).getMark()&&gameBoard.get(4).getMark()==gameBoard.get(8).getMark())||(gameBoard.get(2).getMark()==gameBoard.get(4).getMark()&&gameBoard.get(4).getMark()==gameBoard.get(6).getMark()))&&gameBoard.get(4).getMark()!=Mark.EMPTY) {
			return true;
		}
		return false;
	}

	private boolean verticalCheck(ArrayList<Cell> gameBoard) {
		for (int i = 0; i < this.board.getSize(); i++) {
			if((gameBoard.get(i).getMark()==gameBoard.get(i+3).getMark()&&gameBoard.get(i+3).getMark()==gameBoard.get(i+6).getMark())&&gameBoard.get(i).getMark()!=Mark.EMPTY) {
				return true;
			}
		}
		return false;
	}

	private boolean horizontalCheck(ArrayList<Cell> gameBoard) {
		for (int i = 0; i < gameBoard.size(); i = i+this.board.getSize()) {
			if((gameBoard.get(i).getMark()==gameBoard.get(i+1).getMark()&&gameBoard.get(i+1).getMark()==gameBoard.get(i+2).getMark())&&!gameBoard.get(i).getMark().equals(Mark.EMPTY)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkBoardisFull(ArrayList<Cell> gameBoard) {
		for (Cell cell : gameBoard) {
			if(cell.getMark().equals(Mark.EMPTY)) {
				return false;
			}
		}
		return true;
	}
}
