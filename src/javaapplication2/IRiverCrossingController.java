
package javaapplication2;

import java.util.List;


public interface IRiverCrossingController {
    public void newGame(ICrossingStrategy gamestrategy);
    public void resetgame();
    public String[] getInstructions();
    public List<ICrosser> getCrosserOnRight();
    public List<ICrosser> getCrosserOnLeft();
    public boolean isBoatOnTheLeftBank();
    
    
    
    
}
