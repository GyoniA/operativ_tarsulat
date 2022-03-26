package com.operativ_tarsulat;


public class ProtectiveCape extends Gear {
    private GearSlot slot = GearSlot.PROTECTIVECAPE;

    /**
     *
     * @param v The Virologist who wants to reach another Virologist
     * @param i An Agent, which v wants to use
     * @param v2 The targeted Virologist
     * @return true in 82,3% of the cases
     */
    public Boolean HandleTouch(Virologist v, Agent i, Virologist v2) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(), v.getClass().getName(), i.toString(), v2.getClass().getName());
    	//Generating a random number (0-999)
        Random rand = new Random();
    	int num = rand.nextInt(1000);
    	//If the number is under 823 it returns true (82.3%)
    	if(num < 823){
            Skeleton.LogReturn("true");
    	    return true;
        }
    	// In other cases it's return false
        Skeleton.LogReturn("false");
    	return false;
    }

    /**
     *
     * @param v The Virologist who wants to move
     * @return false, because v can move
     */
    public Boolean HandleMove(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(), v.getClass().getName());
        Skeleton.LogReturn("false");
    	return false;
    }

    /**
     *
     * @param v The Virologist who owns the ProtectiveCape
     * @return a number, which shows how much the capacity increased, it's 0 because the Gloves doesn't provide bigger capacity
     */
    public int HandleInventoryCapacity(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(), v.getClass().getName());
        Skeleton.LogReturn(0.toString());
    	return 0;
    }

    /**
     *
     * @param v The Virologist who we are examining to see if it is paralyzed, because of the ProtectiveCape
     * @return false because it isn't
     */
    public Boolean HandleParalyzed(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(), v.getClass().getName());
        Skeleton.LogReturn("false");
    	return false;
    }

    /**
     *
     * @param v The Virologist who we are examining to see if it can create an Agent, because of the ProtectiveCape
     * @param code The GeneticCode which it wants to use to create an Agent
     * @return false, because it can create Agent
     */
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

    /**
     *
     * @return The Slot which contains the ProtectiveCape
     */
    public GearSlot GetSlot() {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName());
        Skeleton.LogReturn(slot.toString());
        return slot;
    }
}
