package com.techlab.presentation;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class WelcomeFrame extends JFrame{
	private JButton submitButton;
	private JLabel firstPlayerNameLabel, secondPlayerNameLabel;
	private JTextField firstPlayerName, secondPlayerName;
	
	public WelcomeFrame() {
		setTitle("Welcome");
		this.submitButton = new JButton("Submit");
		this.firstPlayerNameLabel = new JLabel("First Player Name: ");
		this.secondPlayerNameLabel = new JLabel("Second Player Name: ");
		this.firstPlayerName = new JTextField();
		this.secondPlayerName = new JTextField();
		new SubmitButtonHandler(submitButton,firstPlayerName, secondPlayerName);
		addAll();
		setAllComponentsLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 300);
		setLayout(null);
		setVisible(true);
	}

	private void setAllComponentsLayout() {
		this.firstPlayerNameLabel.setBounds(20, 20, 140, 50);
		this.firstPlayerName.setBounds(150, 20, 150, 50);
		
		this.secondPlayerNameLabel.setBounds(20, 80, 130, 50);
		this.secondPlayerName.setBounds(150, 80, 150, 50);
		
		this.submitButton.setBounds(125, 140, 100, 30);
	}

	private void addAll() {
		add(this.submitButton);
		add(this.firstPlayerNameLabel);
		add(this.secondPlayerNameLabel);
		add(this.firstPlayerName);
		add(this.secondPlayerName);
	}
}
