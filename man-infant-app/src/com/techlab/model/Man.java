package com.techlab.model;

public class Man implements IEmotionable,ISocialization {

	@Override
	public void depart() {
		// TODO Auto-generated method stub
		System.out.println("Man is Departing");
	}

	@Override
	public void wish() {
		// TODO Auto-generated method stub
		System.out.println("Man is Wishing");
		
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("Man is Crying");
	}

	@Override
	public void laugh() {
		// TODO Auto-generated method stub
		System.out.println("Man is Laughing");
	}

}
