package com.techlab.model;

public class Square extends Rectangle {
	private int side;
	
	public Square(int side) {
		super(side, side);
	}
	
	public void setHeight(int height) {
		this.height = this.width = height;
	}
	public void setWidth(int width) {
		this.width = this.height = width;
	}

}
