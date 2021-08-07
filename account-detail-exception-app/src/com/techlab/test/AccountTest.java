package com.techlab.test;

import com.techlab.model.Account;
import com.techlab.model.InsufficientBalanceException;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean withdrawFlag;
		Account a1 = new Account(11,"rajesh",200);
		int amount = 600;
		a1.deposit(700);
		try {
			withdrawFlag = a1.withdraw(amount);
			if(withdrawFlag==true) {
				System.out.println("Transaction Successful");
			}
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}
