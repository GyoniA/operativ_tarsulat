package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.AmnesiaVirus;
import com.operativ_tarsulat.model.Axe;

public class AxeObserver implements Observer{
    /**
     * Observed object.
     */
    Axe subject;

    /**
     * Constructor.
     * @param subject
     */
    public AxeObserver(Axe subject) {
        this.subject = subject;
    }

    /**
     * Function that is called when the subject is changed.
     */
    public void Update(){

    }
}
