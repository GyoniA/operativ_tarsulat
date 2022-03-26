package com.operativ_tarsulat;

public class ProtectionGeneticCode extends GeneticCode {
    ProtectionGeneticCode() {
        super();
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        Skeleton.LogReturn();
    }
    ProtectionGeneticCode(Virologist v, int a, int n) {
        super(v, a, n);
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName(), String.valueOf(a), String.valueOf(n));
        Skeleton.LogReturn();
    }

    public ProtectionVaccine CreateInstance(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        return new ProtectionVaccine(duration, v);
    }

    public void CheckList(GeneticCodeCheckList ls) {
    	ls.Protection = true;
        Skeleton.LogReturn();
    }
}
