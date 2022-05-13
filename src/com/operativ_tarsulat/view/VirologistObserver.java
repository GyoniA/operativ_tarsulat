package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.*;

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
        //TODO: Fix first round name and material counts not appearing.
        MainWindow.getInstance().getActualPlayerLabel().setText(subject.getName());
        MainWindow.getInstance().getActualPlayerLabel().revalidate();

        MainWindow.getInstance().getAminoLabel().setText(Integer.toString(subject.getAminoCount()));
        MainWindow.getInstance().getAminoLabel().revalidate();

        MainWindow.getInstance().getNucleoLabel().setText(Integer.toString(subject.getNucleoCount()));
        MainWindow.getInstance().getNucleoLabel().revalidate();

        MainWindow.getInstance().getDanceLabel().setIcon(null);
        MainWindow.getInstance().getDanceLabel().revalidate();

        MainWindow.getInstance().getAmnesiaLabel().setIcon(null);
        MainWindow.getInstance().getAmnesiaLabel().revalidate();

        MainWindow.getInstance().getParalyzeLabel().setIcon(null);
        MainWindow.getInstance().getParalyzeLabel().revalidate();

        MainWindow.getInstance().getProtectionLabel().setIcon(null);
        MainWindow.getInstance().getProtectionLabel().revalidate();

        MainWindow.getInstance().getGotParalyzeLabel().setIcon(null);
        MainWindow.getInstance().getGotParalyzeLabel().revalidate();

        MainWindow.getInstance().getGotAmnesiaLabel().setIcon(null);
        MainWindow.getInstance().getGotAmnesiaLabel().revalidate();

        MainWindow.getInstance().getGotDanceLabel().setIcon(null);
        MainWindow.getInstance().getGotDanceLabel().revalidate();

        MainWindow.getInstance().getGotBearLabel().setIcon(null);
        MainWindow.getInstance().getGotBearLabel().revalidate();

        MainWindow.getInstance().getGotBagLabel().setIcon(null);
        MainWindow.getInstance().getGotBagLabel().revalidate();

        MainWindow.getInstance().getGotProtectiveCapeLabel().setIcon(null);
        MainWindow.getInstance().getGotProtectiveCapeLabel().revalidate();

        MainWindow.getInstance().getGotGlovesLabel().setIcon(null);
        MainWindow.getInstance().getGotGlovesLabel().revalidate();

        MainWindow.getInstance().getGotAxeLabel().setIcon(null);
        MainWindow.getInstance().getGotAxeLabel().revalidate();

        for (Gear g : subject.getGears()) {
            g.NotifyAll();
        }
        for (Agent a : subject.getActiveAgent()) {
            a.NotifyAll();
        }
        for (Agent a : subject.getAgentInventory()) {
                a.NotifyAll();
        }
        for (GeneticCode g : subject.getGeneticCodes()) {
            g.NotifyAll();
        }
    }
}
