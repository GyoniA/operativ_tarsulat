package com.operativ_tarsulat;


public class Gloves extends Gear {
    private GearSlot slot = GearSlot.GLOVES


    public Boolean HandleTouch(Virologist v, Agent i, Virologist v2) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(), v.getClass().getName(), i.toString(), v2.getClass().getName());
        Skeleton.LogReturn("true");
    	return true;
    }
    
    public Boolean HandleMove(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(), v.getClass().getName());
        Skeleton.LogReturn("false");
        return false;
    }
    
    public int HandleInventoryCapacity(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(), v.getClass().getName());
        Skeleton.LogReturn(0.toString());
    	return 0;
    }
    
    public Boolean HandleParalyzed(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(), v.getClass().getName());
        Skeleton.LogReturn("false");
    	return false;
    }
    
    public Boolean HandleCreateAgent(Virologist v, GeneticCode code) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(), v.getClass().getName());
        Skeleton.LogReturn("false");
    	return false;
    }
    
    public void HandleTurnStart(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(), v.getClass().getName());
        Skeleton.LogReturn("false");
    	return false;
    }
    
    public GearSlot GetSlot() {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName());
        Skeleton.LogReturn(slot.toString());
    	return slot;
    }
}
