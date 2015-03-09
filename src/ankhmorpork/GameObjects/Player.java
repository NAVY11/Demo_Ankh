/*
 * 
 */
package ankhmorpork.GameObjects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;

import PresentationUtilityCommon.PresentationUtility;
import ankhmorpork.Game.Game;
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
	
	//Get Active Minions List
	public String GetActiveMinions()
	{
		StringBuilder strActiveMinions = new StringBuilder();
		for(Minion objMinion : this.lstMinions)
		{
			if(objMinion.getActive()&& objMinion.getArea_id()!=0)
			{
				strActiveMinions.append(objMinion.getMinion_id() + ",");
			}
		}
		return strActiveMinions.toString();
	}
	
	//Method for Assassination
	public boolean Assassination(Player CurrentPlayer, Hashtable AreaTable) throws IOException
	{		
		boolean success = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Dispaly Areas with Trouble Makers
		System.out.println("Select an area to perform Assasination :");
		boolean TMOnBoard = false;
		StringBuilder sbValidAreas = new StringBuilder();
		for(TroubleMaker objTM : Game.lstTroubleMaker)
		{
			if(objTM.getArea_id()!=0 && objTM.getActive() && (HasOtherPlayersMinion(CurrentPlayer,objTM.getArea_id())||Game.AreaHasTroll(objTM.getArea_id())||Game.AreaHasDemon(objTM.getArea_id())))
			{
				//Display Areas which have Trouble Marker and Minion of other players
				TMOnBoard = true; //At least 1 Trouble marker is present on board
				sbValidAreas.append(objTM.getArea_id());
				System.out.println(objTM.getArea_id() + " : " + AreaTable.get(objTM.getArea_id()));
			}			
		}
		
		if(!TMOnBoard)
		{
			System.out.println("No Area contains a Trouble Marker. Thus Assassination cannot be performed.");
			return false;
		}
		else
		{
			//Read entered Area ID
			String AreaID = null;
			while(true)
			{				
				AreaID = br.readLine() ;
				String[] ValidAreas = sbValidAreas.toString().split(",");
				
				if(Game.ArrayHasElement(ValidAreas, AreaID))
				{					
					break;					
				}
				else
				{
					System.out.println("Enter a valid Area ID shown above.");
				}					
			}
			
			System.out.println("Select whom to assassinate:");
			ArrayList<Minion> Minions = GetOtherPlayersMinion(CurrentPlayer, Integer.parseInt(AreaID));
			ArrayList<Troll> Trolls = Game.GetTrollByAreaID(Integer.parseInt(AreaID));
			ArrayList<Demon> Demons = Game.GetDemonByAreaID(Integer.parseInt(AreaID));
			
			//Display Minions, Demons, Trolls which can be Assassinated
			if(!Minions.isEmpty())
			{
				System.out.println("Minions :");								
				for(Minion objMinion : Minions)
				{					
					System.out.print("ID : " + objMinion.getMinion_id() + " ");
				}
			}
			
			if(!Trolls.isEmpty())
			{
				System.out.println("Trolls :");
				for(Troll objTroll : Trolls)
				{
					System.out.print("ID : " + objTroll.getTroll_id() + " ");
				}
			}
			
			if(!Demons.isEmpty())
			{
				System.out.println("Demons :");
				for(Demon objDemon : Demons)
				{
					System.out.print("ID : " + objDemon.getDemon_id() + " ");
				}
			}
			System.out.println("Enter 'M' for Minion, 'D' for Demon, 'T' for Troll");
			String input = br.readLine();
			switch(input)
			{
			case "M" : success = AssassinateMinion(Minions);
			case "T" : success = AssassinateTroll(Trolls);
			case "D" : success = AssassinateDemon(Demons);
			default  : System.out.println("Incorrect input");
			}
		}
		
		return success;
	}	

	//Method to assassinate Minion
	public boolean AssassinateMinion(ArrayList<Minion> Minions) throws IOException
	{
		boolean success = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if(!Minions.isEmpty())
		{
			System.out.println("Minions :");								
			for(Minion objMinion : Minions)
			{				
				System.out.print("ID : " + objMinion.getMinion_id() + " ");
			}
			
			String MinionID = null;			
			while(true)
			{
				MinionID = br.readLine();
				for(Minion objMinion : Minions)
				{
					if(objMinion.getMinion_id().toString() == MinionID)
					{
						for(Minion GameMinion : Game.lstMinions)
						{
							if(GameMinion.getMinion_id().toString() == MinionID)
							{
								GameMinion.setActive(false);
								success = true;
							}
							
							if(success)
								break;
						}
						

						if(success)
							break;
					}
					else
					{
						System.out.println("Invalid Minion ID");
					}
					
				}
				
			}
		}
		else
		{
			System.out.print("No Minions found");
		}
		
		return success;
	}
	
	public boolean AssassinateTroll(ArrayList<Troll> Trolls) throws IOException
	{
		boolean success = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if(!Trolls.isEmpty())
		{
			System.out.println("Trolls :");								
			for(Troll objTroll : Trolls)
			{				
				System.out.print("ID : " + objTroll.getTroll_id() + " ");
			}
			
			String TrollID = null;			
			while(true)
			{
				TrollID = br.readLine();
				for(Troll objTroll : Trolls)
				{
					if(objTroll.getTroll_id().toString() == TrollID)
					{
						for(Troll GameTroll : Game.lstTrolls)
						{
							if(GameTroll.getTroll_id().toString() == TrollID)
							{
								GameTroll.setActive(false);
								success = true;
							}							
							if(success)
								break;
						}						
						if(success)
							break;
					}
					else
					{
						System.out.println("Invalid Troll ID");
					}
					
				}
				
			}
		}
		else
		{
			System.out.print("No Trolls found");
		}
		
		return success;
	}
	//Assassinate Demon
	public boolean AssassinateDemon(ArrayList<Demon> Demons) throws IOException
	{
		boolean success = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if(!Demons.isEmpty())
		{
			System.out.println("Demons :");								
			for(Demon objDemon : Demons)
			{				
				System.out.print("ID : " + objDemon.getDemon_id() + " ");
			}
			
			String DemonID = null;			
			while(true)
			{
				DemonID = br.readLine();
				for(Demon objDemon : Demons)
				{
					if(objDemon.getDemon_id().toString() == DemonID)
					{
						for(Demon GameDemon : Game.lstDemons)
						{
							if(GameDemon.getDemon_id().toString() == DemonID)
							{
								GameDemon.setActive(false);
								success = true;
							}							
							if(success)
								break;
						}						
						if(success)
							break;
					}
					else
					{
						System.out.println("Invalid Demon ID");
					}
					
				}
				
			}
		}
		else
		{
			System.out.print("No Demons found");
		}
		
		return success;
	}
	
	//Method to check if "other" Players have Minion in an Area
	public boolean HasOtherPlayersMinion(Player objPlayer, int AreaID)
	{
		boolean success = false;
		String ListOfMinions = Game.GetActiveMinionsStringByPlayerID(objPlayer.getPlayer_id());		
		ArrayList<Minion> Minions = Game.GetMinionsByAreaID(AreaID);
		for(Minion objMinion : Minions)
				{
					if(!(ListOfMinions.contains(objMinion.getMinion_id().toString())&&objMinion.getActive()))
					{
						success = true;
						break;
					}
				}
						
		return success;
	}
	//Method to check if "other" Players have Minion in an Area
	public ArrayList<Minion> GetOtherPlayersMinion(Player objPlayer, int AreaID)
	{
		ArrayList<Minion> MinionIDs = new ArrayList<Minion>();
		String ListOfMinions = Game.GetActiveMinionsStringByPlayerID(objPlayer.getPlayer_id());		
		ArrayList<Minion> Minions = Game.GetMinionsByAreaID(AreaID);
		for(Minion objMinion : Minions)
		{
			if(!(ListOfMinions.contains(objMinion.getMinion_id().toString())&&objMinion.getActive()))
			{
				MinionIDs.add(objMinion);						
			}
		}
				
		return MinionIDs;
	}
	
	
	
	
	
	
	
	
	
}
