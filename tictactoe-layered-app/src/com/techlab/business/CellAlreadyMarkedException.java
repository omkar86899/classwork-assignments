package com.techlab.business;

public class CellAlreadyMarkedException extends Exception {
	private String message;
	
	public CellAlreadyMarkedException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
