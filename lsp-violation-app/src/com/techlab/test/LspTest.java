package com.techlab.test;

import com.techlab.model.Rectangle;
import com.techlab.model.Square;

public class LspTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(20,10);
		shouldNotChangeWidthIfHeightIsModified(r);
		Square s = new Square(10);
		shouldNotChangeWidthIfHeightIsModified(s);
	}

	private static void shouldNotChangeWidthIfHeightIsModified(Rectangle r) {
		// TODO Auto-generated method stub
		int beforeWidth = r.getWidth();
		r.setHeight(r.getHeight()+5);
		int afterWidth = r.getWidth();
		System.out.println(beforeWidth == afterWidth);
		System.out.println(r.calculateArea());
	}

}
