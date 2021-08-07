package com.techlab.business;

import java.util.ArrayList;

public interface IBoard {

	public void markCell(int index, Mark mark) throws CellAlreadyMarkedException;

	public ArrayList<Cell> getBoard();
	
	public int getSize();

}