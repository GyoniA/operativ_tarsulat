package com.operativ_tarsulat;

public class AmnesiaVirus extends Agent {
    public Boolean HandleTouch(Virologist v, Agent i, Virologist v2) { return false; }
    
    public Boolean HandleMove(Virologist v) { return false; }
    
    public int HandleInventoryCapacity(Virologist v) { return 0; }
    
    public Boolean HandleParalyzed(Virologist v) {
    	return false;
    }
    
    public Boolean HandleCreateAgent(Virologist v, GeneticCode code) { return true; }
    
    public void HandleTurnStart(Virologist v) {}
}
