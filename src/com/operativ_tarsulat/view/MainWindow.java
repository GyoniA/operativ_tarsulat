package com.operativ_tarsulat.view;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

import com.operativ_tarsulat.controller.Menu;

import java.awt.BorderLayout;
import java.awt.Dimension;

public class MainWindow extends JFrame {
	
	private static MainWindow instance = null;
	
	public static MainWindow getInstance() {
		if(instance == null)
			instance = new MainWindow();
		return instance;
	}
	
	MapPanel mapPanel;
	JList listView;
	
	private MainWindow() {
		super("Vak virológusok földje...");
		setSize(1000,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		mapPanel = new MapPanel();
		getContentPane().add(mapPanel,BorderLayout.NORTH);
		listView = new JList();
		JScrollPane menuScrollPane = new JScrollPane(listView);
		menuScrollPane.setPreferredSize(new Dimension(1000, 200));
		getContentPane().add(menuScrollPane,BorderLayout.SOUTH);
		Menu m = new Menu(listView);
	}
}
