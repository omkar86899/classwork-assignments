package com.techlab.test;

public class RuntimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("calling functon1");
		function1();
	}

	private static void function1() {
		// TODO Auto-generated method stub
		System.out.println("Calling function2");
		function2();
	}

	private static void function2() {
		// TODO Auto-generated method stub
		System.out.println("Calling function3");
		function3();
	}

	private static void function3() {
		// TODO Auto-generated method stub
		System.out.println("Inside function3");
		throw new RuntimeException("Something went wrong");
	}
}
	
