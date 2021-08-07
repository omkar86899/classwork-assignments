package com.techlab.model;

public class Person {
	private int id;
	private String name;
	private float height,weight;
	private int age;
	private Boolean validateAgeFlag = true;
	
	public Person(int id,String name,float height,float weight,int age) {
		this.id = id;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getHeight() {
		return height;
	}
	public float getWeight() {
		return weight;
	}
	public int getAge() {
		return age;
	}
	
	public Boolean validateAge() throws ValidateAgeException {
		if(age<18) {
			this.validateAgeFlag = false;
			throw new ValidateAgeException(this);
		}
		return this.validateAgeFlag;
	}

}
