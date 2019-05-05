
package javaapplication2;


import javafx.scene.image.Image;


public class Goat extends Herbivorous{
    public Goat(){
         EatingRank=2;
         weight=50;
         
    }
    public Sprite goat;
    public Sprite goatR;
    public Sprite goatL;

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
        return new Image("goat.png"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLabelToBeShown(String label) {
        this.LabelToBeShown=label;
    }

    @Override
    public String getLabelToBeShown() {
        return this.LabelToBeShown;
    }

     @Override
    public Sprite getSprite() {
        return this.goat;
    }
    
    @Override
    public void setSprite(Sprite sprite) {
        this.goat=sprite;
    }

    @Override
    public Sprite getSpriteR() {
       return this.goatR;
    }

    @Override
    public Sprite getSpriteL() {
        return this.goatL;
    }
    
    
}
