package com.techlab.model;

public class InvoicePrinter {
	private Invoice invoice;
	
	public InvoicePrinter(Invoice invoice) {
		this.invoice = invoice;
	}
	public void printToConsole() {
		System.out.println("Total cost is: "+invoice.calculateTotalCost());
	}
}
