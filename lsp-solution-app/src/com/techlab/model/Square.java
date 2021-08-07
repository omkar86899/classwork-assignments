package com.techlab.model;

public class Square implements Ishape {
	private int side;
	
	public Square(int side) {
		this.side = side;
	}
	
	public int getHeight() {
		return this.side;
	}
	public int getWidth() {
		return this.side;
	}
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.side*this.side;
	}
}
