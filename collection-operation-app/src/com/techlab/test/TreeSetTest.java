package com.techlab.test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new TreeSet<String>();
		set.add("aa");
		set.add("bb");
		set.add("cc");
		printset(set);
		if(set.contains("cc")) {
			System.out.println("set has a element: cc");
		}
		set.remove("bb");
		System.out.println("after removing element:'bb' from set");
		printset(set);
	}

	private static void printset(Set<String> set) {
		// TODO Auto-generated method stub
		for(String s:set) {
			System.out.println(s);
		}
	}

}
