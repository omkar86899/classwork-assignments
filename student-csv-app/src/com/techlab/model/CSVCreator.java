package com.techlab.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVCreator {
	private FileWriter writer;
	
	public CSVCreator(File file) throws IOException {
		this.writer = new FileWriter(file);
	}
	
	public void addDetails(Student s) throws IOException {
		this.writer.append(String.valueOf(s.getRollNo()));
		this.writer.append(",");
		this.writer.append(s.getName());
		this.writer.append(",");
		this.writer.append(String.valueOf(s.getCgpa()));
		this.writer.append(",");
		this.writer.append(String.valueOf(s.getGreScore()));
		this.writer.append(",");
		this.writer.append(s.getLocation());
		this.writer.append("\n");
	}
	
	public void saveFile() throws IOException {
		this.writer.flush();
		this.writer.close();
	}
}
