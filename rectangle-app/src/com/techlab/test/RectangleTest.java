package com.techlab.test;

import com.techlab.model.Rectangle;
import com.techlab.model.Thickness;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle small = new Rectangle(5,6,Thickness.MEDIUM);
		Rectangle big = new Rectangle(10,12);
		Rectangle[] rectArr = new Rectangle[3];
		rectArr[0] = small;
		rectArr[1] = big;
		rectArr[2] = new Rectangle(1,2,Thickness.HIGH);
		printInfo(rectArr);
	}
	
	private static void printInfo(Rectangle[] rArr) {
		for(Rectangle i: rArr) {
			System.out.println("Width of Rectangle is: "+i.getWidth());
			System.out.println("Height of Rectangle is: "+i.getHeight());
			System.out.println("Thickness of Rectangle is: "+i.getThickness());
			System.out.println("Area of Rectangle is: "+i.calculateArea());
			System.out.println("Hashcode is : "+i.hashCode());
		}
	}

}
