package com.techlab.annotation.test;

import java.lang.reflect.Method;

import com.techlab.annotation.Customer;
import com.techlab.annotation.NeedToBeRefactor;

public class CustomerReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doReflection(Customer.class);
	}

	private static void doReflection(Class<Customer> c) {
		// TODO Auto-generated method stub
		System.out.println("Methods to be Refactor as:");
		Method[] methods = c.getMethods();
		for (Method method : methods) {
			if(method.isAnnotationPresent(NeedToBeRefactor.class)) {
				System.out.println(method.getName());
			}
		}
		
	}

}
