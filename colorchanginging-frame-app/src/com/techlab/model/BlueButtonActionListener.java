package com.techlab.model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class BlueButtonActionListener implements ActionListener{
	private ColorChangingFrame colorChangingFrame;
	private JButton blueButton;
	
	public BlueButtonActionListener(ColorChangingFrame colorChangingFrame, JButton blueButton) {
		// TODO Auto-generated constructor stub
		this.colorChangingFrame = colorChangingFrame;
		this.blueButton = blueButton;
		blueButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.colorChangingFrame.getContentPane().setBackground(Color.BLUE);
	}

}
