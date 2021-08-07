package com.techlab.model;

import java.util.ArrayList;

public class Board {
	private int size;
	private final ArrayList<Cell> board;
	
	public Board(int size) {
		this.size = size;
		this.board = new ArrayList<Cell>();
		for (int i = 0; i <(this.size*this.size); i++) {
			board.add(new Cell());
		}
	}
	
	public int getSize() {
		return this.size;
	}
	public ArrayList<Cell> getBoard(){
		return this.board;
	}
	
	public void markCell(int index, Mark mark) throws CellAlreadyMarkedException {
		board.get(index).setMark(mark);
	}
	
	public boolean checkBoardisFull() {
		for (Cell cell : board) {
			if(!cell.getMark().equals(Mark.EMPTY)) {
				return false;
			}
		}
		return true;
	}
}
