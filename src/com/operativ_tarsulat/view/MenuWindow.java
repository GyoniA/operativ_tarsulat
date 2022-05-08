package com.operativ_tarsulat.view;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.operativ_tarsulat.model.Game;

public class MenuWindow extends JFrame {
	
	JTextField loadGameName,startGameName,seed;
	JTextArea players;
	JButton loadGameButton,startGameButton;
	
	public static void main(String[] args) {
		MenuWindow menu = new MenuWindow();
		menu.setVisible(true);
	}
	public MenuWindow() {
		super("Menü");
		this.setSize(600,600);
		Container content = getContentPane();		
		content.setLayout(new FlowLayout());
		loadGameName = new JTextField();
		
		startGameButton = new JButton("Új játék indítása");
		
		startGameButton.addActionListener((e)->{
			Game.GetInstance().StartGame("TODO név", /*TODO seed*/1,/*TODO player names*/new String[] {"Player1","Player2"});
			MainWindow.getInstance().setVisible(true);
			setVisible(false);
		});
		
		content.add(startGameButton);
		
		content.add(loadGameName);
		
		
		
	}
	
	
}
