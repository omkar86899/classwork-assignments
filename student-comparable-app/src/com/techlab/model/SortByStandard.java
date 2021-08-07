package com.techlab.model;

import java.util.Comparator;

public class SortByStandard implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getStandard()-o2.getStandard();
	}
	
}