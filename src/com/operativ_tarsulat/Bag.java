package com.operativ_tarsulat;



public class Bag extends Gear {
    private GearSlot slot = GearSlot.BAG;
    private int capacityGrow;


    public Boolean HandleTouch(Virologist v, Agent i, Virologist v2) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(), v.getClass().getName(), i.toString(), v2.getClass().getName());
        Skeleton.LogReturn("false");
        return false;
    }
    
    public Boolean HandleMove(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(), v.getClass().getName());
        Skeleton.LogReturn("false");
    	return false;
    }
    
    public int HandleInventoryCapacity(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(), v.getClass().getName());
        Skeleton.LogReturn(capacityGrow.toString());
    	return capacityGrow;
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
