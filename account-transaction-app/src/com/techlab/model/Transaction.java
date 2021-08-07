package com.techlab.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction {
	private TransactionType type;
	private LocalDate date;
	private LocalTime time;
	private double amount;
	private double currentAmount;
	
	public Transaction(TransactionType type, LocalDate date, LocalTime time, double amount, double currentAmount) {
		this.type = type;
		this.date = date;
		this.time = time;
		this.amount = amount;
		this.currentAmount = currentAmount;
	}

	public TransactionType getType() {
		return this.type;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public LocalTime getTime() {
		return this.time;
	}

	public double getAmount() {
		return this.amount;
	}

	public double getCurrentAmount() {
		return this.currentAmount;
	}
	
	
}
