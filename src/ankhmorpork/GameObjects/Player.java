/*
 * 
 */
package ankhmorpork.GameObjects;
import java.util.ArrayList;

import PresentationUtilityCommon.PresentationUtility;
import ankhmorpork.GameConstants.Constants;
import ankhmorpork.GameObjects.Cards.*;
// TODO: Auto-generated Javadoc
/**
 * The Class Player.
 */
public class Player {

	/** The player_id. */
	Integer player_id;
	
	/** The player_name. */
	String player_name;
	
	/** The player_active. */
	Boolean player_active;
	
	/** The player_color. */
	String player_color;
	
	/** The player_amount. */
	//Float player_amount;
	
	/** The player_personality_card_id. */
	Integer player_personality_card_id;
	
	/** The brown card list comma separated. */
	String brownCardListCommaSeparated;
	
	/** The green card list comma separated. */
	String greenCardListCommaSeparated;
	
	/** The city area cards list comma separated. */
	String cityAreaCardsListCommaSeparated;
	
	/** The personality card list comma separated. */
	String personalityCardListCommaSeparated;
	
	/** The lst minions. */
	public ArrayList<Minion> lstMinions = new ArrayList<Minion>();
	
	/** The lst buildings. */
	public ArrayList<Building> lstBuildings = new ArrayList<Building>();	
	
	/** The lst Green Cards. */
	public ArrayList<GreenCard> lstGreenCards = new ArrayList<GreenCard>();
	
	/** The lst BrownCards. */
	public ArrayList<BrownCard> lstBrownCards = new ArrayList<BrownCard>();
	
	/** The lst Personality Card. */
	public PersonalityCard PersonalityCard = new PersonalityCard();		
	
	/** The obj gold coin. */
	public Coins objGoldCoin = new Coins(Constants.GoldCoin());
	
	/** The obj silver coin. */
	public Coins objSilverCoin = new Coins(Constants.SilverCoin());
	
	//public ArrayList<Coins> lstGoldCoin = new ArrayList<Coins>();
	//public ArrayList<Coins> lstSilverCoin = new ArrayList<Coins>();
	
	/**
	 * Gets the brown card list comma separated.
	 *
	 * @return the brown card list comma separated
	 */
	public String getBrownCardListCommaSeparated() {
		return brownCardListCommaSeparated;
	}
	
	/**
	 * Sets the brown card list comma separated.
	 *
	 * @param brownCardListCommaSeparated the new brown card list comma separated
	 */
	public void setBrownCardListCommaSeparated(String brownCardListCommaSeparated) {
		this.brownCardListCommaSeparated = brownCardListCommaSeparated;
	}
	
	/**
	 * Gets the green card list comma separated.
	 *
	 * @return the green card list comma separated
	 */
	public String getGreenCardListCommaSeparated() {
		return greenCardListCommaSeparated;
	}
	
	/**
	 * Sets the green card list comma separated.
	 *
	 * @param greenCardListCommaSeparated the new green card list comma separated
	 */
	public void setGreenCardListCommaSeparated(String greenCardListCommaSeparated) {
		this.greenCardListCommaSeparated = greenCardListCommaSeparated;
	}
	
	/**
	 * Gets the city area cards list comma separated.
	 *
	 * @return the city area cards list comma separated
	 */
	public String getCityAreaCardsListCommaSeparated() {
		return cityAreaCardsListCommaSeparated;
	}
	
	/**
	 * Sets the city area cards list comma separated.
	 *
	 * @param cityAreaCardsListCommaSeparated the new city area cards list comma separated
	 */
	public void setCityAreaCardsListCommaSeparated(
			String cityAreaCardsListCommaSeparated) {
		this.cityAreaCardsListCommaSeparated = cityAreaCardsListCommaSeparated;
	}
	
	/**
	 * Gets the personality card list comma separated.
	 *
	 * @return the personality card list comma separated
	 */
	public String getPersonalityCardListCommaSeparated() {
		return personalityCardListCommaSeparated;
	}
	
	/**
	 * Sets the personality card list comma separated.
	 *
	 * @param personalityCardListCommaSeparated the new personality card list comma separated
	 */
	public void setPersonalityCardListCommaSeparated(
			String personalityCardListCommaSeparated) {
		this.personalityCardListCommaSeparated = personalityCardListCommaSeparated;
	}
	
	/**
	 * Gets the player_id.
	 *
	 * @return the player_id
	 */
	public Integer getPlayer_id() {
		return player_id;
	}
	
	/**
	 * Sets the player_id.
	 *
	 * @param player_id the new player_id
	 */
	public void setPlayer_id(Integer player_id) {
		this.player_id = player_id;
	}
	
	/**
	 * Gets the player_name.
	 *
	 * @return the player_name
	 */
	public String getPlayer_name() {
		return player_name;
	}
	
	/**
	 * Sets the player_name.
	 *
	 * @param player_name the new player_name
	 */
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	
	/**
	 * Gets the player_active.
	 *
	 * @return the player_active
	 */
	public Boolean getPlayer_active() {
		return player_active;
	}
	
	/**
	 * Sets the player_active.
	 *
	 * @param player_active the new player_active
	 */
	public void setPlayer_active(Boolean player_active) {
		this.player_active = player_active;
	}
	
	/**
	 * Gets the player_color.
	 *
	 * @return the player_color
	 */
	public String getPlayer_color() {
		return player_color;
	}
	
	/**
	 * Sets the player_color.
	 *
	 * @param player_color the new player_color
	 */
	public void setPlayer_color(String player_color) {
		this.player_color = player_color;
	}
	
	/**
	 * Gets the player_amount.
	 *
	 * @return the player_amount
	 */
//	public Float getPlayer_amount() {
//		return player_amount;
//	}
//	
	/**
	 * Sets the player_amount.
	 *
	 * @param player_amount the new player_amount
	 */
//	public void setPlayer_amount(Float player_amount) {
//		this.player_amount = player_amount;
//	}
	
	/**
	 * Gets the player_personality_card_id.
	 *
	 * @return the player_personality_card_id
	 */
	public Integer getPlayer_personality_card_id() {
		return player_personality_card_id;
	}
	
	/**
	 * Sets the player_personality_card_id.
	 *
	 * @param player_personality_card_id the new player_personality_card_id
	 */
	public void setPlayer_personality_card_id(Integer player_personality_card_id) {
		this.player_personality_card_id = player_personality_card_id;
	}
	
	//Get Total Amount with PLAYER
	 public int getPlayerAmount()
     {
             int iTotalAmount = 0;
             iTotalAmount = this.objGoldCoin.getCoin_Available()*this.objGoldCoin.getCoin_Val() + this.objSilverCoin.getCoin_Val()*this.objSilverCoin.getCoin_Available();
             return iTotalAmount;
     }
	
	//Constructor
	/**
	 * Instantiates a new player.
	 *
	 * @param PlayerID the player id
	 * @param PlayerName the player name
	 * @param PlayerColour the player colour
	 */
	public Player(Integer PlayerID, String PlayerName, String PlayerColour)
	{
		this.setPlayer_id(PlayerID);
		this.setPlayer_name(PlayerName);
		this.setPlayer_color(PlayerColour);
		this.setPlayer_active(true);
		
		//Create minions for this Player
		for(int i=1; i<=Constants.MinionsPerPlayer();i++)
		{
			Integer MinionID = 100*PlayerID + i;
			Integer BuildingID = MinionID;
			Integer AreaCode = 0;
			if(i<4)
			{
				if(i==1)
				{
					AreaCode=1;
				}
				else if(i==2)
				{
					AreaCode=5;
				}
				else if(i==3)
				{
					AreaCode=7;
				}
			}
			Minion objMinion = new Minion(MinionID,PlayerColour,AreaCode,PlayerID);
			this.lstMinions.add(objMinion);
			Building objBuilding = new Building(BuildingID,PlayerColour,0,PlayerID);
			this.lstBuildings.add(objBuilding);
		}

//		Coins GoldCoin = new Coins(Constants.GoldCoin());
//		this.lstGoldCoin.add(GoldCoin);
//		Coins SilverCoin = new Coins(Constants.SilverCoin());
//		this.lstSilverCoin.add(SilverCoin);
	
	}
	
	
	
	/**
	 * Instantiates a new player.
	 */
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
