package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.ProtectionGeneticCode;

public class ProtectionGeneticCodeObserver implements Observer {
    /**
     * Observed object.
     */
    ProtectionGeneticCode subject;

    /**
     * Constructor.
     * @param subject
     */
    public ProtectionGeneticCodeObserver(ProtectionGeneticCode subject) {
        this.subject = subject;
    }

    /**
     * Function that is called when the subject is changed.
     */
    public void Update(){

    }
}
