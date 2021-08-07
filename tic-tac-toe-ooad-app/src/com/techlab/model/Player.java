package com.techlab.model;

public class Player {
	private Mark mark;
	private String name;
	
	public Player(Mark mark, String name) {
		this.mark = mark;
		this.name = name;
	}
	
	public Mark getMark() {
		return this.mark;
	}
	public String getName() {
		return this.name;
	}
}
