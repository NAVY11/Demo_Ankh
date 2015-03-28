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
    	
//    	Player currentPlayer = null;
//        int totalProperty = 0;
//        for (Player player : BoardGame.playersInGame) {
//            if (player.getWinningCondition().equals(WinningCircumstancesFactory.PersonalityCards.get(5))) {
//                currentPlayer = player;
//                break;
//            }
//        }
//        if (currentPlayer != null && currentPlayer.getPlayerAreas() != null && !currentPlayer.getPlayerAreas().isEmpty()) {
//            for (Area area : currentPlayer.getPlayerAreas()) {
//                totalProperty += area.getCostOfArea();
//            }
//            totalProperty += currentPlayer.getPlayerAmount();
//            totalProperty -= 12 * currentPlayer.getPlayerLoan();
//        }
//        return totalProperty >= 50;
//    }
