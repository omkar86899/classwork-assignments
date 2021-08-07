package com.techlab.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import com.techlab.business.Board;
import com.techlab.business.CellAlreadyMarkedException;
import com.techlab.business.Game;
import com.techlab.business.Mark;
import com.techlab.business.Player;
import com.techlab.business.Result;
import com.techlab.business.ResultAnalyzer;

public class ButtonActionListener implements ActionListener {
	private List<JButton> buttons;
	private Game game;
	private JLabel status;

	public ButtonActionListener(List<JButton> buttons, JLabel status, String firstPlayerName, String secondPlayerName) {
		this.buttons = buttons;
		this.status = status;
		for (JButton jButton : buttons) {
			jButton.addActionListener(this);
		}
		setGame(firstPlayerName, secondPlayerName);
	}

	private void setGame(String firstPlayerName, String secondPlayerName) {
		Player p1, p2;
		p1 = new Player(Mark.O, firstPlayerName);
		p2 = new Player(Mark.X, secondPlayerName);
		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		this.game = new Game(p1, p2, analyzer, board);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int buttonID;
		Result result = null;
		Player turn = this.game.getTurn();
		JFrame frame = (JFrame) SwingUtilities.getRoot(this.buttons.get(0));
		try {
			buttonID = Integer.parseInt(e.getActionCommand()) - 1;
			this.buttons.get(buttonID).setText(turn.getMark().toString());
			result = this.game.play(buttonID);
			this.status.setText("Status: "+result.toString()+", "+this.game.getTurn().getName()+"'s Turn");
		} catch (NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
		} catch (CellAlreadyMarkedException came) {
			System.out.println(came.getMessage());
		}
		if (result.equals(Result.Win)) {
			JOptionPane.showMessageDialog(null, turn.getName() + " Win");
			frame.dispose();
		} else if (result.equals(Result.Draw)) {
			JOptionPane.showMessageDialog(null, "Draw");
			frame.dispose();
		}


	}

}
