package com.techlab.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVReader {
	private List data;
	private Scanner scan;
	
	public CSVReader(Scanner scan) {
		this.scan = scan;
		this.data = new ArrayList();
	}
	
	public List getList() {
		this.scan.useDelimiter("\\n");
		while(this.scan.hasNext()) {
			data.add(this.scan.next().replaceAll("\\n", ""));
		}
		return data;
	}
}
