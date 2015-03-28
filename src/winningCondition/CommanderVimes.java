package winningCondition;

import ankhmorpork.Game.Game;

public class CommanderVimes implements WinningCondition {

	@Override
	public Boolean isWinner(int PlayerID) {
		
		return Game.lstGreenCards.isEmpty();
		
	}

}
