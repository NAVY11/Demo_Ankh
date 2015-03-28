package winningCondition;

import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.Player;

public class Chrysoprase implements WinningCondition {

    @Override
    public Boolean isWinner(int PlayerID) {
    	Player p1 = Game.GetPlayer(PlayerID);
    	return true;
    }
}
 