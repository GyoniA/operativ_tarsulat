package com.operativ_tarsulat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Field implements Serializable {
    private LinkedList<Virologist> virologists;
    private List<Field> neighbours;

	/**
	 * @return The description of the class
	 */
	public String toString(){
		String s = new String();
		for (Virologist v:virologists){
			s = s+v.toString()+" ";
		}
		return s;
	}

	/**
	 * Constructor to create a new field
	 */
    public Field() {
    	Skeleton.LogFunctionCall("Field ctr");
    	neighbours = new LinkedList<Field>();
    	virologists = new LinkedList<Virologist>();
    	Skeleton.LogReturn();
    }

	/**
	 * Adds a virologist to this field
	 * @param v the virologist to add
	 */
	public void Accept(Virologist v) {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(),v.getClass().getName());
    	virologists.add(v);
    	Skeleton.LogReturn();
    }

	/**
	 * Removes a virologist from one of this field's neighbours
	 * @param v the virologist to remove
	 * @param f the field to remove the virologist from
	 * @return true if the virologist was removed, false otherwise
	 */
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

	/**
	 * Returns the list of neighbours of this field
	 * @return the neighbours
	 */
	public List<Field> GetNeighbours() {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
    	Skeleton.LogReturn(neighbours.toString());
    	return neighbours;
    }

	/**
	 * Adds a neighbour to this field
	 * @param f the neighbour to add
	 */
	public void AddNeighbour(Field f) {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
    	Skeleton.LogReturn();
    	neighbours.add(f);
    }

	/**
	 * Returns the list of virologists in this field
	 * @return the virologists
	 */
	public Virologist[] GetVirologists() {
		return virologists.toArray(new Virologist[virologists.size()]);
	}

	/**
	 * Removes a virologist from this field
	 * @param v the virologist to remove
	 */
	public void Remove(Virologist v) {
		virologists.remove(v);
	}
}
