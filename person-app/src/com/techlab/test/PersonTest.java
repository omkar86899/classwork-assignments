package com.techlab.test;

import com.techlab.model.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(1,"rajesh", 150, 65);
		printInfo(p1);
		p1.eat();
		p1.play();
		System.out.println("Person Info after eating and playing: ");
		printInfo(p1);
	}

	private static void printInfo(Person p1) {
		// TODO Auto-generated method stub
		System.out.println("Name of the person is: "+p1.getName());
		System.out.println("Id of the person is: "+p1.getId());
		System.out.println("Height of the person is: "+p1.getHeight());
		System.out.println("Weigth of the person is: "+p1.getWeight());
	}

}
