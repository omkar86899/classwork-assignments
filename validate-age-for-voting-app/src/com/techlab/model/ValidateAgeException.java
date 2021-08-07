package com.techlab.model;

public class ValidateAgeException extends Exception{
	private String errorMessage;
	private Person p;
	public ValidateAgeException(Person p) {
		this.p = p;
	}
	
	public void setMessage() {
		this.errorMessage = "Name of the person is: "+p.getName();
		this.errorMessage += "\nId of the person is: "+p.getId();
		this.errorMessage += "\nHeight of the person is: "+p.getHeight();
		this.errorMessage += "\nWeigth of the person is: "+p.getWeight();
		this.errorMessage += "\nAge of the person is: "+p.getAge();
		this.errorMessage += "\nAge is Not valid for voting";
	}
	public String getMessage() {
		setMessage();
		return errorMessage;
	}
}
