package com.techlab.test;

import com.techlab.model.Ishape;
import com.techlab.model.Rectangle;
import com.techlab.model.Square;

public class LspTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(20,10);
		printInfo(r);
		Square s = new Square(10);
		printInfo(s);
	}

	private static void printInfo(Ishape shape) {
		// TODO Auto-generated method stub
		System.out.println(shape.calculateArea());
	}

}
