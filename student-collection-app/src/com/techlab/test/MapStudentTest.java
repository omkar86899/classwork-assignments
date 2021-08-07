package com.techlab.test;

import java.util.HashMap;
import java.util.Map;
import com.techlab.model.Student;

public class MapStudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student, String> map = new HashMap<Student, String>();
		map.put(new Student(10,"Rajesh",6.89), "London");
		map.put(new Student(11,"Sagar",8.25), "Berlin");
	    map.put(new Student(12,"Omkar",7.1), "Oslo");
	    printMap(map);
	}

	private static void printMap(Map<Student, String> map) {
		// TODO Auto-generated method stub
		for (Student student : map.keySet()) {
			System.out.println("ID of the Student is: "+student.getId());
			System.out.println("Name of the Student is: "+student.getName());
			System.out.println("CGPA of the Student is: "+student.getCgpa());
		}
	}

}
