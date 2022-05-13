package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.ProtectionVaccine;

public class InventoryProtectionVaccineObserver implements Observer {
    /**
     * Observed object.
     */
    ProtectionVaccine subject;

    /**
     * Constructor.
     * @param subject
     */
    public InventoryProtectionVaccineObserver(ProtectionVaccine subject) {
        this.subject = subject;
    }

    /**
     * Function that is called when the subject is changed.
     */
    public void Update(){

    }
}
