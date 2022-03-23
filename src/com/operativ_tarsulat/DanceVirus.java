package com.operativ_tarsulat;

public class DanceVirus extends Agent {
    DanceVirus() {
        super();
    }
    DanceVirus(int d, Virologist v) {
        super(d, v);
    }

    public Boolean HandleTouch(Virologist v, Agent i, Virologist v2) { return false; }
    
    public Boolean HandleMove(Virologist v) { return true; }
    
    public int HandleInventoryCapacity(Virologist v) { return 0; }
    
    public Boolean HandleParalyzed(Virologist v) { return false; }
    
    public Boolean HandleCreateAgent(Virologist v, GeneticCode code) { return false; }
    
    public void HandleTurnStart(Virologist v) {
    	throw new RuntimeException("Unimplemented");
    }
}
