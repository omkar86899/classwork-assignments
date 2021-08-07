package com.techlab.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;

public class ButtonActionListener implements ActionListener{

	public ButtonActionListener(JButton helloButton, JButton synchronusButton, JButton asynchronusButton) {
		helloButton.addActionListener(this);
		synchronusButton.addActionListener(this);
		asynchronusButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonName = e.getActionCommand();
		if(buttonName.equals("Hello")) {
			System.out.println("Hello");
			return;
		}
		if(buttonName.equals("printSync")) {
			printTimeSynchronusly();
			return;
		}
		Thread thread = new Thread(new ASyncPrinter());
		thread.start();
	}

	private void printTimeSynchronusly() {
		while (true) {
			Date date = new Date();
			System.out.println(date);
		}
		
	}

}
