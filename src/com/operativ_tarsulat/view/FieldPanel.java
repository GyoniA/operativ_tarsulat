package com.operativ_tarsulat.view;

import javax.swing.*;

public class FieldPanel extends JPanel {
    private String[] names;
    private String image;
    private JLabel imageLabel = new JLabel();
    private JLabel namesLabel = new JLabel();
    private int posX;
    private int posY;

    public FieldPanel(){
        this.add(imageLabel);
        this.add(namesLabel);
    }

    public void setImage(String img){
        image = img;
    }
    public String getImage(){
        return image;
    }
    public void setNames(String[] nameArray){
        names = nameArray;
    }

    public void setPosX(int pos){
        posX = pos;
    }

    public void setPosY(int pos){
        posY = pos;
    }

}
