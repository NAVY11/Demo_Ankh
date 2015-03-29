package winningCondition;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.Minion;
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

	static int PlayerID = 0;
	static PersonalityCard objPersonalityCard = Game.GetPersonalityCardByPlayerID(PlayerID);
	public static WinningCondition getWinningCircumstance(String PersonalityCard) {
		if ((objPersonalityCard.getName()).equals("LordVetinari"))
			return new LordVetinari();
//  	else if (personalityCardType.equals(PersonalityCards.get(1)) || personalityCardType.equals(PersonalityCards.get(3)) || personalityCardType.equals(PersonalityCards.get(7)))
  //   		return new LordSelRusWor();
		else if (objPersonalityCard.getName().equals("DragonKingOfArms"))
       		return new DragonKingOfArms();
		else if (objPersonalityCard.getName().equals("Chrysoprase"))
			return new Chrysoprase();
		else if (objPersonalityCard.getName().equals("CommanderVimes"))
			return new CommanderVimes();
		return null;
	}
}