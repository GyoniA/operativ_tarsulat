package com.operativ_tarsulat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tests {

	public static void main(String[] args) {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Adja meg a parancsot!");
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
			case "saveGame":
				SaveGameTest();
				break;
			default: System.out.println("Rossz parancs!");
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
	
	static void SaveGameTest()
	{
		
	}
	
	
}
