package com.techlab.model;

public class Product {
	private int pid;
	private String pname;
	private double cost;
	
	public Product(int pid, String pname, double cost) {
		this.pid = pid;
		this.pname = pname;
		this.cost = cost;
	}
	
	public int getPid() {
		return this.pid;
	}
	public String getPname() {
		return this.pname;
	}
	public double getCost() {
		return this.cost;
	}
}
