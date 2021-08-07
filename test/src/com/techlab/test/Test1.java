package com.techlab.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("emp.csv");
		Scanner sc = new Scanner(file);
		sc.useDelimiter(",|\n");
		Map<String, List> map = new HashMap<String, List>();
		while (sc.hasNext()) {
			List details = new ArrayList();
			for (int i = 0; i < 8; i++) {
				details.add(sc.next());
			}
			map.put((String) details.get(0), details.subList(1, 8));
		}
		sc.close();
		System.out.println(map);
		System.out.println("max Salaried Employee: "+map.get(maxSalaryEmployee(map)).get(0));
		noOfEmployee(2,map);
		noOfEmployee(6,map);
	}

	private static String maxSalaryEmployee(Map<String, List> map) {
		// TODO Auto-generated method stub
		String maxSalary,maxSalaryKey = null;
		List<Integer> salaryList = new ArrayList<Integer>();
		for (String string : map.keySet()) {
			String salary = (String) map.get(string).get(4);
			salaryList.add(Integer.parseInt(salary));
		}
		maxSalary = String.valueOf(Collections.max(salaryList));
		for (String string : map.keySet()) {
			if(map.get(string).get(4).equals(maxSalary)) {
				maxSalaryKey =  string;
			}
		}
		return maxSalaryKey;
	}

	private static void noOfEmployee(int i, Map<String, List> map) {
		// TODO Auto-generated method stub
		Map<String, Integer> classifiEmployeeMap = new HashMap<String, Integer>();
		for (String string : map.keySet()) {
			String key = (String) map.get(string).get(i);
			if (classifiEmployeeMap.containsKey(key)) {
				classifiEmployeeMap.put(key, classifiEmployeeMap.get(key) + 1);
			} else {
				classifiEmployeeMap.put(key, 1);
			}
		}
		System.out.println(classifiEmployeeMap);
	}

}
