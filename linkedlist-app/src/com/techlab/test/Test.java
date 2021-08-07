package com.techlab.test;

import com.techlab.model.Node;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<String> node3 = new Node<String>("omkar",null);
		Node<Integer> node2 = new Node<Integer>(3,node3);
		Node<Double> node1 = new Node<Double>(1.8,node2);
		System.out.println(node1.printInfo());
		System.out.println(node2.printInfo());
		System.out.println(node3.printInfo());
	}
}
