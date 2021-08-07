package com.techlab.test;

import com.techlab.model.JSONLogger;
import com.techlab.model.TaxCalculator;

public class DiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONLogger json = new JSONLogger();
		TaxCalculator t = new TaxCalculator(json);
		System.out.println(t.calculateTax(20, 10));
		System.out.println(t.calculateTax(10, 0));
	}

}
