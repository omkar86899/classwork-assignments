package com.techlab.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CSVDataAnalyzer {
	private ILoader loader;
	private Scanner scan;
	private List<List<String>> data;
	
	public CSVDataAnalyzer(ILoader loader) {
		this.loader = loader;
		this.data = loader.load();
		this.url = url;
		try {
			scan = new Scanner(new InputStreamReader(url.openStream()));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			scan = new Scanner(file);
		}
		setData();
	}

	private void setData() {
		this.data = new ArrayList<List<String>>();
		List<String> tempList = new ArrayList<String>();
		int noOfColumns =8;
		this.scan.useDelimiter(",|\n|\r");
		while(this.scan.hasNext()) {
			String element = this.scan.next();
			if(!element.equals("")) {
				tempList.add(element);
			}
		}
		for (int i = 0; i < tempList.size(); i = i+noOfColumns) {
			if(!this.data.contains(tempList.subList(i, i+noOfColumns))) {
				this.data.add(tempList.subList(i, i+noOfColumns));
			}
		}
	}
	
	public List<List<String>> getData() {
		return this.data;
	}
	
	public Map<String, Integer> noOfEmployeesBasedOnColumn(int columnNo) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (List<String> list : data) {
			if(map.keySet().contains(list.get(columnNo))) {
				int value = map.get(list.get(columnNo));
				map.put((String) list.get(columnNo), value+1);
			}else {
				map.put((String) list.get(columnNo), 1);
			}
		}
		return map;
	}
	
	public List<String> maximumSalaried() {
		List<String> maxSalaried = null;
		for (List<String> list : data) {
			if(maxSalaried == null || Integer.valueOf(maxSalaried.get(5)) <Integer.valueOf(list.get(5))) {
				maxSalaried = list;
			}
		}
		return maxSalaried;
	}
}
