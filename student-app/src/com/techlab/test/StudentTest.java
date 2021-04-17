package com.techlab.test;

import com.techlab.model.Student;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student s;
		s = new Student();
		System.out.println("Enter id of the Student:");
		int id = sc.nextInt();
		s.setId(id);
		System.out.println("Enter Name of the Student:");
		String name = sc.next();
		s.setName(name);
		System.out.println("Enter Age of the Student:");
		int age = sc.nextInt();
		s.setAge(age);
		System.out.println("Name of the Student is: "+s.getName());
		System.out.println("Id of the Student is Student is: "+s.getId());
		System.out.println("Age of the Student is: "+s.getAge());
		
		
	}

}
