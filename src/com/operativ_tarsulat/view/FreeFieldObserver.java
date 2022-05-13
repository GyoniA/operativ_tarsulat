package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.FreeField;

public class FreeFieldObserver implements Observer{
    private FreeField subject;
    private FieldPanel panel;

    public FreeFieldObserver(FreeField freeField){
    	subject = freeField;
    	panel = new FieldPanel();
        panel.setNames(updateNames());
        panel.setImage("freeField.png");
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
