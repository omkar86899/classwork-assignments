package com.techlab.model;

public class Robot implements IWorkable{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot is Working");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot is stopped Working");
	}

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		System.out.println("Robot is eating");
	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		System.out.println("Robot is stopped eating");
	}

}
