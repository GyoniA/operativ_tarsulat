package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.AmnesiaGeneticCode;

public class AmnesiaGeneticCodeObserver implements Observer {
    /**
     * Observed object.
     */
    AmnesiaGeneticCode subject;

    /**
     * Constructor.
     * @param subject
     */
    public AmnesiaGeneticCodeObserver(AmnesiaGeneticCode subject) {
        this.subject = subject;
    }

    /**
     * Function that is called when the subject is changed.
     */
    public void Update(){

    }
}
