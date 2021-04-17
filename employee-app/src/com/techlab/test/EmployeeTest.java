package com.techlab.test;

import com.techlab.model.Employee;
import com.techlab.model.Programmer;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(10,"Rajesh",10000);
		printInfo(e1);
		Programmer p1 = new Programmer(11,"Omkar",15000,1000);
		printInfo(p1);
	}

	private static void printInfo(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("Id of the Employee is: "+e.getId());
		System.out.println("Name of the Employee is: "+e.getName());
		System.out.println("Salary of the Employee is: "+e.getSalary());
	}
	private static void printInfo(Programmer p) {
		Employee e = (Employee) p;
		printInfo(e);
		System.out.println("Bonus of the Employee is: "+p.getBonus());
	}
}
