package com.techlab.test;

import java.util.ArrayList;
import java.util.List;

import com.techlab.model.Student;

public class ListStudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(10,"Rajesh",6.89));
		list.add(new Student(11,"Sagar",8.25));
		list.add(new Student(12,"Omkar",7.1));
		printList(list);
	}

	private static void printList(List<Student> list) {
		// TODO Auto-generated method stub
		for (Student student : list) {
			System.out.println("ID of the Student is: "+student.getId());
			System.out.println("Name of the Student is: "+student.getName());
			System.out.println("CGPA of the Student is: "+student.getCgpa());
		}
	}

}
