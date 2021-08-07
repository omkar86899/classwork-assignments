package com.techlab.test;

import com.techlab.model.Account;

public class AccountExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(11,"rajesh",200);
		a1.deposit(700);
		try {
			a1.withdraw(600);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
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
