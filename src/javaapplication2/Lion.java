
package javaapplication2;


import javafx.scene.image.Image;


public class Lion extends Carnivorous {
    public Lion(){
        weight =50;
       EatingRank =3;
    }
    public Sprite lion;
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
        return new Image("lion.png");
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
        return this.lion;
    }

    @Override
    public void setSprite(Sprite sprite) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
