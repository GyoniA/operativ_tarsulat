package com.operativ_tarsulat;

import java.io.Serializable;

public class AmnesiaGeneticCode extends GeneticCode implements Serializable {

    /**
     * @return The description of the class
     */
    public String toString(){
        return "AmnesiaGeneticCode";
    }

    /**
     * Calls the GeneticCode blank constructor
     */
    AmnesiaGeneticCode() {
        super();
        Skeleton.LogFunctionCall("AmnesiaGeneticCode ctr");
        Skeleton.LogReturn();
    }

    /**
     *
     * @param v The virologist that this Agent belongs to
     * @param a The amino cost of this GeneticCode
     * @param n The nucleo cost of this GeneticCode
     */
    AmnesiaGeneticCode(Virologist v, int a, int n) {
        super(v, a, n);
        Skeleton.LogFunctionCall("AmnesiaGeneticCode ctr", v.getName(), String.valueOf(a), String.valueOf(n));
        Skeleton.LogReturn();
    }

    /**
     *
     * @param v The virologist that this Agent will belong to
     * @return The newly created Agent
     */
    public  AmnesiaVirus CreateInstance(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        Skeleton.LogReturn(this.getClass().getName());
        return new AmnesiaVirus(duration, v);
    }

    /**
     * Sets the value that belongs to this genetic code to true in the given CheckList
     * @param ls The list which will be set
     */
    public void CheckList(GeneticCodeCheckList ls) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), ls.getClass().getName());
        ls.Amnesia = true;
        Skeleton.LogReturn();
    }
}
