package com.techlab.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accNo;
	private String accName;
	private double balance = 0;
	private double minimumBalance = 1000;
	private List<Transaction> transactions;

	public Account(int accNo, String accName, double balance) {
		this.accNo = accNo;
		this.accName = accName;
		this.transactions = new ArrayList<Transaction>();
		deposit(balance);
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
	
	public List<Transaction> getTransactions(){
		return this.transactions;
	}

	public void deposit(double amount) {
		this.balance += amount;
		this.transactions.add(new Transaction(TransactionType.deposit, LocalDate.now(), LocalTime.now(), amount, this.balance));
	}

	public void withdraw(double amount) throws Exception {
		if (this.balance - amount < minimumBalance) {
			throw new Exception("Balance not sufficient");
		} else {
			balance -= amount;
			this.transactions.add(new Transaction(TransactionType.withdraw, LocalDate.now(), LocalTime.now(), amount, this.balance));
		}
	}
}
