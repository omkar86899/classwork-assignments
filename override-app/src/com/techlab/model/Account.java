package com.techlab.model;

public class Account {
	int id;
	public Account(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		System.out.println(super.hashCode());
		return this.id;
	}
}
