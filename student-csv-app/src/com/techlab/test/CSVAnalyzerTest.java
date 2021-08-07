package com.techlab.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import com.techlab.model.CSVAnalyzer;

public class CSVAnalyzerTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("student.csv");
		CSVAnalyzer analyzer = new CSVAnalyzer(file);
		System.out.println(analyzer.getData());
		System.out.println(analyzer.minimum(2));
		System.out.println(analyzer.maximum(2));
		System.out.println(analyzer.average(2));
		System.out.println(analyzer.minimum(3));
		System.out.println(analyzer.maximum(3));
		System.out.println(analyzer.average(3));
	}

}
