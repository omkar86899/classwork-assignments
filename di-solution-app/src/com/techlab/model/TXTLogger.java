package com.techlab.model;

public class TXTLogger implements ILogger{
	public void log(String ErrorMessage) {
		System.out.println("Writing in txt file...."+ErrorMessage);
	}
}
