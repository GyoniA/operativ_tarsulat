package com.operativ_tarsulat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Virologist implements Steppable, Serializable {
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

    private final int inventoryCapacity = 100;

    /**
     *
     * @param n Name of the virologist.
     */
    public Virologist(String n){
        Skeleton.LogFunctionCall("Virologist ctr",n);
        this.name = n;
        Skeleton.LogReturn();
    }

    /**
     *
     * @param n Name of the virologist.
     * @param f The specific field, where the virologist stands.
     */
    public Virologist(String n, Field f){
        Skeleton.LogFunctionCall("Virologist ctr",n,f.getClass().toString());
        this.name = n;
        this.field = f;
        Skeleton.LogReturn();
    }

    public Virologist(){
        Skeleton.LogFunctionCall("Virologist ctr");
        Skeleton.LogReturn();
    }

    /**
     * The function sets the amino count.
     * @param amount Quantity of the aminos.
     */
    public void SetAmino(int amount) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), Integer.toString(amount));
        this.aminoCount = amount;
        Skeleton.LogReturn();
    }

    /**
     * The function sets the nucleo count.
     * @param amount Quantity of the nucleos.
     */
    public void SetNucleo(int amount) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), Integer.toString(amount));
        this.nucleoCount = amount;
        Skeleton.LogReturn();
    }

    /**
     * This virologist tries to use agent on another virologist
     * @param v2 The virologist that will be under the effect of Agent a
     * @param a The used agent
     */
    public void UseAgent(Virologist v2, Agent a) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v2.getName());
        // Movement is basically allowed, but if an active agent on the
        // virologist blocks the virologist's ability to move it will be
        // changed to false.
        boolean movement = checkMovement();

        // if movement is allowed
        if(movement)
            v2.ReceiveAgentUse(a,this);
        Skeleton.LogReturn();
    }

    public String getName(){
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        Skeleton.LogReturn(this.name);
        return this.name;
    }

    public void ReceiveAgentUse(Agent a, Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), a.getClass().toString(), v.getName());
        boolean allowtouch = checkTouch(a,v);
        if(allowtouch)
            this.AddAgent(a);
        Skeleton.LogReturn();
    }

    public void LearnGeneticCode(GeneticCode s) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), s.getClass().toString());
        if(!learnedGeneticCodes.contains(s)){
            learnedGeneticCodes.add(s);
            GeneticCodeCheckList gcc = new GeneticCodeCheckList();
            for(int i = 0; i<learnedGeneticCodes.size();i++)
                learnedGeneticCodes.get(i).CheckList(gcc);
            gcc.CheckEndCondition();
        }
        Skeleton.LogReturn();
    }

    public Gear GetGear(Gear g) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), g.getClass().toString());
        GearSlot gs = g.GetSlot();
        Gear temp;
        for(int i = 0;i<gears.size();i++)
            if(gears.get(i).GetSlot() == gs){
                temp = gears.get(i);
                gears.remove(gears.get(i));
                gears.add(g);
                Skeleton.LogReturn(temp.getClass().toString());
                return temp;
            }
        gears.add(g);
        Skeleton.LogReturn(null);
        return null;
    }

    public void RemoveGear(Gear r) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),r.getClass().toString());
        gears.remove(r);
        Skeleton.LogReturn();
    }

    public void AddGeneticCode(GeneticCode gc) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),gc.getClass().toString());
        learnedGeneticCodes.add(gc);
        Skeleton.LogReturn();
    }

    public void Move(Field f2) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),f2.getClass().toString());
        if(this.checkMovement())
            if(field.Remove(this,f2))
                f2.Accept(this);
        Skeleton.LogReturn();
    }

    public void Step() {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        for(int i = 0;i<activeAgents.size();i++) {
            activeAgents.get(i).HandleTurnStart(this);
            activeAgents.get(i).Step();
        }

        Skeleton.LogReturn();
    }

    public void Steal(Virologist v2, Gear r) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v2.getName(),r.getClass().toString());
        if(this.checkMovement())
            v2.StolenFrom(this,r);
        Skeleton.LogReturn();
    }


    public Boolean StolenFrom(Virologist v, Gear r) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName(),r.getClass().toString());
        if(!this.checkMovement()){
            Gear g = v.GetGear(r);
            gears.remove(r);
            gears.add(g);
        }
        Skeleton.LogReturn("true");
        return true;
    }

    public Field GetField() {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        Skeleton.LogReturn(this.field.toString());
        return this.field;
    }

    public void SetField(Field f) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),f.getClass().toString());
        this.field = f;
        Skeleton.LogReturn();
    }

    public void InteractWithField() {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        if(checkMovement())
        	field.Interact(this);
        Skeleton.LogReturn();
    }

    public void StealMaterials(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName());
        if(this.checkMovement())
            v.StolenMaterialsFrom(this);
        Skeleton.LogReturn();
    }

    public void StolenMaterialsFrom(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName());
        if(!this.checkMovement()){
            int aminoToGiveAway = v.GetVacantAmino();
            int nucleoToGiveAway = v.GetVacantNucleo();

            if(aminoToGiveAway > this.aminoCount)
                aminoToGiveAway = this.aminoCount;
            if(nucleoToGiveAway > this.nucleoCount)
                nucleoToGiveAway = this.nucleoCount;

            v.GetMaterial(aminoToGiveAway,nucleoToGiveAway);            
        }
        Skeleton.LogReturn();
    }

    public void GetMaterial(int amino, int nucleo) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), Integer.toString(amino), Integer.toString(nucleo));
        this.aminoCount += amino;
        this.nucleoCount += nucleo;
        Skeleton.LogReturn();
    }

    public int GetVacantAmino() {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        int extraAmino = 0;
        for(int i = 0; i<gears.size();i++)
            extraAmino += gears.get(i).HandleInventoryCapacity(this);
        Skeleton.LogReturn(Integer.toString((inventoryCapacity + extraAmino) - aminoCount));
        return (inventoryCapacity + extraAmino) - aminoCount;
    }

    public int GetVacantNucleo() {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        int extraNucleo = 0;
        for(int i = 0;i<gears.size();i++)
            extraNucleo += gears.get(i).HandleInventoryCapacity(this);
        Skeleton.LogReturn(Integer.toString((inventoryCapacity + extraNucleo) - aminoCount));
        return (inventoryCapacity + extraNucleo) - nucleoCount;
    }

    public void CreateAgent(GeneticCode code) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),code.getClass().toString());
        if(checkMovement()&&!checkAmnesia(code)) {
        	int amino = code.GetAminoCost();
        	int nucleo = code.GetNucleoCost();
        	if(aminoCount>=amino&&nucleoCount>=nucleo) {
        		aminoCount-=amino;
        		nucleoCount-=nucleo;
        		Agent createdAgent = code.CreateInstance(this);
    	        agentInventory.add(createdAgent);	
        	}	        
        }
        Skeleton.LogReturn();
    }

    public void EndTurn() {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        Game.GetInstance().NextTurn();
        Skeleton.LogReturn();

    }

    public void AddAgent(Agent a) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),a.getClass().toString());
        activeAgents.add(a);
        a.setVirologist(this);
        Skeleton.LogReturn();
    }

    public void AddAgentToInventory(Agent a) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),a.getClass().toString());
        agentInventory.add(a);
        a.setVirologist(this);
        Skeleton.LogReturn();
    }

    public void RemoveAgent(Agent a) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),a.getClass().toString());
        activeAgents.remove(a);
        Skeleton.LogReturn();
    }

    private boolean checkMovement(){
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        for (int i = 0;i < activeAgents.size(); i++)
            if(activeAgents.get(i).HandleMove(this)) {
                Skeleton.LogReturn("false");
                return false;
            }
        Skeleton.LogReturn("true");
        return true;
    }
    
    private boolean checkAmnesia(GeneticCode gc){
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        for (int i = 0;i < activeAgents.size(); i++)
            if(activeAgents.get(i).HandleCreateAgent(this,gc)) {
                Skeleton.LogReturn("true");
                return true;
            }
        Skeleton.LogReturn("false");
        return false;
    }

    private boolean checkTouch(Agent a, Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),a.getClass().toString(),v.getName());
        for (int i = 0; i < activeAgents.size(); i++)
            if (activeAgents.get(i).HandleTouch(this, a, v)){
                Skeleton.LogReturn("false");
                return false;
        }
        for(int i = 0;i<gears.size();i++)
            if(gears.get(i).HandleTouch(this,a,v)) {
                Skeleton.LogReturn("false");
                return false;
            }
        Skeleton.LogReturn("true");
        return true;
    }
}
