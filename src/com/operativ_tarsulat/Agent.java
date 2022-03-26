package com.operativ_tarsulat;

public abstract class Agent implements Steppable, Effect {
    public int Duration;
    private Virologist virologist;
    Agent() {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        Duration = 0;
        virologist = null;
        Skeleton.LogReturn();
    }
    Agent(int d, Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        Duration = d;
        virologist = v;
        Skeleton.LogReturn();
    }

    public void DecreaseDuration() {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
    	if (Duration > 0) {
            Duration--;
        }
        Skeleton.LogReturn();
    }
    public void setVirologist(Virologist v) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), v.getName());
        virologist = v;
        Skeleton.LogReturn();
    }
    public Virologist getVirologist() {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        return virologist;
    }

    public void Step() {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
        DecreaseDuration();
    }
    
    public void SetDuration(int length) {
        Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(), String.valueOf(length));
        Duration = length;
        Skeleton.LogReturn();
    }
}
