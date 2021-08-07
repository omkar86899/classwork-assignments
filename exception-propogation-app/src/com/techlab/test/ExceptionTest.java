package com.techlab.test;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("calling functon1");
		try {
			function1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void function1() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Calling function2");
		function2();
	}

	private static void function2() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Calling function3");
		function3();
	}

	private static void function3() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside function3");
		throw new Exception("Something went wrong");
	}

}
