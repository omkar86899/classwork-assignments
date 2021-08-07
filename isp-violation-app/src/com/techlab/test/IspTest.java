package com.techlab.test;

import com.techlab.model.IWorkable;
import com.techlab.model.Managers;
import com.techlab.model.Robot;

public class IspTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Managers m = new Managers();
		Robot r = new Robot();
		printInfo(m);
		printInfo(r);
	}

	private static void printInfo(IWorkable object) {
		// TODO Auto-generated method stub
		object.startWork();
		object.stopWork();
		object.startEat();
		object.stopEat();
	}

}
