package com.techlab.test;

import java.util.Set;
import java.util.TreeSet;
import com.techlab.model.SortByNameStratergy;
import com.techlab.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student s1,s2,s3,s4,s5;
		s1 = new Student(10, "omkar", 7.9);
		s2 = new Student(11,"sagar",7.8);
		s3 = new Student(12, "sachin", 9.1);
		s4 = new Student(14, "rahul", 5.9);
		s5 = new Student(15, "prateek", 8.1);
		
		Set<Student> students = new TreeSet<Student>(new SortByNameStratergy());
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		printInfo(students);

	}

	private static void printInfo(Set<Student> students) {
		for (Student student : students) {
			System.out.println("ID: "+student.getId());
			System.out.println("Name :"+student.getName());
			System.out.println("CGPA: "+student.getCgpa());
		}
		
	}

}
