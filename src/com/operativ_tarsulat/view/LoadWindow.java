package com.operativ_tarsulat.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.operativ_tarsulat.model.Game;

public class LoadWindow extends JFrame implements ActionListener{
	
	
	private JTextField loadFileName;
	private JButton button;
	public LoadWindow()
	{
		this.setSize(300,150);
		this.setLayout(null);
		loadFileName = new JTextField();
		loadFileName.setBounds(90,20,200,27);
		JLabel fn = new JLabel("File name: ");
		fn.setBounds(10,20,100,30);
		button = new JButton("Load");
		button.setBounds(70,50,100,30);
		button.addActionListener(this);
		this.add(loadFileName);
		this.add(fn);
		this.add(button);
		this.setResizable(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button)
		{
			 Game.GetInstance().LoadGame(loadFileName.getText());
			 this.setVisible(false);
		}
		
	}
}
