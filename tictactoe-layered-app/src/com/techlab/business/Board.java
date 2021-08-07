package com.techlab.business;

import java.util.ArrayList;

public class Board implements IBoard {
	private ArrayList<Cell> board;
	private int size;
	
	public Board() {
		this.board = new ArrayList<Cell>();
		this.size = 3;
		for (int i = 0; i <this.size*this.size; i++) {
			board.add(new Cell());
		}
	}
	
	@Override
	public ArrayList<Cell> getBoard(){
		return this.board;
	}
	
	@Override
	public void markCell(int index, Mark mark) throws CellAlreadyMarkedException {
		board.get(index).setMark(mark);
	}

	@Override
	public int getSize() {
		return this.size;
	}
}
