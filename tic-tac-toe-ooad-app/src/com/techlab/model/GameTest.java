package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameTest {

	@Test
	void testGame_for_getting_Result() throws CellAlreadyMarkedException {
		Player p1 = new Player(Mark.O,"omkar");
		Player p2 = new Player(Mark.X, "sagar");
		Board board = new Board(3);
		Player expectedResult = p1;
		for (int i = 0; i < board.getSize(); i++) {
			board.markCell(i, p1.getMark());
		}
		Game game = new Game(p1,p2,resultAnalyzer, board);
		assertEquals(expectedResult, game.isWinner());
	}

	@Test
	void testChangeTurn() {
		Player p1 = new Player(Mark.O,"omkar");
		Player p2 = new Player(Mark.X, "sagar");
		ResultAnalyzer resultAnalyzer= new ResultAnalyzer(new Board(3));
		Player expectedPlayer = p2;
		Game game = new Game(p1,p2,resultAnalyzer);
		assertEquals(expectedPlayer, game.changeTurn(p1));
	}

}
