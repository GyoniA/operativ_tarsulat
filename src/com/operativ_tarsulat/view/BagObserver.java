package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.AmnesiaVirus;
import com.operativ_tarsulat.model.Bag;

public class BagObserver implements Observer{
    /**
     * Observed object.
     */
    Bag subject;

    /**
     * Constructor.
     * @param subject
     */
    public BagObserver(Bag subject) {
        this.subject = subject;
    }

    /**
     * Function that is called when the subject is changed.
     */
    public void Update(){

    }
}
