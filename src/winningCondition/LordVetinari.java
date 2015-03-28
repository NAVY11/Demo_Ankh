package winningCondition;

import java.util.ArrayList;

import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.Player;
import ankhmorpork.GameObjects.Cards.CityAreaCard;

public class LordVetinari implements WinningCondition {

	@Override
    public Boolean isWinner(int PlayerID) {
		int numberOfPlayers = Game.lstPlayers.size();
		ArrayList<CityAreaCard> lstCityAreaCard = Game.GetCityAreaCardByPlayerID(PlayerID);
		if (numberOfPlayers == 2 && lstCityAreaCard.size() == 11)
           return Boolean.TRUE;
		else if (numberOfPlayers == 3 && lstCityAreaCard.size() == 10)
           return Boolean.TRUE;
		else if (numberOfPlayers == 4 && lstCityAreaCard.size() == 9)
           return Boolean.TRUE;
		else
           return Boolean.FALSE;
	}
}



