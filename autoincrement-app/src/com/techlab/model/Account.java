package com.techlab.model;

public class Account {
	private int accNo;
	private String accName;
	private double balance;
	private static int counter = 100;
	
	public Account(String accName, double balance) {
		this.accName = accName;
		this.balance = balance;
		counter+=1;
		this.accNo = counter;
	}
	
	public int getAccNo() {
		return accNo;
	}
	public String getAccName() {
		return accName;
	}
	public double getBalance() {
		return balance;
	}
}
