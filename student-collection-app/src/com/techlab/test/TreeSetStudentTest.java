package com.techlab.test;

import java.util.Set;
import java.util.TreeSet;
import com.techlab.model.Student;

public class TreeSetStudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set = new TreeSet<Student>();
		set.add(new Student(10,"Rajesh",6.89));
		set.add(new Student(11,"Sagar",8.25));
		set.add(new Student(12,"Omkar",7.1));
		printSet(set);
	}
	
	private static void printSet(Set<Student> set) {
		// TODO Auto-generated method stub
		for (Student student : set) {
			System.out.println("ID of the Student is: "+student.getId());
			System.out.println("Name of the Student is: "+student.getName());
			System.out.println("CGPA of the Student is: "+student.getCgpa());
		}
	}
}
