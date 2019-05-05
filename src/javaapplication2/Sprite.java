
package javaapplication2;


import java.util.ArrayList;
import java.util.List;
import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


public class Sprite {
    private Image image;
    public double positionX;
    public double positionY;
    public double originalPositionLeftX;
    public double originalPositionLeftY;
    public double originalPositionRightX;
    public double originalPositionRightY;
    private double width;
    private double height;
    private double DeltaX;
    
    
    public Sprite(Image image){//constructer to initialize values followed by setters
        this.image=image;
        this.positionX=0;
        this.positionY=0;
        width=image.getWidth();
        height=image.getHeight();
        
    }
    
    
    public void addDeltaX(int x){
    this.DeltaX=x;
    }
        
public void update(){
this.positionX+=DeltaX;
DeltaX=0;

}

    
    public void setImage(Image image){
        this.image=image;
    }
    public void setPositionX(double positionX){
        this.positionX=positionX;
    }
     public void setOriginalPositionOnRight(double originalPositionRightX,double originalPositionRightY){
        this.originalPositionRightX=originalPositionRightX;
        this.originalPositionRightY=originalPositionRightY;
    }
     public void setOriginalPositionOnLeft(double originalPositionLeftX,double originalPositionLeftY){
        this.originalPositionLeftX=originalPositionLeftX;
        this.originalPositionLeftY=originalPositionLeftY;
    }
    public void setPositionY(double positionY){
        this.positionY=positionY;
    }
    public void setWidth(double width){
        this.width=width;
    }
     public void setHeight(double height){
        this.height=height;
    }

    void render(GraphicsContext gc) {
        gc.drawImage(image,positionX,positionY);
         
    }
    Rectangle2D getBoundry(){
        return new Rectangle2D(positionX,positionY,width,height);
        
    }
    
    
    public boolean Intersects(Rectangle2D r)
    {
        return this.getBoundry().intersects(r);
    }
    public void add(Sprite sprite,GraphicsContext gc,double x,double y,Sprite s1,Sprite s2,Sprite s3,Sprite s4,Sprite s7,Sprite s5,Sprite s6){
        gc.clearRect(0, 0, 2000, 1000);
        s5.render(gc);
        s6.render(gc);
        s2.render(gc);
        s1.render(gc);
        s3.render(gc);
        s4.render(gc);
        s7.render(gc);
        sprite.setPositionX(x);
        sprite.setPositionY(y);
        sprite.render(gc);
    }

    
 public void addOnOtherSide(Sprite sprite1,Sprite sprite2,GraphicsContext gc,Sprite s1,Sprite s2){
        JavaApplication2 ap= new JavaApplication2();
        gc.clearRect(0, 0, 2000, 1000);
        ap.viewLeft.render(gc);
        ap.viewRight.render(gc);
        s2.render(gc);
        s1.render(gc);
       
        sprite1.setPositionX(sprite1.originalPositionRightX);
        sprite1.setPositionY(sprite1.originalPositionRightY);
        sprite1.render(gc);
        sprite2.setPositionX(sprite2.originalPositionRightX);
        sprite2.setPositionY(sprite2.originalPositionRightY);
        sprite2.render(gc);
        this.render(gc);
    }

    
    
}
