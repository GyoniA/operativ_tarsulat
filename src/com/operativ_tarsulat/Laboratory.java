package com.operativ_tarsulat;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Laboratory.java
//  @ Date : 2022. 03. 19.
//  @ Author : 
//
//




public class Laboratory extends Field {
    private GeneticCode localGeneticCode;
    public void SetGeneticCode(GeneticCode gc) {
    	localGeneticCode = gc;
    }
    public void Interact(Virologist v) {
    	throw new RuntimeException("Unimplemented");
    }
}
