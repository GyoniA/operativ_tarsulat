package com.operativ_tarsulat.view;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

import com.operativ_tarsulat.controller.Menu;
import com.operativ_tarsulat.model.Game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener{
	
	private static MainWindow instance = null;
	
	public static MainWindow getInstance() {
		if(instance == null)
			instance = new MainWindow();
		return instance;
	}
	JMenuBar menuBar;
	MapPanel mapPanel;
	JList listView;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	JLabel danceLabel,amnesiaLabel,paralyzeLabel,protectionLabel,actualPlayer, nucleoLabel, aminoLabel,gotProtectionLabel,gotParalyzeLabel,gotAmnesiaLabel,gotDanceLabel,gotBearLabel,gotBagLabel,gotCloakLabel,gotGlovesLabel,gotAxeLabel;
	private MainWindow() {
		super("Vak virol�gusok f�ldje...");
		setSize(1000,630);
		this.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		mapPanel = new MapPanel();
		mapPanel.setBounds(0,0,1000,300);
		getContentPane().add(mapPanel);
		listView = new JList();
		ImageIcon protectionEmblem = new ImageIcon("protectionEmblem.png");
		ImageIcon amnesiaEmblem = new ImageIcon("amnesiaEmblem.png");
		ImageIcon bearEmblem = new ImageIcon("bearEmblem.png");
		ImageIcon danceEmblem = new ImageIcon("danceEmblem.png");
		ImageIcon paralyzeEmblem = new ImageIcon("paralyzeEmblem.png");
		
		JScrollPane menuScrollPane = new JScrollPane(listView);
		menuScrollPane.setBounds(400,410,200,160);
		getContentPane().add(menuScrollPane);
		
		
		Menu m = new Menu(listView);
		
		JLabel lb=new JLabel("AvailableAction:");
		lb.setBounds(300,405,200,30);
		getContentPane().add(lb);
		
		
		JLabel actionKeret = new JLabel();
		Border actionKeretBorder = BorderFactory.createLineBorder(Color.black,1);
		actionKeret.setBounds(280,410,490,200);
		actionKeret.setBorder(actionKeretBorder);
		getContentPane().add(actionKeret);
		
		
		
		JLabel aktJatekos = new JLabel("Actual player: ");
		aktJatekos.setBounds(300,365,200,30);
		getContentPane().add(aktJatekos);
		
		actualPlayer = new JLabel("vmi");//ezt a sort majd ki kell venni. 
		actualPlayer.setBounds(400,365,200,30);
		getContentPane().add(actualPlayer);
		
		JLabel Keret2 = new JLabel();
		Border Keret2Border = BorderFactory.createLineBorder(Color.black,1);
		Keret2.setBounds(280,350,490,60);
		Keret2.setBorder(Keret2Border);
		getContentPane().add(Keret2);
		
		JLabel Keret3 = new JLabel();
		Border Keret3Border = BorderFactory.createLineBorder(Color.black,1);
		Keret3.setBounds(0,350,280,240);
		Keret3.setBorder(Keret3Border);
		getContentPane().add(Keret3);
		
		JLabel Keret4 = new JLabel();
		Border Keret4Border = BorderFactory.createLineBorder(Color.black,1);
		Keret4.setBounds(770,350,230,240);
		Keret4.setBorder(Keret4Border);
		getContentPane().add(Keret4);
		
		
		JLabel cLabel = new JLabel("Codes:");
		cLabel.setBounds(10,370,100,20);
		getContentPane().add(cLabel);
		
		danceLabel = new JLabel("KEPKEP"); //ezt a sort majd ki kell venni.
		danceLabel.setBounds(60,345,70,70);
		getContentPane().add(danceLabel);
		
		amnesiaLabel = new JLabel("KEPKEP");//ezt a sort majd ki kell venni. 
		amnesiaLabel.setBounds(110,345,70,70);
		getContentPane().add(amnesiaLabel);
		
		paralyzeLabel = new JLabel("KEPKEP");//ezt a sort majd ki kell venni. 
		paralyzeLabel.setBounds(160,345,70,70);
		getContentPane().add(paralyzeLabel);
		
		protectionLabel = new JLabel("KEPKEP");//ezt a sort majd ki kell venni.
		protectionLabel.setBounds(210,345,70,70);
		getContentPane().add(protectionLabel);
		
		
		JLabel mLabel = new JLabel("Materials:");
		mLabel.setBounds(10,415,70,20);
		getContentPane().add(mLabel);
		JLabel aLabel = new JLabel("Amino:");
		aLabel.setBounds(90,415,70,20);
		getContentPane().add(aLabel);
		JLabel nLabel = new JLabel("Nucleo:");
		nLabel.setBounds(190,415,70,20);
		getContentPane().add(nLabel);
		
		aminoLabel = new JLabel("szam");//ezt a sort majd ki kell venni.
		aminoLabel.setBounds(140,415,60,20);
		getContentPane().add(aminoLabel);
		
		nucleoLabel = new JLabel("szam");//ezt a sort majd ki kell venni.
		nucleoLabel.setBounds(240,415,60,20);
		getContentPane().add(nucleoLabel);
		
		JLabel vLabel = new JLabel("Vaccine:");
		vLabel.setBounds(10,455,70,20);
		getContentPane().add(vLabel);
		
		JLabel pLabel = new JLabel();
		pLabel.setIcon(protectionEmblem);
		pLabel.setBounds(80,435,25,25);
		getContentPane().add(pLabel);
		
		gotProtectionLabel = new JLabel("pipa");//ezt a sort majd ki kell venni.
		gotProtectionLabel.setBounds(80,465,25,25);
		getContentPane().add(gotProtectionLabel);
		
		JLabel vPanel = new JLabel("Virus:");
		vPanel.setBounds(10,520,70,20);
		getContentPane().add(vPanel);
		
		JLabel paLabel = new JLabel();
		paLabel.setIcon(paralyzeEmblem);
		paLabel.setBounds(80,505,24,24);
		getContentPane().add(paLabel);
		gotParalyzeLabel = new JLabel("pipa");//ezt a sort majd ki kell venni.
		gotParalyzeLabel.setBounds(80,535,25,25);
		getContentPane().add(gotParalyzeLabel);
		
		JLabel dLabel = new JLabel();
		dLabel.setIcon(danceEmblem);
		dLabel.setBounds(114,505,25,25);
		getContentPane().add(dLabel);
		gotDanceLabel = new JLabel("pipa");//ezt a sort majd ki kell venni.
		gotDanceLabel.setBounds(114,535,25,25);
		getContentPane().add(gotDanceLabel);
		
		JLabel bLabel = new JLabel();
		bLabel.setIcon(bearEmblem);
		bLabel.setBounds(149,505,25,25);
		getContentPane().add(bLabel);
		gotBearLabel = new JLabel("pipa");//ezt a sort majd ki kell venni.
		gotBearLabel.setBounds(149,535,25,25);
		getContentPane().add(gotBearLabel);
		
		JLabel amLabel = new JLabel();
		amLabel.setIcon(amnesiaEmblem);
		amLabel.setBounds(184,505,25,25);
		getContentPane().add(amLabel);
		gotAmnesiaLabel = new JLabel("pipa");//ezt a sort majd ki kell venni.
		gotAmnesiaLabel.setBounds(184,535,25,25);
		getContentPane().add(gotAmnesiaLabel);
		
		
		JLabel eqLabel = new JLabel("Equipment:");
		eqLabel.setBounds(780,370,100,25);
		getContentPane().add(eqLabel);
		
		JLabel ckLabel = new JLabel("Cloak:");
		ckLabel.setBounds(780,420,100,25);
		getContentPane().add(ckLabel);
		gotCloakLabel = new JLabel("KEPECS");//ezt a sort majd ki kell venni.
		gotCloakLabel.setBounds(820,420,40,40);
		getContentPane().add(gotCloakLabel);
		
		JLabel gLabel = new JLabel("Gloves:");
		gLabel.setBounds(885,420,100,25);
		getContentPane().add(gLabel);
		gotGlovesLabel = new JLabel("KEPECS");//ezt a sort majd ki kell venni.
		gotGlovesLabel.setBounds(930,420,40,40);
		getContentPane().add(gotGlovesLabel);
		
		JLabel axLabel = new JLabel("Axe:");
		axLabel.setBounds(885,500,100,25);
		getContentPane().add(axLabel);
		gotAxeLabel = new JLabel("KEPECS");//ezt a sort majd ki kell venni.
		gotAxeLabel.setBounds(930,500,40,40);
		getContentPane().add(gotAxeLabel);
		
		JLabel baLabel = new JLabel("Bag:");
		baLabel.setBounds(780,500,100,25);
		getContentPane().add(baLabel);
		gotBagLabel = new JLabel("KEPECS");//ezt a sort majd ki kell venni.
		gotBagLabel.setBounds(820,500,40,40);
		getContentPane().add(gotBagLabel);
		
		
		/*
		JLabel hatter = new JLabel();
		hatter.setBounds(0,350,1000,250);
		hatter.setBackground(new Color(117,198,239));
		hatter.setOpaque(true);
		getContentPane().add(hatter);
		
		*/
		
		menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		loadItem = new JMenuItem("Load");
		loadItem.addActionListener(this);
		saveItem = new JMenuItem("Save");
		saveItem.addActionListener(this);
		exitItem = new JMenuItem("Exit");
		exitItem.addActionListener(this);
		fileMenu.add(saveItem);
		fileMenu.add(loadItem);
		fileMenu.add(exitItem);
		menuBar.add(fileMenu);
		this.setJMenuBar(menuBar);
		
		this.setResizable(false);
	}
	
	public JLabel getDanceLabel ()
	{
		return danceLabel;
	}
	public void setDanceLabel (JLabel label)
	{
		 danceLabel = label;
	}
	
	public JLabel getAmnesiaLabel ()
	{
		return amnesiaLabel;
	}
	public void setAmnesiaLabel (JLabel label)
	{
		 amnesiaLabel = label;
	}
	
	public JLabel getParalyzeLabel ()
	{
		return paralyzeLabel;
	}
	public void setParalyzeLabel (JLabel label)
	{
		 paralyzeLabel = label;
	}
	
	public JLabel getProtectionLabel ()
	{
		return protectionLabel;
	}
	public void setProtectionLabel (JLabel label)
	{
		protectionLabel = label;
	}
	
	public JLabel getActualPlayerLabel ()
	{
		return actualPlayer;
	}
	public void setActualPlayerLabel (JLabel label)
	{
		actualPlayer = label;
	}
	
	public JLabel getNucleoLabel ()
	{
		return nucleoLabel;
	}
	public void setNucleoLabel (JLabel label)
	{
		nucleoLabel = label;
	}
	
	public JLabel getAminoLabel ()
	{
		return aminoLabel;
	}
	public void setAminoLabel (JLabel label)
	{
		aminoLabel = label;
	}
	
	public JLabel getGotProtectionLabel ()
	{
		return gotProtectionLabel;
	}
	public void setGotProtectionLabel (JLabel label)
	{
		gotProtectionLabel = label;
	}
	
	public JLabel getGotParalyzeLabel ()
	{
		return gotParalyzeLabel;
	}
	public void setGotParalyzeLabel (JLabel label)
	{
		gotParalyzeLabel = label;
	}
	
	public JLabel getGotAmnesiaLabel ()
	{
		return gotAmnesiaLabel;
	}
	public void setGotAmnesiaLabel (JLabel label)
	{
		gotAmnesiaLabel = label;
	}
	
	public JLabel getGotDanceLabel ()
	{
		return gotDanceLabel;
	}
	public void setGotDanceLabel (JLabel label)
	{
		gotDanceLabel = label;
	}
	
	public JLabel getGotBearLabel ()
	{
		return gotBearLabel;
	}
	public void setGotBearLabel (JLabel label)
	{
		gotBearLabel = label;
	}
	
	public JLabel getGotBagLabel ()
	{
		return gotBagLabel;
	}
	public void setGotBagLabel (JLabel label)
	{
		gotBagLabel = label;
	}
	
	public JLabel getGotCloakLabel ()
	{
		return gotCloakLabel;
	}
	public void setGotCloakLabel (JLabel label)
	{
		gotCloakLabel = label;
	}
	
	public JLabel getGotGlovesLabel ()
	{
		return gotGlovesLabel;
	}
	public void setGotGlovesLabel (JLabel label)
	{
		gotGlovesLabel = label;
	}
	
	public JLabel getGotAxeLabel ()
	{
		return gotAxeLabel;
	}
	public void setGotAxeLabel (JLabel label)
	{
		gotAxeLabel = label;
	}
	
	
	
	



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loadItem)
		{
			 //TODO
		}
		if(e.getSource()==saveItem)
		{
			 Game.GetInstance().SaveGame();
		}
		if(e.getSource()==exitItem)
		{
			 Game.GetInstance().ExitGame();
		}
		
	}
}