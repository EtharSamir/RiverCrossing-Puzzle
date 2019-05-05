
package javaapplication2;

import java.awt.image.BufferedImage;
import javafx.scene.image.Image;




public interface ICrosser {
    public boolean canSail();
    public double getWeight();
    public int getEatingRank();
    public Image getImages();
    public Sprite getSprite();
    public void setSprite(Sprite sprite);
    public Sprite getSpriteR();
    public Sprite getSpriteL();
   
   
   
   // public ICrosser MakeCopy();
    public void setLabelToBeShown(String label);
    public String getLabelToBeShown();
    
    
    
}
