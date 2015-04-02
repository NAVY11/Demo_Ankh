package winningCondition;

import java.util.ArrayList;

import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.Building;
import ankhmorpork.GameObjects.Minion;
import ankhmorpork.GameObjects.Player;
import ankhmorpork.GameObjects.Cards.CityAreaCard;

// TODO: Auto-generated Javadoc
/**
 * The Class LordVetinari.
 */
public class LordVetinari implements WinningCondition {

	/* (non-Javadoc)
	 * @see winningCondition.WinningCondition#isWinner(int)
	 */
	@Override
    public Boolean isWinner(int PlayerID) {
		int numberOfPlayers = Game.lstPlayers.size();
		Player objPlayer1 = Game.GetPlayer(PlayerID);
		int noOfcontrolledArea = ControlledArea(objPlayer1);
		if (numberOfPlayers == 2 && noOfcontrolledArea == 11)
           return Boolean.TRUE;
		else if (numberOfPlayers == 3 && noOfcontrolledArea == 10)
           return Boolean.TRUE;
		else if (numberOfPlayers == 4 && noOfcontrolledArea == 9)
           return Boolean.TRUE;
		else
           return Boolean.FALSE;
	}
	
	
	/**
	 * Controlled area.
	 *
	 * @param objPlayer the obj player
	 * @return the int
	 */
	private int ControlledArea(Player objPlayer)
	{
		int minionCounter = 0;
		ArrayList<Minion> lstOfMinion = Game.GetMinionsByPlayerID(objPlayer.getPlayer_id());
		for(Minion objMinion : lstOfMinion){
			if(objMinion.getArea_id() != 0){
				int areaId = objMinion.getArea_id();
				if(!Game.AreaHasDemon(areaId))
				{
					minionCounter++;
				}
			}
		}
		return minionCounter;
				
	}

}




