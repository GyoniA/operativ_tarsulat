package com.operativ_tarsulat;



public class Virologist implements Steppable {
    private Field field;
    private Gear gear;
    private GeneticCode learnedGeneticCodes;
    private Agent activeAgents;
    private Agent agentInventory;
    
    
   
    public void SetAmino(int amount) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void SetNucleo(int amount) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void UseAgent(Virologist v, Agent a) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void ReceiveAgentUse(Agent a, Virologist v) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void LearnGeneticCode(GeneticCode s) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public Gear GetGear(Gear g) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void RemoveGear(Gear r) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void AddGeneticCode(GeneticCode gc) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void Move(Field f) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void Step() {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void Steal(Virologist v, Gear r) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public Boolean StolenFrom(Virologist v, Gear r) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public Field GetField() {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void SetField(Field f) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void InteractWithField() {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void StealMaterials(Virologist v) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void StolenMaterialsFrom(Virologist v) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void GetMaterial(int amino, int nucleo) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public int GetVacantAmino() {
    	throw new RuntimeException("Unimplemented");
    }
    
    public int GetVacantNucleo() {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void CreateAgent(GeneticCode code) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void EndTurn() {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void AddAgent(Agent a) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void AddAgentToInventory(Agent a) {
    	throw new RuntimeException("Unimplemented");
    }
    
    public void RemoveAgent(Agent a) {
    	throw new RuntimeException("Unimplemented");
    }
}
