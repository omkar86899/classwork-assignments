package com.techlab.annotation.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import com.techlab.annotation.Foo;
import com.techlab.annotation.UnitTestCase;

public class FooReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doReflection(Foo.class);
	}

	private static void doReflection(Class<Foo> c) {
		// TODO Auto-generated method stub
		int number = 0,passt = 0,failt = 0;
		Method[] methods = c.getMethods();
		for (Method method : methods) {
			if(method.isAnnotationPresent(UnitTestCase.class)) {
				try {
					number += 1;
					boolean result = (boolean) method.invoke(new Foo());
					if(result == true) {
						passt +=1;
					}else {
						failt+=1;
					}
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		System.out.println("Found "+number+" unit test cases");
		System.out.println("Passing test: "+passt);
		System.out.println("Fail test: "+failt);
	}

}
