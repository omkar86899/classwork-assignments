package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testCustomer() {
		int expectedCid = 10;
		String expectedCname = "omkar";
		Customer c = new Customer(10,"omkar");
		assertEquals(expectedCid,c.getCid());
		assertEquals(expectedCname,c.getCname());
	}

	@Test
	void testAddOrder() {
		int expectedOid = 10;
		String expectedDate = "6/6/2021";
		Customer c = new Customer(10,"omkar");
		Product p1 = new Product(1,"potato",30);
		LineItem item1 = new LineItem(10,5,p1);
		LineItem item2 = new LineItem(11,5,p1);
		Order o = new Order(10,"6/6/2021");
		o.addItem(item1);
		o.addItem(item2);
		c.addOrder(o);
		ArrayList<Order> orders = c.getTotalOrders();
		for (Order order : orders) {
			assertEquals(expectedOid,order.getOid());
			assertEquals(expectedDate,order.getDate());
		}
	}

}
