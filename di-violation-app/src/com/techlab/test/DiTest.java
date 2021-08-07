package com.techlab.test;

import com.techlab.model.LogType;
import com.techlab.model.TaxCalculator;

public class DiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator t = new TaxCalculator(LogType.JSON);
		System.out.println(t.calculateTax(20, 10));
		System.out.println(t.calculateTax(10, 0));
	}

}
