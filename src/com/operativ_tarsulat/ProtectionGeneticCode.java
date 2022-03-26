package com.operativ_tarsulat;

public class ProtectionGeneticCode extends GeneticCode {
    /**
     * Calls the GeneticCode blank constructor
     */
    ProtectionGeneticCode() {
        super();
        Skeleton.LogFunctionCall("ProtectionGeneticCode ctr");
        Skeleton.LogReturn();
    }

    /**
     *
     * @param v The virologist that this Agent belongs to
     * @param a The amino cost of this GeneticCode
     * @param n The nucleo cost of this GeneticCode
     */
    ProtectionGeneticCode(Virologist v, int a, int n) {
        super(v, a, n);
        Skeleton.LogFunctionCall("ProtectionGeneticCode ctr", v.getName(), String.valueOf(a), String.valueOf(n));
        Skeleton.LogReturn();
    }

    /**
     *
     * @param v The virologist that this Agent will belong to
     * @return The newly created Agent
     */
    public ProtectionVaccine CreateInstance(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        return new ProtectionVaccine(duration, v);
    }

    /**
     * Sets the value that belongs to this genetic code to true in the given CheckList
     * @param ls The list which will be set
     */
    public void CheckList(GeneticCodeCheckList ls) {
    	ls.Protection = true;
        Skeleton.LogReturn();
    }
}
