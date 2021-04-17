package com.techlab.test;

import com.techlab.model.Bike;
import com.techlab.model.Car;
import com.techlab.model.IMovable;
import com.techlab.model.Truck;

public class MovableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMovable[] movable = new IMovable[3];
		movable[0] = new Bike();
		movable[1] = new Car();
		movable[2] = new Truck();
		startRace(movable);
	}

	private static void startRace(IMovable[] movable) {
		// TODO Auto-generated method stub
		movable[0].run();
		movable[1].run();
		movable[2].run();
		System.out.println("Race Stopped");
	}

}
