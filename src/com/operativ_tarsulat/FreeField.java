package com.operativ_tarsulat;

import java.io.Serializable;

public class FreeField extends Field implements Serializable {

	/**
	 * @return The description of the class
	 */
	public String toString(){
		return "FreeField, virologists on the field: "+super.toString();
	}

	public FreeField()
	{
		Skeleton.LogFunctionCall("FreeField ctr");
		Skeleton.LogReturn();
	}
    public void Interact(Virologist v) {
    }
}
