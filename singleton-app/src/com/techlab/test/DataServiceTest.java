package com.techlab.test;

import com.techlab.model.DataService;

public class DataServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		DataService dsv1 = DataService.getInstance();
		DataService dsv2 = DataService.getInstance();
		System.out.println(dsv1.hashCode());
		System.out.println(dsv2.hashCode());
		
	}

}
