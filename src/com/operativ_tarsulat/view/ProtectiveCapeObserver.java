package com.operativ_tarsulat.view;
import com.operativ_tarsulat.model.AmnesiaVirus;
import com.operativ_tarsulat.model.ProtectiveCape;

public class ProtectiveCapeObserver implements Observer{
    /**
     * Observed object.
     */
    ProtectiveCape subject;

    /**
     * Constructor.
     * @param subject
     */
    public ProtectiveCapeObserver(ProtectiveCape subject){
        this.subject = subject;
    }

    /**
     * Function that is called when the subject is changed.
     */
    public void Update(){

    }
}
