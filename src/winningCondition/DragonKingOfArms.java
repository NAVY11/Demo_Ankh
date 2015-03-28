package winningCondition;

import java.util.ArrayList;

import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.TroubleMaker;

public class DragonKingOfArms implements WinningCondition {

	@Override
    public Boolean isWinner(int PlayerID) {
      
		int numberOfTroubleMarkers = 0;
        String troubleNotOnBoard = Game.GetTroubleMakerOnBoardAreaId();
        String[] S1 = troubleNotOnBoard.split(",");
        numberOfTroubleMarkers = S1.length;
        if (numberOfTroubleMarkers == 8)
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }

}
