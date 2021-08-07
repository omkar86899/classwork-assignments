package com.techlab.model;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardTest {

	@Test
	void testBoard_for_Size() {
		int expectedSize = 3;
		Board board = new Board(3);
		assertEquals(expectedSize, board.getSize());
	}

	@Test
	void testGetBoard_for_NoOfCells() {
		int expectedNoOfCells = 9;
		Board board = new Board(3);
		assertEquals(expectedNoOfCells, board.getBoard().size());
	}

	@Test
	void testCheckBoardisFull_for_initial_Empty_List() {
		boolean expectedBoardFullFlag = false;
		Board board = new Board(3);
		assertEquals(expectedBoardFullFlag, board.checkBoardisFull());
	}
	
	@Test
	void testCheckBoardisFull_After_Marking_One_Cell() throws CellAlreadyMarkedException {
		boolean expectedBoardFullFlag = false;
		Board board = new Board(3);
		board.markCell(0, Mark.O);
		assertEquals(expectedBoardFullFlag, board.checkBoardisFull());
	}
	
	@Test
	void testCheckBoardisFull_After_Marking_All_Cells() throws CellAlreadyMarkedException {
		boolean expectedBoardFullFlag = true;
		Board board = new Board(3);
		for (int i = 0; i < board.getSize(); i++) {
			board.markCell(i, Mark.O);
		}
		assertEquals(expectedBoardFullFlag, board.checkBoardisFull());
	}

	@Test
	void testGetBoard_for_After_Mark_A_Cell() throws CellAlreadyMarkedException {
		Mark expectedMark = Mark.O;
		Board board = new Board(3);
		board.getBoard().get(0).setMark(Mark.O);
		assertEquals(expectedMark, board.getBoard().get(0).getMark());
	}

	@Test
	void testMarkCell_for_Mark_AlreadyMarked_Cell() throws CellAlreadyMarkedException {
		String expectedMessage = "This cell is already marked";
		Board board = new Board(3);
		board.getBoard().get(0).setMark(Mark.O);
		try {
		board.getBoard().get(0).setMark(Mark.X);
		}catch(CellAlreadyMarkedException e) {
			assertEquals(expectedMessage,e.getMessage());
		}
	}

}
