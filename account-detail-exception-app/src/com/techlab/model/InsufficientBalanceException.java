package com.techlab.model;

public class InsufficientBalanceException extends RuntimeException {
	private Account acc;
	private double amount;
	private String errorMessage;
	public InsufficientBalanceException(Account acc,double amount) {
		this.acc = acc;
		this.amount = amount;
	}
	
	public void setMessage() {
		errorMessage = "Account no: "+acc.getAccNo();
		errorMessage += "\nAccount Name: "+acc.getAccName();
		errorMessage += "\nAccount Balance: "+acc.getBalance();
		errorMessage += "\nNot possible to withdraw amount: "+amount;
	}
	public String getMessage() {
		setMessage();
		return errorMessage;
	}
}
