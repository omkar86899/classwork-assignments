package com.techlab.test;

import java.util.List;

import com.techlab.model.Account;
import com.techlab.model.Transaction;

public class AccountTest {

	public static void main(String[] args) {
		Account acc1 = new Account(11, "omkar", 1000);
		acc1.deposit(1000);
		try {
			acc1.withdraw(500);
			acc1.withdraw(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		printPassbook(acc1.getTransactions());
	}

	private static void printPassbook(List<Transaction> transactions) {
		for (Transaction transaction : transactions) {
			System.out.print(transaction.getType()+", ");
			System.out.print(transaction.getAmount()+", ");
			System.out.print(transaction.getDate()+", ");
			System.out.print(transaction.getTime()+", ");
			System.out.println(transaction.getCurrentAmount());
		}
	}

}
