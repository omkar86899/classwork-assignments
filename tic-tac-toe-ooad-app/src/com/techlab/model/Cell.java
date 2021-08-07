package com.techlab.model;

public class Cell {
	private Mark mark;
	
	public Cell() {
		this.mark = mark.EMPTY;
	}
	
	public Mark getMark() {
		return this.mark;
	}
	public void setMark(Mark mark) throws CellAlreadyMarkedException {
		if(this.mark == Mark.EMPTY) {
			this.mark = mark;
		}else {
			throw new CellAlreadyMarkedException("This cell is already marked");
		}
	}
}
