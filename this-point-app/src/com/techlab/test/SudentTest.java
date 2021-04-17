package com.techlab.test;

import com.techlab.model.Student;

public class SudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(10,"rajesh");
		Student s2 = new Student(11,"omkar",13);
		printStudentInfo(s1);
		printStudentInfo(s2);
	}
	
	private static void printStudentInfo(Student s) {
		System.out.println("Id of Student is: "+s.getId());
		System.out.println("Name of Student is: "+s.getName());
		System.out.println("Age of the Student is: "+s.getAge());

	}

}
