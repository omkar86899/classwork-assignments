package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {

	@Test
	void testPlayer() {
		String expectedName = "omkar";
		Mark expectedMark = Mark.O;
		Player p = new Player(Mark.O,"omkar");
		assertEquals(expectedName, p.getName());
		assertEquals(expectedMark, p.getMark());
	}

}
