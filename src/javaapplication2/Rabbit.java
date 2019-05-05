
package javaapplication2;

import java.awt.image.BufferedImage;
import javafx.scene.image.Image;


public class Rabbit extends Herbivorous{
    public Rabbit()
    {
        EatingRank=2;
        weight=50;
    }
    public Sprite rabbit;

    @Override
    public boolean canSail() {
        return false;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public int getEatingRank() {
        return this.EatingRank;
    }

    @Override
    public Image getImages() {
        return new Image("rabbit.png");
    }

    @Override
    public void setLabelToBeShown(String label) {
        this.LabelToBeShown=label;
    }

    @Override
    public String getLabelToBeShown() {
        return this.getLabelToBeShown();
    }

     @Override
    public Sprite getSprite() {
        return this.rabbit;
    }

    @Override
    public void setSprite(Sprite sprite) {
        this.rabbit=sprite;
    }

    @Override
    public Sprite getSpriteR() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sprite getSpriteL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
