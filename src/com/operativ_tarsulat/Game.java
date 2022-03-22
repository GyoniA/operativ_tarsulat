package com.operativ_tarsulat;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Game.java
//  @ Date : 2022. 03. 19.
//  @ Author : 
//
//

import java.util.ArrayList;

public class Game {
    private ArrayList<Virologist> virologists;
    private ArrayList<Field> fields;
    private int currentVirologistIndex = 0;
    
    private static Game instance;
    
    public static Game GetInstance() {
    	if(instance == null)
    		instance = new Game();
    	return instance;
    }
    
    ///
    /// Constructor with no arguments, initializes all attributes
    ///
    public Game() {
    	virologists = new ArrayList<>();
    	fields = new ArrayList<>();
    }
    
    ///
    /// For testing purposes, so the test can be rerun
    ///
    public void Clear() {
    	instance = new Game(); // Creates a new instance of the game class discarding the last one
    }
    
    ///
    ///	For testing purposes, adds a virologist to the list
    ///
    public void AddVirologist(Virologist v) {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getClass().getName());
    	virologists.add(v);
    	Skeleton.LogReturn();
    }
    
    
    public void StartGame(String saveFile, int seed, String[] names) {
    }
    
    public void EndGame() {
    }
    
    public void NextTurn() {
    }
    
    public void LoadGame(String saveFile) {
    }
    
    public void SaveGame() {
    }
    
    public void ExitGame() {
    }
}
