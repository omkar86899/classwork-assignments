package com.techlab.model;

public class Circle {
	private int radius;
	private String color;
	private float area, peri;
	private Circle biggestCircle;
	private static int lowerLimit = 10, upperLimit = 50;
	
	public Circle(int radius, Color c) {
		this.radius = check(radius);
		this.color = c.toString();
	}
	public Circle(int radius) {
		this(radius,Color.yellow);
	}
	
	public int getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	
	public float calculateArea() {
		area = (float) (3.14*radius*radius);
		return area;
	}
	public float calculatePeri() {
		peri = (float) (2*3.14*radius);
		return peri;
	}
	public Circle findBiggestCircle(Circle[] cArr) {
		biggestCircle = cArr[0];
		for (Circle circle : cArr) {
			if(circle.calculateArea()>biggestCircle.calculateArea()) {
				biggestCircle = circle;
			}
		}
		return biggestCircle;
	}
	
	public static int check(int r) {
		if(r>upperLimit||r<lowerLimit) {
			return 10;
		}
		else {
			return r;
		}
	}
}
