package com.operativ_tarsulat.view;

public class FieldPanel {
    private String[] names;
    private int posX;
    private int posY;

    public FieldPanel(){}

    public void setImage(String image){

    }
    public void setNames(String[] nameArray){
        System.arraycopy(nameArray, 0, names, 0, nameArray.length);
    }

    public void setPosX(int pos){
        posX = pos;
    }

    public void setPosY(int pos){
        posY = pos;
    }

}
