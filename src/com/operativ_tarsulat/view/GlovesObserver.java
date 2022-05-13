package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.Gloves;

import javax.swing.*;

public class GlovesObserver implements Observer{
    /**
     * Observed object.
     */
    Gloves subject;

    /**
     * Constructor.
     * @param subject
     */
    public GlovesObserver(Gloves subject) {
        this.subject = subject;
    }

    /**
     * Function that is called when the subject is changed.
     */
    public void Update(){
        MainWindow.getInstance().getAmnesiaLabel().setIcon(new ImageIcon("gloves.png"));
        MainWindow.getInstance().getAmnesiaLabel().revalidate();
    }
}
