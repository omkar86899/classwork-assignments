package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(11,"rajesh",200);
		a1.deposit(300);
		boolean transactionFlag = a1.withdraw(500);
		if(transactionFlag==true) {
			System.out.println("Transaction Successful");
		}else {
			System.out.println("Transaction Aborted");
		}
		printInfo(a1);
	}

	private static void printInfo(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Account no: "+account.getAccNo());
		System.out.println("Account Name: "+account.getAccName());
		System.out.println("Account Balance: "+account.getBalance());
	}

}
