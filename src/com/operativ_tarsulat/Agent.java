package com.operativ_tarsulat;

public abstract class Agent implements Steppable, Effect {
    public int Duration;
    private Virologist virologist;
    Agent() {
        throw new RuntimeException("Unimplemented, biztos kéne üres konstruktor?");
    }
    Agent(int d, Virologist v) {
        Duration = d;
        virologist = v;
    }

    public void DecreaseDuration() {
    	if (Duration > 0) {
            Duration--;
        }
    }
    
    public void Step() {
    	DecreaseDuration();
    }
    
    public void SetDuration(int length) {
    	Duration = length;
    }
}
