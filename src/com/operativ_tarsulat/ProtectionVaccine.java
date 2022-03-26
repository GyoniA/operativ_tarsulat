package com.operativ_tarsulat;

public class ProtectionVaccine extends Agent {
    ProtectionVaccine() {
        super();
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        Skeleton.LogReturn();
    }
    ProtectionVaccine(int d, Virologist v) {
        super(d, v);
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), String.valueOf(d), v.getName());
        Skeleton.LogReturn();
    }

    public Boolean HandleTouch(Virologist v, Agent i, Virologist v2) { return true; }

    public int HandleInventoryCapacity(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        Skeleton.LogReturn("0");
        return 0;
    }

    public Boolean HandleMove(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        Skeleton.LogReturn("false");
        return false;
    }
    
    public Boolean HandleParalyzed(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        Skeleton.LogReturn("false");
        return false;
    }
    
    public Boolean HandleCreateAgent(Virologist v, GeneticCode code) { return false; }
    
    public void HandleTurnStart(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        Skeleton.LogReturn();
    }
}
