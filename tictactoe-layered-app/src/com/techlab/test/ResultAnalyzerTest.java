package com.techlab.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.business.Board;
import com.techlab.business.CellAlreadyMarkedException;
import com.techlab.business.Mark;
import com.techlab.business.Result;
import com.techlab.business.ResultAnalyzer;

class ResultAnalyzerTest {

	@Test
	void test() throws CellAlreadyMarkedException {
		Result expectedResult = Result.Win;
		Board board = new Board();
		board.markCell(0, Mark.O);
		board.markCell(1, Mark.O);
		board.markCell(2, Mark.O);
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		assertEquals(expectedResult,analyzer.getResult());
	}

}
