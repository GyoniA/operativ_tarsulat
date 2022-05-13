package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.City;
import com.operativ_tarsulat.model.FreeField;
public class CityObserver implements Observer{
    private City subject;
    private FieldPanel panel;

    public CityObserver(City city){
        subject = city;
        panel = new FieldPanel();
        panel.setNames(updateNames());
        panel.setImage("city.png");
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
