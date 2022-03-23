package com.operativ_tarsulat;

public class ParalyzeVirus extends Agent {
    public Boolean HandleTouch(Virologist v, Agent i, Virologist v2) { return false; }
    
    public int HandleInventoryCapacity(Virologist v) { return 0; }
    
    public Boolean HandleMove(Virologist v) { return true; }
    
    public Boolean HandleParalyzed(Virologist v) { return true; }
    
    public Boolean HandleCreateAgent(Virologist v, GeneticCode code) { return false; }
    
    public void HandleTurnStart(Virologist v) {}
}
