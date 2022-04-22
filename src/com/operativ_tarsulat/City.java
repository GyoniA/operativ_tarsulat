package com.operativ_tarsulat;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class City extends Field implements Serializable {
    private List<Building> buildings;
    public City(List<Building> buildings)
    {
    	Skeleton.LogFunctionCall("City ctr");
    	this.buildings = buildings;
    	Skeleton.LogReturn();
    }
    public City() {
    	buildings = new LinkedList<>();
    }
    public List<Building> GetBuildings() {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
    	Skeleton.LogReturn(buildings.toString());
    	return buildings;
    	
    }
    
    public void Interact(Virologist v) {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName(),v.getClass().getName());
    	for(int i = 0;i<buildings.size();i++)
    	{
    		buildings.get(i).Interact(v);
    	}
    	Skeleton.LogReturn();
    }
    public void AddBuilding(Building b) {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),b.getClass().getName());
    	buildings.add(b);
    	Skeleton.LogReturn();
    }
}
