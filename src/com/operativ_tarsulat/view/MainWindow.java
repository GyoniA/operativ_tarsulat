package com.operativ_tarsulat.view;

import javax.swing.JFrame;

public class MainWindow extends JFrame {
	
	private static MainWindow instance = null;
	
	public static MainWindow getInstance() {
		if(instance == null)
			instance = new MainWindow();
		return instance;
	}
	
	private MainWindow() {
		super("Vak virol�gusok f�ldje...");
		setSize(1000,600);
	}
}
