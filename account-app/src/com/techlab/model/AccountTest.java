package com.techlab.model;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AccountTest {

	@SuppressWarnings("deprecation")
	@Test
	void testAccount() {
		int expectedAccNo = 11;
		String expectedName = "omkar";
		double expectedBalance = 2000;
		Account a1 = new Account(11, "omkar", 2000);
		assertEquals(expectedAccNo,a1.getAccNo());
		assertEquals(expectedName,a1.getAccName());
		assertEquals(expectedBalance,a1.getBalance());
	}

	@SuppressWarnings("deprecation")
	@Test
	void testDeposit() {
		double expectedBalance = 2500;
		Account a1 = new Account(11, "omkar", 2000);
		a1.deposit(500);
		assertEquals(expectedBalance,a1.getBalance());
	}

	@SuppressWarnings("deprecation")
	@Test
	void testWithdraw() {
		double expectedBalance = 1500;
		Account a1 = new Account(11, "omkar", 2000);
		a1.withdraw(500);
		assertEquals(expectedBalance,a1.getBalance());
	}

}
