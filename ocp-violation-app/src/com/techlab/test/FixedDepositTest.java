package com.techlab.test;

import com.techlab.model.FestivalType;
import com.techlab.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedDeposit fd = new FixedDeposit(11,"omkar",10000,200,10,FestivalType.NORMAL);
		System.out.println(fd.calculateSimpleInterest());
	}

}
