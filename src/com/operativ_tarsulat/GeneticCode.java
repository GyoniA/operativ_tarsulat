package com.operativ_tarsulat;

public abstract class GeneticCode {
    private Virologist virologist;
    private int aminoCost;
    private int nucleoCost;
    GeneticCode(Virologist v, int a, int n){
        virologist = v;
        aminoCost = a;
        nucleoCost = n;
    }

    public GeneticCode() {
        throw new RuntimeException("Unimplemented, biztos kell üres konstruktor?");
    }

    public abstract Agent CreateInstance(Virologist v);
    public int GetAminoCost() { return aminoCost; }
    public abstract void CheckList(GeneticCodeCheckList ls);
    public int GetNucleoCost() { return nucleoCost; }
}
