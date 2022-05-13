package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.DanceVirus;

import javax.swing.*;

public class ActiveDanceVirusObserver implements Observer {
    /**
     * Observed object.
     */
    DanceVirus subject;

    /**
     * Constructor.
     * @param subject
     */
    public ActiveDanceVirusObserver(DanceVirus subject) {
        this.subject = subject;
    }

    /**
     * Function that is called when the subject is changed.
     */
    public void Update(){
        MainWindow.getInstance().getGotDanceLabel().setIcon(new ImageIcon("danceEmblem.png"));
        MainWindow.getInstance().getGotDanceLabel().revalidate();
    }
}
