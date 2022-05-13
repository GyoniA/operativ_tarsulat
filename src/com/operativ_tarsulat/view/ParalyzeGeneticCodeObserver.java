package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.ParalyzeGeneticCode;

import javax.swing.*;

public class ParalyzeGeneticCodeObserver implements Observer {
    /**
     * Observed object.
     */
    ParalyzeGeneticCode subject;

    /**
     * Constructor.
     * @param subject
     */
    public ParalyzeGeneticCodeObserver(ParalyzeGeneticCode subject) {
        this.subject = subject;
    }

    /**
     * Function that is called when the subject is changed.
     */
    public void Update(){
        MainWindow.getInstance().getParalyzeLabel().setIcon(new ImageIcon("paralyzeEmblem.png"));
        MainWindow.getInstance().getParalyzeLabel().revalidate();
    }
}
