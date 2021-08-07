package com.techlab.test;

import business.domain.A;
import dataaccess.B;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		A a = new A(b);
		a.bar();
	}

}
