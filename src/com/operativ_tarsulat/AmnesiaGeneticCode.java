package com.operativ_tarsulat;

public class AmnesiaGeneticCode extends GeneticCode {
    public  AmnesiaVirus CreateInstance(Virologist v) {
		throw new RuntimeException("Unimplemented");
    }
    
    public void CheckList(GeneticCodeCheckList ls) {
    	ls.Amnesia = true;
    }
}
