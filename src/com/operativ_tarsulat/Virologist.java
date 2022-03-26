package com.operativ_tarsulat;
import java.util.ArrayList;
import java.util.List;

public class Virologist implements Steppable {
    private String name;
    private Field field;

    // Virologist can possess 3 gears
    private List<Gear> gears = new ArrayList<Gear>();

    //ArrayLists that store active agents, agents in inventory and learnd genetic codes.
    private List<Agent> activeAgents = new ArrayList<>();
    private List<Agent> agentInventory = new ArrayList<>();
    private List<GeneticCode> learnedGeneticCodes = new ArrayList<>();

    // integers for storing amino and nucleo count
    private int aminoCount;
    private int nucleoCount;

    private int inventoryCapacity;

    /**
     *
     * @param n Name of the virologist.
     */
    public Virologist(String n){
        this.name = n;
    }

    /**
     *
     * @param n Name of the virologist.
     * @param f The specific field, where the virologist stands.
     */
    public Virologist(String n, Field f){
        this.name = n;
        this.field = f;
    }

    public Virologist(){}

    /**
     * The function sets the amino count.
     * @param amount Quantity of the aminos.
     */
    public void SetAmino(int amount) {
        this.aminoCount = amount;
    }

    /**
     * The function sets the nucleo count.
     * @param amount Quantity of the nucleos.
     */
    public void SetNucleo(int amount) {
        this.nucleoCount = amount;
    }

    /**
     * This virologist tries to use agent on another virologist
     * @param v2 The virologist that will be under the effect of Agent a
     * @param a The used agent
     */
    public void UseAgent(Virologist v2, Agent a) {
        // Movement is basically allowed, but if an active agent on the
        // virologist blocks the virologist's ability to move it will be
        // changed to false.
        boolean movement = checkMovement();

        // if movement is allowed
        if(movement)
            v2.ReceiveAgentUse(a,this);
    }

    /**
     * Another virologist tries to apply agent on this virologist
     * @param a The agent that will be used on this virologist.
     * @param v The virologist who wants to use agent on this virologist.
     */

    public String getName(){
        return this.name;
    }

    public void ReceiveAgentUse(Agent a, Virologist v) {
        boolean allowtouch = checkTouch(a,v);
        if(allowtouch)
            this.AddAgent(a);
    }

    public void LearnGeneticCode(GeneticCode s) {
        if(!learnedGeneticCodes.contains(s)){
            learnedGeneticCodes.add(s);
            GeneticCodeCheckList gcc = new GeneticCodeCheckList();
            for(int i = 0; i<learnedGeneticCodes.size();i++)
                learnedGeneticCodes.get(i).CheckList(gcc);
            gcc.CheckEndCondition();
        }
    }

    public Gear GetGear(Gear g) {
        GearSlot gs = g.GetSlot();
        Gear temp;
        for(int i = 0;i<gears.size();i++)
            if(gears.get(i).GetSlot() == gs){
                temp = gears.get(i);
                gears.remove(gears.get(i));
                gears.add(g);
                return temp;
            }
        gears.add(g);
        return null;
    }

    public void RemoveGear(Gear r) {
        gears.remove(r);
    }

    public void AddGeneticCode(GeneticCode gc) {
        learnedGeneticCodes.add(gc);
    }

    public void Move(Field f2) {
        if(this.checkMovement())
            if(field.Remove(this,f2))
                f2.Accept(this);
    }

    public void Step() {
        for(int i = 0;i<activeAgents.size();i++)
            activeAgents.get(i).Step();
    }

    public void Steal(Virologist v2, Gear r) {
        if(this.checkMovement())
            v2.StolenFrom(this,r);
    }

    public Boolean StolenFrom(Virologist v, Gear r) {
        if(!this.checkMovement()){
            Gear g = v.GetGear(r);
            gears.remove(r);
            gears.add(g);
        }
        return true;
    }

    public Field GetField() {
        return this.field;
    }

    public void SetField(Field f) {
        this.field = f;
    }

    public void InteractWithField() {
        boolean movement = checkMovement();
        field.Interact(this);
    }

    public void StealMaterials(Virologist v) {
        if(this.checkMovement())
            v.StolenMaterialsFrom(this);
    }

    public void StolenMaterialsFrom(Virologist v) {
        if(!this.checkMovement()){
            int aminoToGiveAway = v.GetVacantAmino();
            int nucleoToGiveAway = v.GetVacantNucleo();

            if(aminoToGiveAway > this.aminoCount)
                aminoToGiveAway = this.aminoCount;
            if(nucleoToGiveAway > this.nucleoCount)
                nucleoToGiveAway = this.nucleoCount;

            v.GetMaterial(aminoToGiveAway,nucleoToGiveAway);
        }
    }

    public void GetMaterial(int amino, int nucleo) {
        this.aminoCount += amino;
        this.nucleoCount += nucleo;
    }

    public int GetVacantAmino() {
        int extraAmino = 0;
        for(int i = 0; i<gears.size();i++)
            extraAmino += gears.get(i).HandleInventoryCapacity(this);
        return (inventoryCapacity + extraAmino) - aminoCount;
    }

    public int GetVacantNucleo() {
        int extraNucleo = 0;
        for(int i = 0;i<gears.size();i++)
            extraNucleo += gears.get(i).HandleInventoryCapacity(this);
        return (inventoryCapacity + extraNucleo) - nucleoCount;
    }

    public void CreateAgent(GeneticCode code) {
        Agent createdAgent = code.CreateInstance(this);
        agentInventory.add(createdAgent);
    }

    public void EndTurn() {
        Game.GetInstance().NextTurn();
    }

    public void AddAgent(Agent a) {
        activeAgents.add(a);
        a.setVirologist(this);
    }

    public void AddAgentToInventory(Agent a) {
        agentInventory.add(a);
        a.setVirologist(this);
    }

    public void RemoveAgent(Agent a) {
        activeAgents.remove(a);
    }

    private boolean checkMovement(){
        for (int i = 0;i < activeAgents.size(); i++)
            if(activeAgents.get(i).HandleMove(this))
                return false;
        return true;
    }

    private boolean checkTouch(Agent a, Virologist v){
        for(int i = 0; i<activeAgents.size();i++)
            if(activeAgents.get(i).HandleTouch(this,a,v))
                return false;
        for(int i = 0;i<gears.size();i++)
            if(gears.get(i).HandleTouch(this,a,v))
                return false;
        return true;
    }
}
