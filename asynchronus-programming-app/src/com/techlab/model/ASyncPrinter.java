package com.techlab.model;

import java.util.Date;

public class ASyncPrinter implements Runnable {

	@Override
	public void run() {
		while (true) {
			Date date = new Date();
			System.out.println(date);
		}

	}

}
