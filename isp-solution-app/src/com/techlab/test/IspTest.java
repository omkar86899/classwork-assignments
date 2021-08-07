package com.techlab.test;

import com.techlab.model.IEat;
import com.techlab.model.IWork;
import com.techlab.model.Managers;
import com.techlab.model.Robot;

public class IspTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Managers m = new Managers();
		Robot r = new Robot();
		printInfow(m);
		printInfoe(m);
		printInfow(r);
	}

	private static void printInfow(IWork object) {
		// TODO Auto-generated method stub
		object.startWork();
		object.stopWork();
	}
	private static void printInfoe(IEat object) {
		// TODO Auto-generated method stub
		object.startEat();
		object.stopEat();
	}

}
