package com.operativ_tarsulat;

public class ParalyzeGeneticCode extends GeneticCode {
    public ParalyzeVirus CreateInstance(Virologist v) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void CheckList(GeneticCodeCheckList ls) { ls.Paralyze = true; }
}
