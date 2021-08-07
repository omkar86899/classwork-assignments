package com.techlab.model;

import java.util.Comparator;

public class Student{
	private int id, standard, cgpa;
	
	public Student(int id, int cgpa, int standard) {
		this.id = id;
		this.cgpa = cgpa;
		this.standard = standard;
	}
	
	public int getId() {
		return this.id;
	}
	public int getStandard() {
		return this.standard;
	}
	public int getCgpa() {
		return this.cgpa;
	}
}

