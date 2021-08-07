package com.techlab.test;

import com.techlab.model.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(1,"rajesh", 150, 65,17);
		Boolean validateAgeFlag;
		try {
			validateAgeFlag = p1.validateAge();
			if(validateAgeFlag == true) {
				System.out.println("Person is eligible for voting");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
