package com.operativ_tarsulat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Tests {

	public static void main(String[] args) {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Adjon meg egy parancsot!");
			String command = "";
			try {
				command = br.readLine();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
			switch(command) {
			case "loadGame": 
				LoadGameTest();
				break;
			case "exitGame":
				ExitGameTest();
				break;
			case "startGame":
				StartGameTest();
				break;
			case "playerSteps":
				PlayerStepsTest();
				break;
			default: System.out.println("Nem ismert parancs!");
			}
			
		}
		
		
	}
	
	static void LoadGameTest()
	{		
		BufferedReader lr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Játék neve: ");
		String gameName = "";
		try {
			gameName = lr.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Game.GetInstance().LoadGame(gameName);
	}
	
	static void ExitGameTest()
	{
		BufferedReader lr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("El akarod menteni a fájlt?(I/N) ");
		String answer = "";
		try {
			answer = lr.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(answer.equals("I"))Game.GetInstance().SaveGame();
		System.out.println("Sikeres kilépés!");
		Game.GetInstance().ExitGame();
	}	
	
	static void StartGameTest()
	{
		BufferedReader lr = new BufferedReader(new InputStreamReader(System.in));
		String seed = "";
		String fileName = "";
		String []players = new String [10];
		try {
			System.out.println("Fájlnév: ");
			fileName = lr.readLine();
			System.out.println("Seed: ");
			seed = lr.readLine();
			System.out.println("Játékosok: ");
			players = lr.readLine().split(" ");
			
		} catch (IOException e) {
			System.out.println("Sikertelen pálya betöltés!");
			e.printStackTrace();
		}
		Game.GetInstance().StartGame(fileName, Integer.parseInt(seed), players);
		System.out.println("Sikeres pálya betöltés");
	}
	
	static void PlayerStepsTest()
	{
		BufferedReader lr = new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		try {
			System.out.println("Virológus: ");
			name = lr.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Virologist v = new Virologist(name);
		Field f = new FreeField();
		Field f2 = new Laboratory();
		Field f3 = new City();
		v.SetField(f);
		f.AddNeighbour(f2);
		f.AddNeighbour(f3);
		f2.AddNeighbour(f);
		f2.AddNeighbour(f3);
		f3.AddNeighbour(f);
		f3.AddNeighbour(f2);
		List<Field> neigh = f.GetNeighbours();
		System.out.print("Elérhetõ mezõ: ");
		int a = 1;
		for(int i =0;i<neigh.size();i++)
		{
			System.out.print("("+a+")"+neigh.get(i).getClass()+",");
			a++;
			
		}
		try {
			a = Integer.parseInt(lr.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		v.Move(neigh.get(a-1));
		
		boolean atment = false;
		for(int i = 0;i<neigh.get(a-1).GetVirologists().length;i++)
		{
			Virologist[] vir = neigh.get(a-1).GetVirologists();
			if(vir[i].getName().equals(name)) atment = true;
		}
		if(atment)System.out.println(name+" sikerült elmozdulnia");
		else System.out.println(name+" nem sikerült elmozdulnia");
		v.InteractWithField();
		
		if(a==1)
		{
			v.AddAgent(new BearVirus());
			System.out.println(name +" Megfertõzõdött medve vírussal");
		}
		
		
		
	}
	
	
	
	
}
