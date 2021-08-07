package com.techlab.test;

import java.util.ArrayList;
import com.techlab.model.LineItem;

public class LineItemTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<LineItem> cart = new ArrayList<LineItem>();
		LineItem i1,i2,i3;
		i1 = new LineItem(1,"a",100,6);
		i2 = new LineItem(2,"b",200,4);
		i3 = new LineItem(3,"c",150,6);
		cart.add(i1);
		cart.add(i2);
		cart.add(i3);
		printInfo(cart);
	}

	private static void printInfo(ArrayList<LineItem> cart) {
		// TODO Auto-generated method stub
		for(int i=0;i<cart.size();i++) {
			System.out.println(cart.get(i));
		}
	}

}
