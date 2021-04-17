package com.techlab.model;

public class Account {
	private int accNo;
	private String accName;
	private double balance;
	private static int headCount;
	
	static {
		headCount=0;
	}
	
	public Account(int accNo,String accName,double balance) {
		headCount +=1;
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
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
	public int getCounter() {
		return headCount;
	}
	
	public static int headCount() {
		return headCount;
	}
}
