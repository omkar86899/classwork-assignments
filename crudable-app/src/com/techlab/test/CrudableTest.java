package com.techlab.test;

import com.techlab.model.CustomerDB;
import com.techlab.model.DepartmentDB;
import com.techlab.model.ICrudable;
import com.techlab.model.InvoiceDB;

public class CrudableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doDatabaseOperation(new CustomerDB());
		doDatabaseOperation(new InvoiceDB());
		doDatabaseOperation(new DepartmentDB());	
		
	}

	private static void doDatabaseOperation(ICrudable db) {
		// TODO Auto-generated method stub
		System.out.println("Doing Crude Operation");
		db.create();
		db.read();
		db.update();
		db.delete();
		
	}

}
