package com.techlab.test;

import java.util.ArrayList;
import java.util.List;

import com.techlab.model.LineItem;

public class LineItemTest {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList cart = new ArrayList();
		LineItem i1,i2,i3;
		i1 = new LineItem(1,"a",100,6);
		i2 = new LineItem(2,"b",200,4);
		i3 = new LineItem(3,"c",150,6);
		cart.add(i1);
		cart.add(i2);
		cart.add(i3);
		cart.add("abc");
		printInfo(cart);
	}

	private static void printInfo(ArrayList cart) {
		// TODO Auto-generated method stub
		for(int i=0;i<cart.size();i++) {
			LineItem products = (LineItem) cart.get(i);
			System.out.println(products);
		}
	}


}
