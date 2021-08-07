package com.techlab.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SubmitButtonHandler implements ActionListener{
	private JButton submitButton;
	private JTextField firstPlayerName, secondPlayerName;
	
	public SubmitButtonHandler(JButton button, JTextField firstPlayerName, JTextField secondPlayerName) {
		this.submitButton = button;
		this.firstPlayerName = firstPlayerName;
		this.secondPlayerName = secondPlayerName;
		this.submitButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String firstPlayerName = this.firstPlayerName.getText();
		String secondPlayerName = this.secondPlayerName.getText();
		JFrame frame =  (JFrame) SwingUtilities.getRoot(submitButton);
		frame.dispose();
		new TicTacToeFrame(firstPlayerName, secondPlayerName);
	}

}
