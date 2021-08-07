package com.techlab.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("emp.csv");
		Scanner sc = new Scanner(file);
		sc.useDelimiter(",|\n");
		List dataList = new ArrayList();
		List tempList = new ArrayList();
		while (sc.hasNext()) {
			tempList.add(sc.next());
		}
		System.out.println(dataList);
	}

}
