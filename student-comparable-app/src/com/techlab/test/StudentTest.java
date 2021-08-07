package com.techlab.test;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import com.techlab.model.SortByCgpa;
import com.techlab.model.SortById;
import com.techlab.model.SortByStandard;
import com.techlab.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<Student>();
		Student s1,s2,s3;
		s1 = new Student(10,6,2);
		s2 = new Student(11,5,3);
		s3 = new Student(12,8,2);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println("Before Sorting");
		printList(list);
		Collections.sort(list, new SortByCgpa());
		System.out.println("After Sorting By CGPA:");
		printList(list);
		Collections.sort(list, new SortById());
		System.out.println("After Sorting By ID:");
		printList(list);
		Collections.sort(list, new SortByStandard());
		System.out.println("After Sorting By Standard:");
		printList(list);
	}

	private static void printList(List<Student> list) {
		// TODO Auto-generated method stub
		for (Student student : list) {
			System.out.println("Id of Student is: "+student.getId());
			System.out.println("CGPA of Student is: "+student.getCgpa());
			System.out.println("Standard of Student is: "+student.getStandard());
		}
	}

}
