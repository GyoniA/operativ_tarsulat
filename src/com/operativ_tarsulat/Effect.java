package com.operativ_tarsulat;

public interface Effect {
    public Boolean HandleTouch(Virologist v, Agent i, Virologist v2);
    public Boolean HandleMove(Virologist v) ;

    public int HandleInventoryCapacity(Virologist v);

    public Boolean HandleParalyzed(Virologist v) ;

    public Boolean HandleCreateAgent(Virologist v, GeneticCode code);
    
    public int HandleTurnStart(Virologist v);
}
