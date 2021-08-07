package com.techlab.model;

import java.util.ArrayList;

public class Order {
	private int oid;
	private String date;
	private final ArrayList<LineItem> items;
	
	public Order(int oid, String date) {
		this.oid = oid;
		this.date = date;
		this.items = new ArrayList<LineItem>();
	}
	
	public int getOid() {
		return oid;
	}
	public String getDate() {
		return date;
	}
	
	public void addItem(LineItem item) {
		boolean addFlag = true;
		if(items.isEmpty()) {
			items.add(item);
		}else {
			for (LineItem lineItem : items) {
				if(lineItem.getProduct().getPname().equals(item.getProduct().getPname())) {
					addFlag = false;
					lineItem.setQuantity(item.getQuantity()+lineItem.getQuantity());
				}
			}
			if(addFlag) {
				items.add(item);
			}
		}
	}
	
	public ArrayList<LineItem> getTotalItems(){
		return this.items;
	}
	public double checkOutPrice() {
		double price = 0;
		for (LineItem lineItem : items) {
			price += lineItem.calculateCost();
		}
		return price;
	}
}
