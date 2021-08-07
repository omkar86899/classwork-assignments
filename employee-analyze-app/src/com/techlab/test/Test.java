package com.techlab.test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.techlab.model.CSVDataAnalyzer;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("emp.csv");
		URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
		CSVDataAnalyzer analyzer = new CSVDataAnalyzer(url, file);
		System.out.println("Number of employees based on their department number:\n"+analyzer.noOfEmployeesBasedOnColumn(7));
		System.out.println("Number of employees based on their designation:\n"+analyzer.noOfEmployeesBasedOnColumn(2));
		System.out.println("Maximum Salaried Employee:\n"+analyzer.maximumSalaried());
	}

}
