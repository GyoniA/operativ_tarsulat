package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.FreeField;
import jdk.jfr.internal.tool.Main;

public class FreeFieldObserver implements Observer{
    private FreeField subject;
    private FieldPanel panel = new FieldPanel();

    public FreeFieldObserver(FreeField freeField){
        subject = freeField;
        panel.setPosX(freeField.getPosX());
        panel.setPosY(freeField.getPosY());
        panel.setNames(updateNames());
        panel.setImage("freeField.png");
        MainWindow.getInstance().getMapPanel().add(panel);
    }

    @Override
    public void Update() {
        panel.setNames(updateNames());
    }

    private String[] updateNames(){
        String[] names = new String[subject.GetVirologists().length];
        for(int i = 0; i<subject.GetVirologists().length;i++)
            names[i] = subject.GetVirologists()[i].getName();
        return names;
    }
}
