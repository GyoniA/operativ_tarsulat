package com.operativ_tarsulat;

public class AmnesiaVirus extends Agent {
    /**
     * Calls the blank Agent constructor
     */
    AmnesiaVirus() {
        super();
        Skeleton.LogFunctionCall("AmnesiaVirus ctr");
        Skeleton.LogReturn();
    }

    /**
     *
     * @param d The duration of this Agent
     * @param v The virologist that this Agent belongs to
     */
    AmnesiaVirus(int d, Virologist v) {
        super(d, v);
        Skeleton.LogFunctionCall("AmnesiaVirus ctr", String.valueOf(d), v.getName());
        Skeleton.LogReturn();
    }

    /**
     *
     * @param v The Virologist who wants to reach another Virologist
     * @param i An Agent, which v wants to use
     * @param v2 The targeted Virologist
     * @return false, because v can reach v2
     */
    public Boolean HandleTouch(Virologist v, Agent i, Virologist v2) { return false; }

    /**
     *
     * @param v The Virologist whose inventory we want to check
     * @return a number, which shows how much the capacity increased, it's 0 because this effect doesn't provide bigger capacity
     */
    public int HandleInventoryCapacity(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        Skeleton.LogReturn("0");
        return 0;
    }

    /**
     *
     * @param v The Virologist who wants to move
     * @return false, because v can move
     */
    public Boolean HandleMove(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        Skeleton.LogReturn("false");
        return false;
    }

    /**
     *
     * @param v The Virologist who we are examining to see if they are paralyzed
     * @return false because they aren't paralyzed
     */
    public Boolean HandleParalyzed(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        Skeleton.LogReturn("false");
        return false;
    }

    /**
     *
     * @param v The Virologist who we are examining to see if it can create an Agent
     * @param code The GeneticCode which it wants to use to create an Agent
     * @return true, because it can't create Agent
     */
    public Boolean HandleCreateAgent(Virologist v, GeneticCode code) { return true; }

    /**
     * Handles the start of the turn
     * @param v The Virologist, whose turn starts
     */
    public void HandleTurnStart(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        Skeleton.LogReturn();
    }
}
