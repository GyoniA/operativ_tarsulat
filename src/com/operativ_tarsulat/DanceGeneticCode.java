package com.operativ_tarsulat;

public class DanceGeneticCode extends GeneticCode {
    private int duration;

    DanceGeneticCode() {
        super();
    }
    DanceGeneticCode(Virologist v, int a, int n) {
        super(v, a, n);
    }

    public DanceVirus CreateInstance(Virologist v) {
        return new DanceVirus(duration, v);
    }

    public void CheckList(GeneticCodeCheckList ls) {
    	ls.Dance = true;
    }
}
