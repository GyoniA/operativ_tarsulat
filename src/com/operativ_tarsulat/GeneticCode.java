package com.operativ_tarsulat;

public abstract class GeneticCode {
    private Virologist virologist;
    protected int duration;
    private int aminoCost;
    private int nucleoCost;
    GeneticCode(Virologist v, int a, int n){
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName(), String.valueOf(a), String.valueOf(n));
        virologist = v;
        aminoCost = a;
        nucleoCost = n;
        Skeleton.LogReturn();
    }

    GeneticCode() {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        virologist = null;
        aminoCost = 0;
        nucleoCost = 0;
        Skeleton.LogReturn();
    }

    public abstract Agent CreateInstance(Virologist v);
    public int GetAminoCost() {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        Skeleton.LogReturn();
        return aminoCost;
    }
    public abstract void CheckList(GeneticCodeCheckList ls);
    public int GetNucleoCost() {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        Skeleton.LogReturn();
        return nucleoCost;
    }
    public void SetDuration(int d) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), String.valueOf(d));
        duration = d;
        Skeleton.LogReturn();
    }
}
