package com.operativ_tarsulat.view;

import javax.swing.*;
import java.awt.*;

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
        this.setBounds(posX,posY,40,100);

        imageLabel.setBounds(0,0,40,40);
        namesLabel.setBounds(0,0,40,60);

    }
    
    public void UpdateBounds() {
    	this.setBounds(posX - 20,posY - 50,40,100);
    }

    public void setImage(String img){
        image = img;
        imageLabel.setIcon(new ImageIcon(image));
    }
    public void setNames(String[] nameArray){
        names = nameArray;
        if(names.length != 0) {
            for(int i =0;i<names.length;i++)
                namesLabel.setText(names[i]);
        }
    }
    public void setPosX(int pos){
        posX = pos;
    }

    public void setPosY(int pos){
        posY = pos;        
    }

}
