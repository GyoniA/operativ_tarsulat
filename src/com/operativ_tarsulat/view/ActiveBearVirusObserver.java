package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.BearVirus;

public class ActiveBearVirusObserver implements Observer {
    /**
     * Observed object.
     */
    BearVirus subject;

    /**
     * Constructor.
     * @param subject
     */
    public ActiveBearVirusObserver(BearVirus subject) {
        this.subject = subject;
    }

    /**
     * Function that is called when the subject is changed.
     */
    public void Update(){

    }
}
