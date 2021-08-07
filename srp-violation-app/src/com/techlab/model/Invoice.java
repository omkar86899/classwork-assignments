package com.techlab.model;

public class Invoice {
	private int no;
	private String name;
	private double amount, discountPercentage;
	private float GST;
	
	public Invoice(int no, String name, double amount, double discountPercentage) {
		this.no = no;
		this.name = name;
		this.amount = amount;
		this.discountPercentage = discountPercentage;
	}
	
	public int getId() {
		return this.no;
	}
	public String getName() {
		return this.name;
	}
	public double getAmount() {
		return this.amount;
	}
	public double getDiscountPercentage() {
		return this.discountPercentage;
	}
	
	public double calculateDiscount() {
		return this.amount*(this.discountPercentage/100);
	}
	public double calculateGST() {
		return this.amount*0.02;
	}
	public double calculateTotalCost() {
		return this.amount-this.calculateDiscount()+this.calculateGST();
	}
	public void printToConsole(Invoice invoice) {
		System.out.println("Total cost is: "+this.calculateTotalCost());
	}
}
