package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.Axe;

import javax.swing.*;

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
        MainWindow.getInstance().getAmnesiaLabel().setIcon(new ImageIcon("axe.png"));
        MainWindow.getInstance().getAmnesiaLabel().revalidate();
    }
}
