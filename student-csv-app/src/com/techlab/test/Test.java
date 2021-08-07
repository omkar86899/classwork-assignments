package com.techlab.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.techlab.model.CSVAnalyzer;
import com.techlab.model.CSVCreator;
import com.techlab.model.Student;

public class Test {

	public static void main(String[] args) throws IOException {
		File file = new File("student.csv");
		CSVCreator creator = new CSVCreator(file);
		creator.addDetails(new Student(11,"omkar",7.6,8,"thane"));
		creator.addDetails(new Student(12,"rahul",5.6,8,"pune"));
		creator.addDetails(new Student(13,"sagar",4.6,8,"mumbai"));
		creator.addDetails(new Student(14,"prathmesh",8.6,8,"vikroli"));
		creator.addDetails(new Student(15,"vishal",6.5,8,"punjab"));
		creator.addDetails(new Student(16,"ash",4.7,6,"dadar"));
		creator.addDetails(new Student(17,"pratik",6.8,8,"CSMT"));
		creator.addDetails(new Student(18,"sachin",5.9,8,"Kurla"));
		creator.addDetails(new Student(19,"mukesh",7.8,8,"Borivali"));
		creator.addDetails(new Student(20,"sahil",9.2,8,"Bhaiynder"));
		creator.addDetails(new Student(11,"omkar",7.6,8,"thane"));
		creator.addDetails(new Student(12,"rahul",5.6,8,"pune"));
		creator.addDetails(new Student(13,"sagar",4.6,8,"mumbai"));
		creator.addDetails(new Student(14,"prathmesh",8.6,8,"vikroli"));
		creator.addDetails(new Student(15,"vishal",6.5,8,"punjab"));
		creator.saveFile();
		
		CSVAnalyzer analyzer = new CSVAnalyzer(file);
		System.out.println("Minimum CGPA is: "+analyzer.minimum(2));
		System.out.println("Maximum CGPA is: "+analyzer.maximum(2));
		System.out.println("Average CGPA is: "+analyzer.average(2));
		System.out.println("Minimum GRE Score is: "+analyzer.minimum(3));
		System.out.println("Maximum GRE Score is: "+analyzer.maximum(3));
		System.out.println("Average GRE Score is: "+analyzer.average(3));
	}

}
