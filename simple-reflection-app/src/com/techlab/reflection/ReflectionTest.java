package com.techlab.reflection;

import java.lang.reflect.Method;
import com.techlab.model.Rectangle;

public class ReflectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doReflection(Object.class);
		doReflection(String.class);
		doReflection(Rectangle.class);
	}
	private static void doReflection(Class<?> c) {
		// TODO Auto-generated method stub
		int getters = 0,setters = 0;
		System.out.println(c.getName());
		Method m[] = c.getMethods();
        for(int i = 0; i < m.length; i++) {
           System.out.println(m[i].getName());
        }
        System.out.println(m.length);
        System.out.println("getters:");
        for(Method method : m){
			if(isGetter(method)) {
            	getters += 1;
            	System.out.println(method.getName());
			}
          }
        System.out.println("setters:");
        for(Method method : m){
			if(isSetter(method)) {
            	setters +=1;
            	System.out.println(method.getName());
			}
          }
        System.out.println("Total getters: "+getters);
        System.out.println("Total setters: "+setters);
	}
	private static boolean isSetter(Method method) {
		// TODO Auto-generated method stub
		if(method.getName().startsWith("set")) return true;
		else return false;
	}
	private static boolean isGetter(Method method) {
		// TODO Auto-generated method stub
		if(method.getName().startsWith("get")) return true;
		else return false;
	}
	
	

}
