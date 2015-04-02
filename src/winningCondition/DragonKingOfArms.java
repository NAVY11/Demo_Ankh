package winningCondition;

import java.util.ArrayList;

import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.TroubleMaker;

// TODO: Auto-generated Javadoc
/**
 * The Class DragonKingOfArms.
 */
public class DragonKingOfArms implements WinningCondition {

	/* (non-Javadoc)
	 * @see winningCondition.WinningCondition#isWinner(int)
	 */
	@Override
    public Boolean isWinner(int PlayerID) {
      
		int numberOfTroubleMarkers = 0;
        String troubleNotOnBoard = Game.GetTroubleMakerOnBoardAreaId();
        String[] trblemkrNtonbrd = troubleNotOnBoard.split(",");
        numberOfTroubleMarkers = trblemkrNtonbrd.length;
        if (numberOfTroubleMarkers >= 8)
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }

}
