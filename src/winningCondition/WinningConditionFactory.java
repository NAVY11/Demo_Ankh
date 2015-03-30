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

/**
 * Created with IntelliJ IDEA.
 * User: Mahdiye
 * Date: 2/24/15
 * Time: 3:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class WinningConditionFactory {
	
//	static int PlayerID = 0;
//	static PersonalityCard objPersonalityCard = Game.GetPersonalityCardByPlayerID(PlayerID);
	public static WinningCondition getWinningCircumstance(Player objPlayer) {
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