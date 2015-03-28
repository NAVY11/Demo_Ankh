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
  //	else if (personalityCardType.equals(PersonalityCards.get(5)))
   //   	return new Chrysoprase();
		else if (objPersonalityCard.getName().equals("CommanderVimes"))
      	return new CommanderVimes();
		return null;
}

	
//  public enum PersonalityCards {
//  LordDeWorde(1),
//  LordVetinari(2),
//  LordSelachii(3),
//  DragonKingOfArms(4),
//  Chrysoprase(5),
//  CommanderVimes(6),
//  LordRust(7);
	


//  private static final Map<Integer, String> lookup
//          = new HashMap<Integer, String>();
//
//  static {
//      for (PersonalityCards s : EnumSet.allOf(PersonalityCards.class))
//          lookup.put(s.getCode(), s.name());
//  }
//
//  private int code;
//
//  private PersonalityCards(int code) {
//      this.code = code;
//  }
//
//  public int getCode() {
//      return code;
//  }
//
//  public static String get(int code) {
//      return lookup.get(code);
//  }
//}

//public static WinningCondition getWinningCircumstance(String PersonalityCard) {
//  if (personalityCardType.equals(PersonalityCards.get(2)))
//      return new LordVetinari();
//  else if (personalityCardType.equals(PersonalityCards.get(1)) || personalityCardType.equals(PersonalityCards.get(3)) || personalityCardType.equals(PersonalityCards.get(7)))
//      return new LordSelRusWor();
//  else if (personalityCardType.equals(PersonalityCards.get(4)))
//      return new DragonKingOfArms();
//  else if (personalityCardType.equals(PersonalityCards.get(5)))
//      return new Chrysoprase();
//  else if (personalityCardType.equals(PersonalityCards.get(6)))
//      return new CommanderVimes();
//  return null;
//}

}