package com.techlab.model;

public class Account {
	private int accNo;
	private String accName;
	private double balance;
	
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

	@Override
	public int hashCode() {
		return accNo;
	}

	@Override
	public boolean equals(Object obj) {
		Account a =(Account)obj;
		if(this.accNo==a.accNo) {
			return true;
		}else {
			return false;
		}
	}
	
}
