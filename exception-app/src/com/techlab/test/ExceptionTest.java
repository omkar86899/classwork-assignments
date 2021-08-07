package com.techlab.test;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println(c);
			System.out.println("end of main");
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
