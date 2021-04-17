package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("rajesh",200);
		printInfo(a1);
		Account a2 = new Account("mukesh",200);
		printInfo(a2);
		Account a3 = new Account("swati",200);
		printInfo(a3);

	}

	private static void printInfo(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Account no: "+account.getAccNo());
		System.out.println("Account Name: "+account.getAccName());
		System.out.println("Account Balance: "+account.getBalance());
	}

}
