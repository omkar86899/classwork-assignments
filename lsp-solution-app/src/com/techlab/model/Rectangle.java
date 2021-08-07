package com.techlab.model;

public class Rectangle implements Ishape {
	private int height,width;
	
	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
	public int getHeight() {
		return this.height;
	}
	public int getWidth() {
		return this.width;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}
	
}
