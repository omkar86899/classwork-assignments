package com.techlab.test;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		printList(list);
		System.out.println("changing first element");
		list.set(0, "dd");
		printList(list);
		System.out.println("first element of list is: "+list.get(0));
		list.remove(1);
		System.out.println("after removing second element from list");
		printList(list);
	}
	
	public static void printList(List<String> list) {
		for(String s:list) {
			System.out.println(s);
		}
	}

}
