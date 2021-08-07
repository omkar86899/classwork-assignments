package com.techlab.model;

public class LineItem {
	private int lid;
	private int quantity;
	Product product;
	
	public LineItem(int lid, int quantity, Product product) {
		this.lid = lid;
		this.quantity = quantity;
		this.product = product;
	}
	
	public int getLid() {
		return lid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	
	public double calculateCost() {
		return quantity*product.getCost();
	}
}
