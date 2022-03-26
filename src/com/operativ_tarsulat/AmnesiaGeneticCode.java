package com.operativ_tarsulat;

public class AmnesiaGeneticCode extends GeneticCode {
    AmnesiaGeneticCode() {
        super();
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        Skeleton.LogReturn();
    }
    AmnesiaGeneticCode(Virologist v, int a, int n) {
        super(v, a, n);
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName(), String.valueOf(a), String.valueOf(n));
        Skeleton.LogReturn();
    }

    public  AmnesiaVirus CreateInstance(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        return new AmnesiaVirus(duration, v);
    }
    
    public void CheckList(GeneticCodeCheckList ls) {
    	ls.Amnesia = true;
    }
}
