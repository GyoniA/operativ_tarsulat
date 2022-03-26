package com.operativ_tarsulat;

public class GeneticCodeCheckList {
    public Boolean Protection = false;
    public Boolean Amnesia = false;
    public Boolean Paralyze = false;
    public Boolean Dance = false;
    public void CheckEndCondition() {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
    	if(Protection&&Amnesia&&Paralyze&&Dance) {
    		Game.GetInstance().EndGame();
    	}
    	Skeleton.LogReturn();
    	
    }
}
