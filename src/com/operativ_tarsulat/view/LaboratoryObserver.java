package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.City;
import com.operativ_tarsulat.model.Laboratory;

public class LaboratoryObserver implements Observer{
    private Laboratory subject;
    private FieldPanel panel;

    public LaboratoryObserver(Laboratory lab){
    	subject = lab;
    	panel = new FieldPanel();
        panel.setNames(updateNames());
        panel.setImage("lab.png");
        MainWindow.getInstance().getMapPanel().add(panel);
    }

    @Override
    public void Update() {
        panel.setNames(updateNames());
        panel.setPosX(subject.getPosX());
        panel.setPosY(subject.getPosY());
        panel.UpdateBounds();
    }

    private String[] updateNames(){
        String[] names = new String[subject.GetVirologists().length];
        for(int i = 0; i<subject.GetVirologists().length;i++)
            names[i] = subject.GetVirologists()[i].getName();
        return names;
    }
}
