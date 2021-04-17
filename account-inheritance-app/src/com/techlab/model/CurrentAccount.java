package com.techlab.model;

public class CurrentAccount extends Account {
	public static final int minimumBalance = 1000;
	public CurrentAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
	}

	public void withdrwal(double amount) {
		if(this.balance-amount > minimumBalance) {
			this.balance -= amount;
		}
		else {
			this.setTransactionFlag(false);
		}
	}

}
