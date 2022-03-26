package com.operativ_tarsulat;

public class DanceGeneticCode extends GeneticCode {
    DanceGeneticCode() {
        super();
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        Skeleton.LogReturn();
    }
    DanceGeneticCode(Virologist v, int a, int n) {
        super(v, a, n);
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName(), String.valueOf(a), String.valueOf(n));
        Skeleton.LogReturn();
    }

    public DanceVirus CreateInstance(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        return new DanceVirus(duration, v);
    }

    public void CheckList(GeneticCodeCheckList ls) {
    	ls.Dance = true;
    }
}
