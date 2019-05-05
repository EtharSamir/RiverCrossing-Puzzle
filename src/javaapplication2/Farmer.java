
package javaapplication2;


import javafx.scene.image.Image;


public class Farmer implements ICrosser{

     private final double weight=50;
     private final int EatingRank=-1;
     public Sprite farmer;
     public Sprite farmerR;
     public Sprite farmerL;
     
     
     
     
     private String LabelToBeShown;
     
     
    @Override
    public boolean canSail() {
        return true;
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
        return new Image("hero.png"); //To change body of generated methods, choose Tools | Templates.
    }

    /*@Override
    public ICrosser MakeCopy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public void setLabelToBeShown(String label) {
        this.LabelToBeShown=label;
        
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getLabelToBeShown() {
        return this.LabelToBeShown;
    }

    @Override
    public Sprite getSprite() {
        return this.farmer;
    }

     @Override
    public void setSprite(Sprite sprite) {
        this.farmer=sprite;
    }

   
     @Override
     public Sprite getSpriteR() {
        return this.farmerR;
    }

    @Override
    public Sprite getSpriteL() {
        return this.farmerL;
    }
    
   
    
    
}
