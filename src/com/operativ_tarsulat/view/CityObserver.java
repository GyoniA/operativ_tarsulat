package com.operativ_tarsulat.view;

import com.operativ_tarsulat.model.City;
import com.operativ_tarsulat.model.FreeField;
public class CityObserver implements Observer{
    private City subject;
    private FieldPanel panel = new FieldPanel();

    public CityObserver(City city){
        subject = city;
        panel.setPosX(city.getPosX());
        panel.setPosY(city.getPosY());
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
