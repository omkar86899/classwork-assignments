package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResultAnalyzerTest {

	@Test
	void testResultAnalyzer_For_Result_Player1_Wins() throws CellAlreadyMarkedException {
		Player p1 = new Player(Mark.O,"omkar");
		Player p2 = new Player(Mark.X, "sagar");
		Player expectedResult = p1;
		Board board = new Board(3);
		ResultAnalyzer resultAnalyzer= new ResultAnalyzer(board);
		for (int i = 0; i < board.getSize(); i++) {
			board.markCell(i, p1.getMark());
		}
		assertEquals(expectedResult,resultAnalyzer.getResult(p1, p2));
	}

	@Test
	void testResultAnalyzer_For_Result_Player2_Wins() throws CellAlreadyMarkedException {
		Player p1 = new Player(Mark.O,"omkar");
		Player p2 = new Player(Mark.X, "sagar");
		Player expectedResult = p2;
		Board board = new Board(3);
		ResultAnalyzer resultAnalyzer= new ResultAnalyzer(board);
		for (int i = 0; i < board.getSize(); i++) {
			board.markCell(i, p2.getMark());
		}
		assertEquals(expectedResult,resultAnalyzer.getResult(p1, p2));
	}
	
	@Test
	void testResultAnalyzer_For_Result_NoOneWins() throws CellAlreadyMarkedException {
		Player p1 = new Player(Mark.O,"omkar");
		Player p2 = new Player(Mark.X, "sagar");
		Player expectedResult = null;
		Board board = new Board(3);
		ResultAnalyzer resultAnalyzer= new ResultAnalyzer(board);
		assertEquals(expectedResult,resultAnalyzer.getResult(p1, p2));
	}
	
	@Test 
	void test_Result_When_BoardSize_isDifferent() throws CellAlreadyMarkedException{
		Player p1 = new Player(Mark.O,"omkar");
		Player p2 = new Player(Mark.X, "sagar");
		Player expectedResultForSize4 = p2;
		Board board4 = new Board(4);
		ResultAnalyzer resultAnalyzer4= new ResultAnalyzer(board4);
		for (int i = 0; i < board4.getSize(); i++) {
			board4.markCell(i, p2.getMark());
		}
		assertEquals(expectedResultForSize4,resultAnalyzer4.getResult(p1, p2));
	}
}
