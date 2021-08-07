package com.techlab.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlab.model.CSVReader;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("emp.csv");
		Scanner sc = new Scanner(file);
		CSVReader reader = new CSVReader(sc);
		List data = reader.getList();
		System.out.println(data.get(0).toString().replace("\r", ""));
		System.out.println("ff");
	}

}