
package javaapplication2;


import javafx.scene.image.Image;


public class Fox extends Carnivorous {
     public Sprite fox;
     public Sprite foxR;
     public Sprite foxL;
    
    public Fox()
    {
       weight =50;
       EatingRank =3;
        
    }

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
        return new Image("fox2.png"); //To change body of generated methods, choose Tools | Templates.
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
        return this.fox;
    }
     @Override
    public Sprite getSpriteR() {
        return this.foxR;
    }
    
     @Override
   public void setSprite(Sprite sprite) {
        this.fox=sprite;
    }

    @Override
    public Sprite getSpriteL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
