
package javaapplication2;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javax.swing.JOptionPane;


public class Game implements ICrossingStrategy,IRiverCrossingController {
    Farmer farmer=new Farmer(); 
    Fox fox2=new Fox();
    Lion lion2=new Lion();
    Plant plant2=new Plant();
    Rabbit rabbit2=new Rabbit();
    Goat goat2=new Goat();
    public JavaApplication2 ap=new JavaApplication2();
     String[] instructions;
            
    @Override
    public boolean isValid(List<ICrosser> rightBankCrossers, List<ICrosser> LeftBankCrossers, List<ICrosser> BoatRiders) {
        int diff=0;
           
          
       if (isBoatOnTheLeftBank()==true)
       {
            if (BoatRiders.size()==0)
            {
               JOptionPane.showMessageDialog(null, "No one on boat ","Error",JOptionPane.PLAIN_MESSAGE);return false;
            }
            else if(rightBankCrossers.size()==0 || rightBankCrossers.size()==1)
               diff=0;
           else 
                diff=rightBankCrossers.get(0).getEatingRank()-rightBankCrossers.get(1).getEatingRank();
       }
       else 
       {
            if (BoatRiders.size()==0)
            {
               JOptionPane.showMessageDialog(null, "No one on boat ","Error",JOptionPane.PLAIN_MESSAGE);return false;
            }
            else if (LeftBankCrossers.size()==0 || LeftBankCrossers.size()==1)
               diff=0;
           else 
               diff=LeftBankCrossers.get(0).getEatingRank()-LeftBankCrossers.get(1).getEatingRank();
       }
       
        
        if(BoatRiders.get(0).getEatingRank()==farmer.getEatingRank()||BoatRiders.get(1).getEatingRank()==farmer.getEatingRank())
            {if(java.lang.Math.abs(diff)==1)
            {
                JOptionPane.showMessageDialog(null, "You cant leave those 2 together on land ","error",JOptionPane.PLAIN_MESSAGE);
                return false;
                
            }
     
        else  {System.out.println("Success");  return true; }
        }
    else
        { JOptionPane.showMessageDialog(null, "The farmer must be on the boat ","",JOptionPane.PLAIN_MESSAGE);   return false; }
     
    }

    @Override
    public List<ICrosser> getInitialCrossers() {
       List<ICrosser> list=new ArrayList<ICrosser> ();
       Sprite s1=JavaApplication2.farmer.farmer;
       Sprite s2=JavaApplication2.goat2.goat;
       Sprite s3=JavaApplication2.fox2.fox;
       Sprite s4=JavaApplication2.plant2.plant;
       Rectangle2D r=new Rectangle2D(0,0,1000,1000);
        if (s1.Intersects(r) ) list.add(farmer);
         if (s2.Intersects(r)) list.add(goat2);
         if (s3.Intersects(r)) list.add(fox2);
         if (s4.Intersects(r)) list.add(plant2);
        
          
       
        return list;
    }
    public List<ICrosser> boatCrossers(Sprite s1,Sprite s2,Sprite s3,Sprite s4){
        Rectangle2D r=new Rectangle2D(300,700,500,400);
        Rectangle2D r2=new Rectangle2D(1300,700,500,400);
        List<ICrosser> list=new ArrayList<>();
        if (isBoatOnTheLeftBank()==true)
        {
         
         if (s1.Intersects(r)) { list.add(JavaApplication2.farmer);   }
         if (s2.Intersects(r)) { list.add(JavaApplication2.goat2);  }
         if (s3.Intersects(r)) { list.add(JavaApplication2.fox2);     }
         if (s4.Intersects(r)) { list.add(JavaApplication2.plant2);   }
        }
       else 
        {
            if (s1.Intersects(r2))  {  list.add(JavaApplication2.farmer);   }
            if (s2.Intersects(r2))  {  list.add(JavaApplication2.goat2);   System.out.println("goatijij"); }
            if (s3.Intersects(r2))  {  list.add(JavaApplication2.fox2);   }
            if (s4.Intersects(r2))  {  list.add(JavaApplication2.plant2);  }
        }
        return list;
     }
    public List<ICrosser> boatCrossers2(Sprite s1,Sprite s2,Sprite s3,Sprite s4,Sprite s5){
          
        Rectangle2D r=new Rectangle2D(300,700,500,400);
        Rectangle2D r2=new Rectangle2D(1300,700,500,400);
        
        List<ICrosser> list=new ArrayList<>();
        if (isBoatOnTheLeftBank()==false)
        {
          
         if (s1.Intersects(r)) { list.add(JavaApplication2.farmer2);   }
         if (s2.Intersects(r)) { list.add(JavaApplication2.farmer3);  }
         if (s3.Intersects(r)) { list.add(JavaApplication2.farmer4);     }
         if (s4.Intersects(r)) { list.add(JavaApplication2.farmer5);   }
//         if (s5.Intersects(r)) { list.add(JavaApplication2.animal);   }
        
            
        }
       if (isBoatOnTheLeftBank()==false)
        {
            
            if (s1.Intersects(r2))  {  list.add(JavaApplication2.farmer2);    }
            if (s2.Intersects(r2))  {  list.add(JavaApplication2.farmer3);   }
            if (s3.Intersects(r2))  {  list.add(JavaApplication2.farmer4);     }
            if (s4.Intersects(r2))  {  list.add(JavaApplication2.farmer5);    }
            //if (s5.Intersects(r2))  {  list.add(JavaApplication2.animal);  }
            
        }
        
        
        return list;
     }
    @Override
    public String[] getInstructions() {
        
        instructions= "instructions".split("");
        JOptionPane.showMessageDialog(null, "1) farmer is the only one who can steer the raft. he can only take one passenger(the wolf, the goat,the cabbage) in addition to himself\n" +
"        2) if the wolf and the goat are alone on the same riverbank, the wolf will eat the goat\n" +
"        3) if the goat and the cabbage are alone on the same bank the goat will eat the cabbage\n" +
"        4) how can the farmer get the goat, the wolf, the carrots without any of them being eaten ? "," Instructions ",JOptionPane.PLAIN_MESSAGE);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return instructions;
    }

    @Override
    public void newGame(ICrossingStrategy gamestrategy) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resetgame() {
        JOptionPane.showMessageDialog(null, " Reset will start now "," RESET ",JOptionPane.PLAIN_MESSAGE);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ICrosser> getCrosserOnLeft() {
        
        
       Rectangle2D r=new Rectangle2D(0,0,1000,1000);
        Sprite s1=JavaApplication2.farmer.farmer;
        Sprite s2=JavaApplication2.goat2.goat;
        Sprite s3=JavaApplication2.fox2.fox;
        Sprite s4=JavaApplication2.plant2.plant;
        List<ICrosser> list=new ArrayList<>();
        List<ICrosser> list2=boatCrossers(s1,s2,s3,s4);
        if(list2.size()==2)
        {
       if (s1.Intersects(r) && list2.get(0)!=JavaApplication2.farmer && list2.get(1)!=JavaApplication2.farmer  ) 
       {list.add(JavaApplication2.farmer);  }
       if (s2.Intersects(r) && list2.get(0)!=JavaApplication2.goat2  &&  list2.get(1)!=JavaApplication2.goat2)
       {list.add(JavaApplication2.goat2);}
       if (s3.Intersects(r) && list2.get(0)!=JavaApplication2.fox2 && list2.get(1)!=JavaApplication2.fox2 )
       {list.add(JavaApplication2.fox2); }
       if (s4.Intersects(r) && list2.get(0)!=JavaApplication2.plant2 && list2.get(1)!=JavaApplication2.plant2) 
       {list.add(JavaApplication2.plant2); }
        }
        else if(list2.size()==1)
        {
       if (s1.Intersects(r) && list2.get(0)!=JavaApplication2.farmer  ) 
       {list.add(JavaApplication2.farmer);  }
       if (s2.Intersects(r) && list2.get(0)!=JavaApplication2.goat2  )
       {list.add(JavaApplication2.goat2);}
       if (s3.Intersects(r) && list2.get(0)!=JavaApplication2.fox2 )
       {list.add(JavaApplication2.fox2); }
       if (s4.Intersects(r) && list2.get(0)!=JavaApplication2.plant2 ) 
       {list.add(JavaApplication2.plant2); }
        }
        
        
          else   System.out.println("no one on left");
          
          
             
              
        
          return list;
        
    }
    @Override
    public List<ICrosser> getCrosserOnRight() {
         Rectangle2D r=new Rectangle2D(1000,0,1000,1000);
        Sprite s1=JavaApplication2.farmer.farmer;
        Sprite s2=JavaApplication2.goat2.goat;
        Sprite s3=JavaApplication2.fox2.fox;
        Sprite s4=JavaApplication2.plant2.plant;
        List<ICrosser> list=new ArrayList<>();
        List<ICrosser> list2=new ArrayList<>();
         list2=boatCrossers(s1,s2,s3,s4);
         if  (!list2.isEmpty()) 
         {
             if(list2.size()==2)
             { if (s1.Intersects(r) && list2.get(0)!=JavaApplication2.farmer && list2.get(1)!=JavaApplication2.farmer  )
              { list.add(JavaApplication2.farmer);  System.out.println("farmer on right  ");  }
               if (s2.Intersects(r) && list2.get(0)!=JavaApplication2.goat2  &&  list2.get(1)!=JavaApplication2.goat2)
              { list.add(JavaApplication2.goat2);   System.out.println("goat on right");        }
               if (s3.Intersects(r) && list2.get(0)!=JavaApplication2.fox2 && list2.get(1)!=JavaApplication2.fox2 )
              { list.add(JavaApplication2.fox2);  System.out.println("fox on right");           }
               if (s4.Intersects(r) && list2.get(0)!=JavaApplication2.plant2 && list2.get(1)!=JavaApplication2.plant2)
              { list.add(JavaApplication2.plant2);  System.out.println("plant");                 }
             }
             
             
              if(list2.size()==1)
             { if (s1.Intersects(r) && list2.get(0).getEatingRank()!=farmer.getEatingRank() )
              { list.add(JavaApplication2.farmer);  System.out.println("farmer on right  ");  }
               if (s2.Intersects(r) && list2.get(0).getEatingRank()!=goat2.getEatingRank()  )
              { list.add(JavaApplication2.goat2);   System.out.println("goat on right");        }
               if (s3.Intersects(r) && list2.get(0).getEatingRank()!=fox2.getEatingRank() )
              { list.add(JavaApplication2.fox2);  System.out.println("fox on right");           }
               if (s4.Intersects(r) && list2.get(0).getEatingRank()!=plant2.getEatingRank() )
              { list.add(JavaApplication2.plant2);  System.out.println("plant");                 }
             }
         }
         else 
         {
               if (s1.Intersects(r) )   list.add(farmer); 
               if (s2.Intersects(r) )   list.add(goat2);
               if (s3.Intersects(r) )   list.add(fox2);
               if (s4.Intersects(r) )   list.add(plant2);
         }
         
          
          
             
        
          return list;
}
   
public List<ICrosser> getCrosserOnLeft2() {
        
        
       Rectangle2D r=new Rectangle2D(0,0,1000,1000);
         Sprite s1=JavaApplication2.farmer2.getSprite();
        Sprite s2=JavaApplication2.farmer3.getSprite();
        Sprite s3=JavaApplication2.farmer4.getSprite();
        Sprite s4=JavaApplication2.farmer5.getSprite();
        Sprite s5=JavaApplication2.animal.getSprite();
        List<ICrosser> list=new ArrayList<>();
        List<ICrosser> list2=new ArrayList<>();
         list2=boatCrossers2(s1,s2,s3,s4,s5);
         if  (!list2.isEmpty()) 
         {
             if(list2.size()==2)
             { if (s1.Intersects(r) && list2.get(0)!=JavaApplication2.farmer2 && list2.get(1)!=JavaApplication2.farmer2  )
              { list.add(JavaApplication2.farmer2);    }
               if (s2.Intersects(r) && list2.get(0)!=JavaApplication2.farmer3  &&  list2.get(1)!=JavaApplication2.farmer3)
              { list.add(JavaApplication2.farmer3);         }
               if (s3.Intersects(r) && list2.get(0)!=JavaApplication2.farmer4 && list2.get(1)!=JavaApplication2.farmer5 )
              { list.add(JavaApplication2.farmer);             }
               if (s4.Intersects(r) && list2.get(0)!=JavaApplication2.farmer5 && list2.get(1)!=JavaApplication2.farmer5)
              { list.add(JavaApplication2.farmer5);         }
                //if (s5.Intersects(r) && list2.get(0)!=JavaApplication2.animal && list2.get(1)!=JavaApplication2.animal)
              //{ list.add(JavaApplication2.animal);         }
             }
             
             
              if(list2.size()==1)
             { if (s1.Intersects(r) && list2.get(0)!=JavaApplication2.farmer2 )
              { list.add(JavaApplication2.farmer2);    }
               if (s2.Intersects(r) && list2.get(0)!=JavaApplication2.farmer3  )
              { list.add(JavaApplication2.farmer3);          }
               if (s3.Intersects(r) && list2.get(0)!=JavaApplication2.farmer4)
              { list.add(JavaApplication2.farmer4);       }
               if (s4.Intersects(r) && list2.get(0)!=JavaApplication2.farmer5)
              { list.add(JavaApplication2.farmer5);              }
                //if (s4.Intersects(r) && list2.get(0)!=JavaApplication2.animal)
              //{ list.add(JavaApplication2.animal);              }
             
             }
              
         }
         else 
         {
               if (s1.Intersects(r) )   list.add(JavaApplication2.farmer2); 
               if (s2.Intersects(r) )   list.add(JavaApplication2.farmer3);
               if (s3.Intersects(r) )   list.add(JavaApplication2.farmer4);
               if (s4.Intersects(r) )   list.add(JavaApplication2.farmer5);
              // if (s4.Intersects(r) )   list.add(JavaApplication2.animal);
         }
         
              
        
          return list;
        
    }
   
    public List<ICrosser> getCrosserOnRight2() {
         Rectangle2D r=new Rectangle2D(1000,0,1000,1000);
        Sprite s1=JavaApplication2.farmer2.getSprite();
        Sprite s2=JavaApplication2.farmer3.getSprite();
        Sprite s3=JavaApplication2.farmer4.getSprite();
        Sprite s4=JavaApplication2.farmer5.getSprite();
        Sprite s5=JavaApplication2.animal.getSprite();
        List<ICrosser> list=new ArrayList<>();
        List<ICrosser> list2=new ArrayList<>();
         list2=boatCrossers2(s1,s2,s3,s4,s5);
         if  (!list2.isEmpty()) 
         {
             if(list2.size()==2)
             { if (s1.Intersects(r) && list2.get(0)!=JavaApplication2.farmer2 && list2.get(1)!=JavaApplication2.farmer2  )
              { list.add(JavaApplication2.farmer2);    }
               if (s2.Intersects(r) && list2.get(0)!=JavaApplication2.farmer3  &&  list2.get(1)!=JavaApplication2.farmer3)
              { list.add(JavaApplication2.farmer3);         }
               if (s3.Intersects(r) && list2.get(0)!=JavaApplication2.farmer4 && list2.get(1)!=JavaApplication2.farmer5 )
              { list.add(JavaApplication2.farmer);             }
               if (s4.Intersects(r) && list2.get(0)!=JavaApplication2.farmer5 && list2.get(1)!=JavaApplication2.farmer5)
              { list.add(JavaApplication2.farmer5);         }
                //if (s5.Intersects(r) && list2.get(0)!=JavaApplication2.animal && list2.get(1)!=JavaApplication2.animal)
              //{ list.add(JavaApplication2.animal);         }
             //}
             
             
              if(list2.size()==1)
             { if (s1.Intersects(r) && list2.get(0)!=JavaApplication2.farmer2 )
              { list.add(JavaApplication2.farmer2);    }
               if (s2.Intersects(r) && list2.get(0)!=JavaApplication2.farmer3  )
              { list.add(JavaApplication2.farmer3);          }
               if (s3.Intersects(r) && list2.get(0)!=JavaApplication2.farmer4)
              { list.add(JavaApplication2.farmer4);       }
               if (s4.Intersects(r) && list2.get(0)!=JavaApplication2.farmer5)
              { list.add(JavaApplication2.farmer5);              }
               // if (s4.Intersects(r) && list2.get(0)!=JavaApplication2.animal)
              //{ list.add(JavaApplication2.animal);              }
             }
             }
              
         }
         else 
         {
               if (s1.Intersects(r) )   list.add(JavaApplication2.farmer2); 
               if (s2.Intersects(r) )   list.add(JavaApplication2.farmer3);
               if (s3.Intersects(r) )   list.add(JavaApplication2.farmer4);
               if (s4.Intersects(r) )   list.add(JavaApplication2.farmer5);
              // if (s4.Intersects(r) )   list.add(JavaApplication2.animal);
         }
         
          
          
             
        
          return list;
    
    }

    @Override
    public boolean isBoatOnTheLeftBank() {
        
       Rectangle2D r=new Rectangle2D(0,0,1000,1000);
       Rectangle2D r2=new Rectangle2D(1000,0,1000,1000);
        JavaApplication2 ap=new JavaApplication2();
       
       Sprite s2=JavaApplication2.farmer.farmer;
       
       
        
        
       if (s2.Intersects(r))
       {
           
           return true;
           
       }
       else
       {
            
            return false;
       }
       
        
        
        
            
    }
   
}
