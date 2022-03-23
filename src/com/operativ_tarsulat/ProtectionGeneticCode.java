package com.operativ_tarsulat;

public class ProtectionGeneticCode extends GeneticCode {
    public ProtectionVaccine CreateInstance(Virologist v) {
    	throw new RuntimeException("Unimplemented");
    }

    public void CheckList(GeneticCodeCheckList ls) {
    	ls.Protection = true;
    }
}
