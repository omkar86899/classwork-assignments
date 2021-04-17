package com.techlab.test;

import com.techlab.model.Circle;
import com.techlab.model.Color;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] cArr = new Circle[3];
		cArr[0] = new Circle(20,Color.blue);
		cArr[1] = new Circle(30);
		cArr[2] = new Circle(51,Color.green);
		Circle biggestCircle=cArr[0].findBiggestCircle(cArr);
		printInfo(cArr[0]);
		printInfo(cArr[1]);
		printInfo(cArr[2]);
		System.out.println("Info of the Biggest Circle is:");
		printInfo(biggestCircle);
	}

	private static void printInfo(Circle circle) {
		// TODO Auto-generated method stub
		System.out.println("Radius of Circle is: "+circle.getRadius());
		System.out.println("Color of Circle is: "+circle.getColor());
		System.out.println("Perimeter of Circle is: "+circle.calculatePeri());
		System.out.println("Area of Circle is: "+circle.calculateArea());
	}

}
