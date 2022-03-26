package com.operativ_tarsulat;

import java.util.List;
import java.util.Random;

public class DanceVirus extends Agent {
    DanceVirus() {
        super();
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        Skeleton.LogReturn();
    }
    DanceVirus(int d, Virologist v) {
        super(d, v);
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), String.valueOf(d), v.getName());
        Skeleton.LogReturn();
    }

    public Boolean HandleTouch(Virologist v, Agent i, Virologist v2) { return false; }

    public int HandleInventoryCapacity(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        Skeleton.LogReturn("0");
        return 0; }

    public Boolean HandleMove(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        Skeleton.LogReturn("true");
        return true;
    }

    public Boolean HandleParalyzed(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        Skeleton.LogReturn("false");
        return false;
    }
    
    public Boolean HandleCreateAgent(Virologist v, GeneticCode code) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        Skeleton.LogReturn("false");
        return false;
    }
    
    public void HandleTurnStart(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        List<Field> neighbours = v.GetField().GetNeighbours();
        Random rand = new Random();
        v.Move(neighbours.get(rand.nextInt(neighbours.size()-1)));
        Skeleton.LogReturn();
    }
}
