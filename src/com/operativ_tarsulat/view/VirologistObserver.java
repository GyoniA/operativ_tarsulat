package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.Virologist;

import javax.swing.*;

public class VirologistObserver implements Observer {
    /**
     * Observed object.
     */
    Virologist subject;

    /**
     * Constructor.
     * @param subject
     */
    public VirologistObserver(Virologist subject) {
        this.subject = subject;
    }

    /**
     * Function that is called when the subject is changed.
     */
    public void Update(){
        MainWindow.getInstance().getProtectionLabel().setIcon(new ImageIcon("protectionEmblem.png"));
        MainWindow.getInstance().getProtectionLabel().revalidate();
    }
}
