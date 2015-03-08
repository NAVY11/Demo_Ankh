package ankhmorpork.Game;
import java.util.ArrayList;

import ankhmorpork.GameObjects.*;
import ankhmorpork.GameObjects.Cards.*;

public class Game {

	//private ArrayList<Area> lstArea = new ArrayList<Area>();
	public ArrayList<Demon> lstDemons = new ArrayList<Demon>();
	public ArrayList<Troll> lstTrolls = new ArrayList<Troll>();	
	public ArrayList<Player> lstPlayers = new ArrayList<Player>();
	public ArrayList<TroubleMaker> lstTroubleMaker = new ArrayList<TroubleMaker>();
	public ArrayList<CityAreaCard> lstCityAreaCards = new ArrayList<CityAreaCard>();
	public ArrayList<GreenCard> lstGreenCards = new ArrayList<GreenCard>();
	public ArrayList<BrownCard> lstBrownCards = new ArrayList<BrownCard>();
	public ArrayList<RandomEventCard> lstRandomEventCards = new ArrayList<RandomEventCard>();
	public ArrayList<PersonalityCard> lstPersonalityCard = new ArrayList<PersonalityCard>();
	public Bank GameBank = new Bank();

}
