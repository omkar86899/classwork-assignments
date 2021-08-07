package com.techlab.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.techlab.model.CSVCreator;
import com.techlab.model.Student;

public class CSVCreatorTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File newFile = new File("student.csv");
		CSVCreator creator = new CSVCreator(newFile);
		creator.addDetails(new Student(11,"omkar",7.6,8,"thane"));
		creator.addDetails(new Student(12,"rahul",5.6,8,"pune"));
		creator.addDetails(new Student(13,"omkar",4.6,8,"mumbai"));
		creator.addDetails(new Student(14,"omkar",8.6,8,"vikroli"));
		creator.addDetails(new Student(15,"omkar",6.5,8,"punjab"));
		creator.addDetails(new Student(16,"omkar",4.7,6,"dadar"));
		creator.addDetails(new Student(17,"omkar",6.8,8,"CSMT"));
		creator.addDetails(new Student(18,"omkar",5.9,8,"Kurla"));
		creator.addDetails(new Student(19,"omkar",7.8,8,"Borivali"));
		creator.addDetails(new Student(20,"omkar",9.2,8,"Bhaiynder"));
		creator.addDetails(new Student(11,"omkar",7.6,8,"thane"));
		creator.addDetails(new Student(12,"rahul",5.6,8,"pune"));
		creator.addDetails(new Student(13,"omkar",4.6,8,"mumbai"));
		creator.addDetails(new Student(14,"omkar",8.6,8,"vikroli"));
		creator.addDetails(new Student(15,"omkar",6.5,8,"punjab"));
		creator.saveFile();
	}

}
