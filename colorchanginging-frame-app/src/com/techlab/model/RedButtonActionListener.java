package com.techlab.model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class RedButtonActionListener implements ActionListener{
	private ColorChangingFrame colorChangingFrame;
	private JButton redButton;
	
	public RedButtonActionListener(ColorChangingFrame colorChangingFrame, JButton redButton) {
		// TODO Auto-generated constructor stub
		this.colorChangingFrame = colorChangingFrame;
		this.redButton = redButton;
		this.redButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.colorChangingFrame.getContentPane().setBackground(Color.RED);
	}

}
