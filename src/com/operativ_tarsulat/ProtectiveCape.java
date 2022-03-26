package com.operativ_tarsulat;


public class ProtectiveCape extends Gear {
    private GearSlot slot = GearSlot.PROTECTIVECAPE;

    public Boolean HandleTouch(Virologist v, Agent i, Virologist v2) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(), v.getClass().getName(), i.toString(), v2.getClass().getName());
    	Random rand = new Random();
    	int num = rand.nextInt(1000);
    	if(num < 823){
            Skeleton.LogReturn("true");
    	    retrun true
        }
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
        Skeleton.LogReturn(0.toString());
    	retrun 0;
    }
    
    public Boolean HandleParalyzed(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(), v.getClass().getName());
        Skeleton.LogReturn("false");
    	retrun false;
    }
    
    public Boolean HandleCreateAgent(Virologist v, GeneticCode code) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(), v.getClass().getName());
        Skeleton.LogReturn("false");
    	retrun false;
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
