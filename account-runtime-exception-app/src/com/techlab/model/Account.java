package com.techlab.model;

public class Account {
	private int accNo;
	private String accName;
	private double balance;
	private boolean withdrawFlag = true;
	private double minimumBalance =500;
	
	public Account(int accNo,String accName,double balance) {
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
	
	public void deposit(double amount) {
		balance += amount;
	}
	public boolean withdraw(double amount) {
		if(balance-amount<minimumBalance) {
			withdrawFlag = false;
			throw new RuntimeException("Balance not sufficient");
		}else {
			balance -= amount;
		}
		return withdrawFlag;
	}
}
