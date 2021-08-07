package com.techlab.model;

public class Robot implements IWork{

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
}
