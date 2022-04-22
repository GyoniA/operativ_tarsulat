package com.operativ_tarsulat;

import java.io.Serializable;

public abstract class GeneticCode implements Serializable {
    private Virologist virologist;
    protected int duration;
    private int aminoCost;
    private int nucleoCost;

    /**
     * @return The description of the class
     */
    public String toString(){
        return "virologist, who has the genetic code: "+virologist.getName()+"amino cost: "+aminoCost+"nucleo cost: "+nucleoCost;
    }

    /**
     * Creates a new GeneticCode
     * @param v The virologist that this Agent belongs to
     * @param a The amino cost of this GeneticCode
     * @param n The nucleo cost of this GeneticCode
     */
    GeneticCode(Virologist v, int a, int n){
        Skeleton.LogFunctionCall("GeneticCode ctr", v.getName() , String.valueOf(a), String.valueOf(n));
        virologist = v;
        aminoCost = a;
        nucleoCost = n;
        Skeleton.LogReturn();
    }

    /**
     * Creates a new blank GeneticCode
     */
    GeneticCode() {
        Skeleton.LogFunctionCall("GeneticCode ctr");
        virologist = null;
        aminoCost = 0;
        nucleoCost = 0;
        Skeleton.LogReturn();
    }

    public abstract Agent CreateInstance(Virologist v);

    /**
     * Returns the amino cost of this GeneticCode
     * @return The amino cost of this GeneticCode
     */
    public int GetAminoCost() {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        Skeleton.LogReturn();
        return aminoCost;
    }
    public abstract void CheckList(GeneticCodeCheckList ls);

    /**
     * Returns the nucleo cost of this GeneticCode
     * @return The nucleo cost of this GeneticCode
     */
    public int GetNucleoCost() {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        Skeleton.LogReturn();
        return nucleoCost;
    }

    /**
     * Sets the duration of this GeneticCode
     * @param d The duration of this GeneticCode
     */
    public void SetDuration(int d) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), String.valueOf(d));
        duration = d;
        Skeleton.LogReturn();
    }
}
