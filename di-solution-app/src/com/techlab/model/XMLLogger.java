package com.techlab.model;

public class XMLLogger implements ILogger{
	public void log(String ErrorMessage) {
		System.out.println("Writing in xml file...."+ErrorMessage);
	}

}
