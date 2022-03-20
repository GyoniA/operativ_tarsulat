package com.operativ_tarsulat;

public class AmnesiaGeneticCode extends GeneticCode {
	@Override
    public  AmnesiaVirus CreateInstance(Virologist v) {
		throw new RuntimeException("Unimplemented");
    }
    
    public int GetAminoCost() {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void CheckList(GeneticCodeCheckList ls) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public int GetNucleoCost() {
    	throw new RuntimeException("Unimplemented");
    }
}
