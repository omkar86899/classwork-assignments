package com.techlab.model;

public abstract class Account {
	private int accNo;
	private String accName;
	protected double balance;
	private boolean transactionFlag = false;
	
	public Account(int accNo, String accName, double balance) {
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}
	
	public int getAccNo() {
		return this.accNo;
	}
	public String getAccName() {
		return this.accName;
	}
	public double getBalance() {
		return this.balance;
	}
	public boolean getTransactionFlag() {
		return transactionFlag;
	}
	public void setTransactionFlag(boolean tflag) {
		this.transactionFlag = tflag;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	public abstract void withdrwal(double amount);

}
