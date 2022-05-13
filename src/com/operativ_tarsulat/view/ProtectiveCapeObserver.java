package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.ProtectiveCape;

import javax.swing.*;

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
        MainWindow.getInstance().getAmnesiaLabel().setIcon(new ImageIcon("cloak.png"));
        MainWindow.getInstance().getAmnesiaLabel().revalidate();
    }
}
