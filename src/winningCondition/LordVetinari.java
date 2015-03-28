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
//		int numberOfPlayers = BoardGame.playersInGame.size();
//        Player currentPlayer = null;
//        for (Player player : BoardGame.playersInGame) {
//            if (player.getWinningCondition().equals(WinningCircumstancesFactory.PersonalityCards.get(2))) {
//                currentPlayer = player;
//                break;
//            }
//        }
//        if (currentPlayer != null && currentPlayer.getPlayerAreas() != null && !currentPlayer.getPlayerAreas().isEmpty()) {
//            if (numberOfPlayers == 2 && calculateAreaOfPlayer(currentPlayer) == 11)
//                return Boolean.TRUE;
//            else if (numberOfPlayers == 3 && calculateAreaOfPlayer(currentPlayer) == 10)
//                return Boolean.TRUE;
//            else if (numberOfPlayers == 4 && calculateAreaOfPlayer(currentPlayer) == 9)
//                return Boolean.TRUE;
//            else
//                return Boolean.FALSE;
//        } else
//            return Boolean.FALSE;
//    }
//
//    private int calculateAreaOfPlayer(Player currentPlayer) {
//        int numberOfArea = 0;
//        for (Area area : currentPlayer.getPlayerAreas()) {
//            numberOfArea += area.getMinions();
//        }
//
//        return numberOfArea;
//    }



