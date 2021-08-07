package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
	private T data;
	private Node next;
	
	public Node(T data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	public T getData() {
		return this.data;
	}
	
	public Node<T> getNext() {
		return this.next;
	}
	
	public List printInfo() {
		List dataList = new ArrayList();
		dataList.add(this.getData());
		while(this.next != null) {
			dataList.add(this.next.getData());
			this.next = this.next.next;
		}
		return dataList;
	}
}
