package com.operativ_tarsulat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Field implements Serializable {
    private LinkedList<Virologist> virologists;
    private List<Field> neighbours;
    public Gear droppedGear;
    public Field() {
    	Skeleton.LogFunctionCall("Field ctr");
    	neighbours = new LinkedList<Field>();
    	virologists = new LinkedList<Virologist>();
    	Skeleton.LogReturn();
    }
    
	public void Accept(Virologist v) {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(),v.getClass().getName());
    	virologists.add(v);
    	Skeleton.LogReturn();
    }
    
    public Boolean Remove(Virologist v, Field f) {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(),f.getClass().getName(),v.getClass().getName());
    	if(neighbours.contains(f))
    	{
    		virologists.remove(v);
    		Skeleton.LogReturn("true");
    		return true;
    	}
    	Skeleton.LogReturn("false");
    	return false;
    		
    }
    
    public abstract void Interact(Virologist v);
    
    public List<Field> GetNeighbours() {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
    	Skeleton.LogReturn(neighbours.toString());
    	return neighbours;
    }
    
    public void AddNeighbour(Field f) {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
    	Skeleton.LogReturn();
    	neighbours.add(f);
    }

	public Virologist[] GetVirologists() {
		return virologists.toArray(new Virologist[virologists.size()]);
	}

	public void Remove(Virologist v) {
		virologists.remove(v);
	}
}
