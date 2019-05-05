
package javaapplication2;

import java.util.List;


public interface ICrossingStrategy {
    public boolean isValid(List<ICrosser> rightBankCrossers ,List<ICrosser> LeftBankCrossers,List<ICrosser> BoatRiders );
    public List<ICrosser> getInitialCrossers();
    public String[] getInstructions();
}
