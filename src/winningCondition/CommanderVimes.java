package winningCondition;

import ankhmorpork.Game.Game;

// TODO: Auto-generated Javadoc
/**
 * The Class CommanderVimes.
 */
public class CommanderVimes implements WinningCondition {

	/* (non-Javadoc)
	 * @see winningCondition.WinningCondition#isWinner(int)
	 */
	@Override
	public Boolean isWinner(int PlayerID) {
		
		return Game.lstGreenCards.isEmpty();
		
	}

}
