package com.operativ_tarsulat;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Effect.java
//  @ Date : 2022. 03. 19.
//  @ Author : 
//
//




public interface Effect {
    public Boolean HandleTouch(Virologist v, Agent i, Virologist v2);
    public Boolean HandleMove(Virologist v) ;
    
    public int HandleInventoryCapacity(Virologist v);
    
    public Boolean HandleParalized(Virologist v) ;
    
    public Boolean HandleCreateAgent(Virologist v, GeneticCode code);
    
    public void HandleTurnStart(Virologist v);
}
