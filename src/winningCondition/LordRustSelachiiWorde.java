package winningCondition;

import java.util.ArrayList;

import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.Cards.CityAreaCard;

public class LordRustSelachiiWorde implements WinningCondition {

	@Override
	public Boolean isWinner(int PlayerID) {
		int numberOfPlayers = Game.lstPlayers.size();
		ArrayList<CityAreaCard> lstCityAreaCard = Game.GetCityAreaCardByPlayerID(PlayerID);
		if (numberOfPlayers == 2)
			//Controlled Area
			return Boolean.TRUE;
	   else if (numberOfPlayers == 3)
	        //Controlled Area
		   return Boolean.TRUE;
	   else if (numberOfPlayers == 4)
	        //Controlled Area
		   return Boolean.TRUE;
	   return false;
	}

}
