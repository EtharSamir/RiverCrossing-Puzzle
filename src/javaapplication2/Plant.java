
package javaapplication2;


import javafx.scene.image.Image;


public class Plant implements ICrosser {
    private double weight=50;
    private int EatingRank=1;
    private String LabelToBeShown;
    public Sprite plant;
    public Sprite plantR;
     public Sprite plantL;

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
         return new Image("plant.png");
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
        return this.plant;
    }

    @Override
    public void setSprite(Sprite sprite) {
       this.plant=sprite;
    }

    @Override
    public Sprite getSpriteR() {
       return this.plantR; 
    }

    @Override
    public Sprite getSpriteL() {
        return this.plantL;
    }
    
    
}
