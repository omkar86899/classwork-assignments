package com.techlab.test;

import java.io.File;
import java.io.FileWriter;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("test.txt");
		try {
		FileWriter w1 = new FileWriter(f1);
		w1.write("hello\nworld");
		w1.flush();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
