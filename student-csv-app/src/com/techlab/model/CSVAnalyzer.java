package com.techlab.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CSVAnalyzer {
	private List<List<String>> data;
	private Scanner scan;
	
	public CSVAnalyzer(File file) throws FileNotFoundException {
		this.scan = new Scanner(file);
		setData();
	}

	private void setData() {
		data = new ArrayList<List<String>>();
		List<String> tempList = new ArrayList<String>();
		int noOfColumns = 5;
		this.scan.useDelimiter(",|\r|\n");
		while(this.scan.hasNext()) {
			tempList.add(this.scan.next());
		}
		for (int i = 0; i < tempList.size(); i=i+noOfColumns) {
			if(!data.contains(tempList.subList(i, i+noOfColumns))) {
				data.add(tempList.subList(i, i+noOfColumns));
			}
		}
	}

	public List<List<String>> getData() {
		return this.data;
	}
	
	
	public double minimum(int column) {
		List<Double> tempList = new ArrayList<Double>();
		for (List<String> list : this.data) {
			tempList.add(Double.valueOf(list.get(column)));
		}
		return Collections.min(tempList);
	}
	
	public double maximum(int column) {
		List<Double> tempList = new ArrayList<Double>();
		for (List<String> list : this.data) {
			tempList.add(Double.valueOf(list.get(column)));
		}
		return Collections.max(tempList);
	}
	
	public double average(int column) {
		double sum = 0;
		int n=0;
		for (List<String> list : this.data) {
			sum += Double.valueOf(list.get(column));
			n +=1;
		}
		return sum/n;
	}
	
}
