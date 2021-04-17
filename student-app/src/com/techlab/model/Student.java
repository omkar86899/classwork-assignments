package com.techlab.model;

public class Student {
	private int id,age;
	private String name;
	private static int defaultId = 100, defaultAge = 16;
	private static int idLowerLimit = 1, idUpperLimit = 50;
	private static int ageLowerLimit = 16, ageUpperLimit = 21;
	
	public void setId(int pid) {
		id = checkId(pid);
	}
	public void setName(String pname) {
		name = pname;
	}
	public void setAge(int page) {
		age = checkAge(page);
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	private static int checkId(int number) {
		if(number<idLowerLimit||number>idUpperLimit) {
			return defaultId;
		}
		else {
			return number;
		}
	}
	private static int checkAge(int number) {
		if(number<ageLowerLimit||number>ageUpperLimit) {
			return defaultAge;
		}
		else {
			return number;
		}
	}
}
