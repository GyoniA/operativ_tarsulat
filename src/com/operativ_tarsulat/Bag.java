package com.operativ_tarsulat;

import java.io.Serializable;

public class Bag extends Gear implements Serializable {
    private final GearSlot slot = GearSlot.Bag;
    private final int capacityGrow = 20;

    /**
     *
     * @param v The Virologist who wants to reach another Virologist
     * @param i An Agent, which v wants to use
     * @param v2 The targeted Virologist
     * @return false, because v can reach v2
     */
    public Boolean HandleTouch(Virologist v, Agent i, Virologist v2) {
        Skeleton.LogFunctionCall("Bag ctr", v.getClass().getName(), i.toString(), v2.getClass().getName());
        Skeleton.LogReturn("false");
        return false;
    }

    /**
     *
     * @param v The Virologist who wants to move
     * @return false, because v can move
     */
    public Boolean HandleMove(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getClass().getName());
        Skeleton.LogReturn("false");
    	return false;
    }

    /**
     *
     * @param v The Virologist who owns the Bag
     * @return a number, which shows how much the capacity increased
     */
    public int HandleInventoryCapacity(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getClass().getName());
        Skeleton.LogReturn(Integer.toString(capacityGrow));
    	return capacityGrow;
    }

    /**
     *
     * @param v The Virologist who we are examining to see if it is paralyzed, because of the Bag
     * @return false because it isn't
     */
    public Boolean HandleParalyzed(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getClass().getName());
        Skeleton.LogReturn("false");
    	return false;
    }

    /**
     *
     * @param v The Virologist who we are examining to see if it can create an Agent, because of the Bag
     * @param code The GeneticCode which it wants to use to create an Agent
     * @return false, because it can create Agent
     */
    public Boolean HandleCreateAgent(Virologist v, GeneticCode code) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getClass().getName());
        Skeleton.LogReturn("false");
    	return false;
    }

    /**
     * Handles the start of the turn
     * @param v The Virologist, whose turn starts
     */
    public void HandleTurnStart(Virologist v) {

    }

    /**
     *
     * @return The Slot which contains the Bag
     */
    public GearSlot GetSlot() {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        Skeleton.LogReturn(slot.toString());
    	return slot;
    }
}
