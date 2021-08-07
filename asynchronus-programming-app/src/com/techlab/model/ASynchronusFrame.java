package com.techlab.model;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ASynchronusFrame extends JFrame{
	private JButton helloButton, synchronusButton, asynchronusButton;
	
	public ASynchronusFrame() {
		this.helloButton = new JButton("Hello");
		this.synchronusButton = new JButton("printSync");
		this.asynchronusButton = new JButton("printASync");
		new ButtonActionListener(this.helloButton,this.synchronusButton,this.asynchronusButton);
		addAllComponents();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 300);
		setLayout(null);
		setVisible(true);
	}

	private void addAllComponents() {
		add(this.helloButton);
		add(this.synchronusButton);
		add(this.asynchronusButton);
		this.helloButton.setBounds(20, 20, 90, 50);
		this.synchronusButton.setBounds(120, 20, 90, 50);
		this.asynchronusButton.setBounds(220, 20, 100, 50);
		
	}
	
}
