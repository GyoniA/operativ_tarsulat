package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.AmnesiaVirus;

public class InventoryAmnesiaVirusObserver implements Observer {
    /**
     * Observed object.
     */
    AmnesiaVirus subject;

    /**
     * Constructor.
     * @param subject
     */
    public InventoryAmnesiaVirusObserver(AmnesiaVirus subject) {
        this.subject = subject;
    }

    /**
     * Function that is called when the subject is changed.
     */
    public void Update(){

    }
}
