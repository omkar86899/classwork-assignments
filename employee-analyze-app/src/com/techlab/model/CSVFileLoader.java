package com.techlab.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVFileLoader implements ILoader{
	private File file;
	
	public CSVFileLoader(File file) {
		this.file = file;
	}

	@Override
	public List<List<String>> load() throws Exception {
		Scanner scan = new Scanner(this.file);
		return setData(scan);
	}

	private List<List<String>> setData(Scanner scan) {
		List data = new ArrayList<List<String>>();
		List<String> tempList = new ArrayList<String>();
		int noOfColumns =8;
		scan.useDelimiter(",|\n|\r");
		while(scan.hasNext()) {
			String element = scan.next();
			if(!element.equals("")) {
				tempList.add(element);
			}
		}
		for (int i = 0; i < tempList.size(); i = i+noOfColumns) {
			if(!data.contains(tempList.subList(i, i+noOfColumns))) {
				data.add(tempList.subList(i, i+noOfColumns));
			}
		}
		return data;
	}

}
