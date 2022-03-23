package com.operativ_tarsulat;

public class ProtectionVaccine extends Agent {
    public Boolean HandleTouch(Virologist v, Agent i, Virologist v2) { return true; }
    
    public Boolean HandleMove(Virologist v) { return false; }
    
    public int HandleInventoryCapacity(Virologist v) { return 0; }
    
    public Boolean HandleParalyzed(Virologist v) { return false; }
    
    public Boolean HandleCreateAgent(Virologist v, GeneticCode code) { return false; }
    
    public void HandleTurnStart(Virologist v) {}
}
