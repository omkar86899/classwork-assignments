package com.techlab.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ResultAnalyzer {
	public Board board;
	
	public ResultAnalyzer(Board board) {
		this.board = board;
	}
	
	public Player getResult(Player p1,Player p2) {
		Mark horizontalCheck, verticalCheck, diagonalCheck, winnerMark = null;
		horizontalCheck = horizontalCheck();
		verticalCheck = verticalCheck();
		diagonalCheck = diagonalCheck();
		if(horizontalCheck!= Mark.EMPTY) {
			winnerMark = horizontalCheck;
		}else if(verticalCheck!=Mark.EMPTY) {
			winnerMark = verticalCheck;
		}else if(diagonalCheck != Mark.EMPTY) {
			winnerMark = diagonalCheck;
		}
		if(winnerMark == p1.getMark()) {
			return p1;
		}else if(winnerMark == p2.getMark()) {
			return p2;
		}
		return null;
	}

	private Mark diagonalCheck() {
		ArrayList<Cell> board = this.board.getBoard();
		ArrayList<Cell> diagonalList1 = new ArrayList<Cell>();
		ArrayList<Cell> diagonalList2 = new ArrayList<Cell>();
		for (int i = 0; i < this.board.getSize(); i++) {
			diagonalList1.add(board.get(i*(this.board.getSize()+1)));
			diagonalList2.add(board.get((i+1)*(this.board.getSize()-1)));
		}
		if(allSame(diagonalList1)&&diagonalList1.get(0).getMark()!=Mark.EMPTY) {
			return board.get(0).getMark();
		}else if(allSame(diagonalList2)&&diagonalList1.get(0).getMark()!=Mark.EMPTY) {
			return board.get(this.board.getSize()-1).getMark();
		}
		return Mark.EMPTY;
	}

	private Mark verticalCheck() {
		ArrayList<Cell> board = this.board.getBoard();
		ArrayList<Cell> verticalList = new ArrayList<Cell>();
		for (int i = 0; i < this.board.getSize(); i++) {
			for (int j = i; j < this.board.getSize(); j=j+4) {
				verticalList.add(board.get(j));
			}
			if(allSame(verticalList)&&board.get(i).getMark()!=Mark.EMPTY) {
				return board.get(i).getMark();
			}
		}
		return Mark.EMPTY;
	}

	private Mark horizontalCheck() {
		ArrayList<Cell> board = this.board.getBoard();
		for (int i = 0; i <this.board.getSize() ; i = i+this.board.getSize()) {
			if(allSame(board.subList(i, i+this.board.getSize()))&&board.get(i).getMark()!=Mark.EMPTY) {
				return board.get(i).getMark();
			}
		}
		return Mark.EMPTY;
	}

	private boolean allSame(List<Cell> subList) {
		for (Cell cell : subList) {
			if(!cell.equals(subList.get(0))) {
				return false;
			}
		}
		return true;
	}
}
