package com.techlab.presentation;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TicTacToeFrame extends JFrame {
	private List<JButton> buttons;
	private JLabel status;

	public TicTacToeFrame(String firstPlayerName, String secondPlayerName) {
		this.buttons = new ArrayList<JButton>();
		this.status = new JLabel("Status: Processing, "+firstPlayerName+"'s Turn");
		setTitle("Tic Tac Toe");
		for (int i = 0; i < 9; i++) {
			JButton button = new JButton(String.valueOf(i + 1));
			buttons.add(button);
			add(button);
		}
		add(status);
		setAllComponentsLayout();
		new ButtonActionListener(buttons,status, firstPlayerName, secondPlayerName);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 300);
		setLayout(null);
		setVisible(true);
	}

	private void setAllComponentsLayout() {
		this.buttons.get(0).setBounds(20, 20, 90, 50);
		this.buttons.get(1).setBounds(120, 20, 90, 50);
		this.buttons.get(2).setBounds(220, 20, 90, 50);

		this.buttons.get(3).setBounds(20, 80, 90, 50);
		this.buttons.get(4).setBounds(120, 80, 90, 50);
		this.buttons.get(5).setBounds(220, 80, 90, 50);

		this.buttons.get(6).setBounds(20, 140, 90, 50);
		this.buttons.get(7).setBounds(120, 140, 90, 50);
		this.buttons.get(8).setBounds(220, 140, 90, 50);
		
		this.status.setBounds(30, 200, 200, 50);
	}

}
