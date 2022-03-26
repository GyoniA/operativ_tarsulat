package com.operativ_tarsulat;

public class ParalyzeGeneticCode extends GeneticCode {
    ParalyzeGeneticCode() {
        super();
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        Skeleton.LogReturn();
    }
    ParalyzeGeneticCode(Virologist v, int a, int n) {
        super(v, a, n);
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName(), String.valueOf(a), String.valueOf(n));
        Skeleton.LogReturn();
    }

    public ParalyzeVirus CreateInstance(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        return new ParalyzeVirus(duration, v);
    }
    
    public void CheckList(GeneticCodeCheckList ls) {
        ls.Paralyze = true;
        Skeleton.LogReturn();
    }
}
