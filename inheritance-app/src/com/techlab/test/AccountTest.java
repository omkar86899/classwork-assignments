package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(11,"rajesh",200);
		Account a2 = new Account(11,"mukesh",200);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
	}

}
