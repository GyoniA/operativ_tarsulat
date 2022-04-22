package com.operativ_tarsulat;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class City extends Field implements Serializable {
    private List<Building> buildings;
	/**
	 * Constructor for City
	 * @param buildings List of buildings
	 */
    public City(List<Building> buildings)
    {
    	Skeleton.LogFunctionCall("City ctr");
    	this.buildings = buildings;
    	Skeleton.LogReturn();
    }

	/**
	 * Constructor for City with no buildings
	 */
    public City() {
    	buildings = new LinkedList<>();
    }
	/**
	 * Getter for buildings
	 * @return List of buildings
	 */
    public List<Building> GetBuildings() {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
    	Skeleton.LogReturn(buildings.toString());
    	return buildings;
    	
    }

	/**
	 * Virologist interacts with the city
	 * @param v the virologist
	 */
    public void Interact(Virologist v) {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(),v.getClass().getName());
    	for(int i = 0;i<buildings.size();i++)
    	{
    		buildings.get(i).Interact(v);
    	}
    	Skeleton.LogReturn();
    }
	/**
	 * Add a building to the city
	 * @param b the building
	 */
    public void AddBuilding(Building b) {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),b.getClass().getName());
    	buildings.add(b);
    	Skeleton.LogReturn();
    }
}
