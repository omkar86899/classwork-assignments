package com.techlab.model;

public class LineItem {
	private int id;
	private String name;
	private double unitPrice;
	private int quantity;
	private double totalItemCost;
	
	public LineItem(int id, String name, double unitPrice, int quantity) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public double getUnitPrice() {
		return this.unitPrice;
	}
	public int getQuantity() {
		return this.quantity;
	}
	
	public void calculateTotalItemPrice() {
		this.totalItemCost = unitPrice*quantity;
	}
	public double getTotalPrice() {
		return this.totalItemCost;
	}
	
	public String toString() {
		return "id is: "+this.id+"\nName is: "+this.name+"\nunit price is: "+this.unitPrice+"\nquantity is: "+this.quantity;
	}
}
