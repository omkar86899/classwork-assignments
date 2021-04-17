package com.techlab.model;

public class Student {
	private int id,age;
	private String name;
	
	public Student(int id, String name, int age) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public Student(int id, String name) {
		this(id,name,25);
	}
	
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public Student whoIsElder(Student s) {
		if(this.age>s.age) {
			return this;
		}
		else {
			return s;
		}
	}
}
