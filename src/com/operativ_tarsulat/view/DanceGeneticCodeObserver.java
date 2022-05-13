package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.DanceGeneticCode;

public class DanceGeneticCodeObserver implements Observer {
    /**
     * Observed object.
     */
    DanceGeneticCode subject;

    /**
     * Constructor.
     * @param subject
     */
    public DanceGeneticCodeObserver(DanceGeneticCode subject) {
        this.subject = subject;
    }

    /**
     * Function that is called when the subject is changed.
     */
    public void Update(){

    }
}
