package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.ParalyzeVirus;

public class ActiveParalyzeVirusObserver implements Observer {
    /**
     * Observed object.
     */
    ParalyzeVirus subject;

    /**
     * Constructor.
     * @param subject Observed object.
     */
    public ActiveParalyzeVirusObserver(ParalyzeVirus subject) {
        this.subject = subject;
    }

    /**
     * Function that is called when the subject is changed.
     */
    public void Update(){

    }
}
