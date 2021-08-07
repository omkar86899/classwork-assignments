package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CellTest {

	@Test
	void testCell() {
		Mark expectedMark = Mark.EMPTY;
		Cell c = new Cell();
		assertEquals(expectedMark,c.getMark());
	}

	@Test
	void testGetMark() {
		Mark expectedMark = Mark.O;
		Cell c = new Cell();
		assertEquals(expectedMark,c.getMark());
	}

	@Test
	void test_SetMark_For_EmptyCell() throws CellAlreadyMarkedException {
		Mark expectedMark = Mark.EMPTY;
		Cell c = new Cell();
		c.setMark(Mark.EMPTY);
		assertEquals(expectedMark,c.getMark());
	}
	
	@Test
	void test_SetMark_For_O() throws CellAlreadyMarkedException {
		Mark expectedMark = Mark.O;
		Cell c = new Cell();
		c.setMark(Mark.O);
		assertEquals(expectedMark,c.getMark());
	}
	
	@Test
	void test_SetMark_For_X() throws CellAlreadyMarkedException {
		Mark expectedMark = Mark.X;
		Cell c = new Cell();
		c.setMark(Mark.X);
		assertEquals(expectedMark,c.getMark());
	}
	
	@Test
	void test_SetMark_For_X_If_Already_Marked() throws CellAlreadyMarkedException {
		Mark expectedMark = Mark.X;
		Cell c = new Cell();
		c.setMark(Mark.X);
		c.setMark(Mark.O);
		assertEquals(expectedMark,c.getMark());
	}

}
