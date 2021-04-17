package com.techlab.test;

import com.techlab.model.Account;
import com.techlab.model.CurrentAccount;
import com.techlab.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount s1 = new SavingAccount(10,"rajesh",1000);
		s1.deposit(1000);
		s1.withdrwal(1600);
		if(s1.getTransactionFlag() == false) {
			System.out.println("Transaction Aborted");
		}
		printInfo(s1);
		CurrentAccount c1 = new CurrentAccount(11,"omkar",2000);
		c1.deposit(1000);
		c1.withdrwal(2500);
		if(c1.getTransactionFlag() == false) {
			System.out.println("Transaction Aborted");
		}
		printInfo(c1);

	}

	private static void printInfo(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Account number is: "+account.getAccNo());
		System.out.println("Account name is: "+account.getAccName());
		System.out.println("Account Balance is: "+account.getBalance());
	}

}
