package com.techlab.test;

import com.techlab.model.DiwaliRate;
import com.techlab.model.FixedDeposit;
import com.techlab.model.IFestivalRate;

public class FixedDepositTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFestivalRate f;
		f = new DiwaliRate();
		FixedDeposit fd = new FixedDeposit(11,"omkar",10000,200,10,f);
		System.out.println(fd.calculateSimpleInterest());
	}

}
