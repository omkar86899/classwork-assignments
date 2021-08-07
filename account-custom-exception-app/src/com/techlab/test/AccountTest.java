package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(11,"rajesh",200);
		a1.deposit(700);
		try {
			boolean withdrawFlag = a1.withdraw(600);
			if(withdrawFlag==true) {
				System.out.println("Transaction Successful");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
