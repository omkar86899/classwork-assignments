package com.techlab.model;

public class Managers implements IWork,IEat {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Manager is Working");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Manager is stopped working");
	}

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		System.out.println("Manager is Eating");
	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		System.out.println("Manager is stopped Eating");
	}

}
