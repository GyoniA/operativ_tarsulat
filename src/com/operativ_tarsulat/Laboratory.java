package com.operativ_tarsulat;

import java.io.Serializable;

public class Laboratory extends Field implements Serializable {
	
	
	private GeneticCode localGeneticCode;
	/**
	 * The constructor of the Laboratory class 
	 * @param gc This genetic code can be found here. 
	 */
	public Laboratory(GeneticCode gc)
	{
		Skeleton.LogFunctionCall("Laboratory ctr");
		localGeneticCode = gc;
		Skeleton.LogReturn();
	}
	public Laboratory() {
		Skeleton.LogFunctionCall("Laboratory ctr");
		Skeleton.LogReturn();
	}
	/**
	 * Set a new genetic code. 
	 * @param gc This will be the new genetic code that can be found here.
	 */
    public void SetGeneticCode(GeneticCode gc) {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),gc.getClass().getName());
    	localGeneticCode = gc;
    	Skeleton.LogReturn();
    }
    
    /**
     * A virologist learns  the local genetic code. 
     * @param v The virologist who wants to learn the genetic code. 
     */
    public void Interact(Virologist v) {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getName());
    	v.LearnGeneticCode(localGeneticCode);
    	Skeleton.LogReturn();
    }
}
