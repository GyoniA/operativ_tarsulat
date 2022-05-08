package com.operativ_tarsulat.view;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class MainWindow extends JFrame {
	
	private static MainWindow instance = null;
	
	public static MainWindow getInstance() {
		if(instance == null)
			instance = new MainWindow();
		return instance;
	}
	
	MapPanel mapPanel;
	
	private MainWindow() {
		super("Vak virológusok földje...");
		setSize(1000,600);
		mapPanel = new MapPanel();
		getContentPane().add(mapPanel,BorderLayout.NORTH);
	}
}
