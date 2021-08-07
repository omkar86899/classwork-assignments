package com.techlab.model;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorChangingFrame extends JFrame {
	private JButton redButton, blueButton;
	private RedButtonActionListener redButtonActionListener;
	private BlueButtonActionListener bluesButtonActionListener;

	public ColorChangingFrame() {
		setTitle("Color Changing Frame");
		redButton = new JButton("Red");
		redButtonActionListener = new RedButtonActionListener(this, redButton);
		blueButton = new JButton("Blue");
		bluesButtonActionListener = new BlueButtonActionListener(this, blueButton);
		redButton.setBounds(20, 20, 75, 30);
		blueButton.setBounds(100, 20, 75, 30);
		add(redButton);
		add(blueButton);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 500);
		setLayout(null);
		setVisible(true);
	}
}
