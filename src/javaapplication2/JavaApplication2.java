
package javaapplication2;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static jdk.nashorn.tools.ShellFunctions.input;


public class JavaApplication2 extends Application{

     int i=0;
      int j=0;
     public static Farmer farmer=new Farmer();
     public static Farmer farmer2=new Farmer();
     public static Farmer farmer3=new Farmer();
     public static Farmer farmer4=new Farmer();
     public static Farmer farmer5=new Farmer();
     public static Rabbit rabbit=new Rabbit();
        public static Fox fox2=new Fox();
        public static Goat goat2=new Goat();
        public static Plant plant2=new Plant();
        public static Rabbit animal=new Rabbit();
         
        
        public Sprite boat = new Sprite(new Image("boat.png"));
        public Sprite viewRight=new Sprite(new Image("viewrightnew.png"));
        public Sprite viewLeft=new Sprite(new Image("viewleftnew.png"));
        public  Sprite boatR = new Sprite(new Image("boatR.png"));
       
        public static Sprite heroR = new Sprite(new Image("heroR.png"));
        public static Game game=new Game();
         
    public static void main(String[] args) {
        
       launch(args);
        
         
    }

    
      
    
    
   
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Group root =new Group();//stuff added to the screen as a group
        Scene scene =new Scene(root,2000,1000);//inserting stuff in the group and setting dimentions of the scene
        Canvas canvas=new Canvas(2000,1000);//allows us to draw in screen
        root.getChildren().add(canvas);//inserting canvas in group which is inserted in scene
        GraphicsContext gc=canvas.getGraphicsContext2D();
        
         StackPane root2 = new StackPane();
        Group root3=new Group();
        Scene secondScene = new Scene(root3, 2000,1000);
        Stage secondStage = new Stage();
        Canvas canvas2=new Canvas(2000,1000);//allows us to draw in screen
        root3.getChildren().add(canvas2);//inserting canvas in group which is inserted in scene
        GraphicsContext gc2=canvas2.getGraphicsContext2D();
        
        Sprite animal2 = new Sprite(animal.getImages());
        Sprite hero = new Sprite(farmer.getImages());
        Sprite fox = new Sprite(fox2.getImages());
        Sprite goat = new Sprite(goat2.getImages());
        Sprite plant = new Sprite(plant2.getImages());
           Sprite boat = new Sprite(new Image("boat.png"));
        Sprite viewRight=new Sprite(new Image("viewrightnew.png"));
        Sprite viewLeft=new Sprite(new Image("viewleftnew.png"));
           Sprite heroR = new Sprite(new Image("heroR.png"));
        Sprite foxR = new Sprite(new Image("fox2R.png"));
        Sprite goatR = new Sprite(new Image("goatR.png"));
       Sprite animal1 = new Sprite(new Image("rabbit.png"));
        Sprite plantR = new Sprite(plant2.getImages());
        viewRight.setPositionX(0); viewRight.setPositionY(0);
        viewRight.render(gc);
        viewLeft.setPositionX(1000); viewLeft.setPositionY(0);
        viewLeft.render(gc);
        heroR.setOriginalPositionOnRight(1200,250);
        foxR.setOriginalPositionOnRight(1625,500);
        goatR.setOriginalPositionOnRight(1450,350);
        plantR.setOriginalPositionOnRight(1800,600);
        boatR.setOriginalPositionOnRight(1100,550);
        heroR.setPositionX(heroR.originalPositionRightX);heroR.setPositionY(heroR.originalPositionRightY);
        foxR.setPositionX(foxR.originalPositionRightX);foxR.setPositionY(foxR.originalPositionRightY);
        goatR.setPositionX(goatR.originalPositionRightX);goatR.setPositionY(goatR.originalPositionRightY);
        goatR.setPositionX(goatR.originalPositionRightX);goatR.setPositionY(goatR.originalPositionRightY);
        plantR.setPositionX(plantR.originalPositionRightX);plantR.setPositionY(plantR.originalPositionRightY);
        boatR.setPositionX(boatR.originalPositionRightX);boatR.setPositionY(boatR.originalPositionRightY);
         
        
        
        
        
       
        
        hero.setOriginalPositionOnLeft(550,250);
        fox.setOriginalPositionOnLeft(100,500);
        goat.setOriginalPositionOnLeft(325,350);
        plant.setOriginalPositionOnLeft(0,600);
        hero.setPositionX(hero.originalPositionLeftX);hero.setPositionY(hero.originalPositionLeftY);
        fox.setPositionX(fox.originalPositionLeftX);fox.setPositionY(fox.originalPositionLeftY);
        goat.setPositionX(goat.originalPositionLeftX);goat.setPositionY(goat.originalPositionLeftY);
        plant.setPositionX(plant.originalPositionLeftX);plant.setPositionY(plant.originalPositionLeftY);
        boat.setPositionX(300);boat.setPositionY(550);
        farmer.farmer=hero; goat2.goat=goat; fox2.fox=fox;   plant2.plant=plant;
        farmer.farmerR=heroR; goat2.goatR=goatR; fox2.foxR=foxR;   plant2.plantR=plantR;
        farmer.farmerL=hero; goat2.goatL=goat; fox2.foxL=fox;   plant2.plantL=plant;
        animal2.setOriginalPositionOnLeft(0,0);
        
        hero.render(gc);fox.render(gc);goat.render(gc);plant.render(gc);  boat.render(gc);
         
        Button b=new Button("Move right");
        Button btn1=new Button("Move right");
        Button btn2=new Button("Move left");
        btn1.setLayoutX(250);
        btn2.setLayoutX(450);
          root.getChildren().add(b);
           b.setLayoutX(500);
           Button b1=new Button("Move left");
           b1.setLayoutX(250);
           b1.setLayoutY(0);
           
          root.getChildren().add(b1);Button button=new Button("One Story");
        button.setMaxWidth(10000);
        root.getChildren().add(button);
        
        Button btnNewGame=new Button("Reset");
           btnNewGame.setLayoutX(375);
           btnNewGame.setLayoutY(0);
          root.getChildren().add(btnNewGame);
          
          
          Button instructions=new Button("Instructions");
          instructions.setLayoutX(100);
          instructions.setLayoutY(0);
          root.getChildren().add(instructions);
          
        List<String> inputs= new ArrayList<>();
        ///////////////////////////////////////////////////////////////////////////////////////////////////
      button.setOnAction(e->{
            
        /*StackPane root2 = new StackPane();
        Group root3=new Group();
        Scene secondScene = new Scene(root3, 2000,1000);
        Stage secondStage = new Stage();
        Canvas canvas2=new Canvas(2000,1000);//allows us to draw in screen
        root3.getChildren().add(canvas2);//inserting canvas in group which is inserted in scene
        GraphicsContext gc2=canvas2.getGraphicsContext2D();*/
        Sprite hero2 = new Sprite(new Image("Boy.png"));
        Sprite hero3 = new Sprite(new Image("hero.png"));
        Sprite hero4= new Sprite(new Image("old.png"));
        Sprite hero5 = new Sprite(new Image("Boy1.png"));
        Sprite viewRight2=new Sprite(new Image("viewrightnew.png"));
        Sprite viewLeft2=new Sprite(new Image("viewleftnew.png"));
        Sprite boat2 = new Sprite(new Image("boat.png"));
        Sprite animal= new Sprite(new Image("rabbit.png"));
       root3.getChildren().add(btn1);
      
       root3.getChildren().add(btn2);
        viewRight2.setPositionX(0); 
        viewRight2.setPositionY(0);
        viewRight2.render(gc2);
        viewLeft2.setPositionX(1000); 
        viewLeft2.setPositionY(0);
        viewLeft2.render(gc2);
        hero2.setOriginalPositionOnLeft(550,250);
        hero3.setOriginalPositionOnLeft(150,250);
        hero4.setOriginalPositionOnLeft(325,350);
        hero5.setOriginalPositionOnLeft(0,400);
        boat2.setOriginalPositionOnLeft(300,550);
        animal.setOriginalPositionOnLeft(200,530);
         hero2.setOriginalPositionOnRight(1150,250);
        hero3.setOriginalPositionOnRight(1850,250);
        hero4.setOriginalPositionOnRight(1550,350);
        hero5.setOriginalPositionOnRight(1900,400);
       
        
        boat2.setPositionX(boat2.originalPositionLeftX);boat2.setPositionY(boat2.originalPositionLeftY);
        hero2.setPositionX(hero2.originalPositionLeftX);hero2.setPositionY(hero2.originalPositionLeftY);
        hero3.setPositionX(hero3.originalPositionLeftX);hero3.setPositionY(hero3.originalPositionLeftY);
        hero4.setPositionX(hero4.originalPositionLeftX);hero4.setPositionY(hero4.originalPositionLeftY);
        hero5.setPositionX(hero5.originalPositionLeftX);hero5.setPositionY(hero5.originalPositionLeftY);
        animal.setPositionX(animal.originalPositionLeftX);animal.setPositionY(animal.originalPositionLeftY);
       
      
        hero2.render(gc2);
        hero3.render(gc2);
        hero4.render(gc2);
        hero5.render(gc2);
        animal.render(gc2);
         boat2.render(gc2);
         farmer2.setSprite(hero2);farmer3.setSprite(hero3);farmer4.setSprite(hero4);farmer5.setSprite(hero5);rabbit.setSprite(animal);
            secondStage.setScene(secondScene); // set the scene
            secondStage.setTitle("story two");
            secondStage.show();
            primaryStage.close();
           
      secondScene.setOnMouseClicked(new EventHandler<MouseEvent>(){
            
            public void handle(MouseEvent event) {
                
                
                
                double y=event.getY();
                double x=event.getX();
                Rectangle2D r=new Rectangle2D(x,y,1,1);
            if(viewRight.Intersects(r))
            {
             if(hero2.Intersects(r))
                { if(hero2.positionX!=hero2.originalPositionLeftX)
                    {
                        hero2.add(hero2, gc2,hero2.originalPositionLeftX,hero2.originalPositionLeftY,hero5,boat2,animal,hero4,hero3,viewRight,viewLeft);
                        j--;
                    }
                else  if (i%2==0&&j<2)
                    {  hero2.add(hero2,gc2,300,480,hero4,boat2,animal,hero5,hero3,viewRight,viewLeft);
                        j++;
                    }
                    else if (i%2==1&&j<2)
                    
                    { hero2.add(hero2, gc2,530,500,hero4,boat2,animal,hero5,hero3,viewRight,viewLeft);
                     j++;
                    }
                   
                 
                      i++;
                     farmer2.setSprite(hero2);
                 }
             if(hero3.Intersects(r))
                {if(hero3.positionX!=hero3.originalPositionLeftX)
                    {
                        hero3.add(hero3, gc2,hero3.originalPositionLeftX,hero3.originalPositionLeftY,hero5,boat2,animal,hero4,hero2,viewRight,viewLeft);
                        j--;
                    }
                else if (i%2==0&&j<2)
                    {
                        
                        hero3.add(hero3,gc2,400,440,animal,boat2,hero2,hero4,hero5,viewRight,viewLeft);
                        j++;
                    }
                    else if (i%2==1&&j<2)
                    
                    { hero3.add(hero3, gc2,590,450,animal,boat2,hero2,hero4,hero5,viewRight,viewLeft);
                     j++;
                    }
                   
                    i++;
                    farmer3.setSprite(hero3);
                     
                 } if(hero4.Intersects(r))
                {  if(hero4.positionX!=hero4.originalPositionLeftX)
                    {
                        hero4.add(hero4, gc2,hero4.originalPositionLeftX,hero4.originalPositionLeftY,hero5,boat2,animal,hero2,hero3,viewRight,viewLeft);
                        j--;
                    }
                  else if (i%2==0&&j<2)
                    {
                        
                        hero4.add(hero4,gc2,340,510,hero3,boat2,animal,hero2,hero5,viewRight,viewLeft);
                        j++;
                    }
                    else if (i%2==1&&j<2)
                    
                    { hero4.add(hero4, gc2,530,510,hero3,boat2,animal,hero2,hero5,viewRight,viewLeft);
                     j++;
                    }
                   i++;
                   farmer4.setSprite(hero4);
                 } if(hero5.Intersects(r))
                {  if(hero5.positionX!=hero5.originalPositionLeftX)
                    {
                        hero5.add(hero5, gc2,hero5.originalPositionLeftX,hero5.originalPositionLeftY,hero2,boat2,animal,hero4,hero3,viewRight,viewLeft);
                        j--;
                    }
                   else if (i%2==0 && j<2)
                    {
                        
                        hero5.add(hero5,gc2,400,420,hero4,boat2,animal,hero3,hero2,viewRight,viewLeft);
                        j++;
                    }
                    else if (i%2==1&&j<2)
                   
                    { hero5.add(hero5, gc2,580,450,hero4,boat2,animal,hero3,hero2,viewRight,viewLeft);
                     j++;
                    }
                   
                    i++;
                    farmer5.setSprite(hero5);
                     
                 }if(animal.Intersects(r))
                {if(animal.positionX!=animal.originalPositionLeftX)
                    {
                        animal.add(animal, gc2,animal.originalPositionLeftX,animal.originalPositionLeftY,hero5,boat2,hero2,hero4,hero3,viewRight,viewLeft);
                        j--;
                    }
                else if (i%2==0&&j<2)
                    {
                        
                        animal.add(animal,gc2,400,630,hero4,boat2,hero2,hero3,hero5,viewRight,viewLeft);
                        j++;
                    }
                    else if (i%2==1&&j<2)
                   
                    {  animal.add(animal, gc2,590,640,hero4,boat2,hero2,hero3,hero5,viewRight,viewLeft);
                     j++;
                    }
                   
                    
                    i++; 
                    rabbit.setSprite(animal);
                 }
            }
             else
            {
                 if(hero2.Intersects(r))
                { if(hero2.positionX!=hero2.originalPositionRightX)
                    {
                        hero2.add(hero2, gc2,hero2.originalPositionRightX,hero2.originalPositionRightY,hero5,boatR,animal,hero4,hero3,viewRight,viewLeft);
                        j--;
                    }
                else  if (i%2==0&&j<2)
                    {  hero2.add(hero2,gc2,1400,480,hero4,boatR,animal,hero5,hero3,viewRight,viewLeft);
                        j++;
                    }
                    else if (i%2==1&&j<2)
                    
                    { hero2.add(hero2, gc2,1500,500,hero4,boatR,animal,hero5,hero3,viewRight,viewLeft);
                     j++;
                    }
                   
                 
                      i++;
                     farmer2.setSprite(hero2);
                 }
             if(hero3.Intersects(r))
                {if(hero3.positionX!=hero3.originalPositionRightX)
                    {
                        hero3.add(hero3, gc2,hero3.originalPositionRightX,hero3.originalPositionRightY,hero5,boatR,animal,hero4,hero2,viewRight,viewLeft);
                        j--;
                    }
                else if (i%2==0&&j<2)
                    {
                        
                        hero3.add(hero3,gc2,1250,440,animal,boatR,hero2,hero4,hero5,viewRight,viewLeft);
                        j++;
                    }
                    else if (i%2==1&&j<2)
                    
                    { hero3.add(hero3, gc2,1320,450,animal,boatR,hero2,hero4,hero5,viewRight,viewLeft);
                     j++;
                    }
                   
                    i++;
                    farmer3.setSprite(hero3);
                     
                 } if(hero4.Intersects(r))
                {  if(hero4.positionX!=hero4.originalPositionRightX)
                    {
                        hero4.add(hero4, gc2,hero4.originalPositionRightX,hero4.originalPositionRightY,hero5,boatR,animal,hero2,hero3,viewRight,viewLeft);
                        j--;
                    }
                  else if (i%2==0&&j<2)
                    {
                        
                        hero4.add(hero4,gc2,1450,510,hero3,boatR,animal,hero2,hero5,viewRight,viewLeft);
                        j++;
                    }
                    else if (i%2==1&&j<2)
                    
                    { hero4.add(hero4, gc2,1250,510,hero3,boatR,animal,hero2,hero5,viewRight,viewLeft);
                     j++;
                    }
                   i++;
                   farmer4.setSprite(hero4);
                 } if(hero5.Intersects(r))
                {  if(hero5.positionX!=hero5.originalPositionLeftX)
                    {
                        hero5.add(hero5, gc2,hero5.originalPositionLeftX,hero5.originalPositionLeftY,hero2,boat2,animal,hero4,hero3,viewRight,viewLeft);
                        j--;
                    }
                   else if (i%2==0 && j<2)
                    {
                        
                        hero5.add(hero5,gc2,1500,420,hero4,boatR,animal,hero3,hero2,viewRight,viewLeft);
                        j++;
                    }
                    else if (i%2==1&&j<2)
                   
                    { hero5.add(hero5, gc2,1350,450,hero4,boatR,animal,hero3,hero2,viewRight,viewLeft);
                     j++;
                    }
                   
                    i++;
                    farmer5.setSprite(hero5);
                     
                 }if(animal.Intersects(r))
                {if(animal.positionX!=animal.originalPositionLeftX)
                    {
                        animal.add(animal, gc2,animal.originalPositionLeftX,animal.originalPositionLeftY,hero5,boatR,hero2,hero4,hero3,viewRight,viewLeft);
                        j--;
                    }
                else if (i%2==0&&j<2)
                    {
                        
                        animal.add(animal,gc2,1500,630,hero4,boatR,hero2,hero3,hero5,viewRight,viewLeft);
                        j++;
                    }
                    else if (i%2==1&&j<2)
                   
                    {  animal.add(animal, gc2,1200,640,hero4,boatR,hero2,hero3,hero5,viewRight,viewLeft);
                     j++;
                    }
                   
                    
                    i++; 
                    rabbit.setSprite(animal);
                 }
            }
            }
           
            
            
       });
        
        });
           b1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
            public void handle(ActionEvent event) {
            Game game=new Game();
             List<ICrosser> list1=game.boatCrossers(heroR,goatR , foxR, plantR);
             List<ICrosser> list2=new ArrayList<>();
             list2=game.getCrosserOnLeft();
             
             List<ICrosser> list3=game.getCrosserOnRight();
            if (game.isBoatOnTheLeftBank()==false)
            {
                if(game.isValid(list2, list3, list1)==true)
                {
                     i=0;
                     j=0;
                if (list1.size()==0)
                {
                    JOptionPane.showMessageDialog(null, "No One on boat","error",JOptionPane.PLAIN_MESSAGE);
                }
               if (list1.size()==1 && list2.size()==2)
               {
                   
                   list1.get(0).setSprite(list1.get(0).getSpriteL());
                   Sprite s= list3.get(0).getSpriteR();
                   list3.get(0).setSprite(s);
                   boat.add(list1.get(0).getSprite(),gc,list1.get(0).getSprite().originalPositionLeftX,list1.get(0).getSprite().originalPositionLeftY, boat,list3.get(0).getSprite(),list2.get(0).getSprite(),list2.get(1).getSprite() ,animal1, viewRight, viewLeft);
               }
              
                if (list1.size()==2 && list2.size()==2)
               {
                   
                   list1.get(0).setSprite(list1.get(0).getSpriteL());
                   list1.get(1).setSprite(list1.get(1).getSpriteL());
                   list1.get(1).getSprite().positionY=list1.get(1).getSprite().originalPositionLeftY;
                   list1.get(1).getSprite().positionX=list1.get(1).getSprite().originalPositionLeftX;
                  
                   boat.add(list1.get(0).getSprite(),gc,list1.get(0).getSprite().originalPositionLeftX,list1.get(0).getSprite().originalPositionLeftY, boat,list1.get(1).getSprite(),list2.get(0).getSprite(),list2.get(1).getSprite() ,animal1,  viewRight, viewLeft);
               }
                 if (list1.size()==1 && list2.size()==1)
               {
                   
                   list1.get(0).setSprite(list1.get(0).getSpriteL());
                   list3.get(0).setSprite(list3.get(0).getSpriteR());
                   list3.get(1).setSprite(list3.get(1).getSpriteR());
                   boat.add(list1.get(0).getSprite(),gc,list1.get(0).getSprite().originalPositionLeftX,list1.get(0).getSprite().originalPositionLeftY, boat,list3.get(1).getSprite(),list2.get(0).getSprite(),list3.get(0).getSprite() ,animal1,  viewRight, viewLeft);
               }
                  if (list1.size()==2 && list2.size()==1)
               {
                   
                   list1.get(0).setSprite(list1.get(0).getSpriteL());
                   list1.get(1).setSprite(list1.get(1).getSpriteL());
                    list1.get(1).getSprite().positionY=list1.get(1).getSprite().originalPositionLeftY;
                   list1.get(1).getSprite().positionX=list1.get(1).getSprite().originalPositionLeftX;
                   Sprite s= list3.get(0).getSpriteR();
                   list3.get(0).setSprite(s);
                   boat.add(list1.get(0).getSprite(),gc,list1.get(0).getSprite().originalPositionLeftX,list1.get(0).getSprite().originalPositionLeftY, boat,list1.get(1).getSprite(),list2.get(0).getSprite(),list3.get(0).getSprite() ,animal1,  viewRight, viewLeft);
               }
                  if (list1.size()==2 && list2.size()==0)
               {
                  
                   list1.get(0).setSprite(list1.get(0).getSpriteL());
                   list1.get(1).setSprite(list1.get(1).getSpriteL());
                    list1.get(1).getSprite().positionY=list1.get(1).getSprite().originalPositionLeftY;
                   list1.get(1).getSprite().positionX=list1.get(1).getSprite().originalPositionLeftX;
                   Sprite s= list3.get(0).getSpriteR();
                   list3.get(0).setSprite(s);
                   boat.add(list1.get(0).getSprite(),gc,list1.get(0).getSprite().originalPositionLeftX,list1.get(0).getSprite().originalPositionLeftY, boat,list1.get(1).getSprite(),list3.get(0).getSprite(),list3.get(1).getSprite() ,animal1,  viewRight, viewLeft);
               }
               System.out.println("list 1 size"+list1.size());
               System.out.println("list 2size"+list2.size());
               
                
                }
               
               
              
             
                
               
               
            }
            else 
                 JOptionPane.showMessageDialog(null, "You are on Right bank you cannot move left ","error",JOptionPane.PLAIN_MESSAGE);
            
            
                    }
               
           });
           btn1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
            public void handle(ActionEvent event) {
            Game game=new Game();
             List<ICrosser> list1=game.boatCrossers2(farmer2.getSprite(),farmer3.getSprite() ,farmer4.getSprite(),farmer5.getSprite(),animal.getSprite());
             List<ICrosser> list2=new ArrayList<>();
             list2=game.getCrosserOnLeft2();
             
             List<ICrosser> list3=game.getCrosserOnRight2();
            if (game.isBoatOnTheLeftBank()==false)
            {
                if(game.isValid(list2, list3, list1)==true)
                {
                     i=0;
                     j=0;
                if (list1.size()==0)
                {
                    JOptionPane.showMessageDialog(null, "No One on boat","error",JOptionPane.PLAIN_MESSAGE);
                }
               if (list1.size()==1 && list2.size()==3)
               {
                   
                  
                   Sprite s= list3.get(0).getSpriteR();
                   list3.get(0).setSprite(s);
                   boat.add(list1.get(0).getSprite(),gc2,list1.get(0).getSprite().originalPositionLeftX,list1.get(0).getSprite().originalPositionLeftY, boatR,list3.get(0).getSprite(),list2.get(0).getSprite(),list2.get(1).getSprite() ,list2.get(2).getSprite(), viewRight, viewLeft);
               }
              
                if (list1.size()==2 && list2.size()==3)
               {
                   System.out.println("hey");
                   
                   list1.get(1).getSprite().positionY=list1.get(1).getSprite().originalPositionRightY;
                   list1.get(1).getSprite().positionX=list1.get(1).getSprite().originalPositionRightX;
                  
                   boat.add(list1.get(0).getSprite(),gc2,list1.get(0).getSprite().originalPositionRightX,list1.get(0).getSprite().originalPositionRightY, boatR,list1.get(1).getSprite(),list2.get(0).getSprite(),list2.get(1).getSprite() ,list2.get(2).getSprite(),  viewRight, viewLeft);
               }
                 if (list1.size()==2 && list2.size()==1)
               {
                   
                  
                   boat.add(list1.get(0).getSprite(),gc,list1.get(0).getSprite().originalPositionLeftX,list1.get(0).getSprite().originalPositionLeftY, boatR,list3.get(1).getSprite(),list2.get(0).getSprite(),list3.get(0).getSprite() ,list1.get(0).getSprite(),  viewRight, viewLeft);
               }
                  if (list1.size()==2 && list2.size()==1)
               {
                   
                   list1.get(0).setSprite(list1.get(0).getSpriteL());
                   list1.get(1).setSprite(list1.get(1).getSpriteL());
                    list1.get(1).getSprite().positionY=list1.get(1).getSprite().originalPositionLeftY;
                   list1.get(1).getSprite().positionX=list1.get(1).getSprite().originalPositionLeftX;
                   Sprite s= list3.get(0).getSpriteR();
                   list3.get(0).setSprite(s);
                   boat.add(list1.get(0).getSprite(),gc,list1.get(0).getSprite().originalPositionLeftX,list1.get(0).getSprite().originalPositionLeftY, boat,list1.get(1).getSprite(),list2.get(0).getSprite(),list3.get(0).getSprite() ,animal1,  viewRight, viewLeft);
               }
                  if (list1.size()==2 && list2.size()==0)
               {
                  
                   list1.get(0).setSprite(list1.get(0).getSpriteL());
                   list1.get(1).setSprite(list1.get(1).getSpriteL());
                    list1.get(1).getSprite().positionY=list1.get(1).getSprite().originalPositionLeftY;
                   list1.get(1).getSprite().positionX=list1.get(1).getSprite().originalPositionLeftX;
                   Sprite s= list3.get(0).getSpriteR();
                   list3.get(0).setSprite(s);
                   boat.add(list1.get(0).getSprite(),gc,list1.get(0).getSprite().originalPositionLeftX,list1.get(0).getSprite().originalPositionLeftY, boat,list1.get(1).getSprite(),list3.get(0).getSprite(),list3.get(1).getSprite() ,animal1,  viewRight, viewLeft);
               }
               System.out.println("list 1 size"+list1.size());
               System.out.println("list 2size"+list2.size());
               
                
                }
               
               
              
             
                
               
               
            }
            else 
                 JOptionPane.showMessageDialog(null, "You are on Right bank you cannot move left ","error",JOptionPane.PLAIN_MESSAGE);
            
           
                    }
               
           });
           
            b1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
            public void handle(ActionEvent event) {
            Game game=new Game();
             List<ICrosser> list1=game.boatCrossers(heroR,goatR , foxR, plantR);
             List<ICrosser> list2=new ArrayList<>();
             list2=game.getCrosserOnLeft();
             
             List<ICrosser> list3=game.getCrosserOnRight();
            if (game.isBoatOnTheLeftBank()==false)
            {
                if(game.isValid(list2, list3, list1)==true)
                {
                     i=0;
                     j=0;
                if (list1.size()==0)
                {
                    JOptionPane.showMessageDialog(null, "No One on boat","error",JOptionPane.PLAIN_MESSAGE);
                }
               if (list1.size()==1 && list2.size()==2)
               {
                   
                   list1.get(0).setSprite(list1.get(0).getSpriteL());
                   Sprite s= list3.get(0).getSpriteR();
                   list3.get(0).setSprite(s);
                   boat.add(list1.get(0).getSprite(),gc,list1.get(0).getSprite().originalPositionLeftX,list1.get(0).getSprite().originalPositionLeftY, boat,list3.get(0).getSprite(),list2.get(0).getSprite(),list2.get(1).getSprite() ,animal1, viewRight, viewLeft);
               }
              
                if (list1.size()==2 && list2.size()==2)
               {
                   
                   list1.get(0).setSprite(list1.get(0).getSpriteL());
                   list1.get(1).setSprite(list1.get(1).getSpriteL());
                   list1.get(1).getSprite().positionY=list1.get(1).getSprite().originalPositionLeftY;
                   list1.get(1).getSprite().positionX=list1.get(1).getSprite().originalPositionLeftX;
                  
                   boat.add(list1.get(0).getSprite(),gc,list1.get(0).getSprite().originalPositionLeftX,list1.get(0).getSprite().originalPositionLeftY, boat,list1.get(1).getSprite(),list2.get(0).getSprite(),list2.get(1).getSprite() ,animal1,  viewRight, viewLeft);
               }
                 if (list1.size()==1 && list2.size()==1)
               {
                   
                   list1.get(0).setSprite(list1.get(0).getSpriteL());
                   list3.get(0).setSprite(list3.get(0).getSpriteR());
                   list3.get(1).setSprite(list3.get(1).getSpriteR());
                   boat.add(list1.get(0).getSprite(),gc,list1.get(0).getSprite().originalPositionLeftX,list1.get(0).getSprite().originalPositionLeftY, boat,list3.get(1).getSprite(),list2.get(0).getSprite(),list3.get(0).getSprite() ,animal1,  viewRight, viewLeft);
               }
                  if (list1.size()==2 && list2.size()==1)
               {
                   
                   list1.get(0).setSprite(list1.get(0).getSpriteL());
                   list1.get(1).setSprite(list1.get(1).getSpriteL());
                    list1.get(1).getSprite().positionY=list1.get(1).getSprite().originalPositionLeftY;
                   list1.get(1).getSprite().positionX=list1.get(1).getSprite().originalPositionLeftX;
                   Sprite s= list3.get(0).getSpriteR();
                   list3.get(0).setSprite(s);
                   boat.add(list1.get(0).getSprite(),gc,list1.get(0).getSprite().originalPositionLeftX,list1.get(0).getSprite().originalPositionLeftY, boat,list1.get(1).getSprite(),list2.get(0).getSprite(),list3.get(0).getSprite() ,animal1,  viewRight, viewLeft);
               }
                  if (list1.size()==2 && list2.size()==0)
               {
                  
                   list1.get(0).setSprite(list1.get(0).getSpriteL());
                   list1.get(1).setSprite(list1.get(1).getSpriteL());
                    list1.get(1).getSprite().positionY=list1.get(1).getSprite().originalPositionLeftY;
                   list1.get(1).getSprite().positionX=list1.get(1).getSprite().originalPositionLeftX;
                   Sprite s= list3.get(0).getSpriteR();
                   list3.get(0).setSprite(s);
                   boat.add(list1.get(0).getSprite(),gc,list1.get(0).getSprite().originalPositionLeftX,list1.get(0).getSprite().originalPositionLeftY, boat,list1.get(1).getSprite(),list3.get(0).getSprite(),list3.get(1).getSprite() ,animal1,  viewRight, viewLeft);
               }
               System.out.println("list 1 size"+list1.size());
               System.out.println("list 2size"+list2.size());
               
                
                }
               
               
              
             
                
               
               
            }
            else 
                 JOptionPane.showMessageDialog(null, "You are on Right bank you cannot move left ","error",JOptionPane.PLAIN_MESSAGE);
            
            
                    }
               
           });
           btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
              
                List<ICrosser> list1=new ArrayList();
                List<ICrosser> list2=new ArrayList();
                List<ICrosser> list3=new ArrayList();
                List<ICrosser> list4=new ArrayList();
                list4=game.getInitialCrossers();
                System.out.println("hey");
                list1=game.boatCrossers2(farmer2.getSprite(),farmer3.getSprite() ,farmer4.getSprite(),farmer5.getSprite(),animal.getSprite());
                list3=game.getCrosserOnRight2();
                list2=game.getCrosserOnLeft2();
                System.out.println("size of list1="+list1.size());
                System.out.println("size of list2="+list2.size());
                
                 Rectangle2D r=new Rectangle2D(0,0,1000,1000);
               
                if (game.isBoatOnTheLeftBank()==false)
                 {
               if (game.isValid(list2, list3, list1)==true)
               {
                  
                 boatR.positionX=boat.originalPositionRightX;
                 boatR.positionY=boat.originalPositionRightY;
                  
                     if (list1.size()==0)
                {
                    JOptionPane.showMessageDialog(null, "No One on boat","error",JOptionPane.PLAIN_MESSAGE);
                }
                    if (list1.size()==2 && list2.size()==3)
                    {
                       list1.get(0).getSprite().positionX=list1.get(0).getSprite().originalPositionLeftX;
                        list1.get(1).getSprite().positionX=list1.get(1).getSprite().originalPositionLeftX;
                        boatR.add(boat, gc, boat.originalPositionLeftX, boatR.originalPositionLeftY, list1.get(0).getSprite(),list1.get(1).getSprite(), list2.get(0).getSprite(),list2.get(1).getSprite() ,list2.get(2).getSprite(),  viewRight, viewLeft);
                        
                    }
                    else  if (list1.size()==2 && list2.size()==2)
                    {
                       
                        
                        
                         
                         list1.get(1).getSprite().positionX=list1.get(1).getSprite().originalPositionLeftX;
                          list1.get(1).getSprite().positionY=list1.get(1).getSprite().originalPositionLeftY;
                         
                         boat.add(list1.get(0).getSprite(), gc2,list1.get(0).getSprite().originalPositionLeftX ,list1.get(0).getSprite().originalPositionLeftY,boat,list1.get(1).getSprite(), list2.get(0).getSprite(),animal1 , animal1, viewRight, viewLeft);
                    }
                    else  if (list1.size()==2 && list2.size()==0)
                    {
                       
                        
                         list1.get(0).setSprite(list1.get(0).getSpriteR());
                         list1.get(0).getSprite().positionY=list1.get(0).getSprite().originalPositionRightY;
                         list1.get(1).setSprite(list1.get(1).getSpriteR());
                         list1.get(1).getSprite().positionY=list1.get(1).getSprite().originalPositionRightY;
                         list1.get(1).getSprite().positionX=list1.get(1).getSprite().originalPositionRightX;
                         boatR.add(boatR, gc, boatR.originalPositionRightX, boatR.originalPositionRightY, list1.get(0).getSprite(),list1.get(1).getSprite(), list3.get(0).getSprite(),list3.get(1).getSprite() ,animal1,  viewRight, viewLeft);
                    }
                    else  if (list1.size()==1 && list2.size()==2)
                    {
                       
                        
                         
                         list1.get(0).getSprite().positionX=list1.get(0).getSprite().originalPositionLeftX;
                         list1.get(1).getSprite().positionX=list1.get(1).getSprite().originalPositionLeftX;
                         boatR.add(boat, gc, boat.originalPositionLeftX, boat.originalPositionLeftY, list1.get(0).getSprite(),list2.get(1).getSprite(), list2.get(0).getSprite(),list2.get(2).getSprite() ,animal1,  viewRight, viewLeft);
                    }
                    else  if (list1.size()==0)
                    {   
                         JOptionPane.showMessageDialog(null, "No one on boat ","Error",JOptionPane.PLAIN_MESSAGE);
                    }
                    
                    
                     
                     
                     
                      j=0;
                      i=0;
                     
               }
                    
                 }
                  else 
                     JOptionPane.showMessageDialog(null, "You are on right you cannot move right ","",JOptionPane.PLAIN_MESSAGE); 
               
                   
                   
                
                
                   }
        });
        
          
        scene.setOnMouseClicked(new EventHandler<MouseEvent>(){
         
            @Override
            public void handle(MouseEvent event) {
                
                
               
                
                
                double y=event.getY();
                double x=event.getX();
                Rectangle2D r=new Rectangle2D(x,y,1,1);
               
                if(viewRight.Intersects(r)){
                if(hero.Intersects(r))
                {
                    if(hero.positionX!=hero.originalPositionLeftX )
                     { hero.add(hero, gc,hero.originalPositionLeftX,hero.originalPositionLeftY,goat,boat,plant,fox,animal1, viewRight,viewLeft); j--;   }
                    else if (i%2==0  && j<2)
                    {  hero.add(farmer.farmer,gc,625,475,goat2.goat,boat,plant2.plant,fox2.fox,animal1, viewRight,viewLeft);   j++;    }
                    else if (i%2==1 && j<2)
                    {  hero.add(farmer.farmer, gc,350,450,goat2.goat,boat,plant2.plant,fox2.fox,animal1, viewRight,viewLeft);    j++;  }
                        i++;
                        farmer.farmer=hero;
                  }
                if(goat.Intersects(r))
                {
                    if(goat.positionX!=goat.originalPositionLeftX)
                     {goat.add(goat2.goat, gc,goat.originalPositionLeftX,goat.originalPositionLeftY,farmer.farmer,boat,plant2.plant,fox2.fox,animal1, viewRight,viewLeft);j--;  }
                    else if (i%2==0 && j<2)
                    {goat.add(goat2.goat,gc,650,550,farmer.farmer,boat,plant2.plant,fox2.fox,animal1, viewRight,viewLeft);  j++; }
                    else if (i%2==1 && j<2)
                    { goat.add(goat2.goat,gc,375,550,farmer.farmer,boat,plant2.plant,fox2.fox,animal1, viewRight,viewLeft);  j++;}
                     i++;
                     goat2.goat=goat;
                }
                
                if(fox.Intersects(r))
                {
                     if(fox.positionX!=fox.originalPositionLeftX)
                     { fox.add(fox2.fox, gc,fox.originalPositionLeftX,fox.originalPositionLeftY,goat2.goat,boat,plant2.plant,farmer.farmer,animal1, viewRight,viewLeft); j--; }
                     else if (i%2==0 && j<2)
                    {fox.add(fox2.fox,gc,600,675,goat2.goat,boat,plant2.plant,farmer.farmer,animal1, viewRight,viewLeft);j++;}
                    else if (i%2==1 && j<2)
                    {fox.add(fox2.fox,gc,350,650,goat2.goat,boat,plant2.plant,farmer.farmer,animal1, viewRight,viewLeft);j++;}
                                i++;  fox2.fox=fox; }
                if(plant.Intersects(r))
                {if(plant.positionX!=plant.originalPositionLeftX)
                { plant.add(plant, gc,plant.originalPositionLeftX,plant.originalPositionLeftY,goat,boat,hero,fox,animal1, viewRight,viewLeft);j--;}
                    else  if (i%2==0 && j<2)
                    { plant.add(plant2.plant,gc,600,700,goat2.goat,boat,farmer.farmer,fox2.fox,animal1, viewRight,viewLeft);j++;}
                    else if (i%2==1 && j<2)
                    { plant.add(plant2.plant,gc,400,675,goat2.goat,boat,farmer.farmer,fox2.fox,animal1, viewRight,viewLeft);j++;}
                    i++;
                    plant2.plant=plant;
                }
                }
                 
                if (viewLeft.Intersects(r))
                {
                    
                    if(heroR.Intersects(r))
                {
                   
                   farmer.farmer=heroR;
                    if(heroR.positionY!=heroR.originalPositionRightY)
                     { heroR.add(heroR,gc,heroR.originalPositionRightX,250,plant2.plant,boatR,goat2.goat,fox2.fox,animal1, viewRight,viewLeft);farmer.setSprite(heroR);
                      j--;}
                   else if (i%2==0 && j<2)
                    {    
                        farmer.farmer.add(heroR,gc,1200,475,goat2.goat,boatR,plant2.plant,fox2.fox,animal1, viewRight,viewLeft);
                        farmer.setSprite(heroR);j++;
                    }
                    else if (i%2==1 && j<2)
                    {
                        hero.add(farmer.farmer,gc,1400,475,goat2.goat,boatR,plant2.plant,fox2.fox,animal1, viewRight,viewLeft);
                        farmer.setSprite(heroR);j++;
                    }
                        i++;
                   
                    
                     
                 }
                    
                if(goat2.goat.Intersects(r))
                {
                    
                    if(goat2.goat.positionX!=goatR.originalPositionRightX)
                     {
                        goat2.goat.add(goatR,gc,goatR.originalPositionRightX,goatR.originalPositionRightY,plant2.plant,boatR,heroR,fox2.fox,animal1, viewRight,viewLeft);
                       goat2.setSprite(goatR);j--;
                     }
                     else if (i%2==0 && j<2)
                    {
                        
                        goat2.goat.add(goatR,gc,1150,550,plant2.plant,boatR,farmer.farmer,fox2.fox,animal1, viewRight,viewLeft);
                        goat2.setSprite(goatR);j++;
                      
                    }
                    else if (i%2==1  && j<2)
                    {
                      
                        goatR.add(goatR,gc,1400,550,plant2.plant,boatR,farmer.farmer,fox2.fox,animal1, viewRight,viewLeft);
                        goat2.setSprite(goatR);j++;
                       
                    }
                     i++;
                   
                }
                if(foxR.Intersects(r))
                {
                     if(fox2.fox.positionX!=foxR.originalPositionLeftX)
                     {
                        fox.add(foxR, gc,foxR.originalPositionRightX,foxR.originalPositionRightY,goat2.getSprite(),boat,plant2.getSprite(),farmer.getSprite(),animal1, viewRight,viewLeft);
                        fox2.setSprite(foxR);
                        j--;
                     }
                    if (i%2==0 && j<2)
                    {
                    foxR.add(foxR,gc,1200,675,goat2.getSprite(),boat,plant2.getSprite(),farmer.getSprite(),animal1, viewRight,viewLeft);
                    fox2.setSprite(foxR);j++;
                    }
                    else if (i%2==1 && j<2)
                    {
                       fox.add(foxR,gc,1650,650,goat2.getSprite(),boat,plant2.getSprite(),farmer.getSprite(),animal1, viewRight,viewLeft);
                       fox2.setSprite(foxR);j++;
                    }
                    i++;
                }
                if(plantR.Intersects(r))
                {
                    if(plant.positionX!=plant.originalPositionLeftX)
                    {
                        plant.add(plantR, gc,plant.originalPositionLeftX,plant.originalPositionLeftY,goat2.goat,boat,farmer.farmer,fox2.fox,animal1, viewRight,viewLeft);
                        plant2.setSprite(plantR);
                        j--;
                    }
                    if (i%2==0 && j<2)
                    {
                    plant.add(plantR,gc,600,700,goat2.goat,boat,farmer.farmer,fox2.fox,animal1, viewRight,viewLeft);j++;
                    plant2.plant=plantR;
                    }
                    else if (i%2==1 && j<2)
                    {
                       plant.add(plant,gc,400,675,goat2.goat,boat,farmer.farmer,fox2.fox,animal1, viewRight,viewLeft);j++;
                       plant2.plant=plantR;
                    }
                    i++;
                }
                }
                
        
         
            }
              
             });
        
        btnNewGame.setOnMouseClicked(new EventHandler<MouseEvent>(){
         
            @Override
            public void handle(MouseEvent event) {
                
                game.resetgame();
                gc.clearRect(0, 0, 2000, 2000);
                
                hero.setPositionX(hero.originalPositionLeftX);
                hero.setPositionY(hero.originalPositionLeftY);
                fox.setPositionX(fox.originalPositionLeftX);
                fox.setPositionY(fox.originalPositionLeftY);
                goat.setPositionX(goat.originalPositionLeftX);
                goat.setPositionY(goat.originalPositionLeftY);
                plant.setPositionX(plant.originalPositionLeftX);
                plant.setPositionY(plant.originalPositionLeftY);
                farmer.farmer=hero;goat2.goat=goat;plant2.plant=plant;fox2.fox=fox;
                boat.add(boat, gc, boat.positionX, boat.positionY, hero, goat, plant, fox,animal1, viewLeft, viewRight);
               
    }
});
       
        instructions.setOnMouseClicked(new EventHandler<MouseEvent>(){
         
            @Override
            public void handle(MouseEvent event) {
                
                game.getInstructions();
                
                      /*  JOptionPane.showMessageDialog(null, "       1) farmer is the only one who can steer the raft. he can only take one passenger(the wolf, the goat,the cabbage) in addition to himself\n" +
"        2) if the wolf and the goat are alone on the same riverbank, the wolf will eat the goat\n" +
"        3) if the goat and the cabbage are alone on the same bank the goat will eat the cabbage\n" +
"        4) how can the farmer get the goat, the wolf, the carrots without any of them being eaten ? ","instructions",JOptionPane.PLAIN_MESSAGE);
             */  
              
               
    }
});
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
              
                List<ICrosser> list1=new ArrayList();
                List<ICrosser> list2=new ArrayList();
                List<ICrosser> list3=new ArrayList();
                List<ICrosser> list4=new ArrayList();
                list4=game.getInitialCrossers();
                
                list1= game.boatCrossers(farmer.farmer,goat2.goat,fox2.fox,plant2.plant);
                list3=game.getCrosserOnRight();
                list2=game.getCrosserOnLeft();
                
                 Rectangle2D r=new Rectangle2D(0,0,1000,1000);
               
                if (game.isBoatOnTheLeftBank()==true)
                 {
               if (game.isValid(list2, list3, list1)==true)
               {
                  
                 boatR.positionX=boat.originalPositionRightX;
                 boatR.positionY=boat.originalPositionRightY;
                  
                     if (list1.size()==0)
                {
                    JOptionPane.showMessageDialog(null, "No One on boat","error",JOptionPane.PLAIN_MESSAGE);
                }
                    if (list1.size()==2 && list2.size()==2)
                    {
                        list1.get(0).setSprite(list1.get(0).getSpriteR());
                        list1.get(1).setSprite(list1.get(1).getSpriteR());
                        boatR.add(boatR, gc, boatR.originalPositionRightX, boatR.originalPositionRightY, list1.get(0).getSprite(),list1.get(1).getSprite(), list2.get(0).getSprite(),list2.get(1).getSprite() ,animal1,  viewRight, viewLeft);
                        
                    }
                    else  if (list1.size()==2 && list2.size()==1)
                    {
                       
                        
                         list1.get(0).setSprite(list1.get(0).getSpriteR());
                         list1.get(0).getSprite().positionY=list1.get(0).getSprite().originalPositionRightY;
                         list1.get(1).setSprite(list1.get(1).getSpriteR());
                         boatR.add(boatR, gc, boatR.originalPositionRightX, boatR.originalPositionRightY, list1.get(0).getSprite(),list1.get(1).getSprite(), list2.get(0).getSprite(),list3.get(0).getSprite() , animal1, viewRight, viewLeft);
                    }
                    else  if (list1.size()==2 && list2.size()==0)
                    {
                       
                        
                         list1.get(0).setSprite(list1.get(0).getSpriteR());
                         list1.get(0).getSprite().positionY=list1.get(0).getSprite().originalPositionRightY;
                         list1.get(1).setSprite(list1.get(1).getSpriteR());
                         list1.get(1).getSprite().positionY=list1.get(1).getSprite().originalPositionRightY;
                         list1.get(1).getSprite().positionX=list1.get(1).getSprite().originalPositionRightX;
                         boatR.add(boatR, gc, boatR.originalPositionRightX, boatR.originalPositionRightY, list1.get(0).getSprite(),list1.get(1).getSprite(), list3.get(0).getSprite(),list3.get(1).getSprite() ,animal1,  viewRight, viewLeft);
                    }
                    else  if (list1.size()==1 && list2.size()==3)
                    {
                       
                        
                         list1.get(0).setSprite(list1.get(0).getSpriteR());
                         list1.get(0).getSprite().positionY=list1.get(0).getSprite().originalPositionRightY;
                         boatR.add(boatR, gc, boatR.originalPositionRightX, boatR.originalPositionRightY, list1.get(0).getSprite(),list2.get(1).getSprite(), list2.get(0).getSprite(),list2.get(2).getSprite() ,animal1,  viewRight, viewLeft);
                    }
                    else  if (list1.size()==0)
                    {   
                         JOptionPane.showMessageDialog(null, "No one on boat ","Error",JOptionPane.PLAIN_MESSAGE);
                    }
                    
                    
                     
                     
                     
                      j=0;
                      i=0;
                     
               }
                    
                 }
                  else 
                     JOptionPane.showMessageDialog(null, "You are on right you cannot move right ","",JOptionPane.PLAIN_MESSAGE); 
               
                   
                   
                
                
                   }
        });
        
        
               new AnimationTimer(){
        @Override
        public void handle(long now){
            //process input
            //update game status
            //render
            
        }
    }.start();
        primaryStage.setScene(scene);
        primaryStage.show();//show everything added to the scene
    }
        
              
               
     /*  new AnimationTimer(){ 
    List<ICrosser> list5=new ArrayList<ICrosser>();
    
    @Override
    public void handle(long now)
    {list5=game.boatCrossers(hero, goat, plant, fox);
    if(inputs.contains("RIGHT")){
    
       boat.addDeltaX(110);
       hero.addDeltaX(110);
       if(list5.get(0).getEatingRank()==goat2.getEatingRank()||list5.get(1).getEatingRank()==goat2.getEatingRank())
       {goat2.goat.addDeltaX(110);
        goat.update();
       }
       else if(list5.get(0).getEatingRank()==fox2.getEatingRank()||list5.get(1).getEatingRank()==fox2.getEatingRank())
       {fox2.fox.addDeltaX(110);
        fox.update();
       }
       else if(list5.get(0).getEatingRank()==plant2.getEatingRank()||list5.get(1).getEatingRank()==plant2.getEatingRank())
       {plant2.plant.addDeltaX(110);
        plant.update();
       }
       
       
    }
  
    else if(inputs.contains("LEFT")){
    boat.addDeltaX(-100);
    hero.addDeltaX(-100);
    if(list5.get(0).getEatingRank()==goat2.getEatingRank()||list5.get(1).getEatingRank()==goat2.getEatingRank())
       {goat2.goat.addDeltaX(-100);
       goat.update();
       }
    else if(list5.get(0).getEatingRank()==fox2.getEatingRank()||list5.get(1).getEatingRank()==fox2.getEatingRank())
       {fox2.fox.addDeltaX(-100);
       fox.update();
       }
    else if(list5.get(0).getEatingRank()==plant2.getEatingRank()||list5.get(1).getEatingRank()==plant2.getEatingRank())
       {plant2.plant.addDeltaX(-100);
        plant.update();
       }
    
    
    }
    boat.update();
    hero.update();
    
    gc.clearRect(0, 0, 2000, 2000);
    boat.add(boat, gc, boat.positionX, boat.positionY, hero, goat, plant, fox,animal1, viewLeft, viewRight);
    hero.add(hero, gc,hero.positionX,hero.positionY,goat,boat,plant,fox,animal1,viewRight,viewLeft);
    
    //boat.render(gc);
    
    
 }
        
    }.start();
        primaryStage.setScene(scene);
        primaryStage.show();//show everything added to the scene
    }*/
    
}

