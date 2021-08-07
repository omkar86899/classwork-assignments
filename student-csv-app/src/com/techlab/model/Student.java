package com.techlab.model;

public class Student {
	private int rollNo;
	private String name,location;
	private double cgpa, greScore;
	
	public Student(int rollNo, String name, double cgpa, double greScore, String location) {
		this.rollNo = rollNo;
		this.name = name;
		this.cgpa = cgpa;
		this.greScore = greScore;
		this.location = location;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public double getCgpa() {
		return cgpa;
	}

	public double getGreScore() {
		return greScore;
	}
	
	
}
