package com.techlab.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEdit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File oldFile = new File("emp.csv");
		File newFile = new File("copyemp.csv");
		FileWriter writer = new FileWriter(newFile);
		Scanner sc = new Scanner(oldFile);
		String data;
		sc.useDelimiter(",");
		while(sc.hasNext()) {
			data = sc.next();
			if (data.equals("KING")) {
				writer.append("omkar");
			}
			else {
				writer.append(data);
			}
			writer.append(",");
		}
		writer.flush();
		writer.close();
		sc.close();
		System.out.println("Deleting 'emp.csv' File");
		oldFile.delete();
		System.out.println("Renaming 'copyemp.csv' to 'emp.csv' File");
		newFile.renameTo(oldFile);
	}
}
