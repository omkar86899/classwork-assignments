package com.techlab.test;

import com.techlab.model.Boy;
import com.techlab.model.Infant;
import com.techlab.model.Kids;
import com.techlab.model.Man;

public class ManTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kids());
		atThePark(new Infant());
		
	}

	private static void atThePark(Man m) {
		// TODO Auto-generated method stub
		m.eat();
		m.play();
	}
}
