package com.techlab.test;

import com.techlab.model.Invoice;
import com.techlab.model.InvoicePrinter;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice i1 = new Invoice(10,"Product1",1000,10);
		InvoicePrinter ip1 = new InvoicePrinter(i1);
		ip1.printToConsole();
	}

}
