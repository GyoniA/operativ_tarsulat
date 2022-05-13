package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.FreeField;

public class FreeFieldObserver implements Observer{
    private FreeField subject;
    private FieldPanel panel;

    public FreeFieldObserver(FreeField freeField){
        subject = freeField;
        panel.setPosX(freeField.getPosX());
        panel.setPosY(freeField.getPosY());
        panel.setNames(updateNames());
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