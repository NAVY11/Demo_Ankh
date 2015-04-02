package winningCondition;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.Minion;
import ankhmorpork.GameObjects.Player;
import ankhmorpork.GameObjects.Cards.GreenCard;
import ankhmorpork.GameObjects.Cards.PersonalityCard;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating WinningCondition objects.
 */
public class WinningConditionFactory {
	
	/**
	 * Gets the winning condition.
	 *
	 * @param objPlayer the obj player
	 * @return the winning condition
	 */
	public static WinningCondition getWinningCondition(Player objPlayer) {
		int playeID = objPlayer.getPlayer_id();
		PersonalityCard objPersonalityCard = Game.GetPersonalityCardByPlayerID(playeID);
		if ((objPersonalityCard.getName()).equals("Lord Vetinari"))
			return new LordVetinari();
		else if ((objPersonalityCard.getName()).equals("Lord de Worde") || (objPersonalityCard.getName()).equals("Lord Selachii") || (objPersonalityCard.getName()).equals("Lord Rust"))
     		return new LordRustSelachiiWorde();
		else if (objPersonalityCard.getName().equals("Dragon King of Arms"))
       		return new DragonKingOfArms();
		else if (objPersonalityCard.getName().equals("Chrysoprase"))
			return new Chrysoprase();
		else if (objPersonalityCard.getName().equals("Commander Vimes"))
			return new CommanderVimes();
		return null;
	}
}