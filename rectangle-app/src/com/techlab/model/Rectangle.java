package com.techlab.model;

public class Rectangle {
	private int width;
	private int height;
	private String thickness;
	
	public Rectangle(int width,int height, Thickness t) {
		this.width = width;
		this.height = height;
		this.thickness = t.toString();
	}
	public Rectangle(int width,int height) {
		this(width,height,Thickness.LOW);
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public String getThickness() {
		return thickness;
	}
	public int calculateArea() {
		return width*height;
	}
	
}
