package com.operativ_tarsulat;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

public class BearVirus extends Agent implements Serializable {
    /**
     * Calls the blank Agent constructor
     */
    BearVirus() {
        super();
        Skeleton.LogFunctionCall("BearVirus ctr");
        Skeleton.LogReturn();
    }

    /**
     *
     * @param d The duration of this Agent
     * @param v The virologist that this Agent belongs to
     */
    BearVirus(int d, Virologist v) {
        super(d, v);
        Skeleton.LogFunctionCall("BearVirus ctr", String.valueOf(d), v.getName());
        Skeleton.LogReturn();
    }

    /**
     *
     * @param v The Virologist who wants to reach another Virologist
     * @param i An Agent, which v wants to use
     * @param v2 The targeted Virologist
     * @return false, because v can reach v2
     */
    public Boolean HandleTouch(Virologist v, Agent i, Virologist v2) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName(), i.getClass().getName(), v2.getName());
        Skeleton.LogReturn("false");
        return false;
    }

    /**
     *
     * @param v The Virologist whose inventory we want to check
     * @return a number, which shows how much the capacity increased, it's 0 because this effect doesn't provide bigger capacity
     */
    public int HandleInventoryCapacity(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        Skeleton.LogReturn("0");
        return 0; }

    /**
     *
     * @param v The Virologist who wants to move
     * @return true, because v can't move
     */
    public Boolean HandleMove(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        Skeleton.LogReturn("true");
        return true;
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
     * @return false, because it can create Agent
     */
    public Boolean HandleCreateAgent(Virologist v, GeneticCode code) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName(), code.getClass().getName());
        Skeleton.LogReturn("false");
        return false;
    }

    /**
     * Handles the start of the turn, moves to a random neighbour field
     * @param v The Virologist, whose turn starts
     */
    public void HandleTurnStart(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        List<Field> neighbours = v.GetField().GetNeighbours();
        Random rand = new Random();
        v.Move(neighbours.get(rand.nextInt(neighbours.size()-1)));
        Skeleton.LogReturn();
    }
}
