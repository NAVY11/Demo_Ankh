/*
 * 
 */
package ankhmorpork.GameObjects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import PresentationUtilityCommon.IConstants;
import PresentationUtilityCommon.PresentationUtility;
import ankhmorpork.Game.Game;
import ankhmorpork.GameConstants.Constants;
import ankhmorpork.GameObjects.Cards.BrownCard;
import ankhmorpork.GameObjects.Cards.CityAreaCard;
import ankhmorpork.GameObjects.Cards.GreenCard;
import ankhmorpork.GameObjects.Cards.PersonalityCard;
// TODO: Auto-generated Javadoc
/**
 * The Class Player.
 */
public class Player {

	@Override
	public String toString() {
		return "Player [player_id=" + player_id + ", player_name="
				+ player_name + ", player_active=" + player_active
				+ ", player_color=" + player_color + ", player_amount="
				+ player_amount + ", player_comments=" + player_comments
				+ ", player_personality_card_id=" + player_personality_card_id
				+ ", brownCardListCommaSeparated="
				+ brownCardListCommaSeparated
				+ ", greenCardListCommaSeparated="
				+ greenCardListCommaSeparated
				+ ", cityAreaCardsListCommaSeparated="
				+ cityAreaCardsListCommaSeparated
				+ ", personalityCardListCommaSeparated="
				+ personalityCardListCommaSeparated + ", objGoldCoin="
				+ objGoldCoin + ", objSilverCoin=" + objSilverCoin + "]";
	}
	/** The player_id. */
	Integer player_id;

	/** The player_name. */
	String player_name;

	/** The player_active. */
	Boolean player_active;

	/** The player_color. */
	String player_color;

	/** The player_amount. */
	Float player_amount;

	String player_comments;

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
	//	
	//	/** The lst minions. */
	//	public ArrayList<Minion> lstMinions = new ArrayList<Minion>();
	//	
	//	/** The lst buildings. */
	//	public ArrayList<Building> lstBuildings = new ArrayList<Building>();	
	//	
	//	/** The lst Green Cards. */
	//	public ArrayList<GreenCard> lstGreenCards = new ArrayList<GreenCard>();
	//	
	//	/** The lst BrownCards. */
	//	public ArrayList<BrownCard> lstBrownCards = new ArrayList<BrownCard>();
	//	
	//	/** The lst Personality Card. */
	//	public PersonalityCard PersonalityCard = new PersonalityCard();		
	//	
	/** The obj gold coin. */
	public Coins objGoldCoin = new Coins(Constants.GoldCoin());

	/** The obj silver coin. */
	public Coins objSilverCoin = new Coins(Constants.SilverCoin());

	//public ArrayList<Coins> lstGoldCoin = new ArrayList<Coins>();
	//public ArrayList<Coins> lstSilverCoin = new ArrayList<Coins>();

	private static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
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
	public Float getPlayer_amount() {
		return player_amount;
	}

	/**
	 * Sets the player_amount.
	 *
	 * @param player_amount the new player_amount
	 */
	public void setPlayer_amount(float player_amount) {
		this.player_amount = player_amount;
	}

	/**
	 * Gets the player_personality_card_id.
	 *
	 * @return the player_personality_card_id
	 */
	public Integer getPlayer_personality_card_id() {
		return player_personality_card_id;
	}

	public String getPlayer_comments() {
		return player_comments;
	}

	public void setPlayer_comments(String player_comments) {
		this.player_comments = player_comments;
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
		this.setPlayer_amount(getPlayerAmount());

		//		//Create minions for this Player
		//		for(int i=1; i<=Constants.MinionsPerPlayer();i++)
		//		{
		//			Integer MinionID = 100*PlayerID + i;
		//			Integer BuildingID = MinionID;
		//			Integer AreaCode = 0;
		//			if(i<4)
		//			{
		//				if(i==1)
		//				{
		//					AreaCode=1;
		//				}
		//				else if(i==2)
		//				{
		//					AreaCode=5;
		//				}
		//				else if(i==3)
		//				{
		//					AreaCode=7;
		//				}
		//			}
		//			Minion objMinion = new Minion(MinionID,PlayerColour,AreaCode,PlayerID);
		//			this.lstMinions.add(objMinion);
		//			Building objBuilding = new Building(BuildingID,PlayerColour,0,PlayerID);
		//			this.lstBuildings.add(objBuilding);
	}

	//		Coins GoldCoin = new Coins(Constants.GoldCoin());
	//		this.lstGoldCoin.add(GoldCoin);
	//		Coins SilverCoin = new Coins(Constants.SilverCoin());
	//		this.lstSilverCoin.add(SilverCoin);

	//	}



	/**
	 * Instantiates a new player.
	 */
	public Player() {
		// TODO Auto-generated constructor stub
	}

	//Get Active Minions List
	//	public String GetActiveMinions()
	//	{
	//		StringBuilder strActiveMinions = new StringBuilder();
	//		String activeMinionStr = "";
	//		for(Minion objMinion : this.lstMinions)
	//		{
	//			if(objMinion.getActive()&& objMinion.getArea_id()!=0)
	//			{
	//				strActiveMinions.append(objMinion.getMinion_id() + ",");
	//			}
	//		}
	//		activeMinionStr = strActiveMinions.toString();
	//		if(activeMinionStr.endsWith(",")){
	//			activeMinionStr = activeMinionStr.substring(0, activeMinionStr.length()-1);
	//		}
	//		return activeMinionStr;
	//	}
	//	
	//Method for Assassination
	/**
	 * Assassination.
	 *
	 * @return true, if successful
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public boolean Assassination() throws IOException
	{			
		String AreaID = null;
		boolean success = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Dispaly Areas with Trouble Makers
		System.out.println("Select an area to perform Assasination :");		
		boolean TMOnBoard = false;
		StringBuilder sbValidAreas = new StringBuilder();
		for(TroubleMaker objTM : Game.lstTroubleMaker)
		{
			if(objTM.getArea_id()!=0 && objTM.getActive() && (HasOtherPlayersMinion(this,objTM.getArea_id())||Game.AreaHasTroll(objTM.getArea_id())||Game.AreaHasDemon(objTM.getArea_id())))
			{
				//Display Areas which have Trouble Marker and Minion of other players
				TMOnBoard = true; //At least 1 Trouble marker is present on board
				sbValidAreas.append(objTM.getArea_id()+",");
				System.out.println(objTM.getArea_id() + " : " + PresentationUtility.getCityAreaCardNameById(objTM.getArea_id()));
			}			
		}

		if(!TMOnBoard)
		{
			System.out.println("No Area contains a Trouble Marker. Thus Assassination cannot be performed.");
			return false;
		}
		else
		{	
			if(sbValidAreas.length()!=0)
			{
				sbValidAreas.substring(0,sbValidAreas.length()-1);
			}
			while(true)
			{	
				System.out.println("Enter a valid Area ID");
				//Read entered Area ID
				AreaID = br.readLine() ;
				String[] ValidAreas = sbValidAreas.toString().split(",");				
				if(PresentationUtility.ArrayHasElement(ValidAreas, AreaID))
				{					
					break;					
				}
				else
				{
					System.out.println("Invalid Area. Please try again.");
				}					
			}

			System.out.println("Select whom to assassinate:");
			ArrayList<Minion> Minions = GetOtherPlayersMinion(this, Integer.parseInt(AreaID));
			ArrayList<Troll> Trolls = Game.GetTrollByAreaID(Integer.parseInt(AreaID));
			ArrayList<Demon> Demons = Game.GetDemonByAreaID(Integer.parseInt(AreaID));

			//Display Minions, Demons, Trolls which can be Assassinated
			if(!Minions.isEmpty())
			{
				System.out.print("Minions :");								
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
			boolean Break = false;
			while(true)
			{
				System.out.println("To assassinate Enter 'M' for Minion, 'D' for Demon, 'T' for Troll");
				String input = br.readLine();
				switch(input)
				{
				case "M" : if(AskForInterrupt()){if(GetInterrupter()){success = false; Break =true;}else{success = AssassinateMinion(Minions); Break = true;}}else{success = AssassinateMinion(Minions); Break = true;} break;						
				case "T" : if(AskForInterrupt()){if(GetInterrupter()){success = false; Break =true;}else{success = AssassinateTroll(Trolls); Break = true;}}else{success = AssassinateTroll(Trolls); Break = true;} break;
				case "D" : if(AskForInterrupt()){if(GetInterrupter()){success = false; Break =true;}else{success = AssassinateDemon(Demons); Break = true;}}else{success = AssassinateDemon(Demons); Break = true;}break;
				default  : System.out.println("Incorrect input. Please try again.");
				}
				if(Break)
				{
					break;
				}

			}
		}

		if(success)
		{
			RemoveTroubleMarker(Integer.parseInt(AreaID));
		}
		return success;
	}	

	private boolean GetInterrupter() {
		// TODO Auto-generated method stub
		return false;
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
				System.out.println("Enter a Minion ID to assassinate:");
				MinionID = br.readLine();
				for(Minion objMinion : Minions)
				{
					if(objMinion.getMinion_id().toString().equals(MinionID) )
					{
						for(Minion GameMinion : Game.lstMinions)
						{
							if(GameMinion.getMinion_id().toString().equals(MinionID))
							{
								GameMinion.setActive(false);
								GameMinion.setArea_id(0);								
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
				if(success)
					break;
			}
		}
		else
		{
			System.out.print("No Minions found");
		}
		if(success)
			System.out.println("Minion assassinated successfully");

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
					if(objTroll.getTroll_id().toString().equals(TrollID))
					{
						for(Troll GameTroll : Game.lstTrolls)
						{
							if(GameTroll.getTroll_id().toString().equals(TrollID))
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
				if(success)
					break;

			}
		}
		else
		{
			System.out.print("No Trolls found");
		}
		if(success)
			System.out.println("Troll assassinated successfully");
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
					if(objDemon.getDemon_id().toString().equals(DemonID) )
					{
						for(Demon GameDemon : Game.lstDemons)
						{
							if(GameDemon.getDemon_id().toString().equals(DemonID))
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

				if(success)
					break;

			}
		}
		else
		{
			System.out.print("No Demons found");
		}
		if(success)
			System.out.println("Demon assassinated successfully");
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

	//Method to ask user to remove One trouble marker
	public boolean UserRemoveOneTroubleMarker() throws IOException
	{
		System.out.println("Select an area to remove Trouble Marker");
		String strAreaList = Game.GetTroubleMakerOnBoardAreaId();
		String[] arryAreaList = strAreaList.split(",");
		for(int i = 0; i<arryAreaList.length;i++)
		{
			System.out.print(arryAreaList[i]+":"+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(arryAreaList[i])));
		}
		boolean Run = true;
		String ans = "";
		while(Run)
		{
			ans = BR.readLine();
			for(int i=0;i<arryAreaList.length;i++)
			{
				if(arryAreaList[i]==ans)
				{
					Run=false;
					break;
				}
			}
			if(Run)
			{
				System.out.println("Please enter valid ID");
			}
		}

		return RemoveTroubleMarker(Integer.parseInt(ans));

	}




	//Method to remove Trouble marker
	public boolean RemoveTroubleMarker(int AreaID)
	{
		boolean success = false;
		for(TroubleMaker TM : Game.lstTroubleMaker)
		{
			if(TM.getArea_id()== AreaID)
			{
				TM.setArea_id(0);
				success = true;
			}
		}
		if(success)
		{
			System.out.println("Trouble Marker was removed from "+PresentationUtility.getCityAreaCardNameById(AreaID));
		}

		return success;
	}

	//Method to ask for Interrupt
	private boolean AskForInterrupt()
	{
		boolean interrupt =false;
		boolean Break = false;
		String Answer = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Does any Player wish to interupt? Y/N");
		while(true)
		{
			try {
				Answer = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if(Answer.equalsIgnoreCase("N"))
			{
				interrupt = false;
				Break = true;
			}
			else if(Answer.equalsIgnoreCase("Y"))
			{
				interrupt = true;
				Break = true;
			}
			else
			{
				System.out.println("Incorrect input. Enter 'Y' for Yes or 'N' for No.");
			}
			if(Break)
				break;
		}

		return interrupt;
	}

	//Take money from bank
	public boolean TakeMoneyFromBank(String CardID)
	{
		int iAmount = PresentationUtility.howMuchMoneyToTakeFromBank(CardID);
		//this.
		return Game.PaymentFromBank(this.getPlayer_id(), iAmount);
	}
	//Player performs action
	public boolean PerformCardAction(String ActionID, String CardID) throws IOException
	{
		boolean success = false;
		if(ActionID.equalsIgnoreCase("Scroll"))
		{
			//this.theFireBrigadeFunctionality();
			//this.theZorgoTheRetroFunctionality();
			//this.mrBentFunctionality(CardID);
			switch(CardID)
			{
			case "g1" : return this.mrBoggisFunctionality();
			case "g2" : return this.mrBentFunctionality(CardID);
			case "g3" : return this.theBeggersGuildFunctionality();
			case "g4" : return this.mrBentFunctionality(CardID);
			case "g5" : return this.theAnkhMorporkSunshineDragonSanctuaryFunctionality();	
			case "g8" : return this.theDyskFunctionality();
			case "g9" : return this.theDuckmanFunctionality();
			case "g10" : return this.theDrumknottFunctionality();
			case "g11" : return this.theCMOTDibblerFunctionality();
			case "g14" : return this.theMrsCakeFunctionality();
			case "g19" : return this.theDuckmanFunctionality();
			case "g20" : return this.theFoolsGuildFunctionality(CardID);
			case "g21" : return this.theFireBrigadeFunctionality();
			case "g23" : return this.theHistoryMonksFunctionality();
			case "g24" : return this.DrawRandomCardsFromDeck(3); //Draw 3 random cards from Deck
			case "g25" : return this.theCMOTDibblerFunctionality();
			case "g26" : return this.theHarryKingOrShonkyShopFunctionality(CardID, 2);
			case "g30" : return this.theDyskFunctionality();
			case "g31" : return this.theNoobyNoobsFunctionality();
			case "g32" : return this.theModoFunctionality(CardID);
			case "g34" : return this.DrawRandomCardsFromDeck(4); //Draw 4 random cards from deck
			case "g35" : return this.DrawRandomCardsFromDeck(4);
			case "g36" : return this.theHarryKingOrShonkyShopFunctionality(CardID, 1);
			case "g37" : return this.theSacharissaCripslockFunctionality();
			case "g38" : return this.theRosiePalmFunctionality();
			case "g39" : return this.theDuckmanFunctionality();
			case "g41" : return this.theBeggersGuildFunctionality();
			case "g43" : return this.theZorgoTheRetroFunctionality();
			case "g44" : return this.theFoolsGuildFunctionality(CardID);
			case "g46" : return this.theRosiePalmFunctionality();
			case "g48" : return this.mrBoggisFunctionality();
			}
		}
		else
		{
			switch(ActionID)
			{
			case "Assassination" : return this.Assassination();
			case "Remove one trouble marker" : return this.UserRemoveOneTroubleMarker();
			case "Take money" : return this.TakeMoneyFromBank(CardID);
			case "Random Event" : this.randomCardToPlay(); 
			case "Play another card" : return this.PlayAnotherCard(CardID);
			//				case "Interrupt " : return 
			case "Place a Minion" : return this.placeAMinionFunctionality();
			case "Place a Building" : return this.placeABuildingFunctionality();
			case "No Action" : System.out.println("This card cannot be played."); return false;
			}
		}
		return success;			
	}

	//Green Card Functionalities
	//Play another card
	public boolean PlayAnotherCard(String OldCardID) throws IOException
	{
		//Set previously played card to Played
		Game.SetGreenCardIsPlayed(OldCardID, true);

		System.out.println("Player " + this.getPlayer_name()+" plays another card");
		System.out.println("Which card to play?");

		//Show available cards
		StringBuilder sbValidIDs = new StringBuilder();
		for(GreenCard grnCard: Game.lstGreenCards)
		{	
			if(grnCard.getPlayerID()==this.getPlayer_id() && !grnCard.GetIsPlayed())
			{
				sbValidIDs.append(grnCard.GetCardID());			
				System.out.println(grnCard.CardID + " : " + grnCard.getName());
			}
		}

		//Accept Card to play from Player
		String CardID = null;
		while(true)
		{
			System.out.println("Enter a valid Card ID");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			CardID = br.readLine().toString();
			if((sbValidIDs.toString()).contains(CardID))
			{
				break;
			}
		}
		//Which Action to perform?
		GreenCard grnCard = Game.GetGreenCard(CardID);
		String[] ActionArray = grnCard.GetAction();
		String ActionList = Game.GetGreenCardActions(CardID);
		System.out.println("Card " + grnCard.getName() + " has following actions :");
		System.out.println(ActionList);
		for(int i = 0; i<ActionArray.length; i++)
		{
			String ans = null;
			System.out.println("Do you wish to perform " + ActionArray[i] + " action? Y/N");
			while(true)
			{						
				ans = BR.readLine();
				if(ans.equalsIgnoreCase("Y") || ans.equalsIgnoreCase("N"))
				{
					break;
				}
				else
					System.out.println("Incorrect input. Please try again.");
			}

			if(ans.equalsIgnoreCase("Y"))
			{
				//Perform Action
				this.PerformCardAction(ActionArray[i], CardID);

			}
			else
				continue;
		}
		return true;
	}

	//Same Functionality of The Thieves' Guild
	//Take $2, if possible, from each player
	public boolean mrBoggisFunctionality(){
		//1st Action to read scroll & then to place minion
		boolean success = false;
		for(Player player : Game.lstPlayers){
			if(!(player.getPlayer_id() == this.getPlayer_id())){
				Game.PaymentPlayerToPlayer(this.getPlayer_id(), player.getPlayer_id(), 2);
				//				this.setPlayer_amount((float) (this.getPlayer_amount() != null ? this.getPlayer_amount() : 0) + 2);
				//				player.setPlayer_amount((float)(player.getPlayerAmount() - 2));
			}
			success = true;
		}
		return success;
	}

	// Same Functionality for The Bank of Ankh-Morpork
	public boolean mrBentFunctionality(String CardID){
		//1st Action to read scroll & then play another card
		boolean success = false;
		Game.PaymentFromBank(this.getPlayer_id(), 10);
		//		this.setPlayer_amount((float)(this.getPlayer_amount() != null ? this.getPlayer_amount() : 0) + 10);
		//		Game.GameBank.setBankAmount((float)Game.GameBank.getBankAmount() - 10);
		this.setPlayer_comments("You had played Mr. Bent/The Bank of AnkhMorpork You need to pay $12 back to Bank Or either you lose 15 points.");
		//Card placed in front of Bank 
		Game.SetGreenCardIsPlayed(CardID, true);
		success = true;
		return success;
	}

	public String removeOneCardFromCommaSeparatedString(String listOfCommaSeparatedCard, String whatToRemove){

		if(listOfCommaSeparatedCard.contains(whatToRemove)){
			if(listOfCommaSeparatedCard.contains(whatToRemove+",")){
				listOfCommaSeparatedCard.replace(whatToRemove+",", "");
			}else if(listOfCommaSeparatedCard.contains(","+whatToRemove)){
				listOfCommaSeparatedCard.replace(","+whatToRemove, "");
			}else if(listOfCommaSeparatedCard.contains(whatToRemove)){
				listOfCommaSeparatedCard.replace(whatToRemove, "");
			}
		}
		return listOfCommaSeparatedCard;
	}

	// Same Functionality for Queen Molly
	//Select one player. They must give you two cards of their choice
	public boolean theBeggersGuildFunctionality() throws IOException
	{
		//1st Action to read scroll & then play another card
		boolean success = false;
		String strPlayerIDs = ",";
		for(Player objPlayer : Game.lstPlayers)
		{
			if(objPlayer.getPlayer_id()!=this.getPlayer_id())
			{
				System.out.println(objPlayer.getPlayer_id()+" : " +objPlayer.getPlayer_name());
				strPlayerIDs+=objPlayer.getPlayer_id()+",";
			}
		}
		String strChosenPlayerID = PresentationUtility.GetValidAnswerFromUser(strPlayerIDs);
		Player objChosenPlayer = Game.GetPlayer(Integer.parseInt(strChosenPlayerID)); 
		System.out.println("Enter a card ID you wish to give to " + this.getPlayer_name());
		StringBuilder sbValidIDs = new StringBuilder();
		sbValidIDs.append(",");
		for(int i=0; i<2; i++)//For giving 2 Cards
		{
			System.out.println("Select Card : "+i);
			for(GreenCard grnCard: Game.lstGreenCards)
			{	
				if(grnCard.getPlayerID()==objChosenPlayer.getPlayer_id() && !grnCard.GetIsPlayed())
				{
					sbValidIDs.append(grnCard.GetCardID()+",");		
					String ActionList = Game.GetGreenCardActions(grnCard.GetCardID());
					System.out.printf("%-5s%-5s%-40s%-5s%-50s%-5s%-60s\n",grnCard.CardID ,  " : " ,  grnCard.getName() , " : " , ActionList," : ","Scroll Action : "+grnCard.GetActionDescription());
				}
			}

			String strGreenCardID = PresentationUtility.GetValidAnswerFromUser(sbValidIDs.toString());
			//Set Card to current Player
			success = Game.SetGreenCardToPlayer(strGreenCardID, this.getPlayer_id());
			System.out.println("Card assigned successfully!");
		}
		return success;
	}



	//	public boolean theBeggersGuildFunctionality() throws IOException{
	//		//1st Action to read scroll & then play another card
	//		boolean success = false;
	//		System.out.println("Enter playerId from whom you want two card : ");
	//		BufferedReader brPlayerBuff = new BufferedReader(new InputStreamReader(System.in));
	//		String brPlayer = brPlayerBuff.readLine();
	//		for(Player player : Game.lstPlayers){
	//			if(player.getPlayer_id() == Integer.parseInt(brPlayer.toString())){
	//				System.out.print("Enter one by one from the list of green card you have available : " + player.getGreenCardListCommaSeparated());
	//				BufferedReader brCard1Selected = new BufferedReader(new InputStreamReader(System.in));
	//				String brCard1SelectedReadLine = brCard1Selected.readLine();
	//				this.setGreenCardListCommaSeparated(this.getGreenCardListCommaSeparated() + "," +brCard1SelectedReadLine.toString());
	//				player.setGreenCardListCommaSeparated(removeOneCardFromCommaSeparatedString(player.getGreenCardListCommaSeparated(), brCard1Selected.toString()));
	//
	//				System.out.print("Enter 2nd card from the list of green card you have available : " + player.getGreenCardListCommaSeparated());
	//				BufferedReader brCard2Selected = new BufferedReader(new InputStreamReader(System.in));
	//				String brCard2SelectedReadLine = brCard1Selected.readLine();
	//				this.setGreenCardListCommaSeparated(this.getGreenCardListCommaSeparated() + "," +brCard2SelectedReadLine.toString());
	//				player.setGreenCardListCommaSeparated(removeOneCardFromCommaSeparatedString(player.getGreenCardListCommaSeparated(), brCard2Selected.toString()));
	//				return (success = true);
	//			}
	//		}
	//		return success;
	//	}

	//Each Player must give you either $1 or one of their cards
	public boolean theAnkhMorporkSunshineDragonSanctuaryFunctionality() throws IOException{
		//1st Action to read scroll & then play another card
		boolean success = false;
		for(Player objPlayer : Game.lstPlayers)
		{
			boolean payed = false;
			if(objPlayer.getPlayer_id()!=this.getPlayer_id())
			{
				System.out.println("Hello " + objPlayer.getPlayer_name()+", would you like to pay $1 to "+ this.getPlayer_name() +" or give "+ this.getPlayer_name()+" one of your cards");
				System.out.println("Enter '1' to pay $1 OR Enter '2' to give a Card");
				String ans = PresentationUtility.GetValidAnswerFromUser(",1,2,");
				if(ans.equals("1"))
				{
					if(Game.PaymentPlayerToPlayer(this.getPlayer_id(), objPlayer.getPlayer_id(), 1))
					{
						System.out.println("Payment was successful");
						payed = true;
						success = true;
					}
				}
				if(ans.equals("2")||!payed)
				{
					System.out.println("Enter a card ID you wish to give to " + this.getPlayer_name());
					StringBuilder sbValidIDs = new StringBuilder();
					sbValidIDs.append(",");
					for(GreenCard grnCard: Game.lstGreenCards)
					{	
						if(grnCard.getPlayerID()==objPlayer.getPlayer_id() && !grnCard.GetIsPlayed())
						{
							sbValidIDs.append(grnCard.GetCardID()+",");		
							String ActionList = Game.GetGreenCardActions(grnCard.GetCardID());
							System.out.printf("%-5s%-5s%-40s%-5s%-50s%-5s%-60s\n",grnCard.CardID ,  " : " ,  grnCard.getName() , " : " , ActionList," : ","Scroll Action : "+grnCard.GetActionDescription());
						}
					}					
					String strGreenCardID = PresentationUtility.GetValidAnswerFromUser(sbValidIDs.toString());
					//Set Card to current Player
					success = Game.SetGreenCardToPlayer(strGreenCardID, this.getPlayer_id());
					System.out.println("Card assigned successfully!");
				}
			}
		}
		return success;
	}



	//	public boolean theAnkhMorporkSunshineDragonSanctuaryFunctionality() throws IOException{
	//		//1st Action to read scroll & then play another card
	//		boolean success = false;
	//		for(Player player : Game.lstPlayers){
	//			if(!(this.getPlayer_id() == player.getPlayer_id())){
	//				System.out.println("Player " + player.getPlayer_id() + ": Select y to give $1 or n to give any one of your card : ");
	//				BufferedReader brGiveMoney = new BufferedReader(new InputStreamReader(System.in));
	//				String brGiveMoneyReadLine = brGiveMoney.readLine();
	//				if(brGiveMoneyReadLine.toString().equals("y") || brGiveMoneyReadLine.toString().equals("Y")){
	//					this.setPlayer_amount((float)(this.getPlayer_amount() != null ? this.getPlayer_amount() : 0) + 1);
	//					player.setPlayer_amount((float)player.getPlayer_amount() - 1);
	//				}else{
	//					System.out.print("Enter one by one from the list of green card you have available : " + player.getGreenCardListCommaSeparated());
	//					BufferedReader brCard1Selected = new BufferedReader(new InputStreamReader(System.in));
	//					String brCard1SelectedReadLine = brGiveMoney.readLine();
	//					this.setGreenCardListCommaSeparated(this.getGreenCardListCommaSeparated() + "," +brCard1SelectedReadLine.toString());
	//					player.setGreenCardListCommaSeparated(removeOneCardFromCommaSeparatedString(player.getGreenCardListCommaSeparated(), brCard1SelectedReadLine.toString()));
	//				}
	//			}
	//			success = true;
	//		}
	//		return success;
	//	}

	// Same Functionality for The Opera House
	public boolean theDyskFunctionality()
	{
		//Place a building & then read the scroll
		boolean success = false;
		int  count = 0;
		for(Minion minion : Game.lstMinions){
			if(minion.getArea_id() == IConstants.cityCardAreaId10){
				count += 1;
			}
			//			this.setPlayer_amount((float) (this.getPlayer_amount() != null ? this.getPlayer_amount() : 0) + (count*1) );
			//			success = true;
			success = Game.PaymentFromBank(this.getPlayer_id(), count);
		}
		return success;
	}

	//Foul Ole Ron & RinceWind has the same functionality
	//Move a minion belonging to another player from one area to an adjacent area
	public boolean theDuckmanFunctionality() throws IOException
	{
		//Read the scroll
		boolean success = false;
		//Get a comma separated list of Players having Minions on Board
		String strPlayerIDs = Game.GetPlayerIDsHavingMinionsOnBoard();
		//Remove current Player's ID from the List
		strPlayerIDs = strPlayerIDs.replace(","+this.getPlayer_id()+",", ",");
		//Display players having Minions on Board
		System.out.println("Choose a Player from following whose Minion you wish to move:");
		Game.DisplayPlayers(strPlayerIDs);
		String PlayerID = PresentationUtility.GetValidAnswerFromUser(strPlayerIDs);	
		Player objChosenPlayer = Game.GetPlayer(Integer.parseInt(PlayerID));
		ArrayList<Minion> objMinionList = Game.GetMinionsByPlayerID(Integer.parseInt(PlayerID));
		String strAreaList = ",";
		for(Minion objMinion : objMinionList)
		{
			if(objMinion.getArea_id()!=0)
			{
				if(!strAreaList.contains(","+objMinion.getArea_id()+","))
				{
					strAreaList+=objMinion.getArea_id()+",";
				}
			}
		}

		//Display Areas
		System.out.println(objChosenPlayer.getPlayer_name()+" has Minions in following Areas. Enter an Area ID from where you wish to move a Minion.");
		Game.DisplayAreas(strAreaList);
		String strAreaID = PresentationUtility.GetValidAnswerFromUser(strAreaList);
		String strAdjacentAreas = PresentationUtility.GetAdjacentAreas(Integer.parseInt(strAreaID));
		System.out.println("Following are the Areas Adjacent to "+ PresentationUtility.getCityAreaCardNameById(Integer.parseInt(strAreaID)));
		Game.DisplayAreas(strAdjacentAreas);
		System.out.println("Enter an Area ID where you wish to move the Minion");
		String strMoveToArea = PresentationUtility.GetValidAnswerFromUser(strAdjacentAreas);

		for(Minion objMinion : Game.lstMinions)
		{
			if(objMinion.getArea_id()==Integer.parseInt(strAreaID) && objMinion.getPlayer_id()==this.getPlayer_id())
			{
				objMinion.setArea_id(Integer.parseInt(strMoveToArea));
				//Handle Trouble Markers
				//Place or Remove Trouble Marker from Previous Area
				if(Game.AreaHasTroubleMarker(Integer.parseInt(strAreaID)))
				{
					Game.removeTroubleMarkerByAreaId(Integer.parseInt(strAreaID));							
					System.out.println("Trouble Marker was removed from : "+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(strAreaID)));													
				}
				else
				{
					PlaceATroubleMarkerInArea(Integer.parseInt(strAreaID));														
					System.out.println("Trouble Marker was placed in : "+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(strAreaID)));																				
				}

				//Place or Remove Trouble Marker from New Area
				if(Game.AreaHasTroubleMarker(Integer.parseInt(strMoveToArea)))
				{
					Game.removeTroubleMarkerByAreaId(Integer.parseInt(strMoveToArea));							
					System.out.println("Trouble Marker was removed from : "+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(strMoveToArea)));													
				}
				else
				{
					PlaceATroubleMarkerInArea(Integer.parseInt(strMoveToArea));														
					System.out.println("Trouble Marker was placed in : "+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(strMoveToArea)));																				
				}
				System.out.println("Minion moved successfully!");
				success = true;
				break;//Important to break as this should happen for 1 Minion Only
			}
		}


		return success;
	}



	//	public boolean theDuckmanFunctionality() throws IOException
	//	{
	//		//Read the scroll
	//		boolean success = false;
	//		Minion minionObj = null;
	//		System.out.println("Enter the minionId you wish to move of another player : ");
	//		BufferedReader brMinionIdBuff = new BufferedReader(new InputStreamReader(System.in));
	//		String brMinionId = brMinionIdBuff.readLine();
	//		System.out.println("Enter the areaId you wish to move of another player minion : ");
	//		BufferedReader brAreaIdBuf = new BufferedReader(new InputStreamReader(System.in));
	//		String brAreaId = brAreaIdBuf.readLine();
	//
	//		for(Minion minion : Game.lstMinions){
	//			if(minion.getMinion_id() == Integer.parseInt(brMinionId.toString())){
	//				minionObj = minion;
	//				break;
	//			}
	//		}
	//
	//		boolean checkWhetherMinionCanBeRemoved = PresentationUtility.canMinionBePlacedInAdjacentArea(minionObj.getPlayer_id(), Integer.parseInt(brMinionId.toString()), minionObj.getArea_id(), Integer.parseInt(brAreaId.toString()));
	//		if(checkWhetherMinionCanBeRemoved){
	//			minionObj.setArea_id(Integer.parseInt(brAreaId.toString()));
	//			success = true;
	//		}
	//		return success;
	//	}


	//********* TO be handelled************
	//Play any two other cards from your hand
	public boolean theDrumknottFunctionality() throws IOException{
		//Read the scroll
		boolean success = false;
		String selectCardToPlay = "";
		System.out.println("Do you want to continue? Please enter 'y' : ");
		BufferedReader brBuff = new BufferedReader(new InputStreamReader(System.in));
		String br = brBuff.readLine();
		if(br.toString().equals("y") || br.toString().equals("Y")){
			System.out.print("Enter one by one from the list of green card you have available : " + this.getGreenCardListCommaSeparated());
			BufferedReader brCard1SelectedBuff = new BufferedReader(new InputStreamReader(System.in));
			String brCard1Selected = brCard1SelectedBuff.readLine();
			selectCardToPlay = brCard1Selected.toString() + ",";

			BufferedReader brCard2SelectedBuff = new BufferedReader(new InputStreamReader(System.in));
			String brCard2Selected = brCard2SelectedBuff.readLine();
			selectCardToPlay = brCard2Selected.toString();
		}
		return success;
	}

	// Same functionality for Here'n'Now
	//Roll the die. On a roll of '7' or more you take $4 from the bank. On a roll of '1' you must pay $2 to the bank or remove one of your minions from the board. All other results have no effect
	public boolean theCMOTDibblerFunctionality() throws IOException
	{
		//Read the scroll
		boolean success = false;
		System.out.println("The Die has been rolled: ");						
		Integer rollingDiceNumber = PresentationUtility.returnRandomNumber(1, 12);
		System.out.println("It is a Roll of "+rollingDiceNumber+"!");
		if(rollingDiceNumber >= 7)
		{
			System.out.println("You get a payment of $4 from Bank.");
			Game.PaymentFromBank(this.getPlayer_id(),4);
			success = true;
		}
		else if(rollingDiceNumber == 1)
		{
			System.out.println("Enter '1' to Pay $2 to Bank or '2' to remove one of your Minion");
			String ans = PresentationUtility.GetValidAnswerFromUser(",1,2,");
			if(ans.equals("1"))
			{
				if(Game.PaymentToBank(this.getPlayer_id(),2))
				{
					success = true;
					System.out.println("Payment of $2 was made to Bank.");
				}
			}
			String strAreaList = ",";
			if(ans.equals("2")||!success)
			{
				//Remove a Minion of current Player from Board
				//Get Areas of all Minions on Board of the Player
				ArrayList<Minion> objMinionList = Game.GetMinionsByPlayerID(this.getPlayer_id());

				for(Minion objMinion : objMinionList)
				{
					if(objMinion.getArea_id()!=0)
					{
						if(!strAreaList.contains(","+objMinion.getArea_id()+","))
						{
							strAreaList+=objMinion.getArea_id()+",";
						}
					}
				}

				//Display Areas
				System.out.println("You have Minions in the following Areas. Enter Area ID from where you wish to remove a Minion.");
				Game.DisplayAreas(strAreaList);
				//Read Area ID from Player
				String strAreaID = PresentationUtility.GetValidAnswerFromUser(strAreaList);
				//Remove Building from that Area
				for(Minion objMinion : Game.lstMinions)
				{
					if(objMinion.getArea_id()==Integer.parseInt(strAreaID) && objMinion.getPlayer_id()==this.getPlayer_id())
					{
						//Remove Minion from Board
						objMinion.setArea_id(0);
						success = true;
						//Place or Remove Trouble Marker from Area
						if(Game.AreaHasTroubleMarker(Integer.parseInt(strAreaID)))
						{
							Game.removeTroubleMarkerByAreaId(Integer.parseInt(strAreaID));							
							System.out.println("Trouble Marker was removed from : "+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(strAreaID)));													
						}
						else
						{
							PlaceATroubleMarkerInArea(Integer.parseInt(strAreaID));														
							System.out.println("Trouble Marker was placed in : "+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(strAreaID)));																				
						}
						break;
					}
				}

			}				
		}
		else
		{
			System.out.println("This face value has no effect.");
			success = true;
		}

		return success;
	}

	//	public boolean theCMOTDibblerFunctionality() throws IOException{
	//		//Read the scroll
	//		boolean success = false;
	//		System.out.println("Enter 1 to roll the dice or 2 to remove your minion from the board : ");
	//		BufferedReader brChoiceBuff = new BufferedReader(new InputStreamReader(System.in));
	//		String brChoice = brChoiceBuff.readLine();
	//		if(brChoice.toString().equals("1")){
	//			Integer rollingDiceNumber = PresentationUtility.returnRandomNumber(1, 12);
	//			if(rollingDiceNumber >= 7){
	//				this.setPlayer_amount((float) (this.getPlayer_amount() != null ? this.getPlayer_amount() : 0) + 4);
	//				Game.GameBank.setBankAmount((float) Game.GameBank.getBankAmount() - 4);
	//				success = true;
	//			}else if(rollingDiceNumber == 1){
	//				this.setPlayer_amount((float) (this.getPlayer_amount() != null ? this.getPlayer_amount() : 0) - 2);
	//				Game.GameBank.setBankAmount((float) Game.GameBank.getBankAmount() + 2);
	//				success = true;
	//			}
	//		}else if(brChoice.toString().equals("2")){
	//			System.out.println("Enter the minionId to be removed from the board : ");
	//			BufferedReader brMinionIdToBeRemovedBuff = new BufferedReader(new InputStreamReader(System.in));
	//			String brMinionIdToBeRemoved = brMinionIdToBeRemovedBuff.readLine();
	//			for(Minion minion : Game.lstMinions){
	//				if(minion.getMinion_id() == Integer.parseInt(brMinionIdToBeRemoved.toString())){
	//					minion.setArea_id(0);
	//					success = true;
	//				}
	//			}
	//		}
	//		return success;
	//	}

	public boolean theMrsCakeFunctionality()
	{
		//Read the scroll
		boolean success = true;
		String nameOfPersonalityCardsCommaSeparated = "";
		for(PersonalityCard personalityCard : Game.lstPersonalityCard){
			nameOfPersonalityCardsCommaSeparated = personalityCard.GetPersonalityName() + ",";
		}
		if(nameOfPersonalityCardsCommaSeparated.endsWith(",")){
			nameOfPersonalityCardsCommaSeparated = nameOfPersonalityCardsCommaSeparated.substring(0, nameOfPersonalityCardsCommaSeparated.length()-1);
		}
		System.out.println("Personality Card which are not being used are: " + nameOfPersonalityCardsCommaSeparated );
		return success;
	}

	
	// Same Functionality of Dr WhiteFace
	//Select another player. If they do not give you $5 then place this card in front of them. This card now counts towards their hand size of five cards when they come to refill their hands. They cannot get rid of this card
	public boolean theFoolsGuildFunctionality(String CardID) throws IOException{
		boolean success = false;
		GreenCard grnCard = Game.GetGreenCard(CardID);
		//Get a List of Other Players
		String strOtherPlayersCommaSep = ",";
		for(Player objPlayer : Game.lstPlayers)
		{
			if(objPlayer.getPlayer_id()!=this.getPlayer_id())
			{
				strOtherPlayersCommaSep+=objPlayer.getPlayer_id()+",";
			}
		}
		//Display the other Players
		System.out.println("Choose a Player from whom you would like to take $5:");
		Game.DisplayPlayers(strOtherPlayersCommaSep);
		//Read User input
		String strChosenPlayerID = PresentationUtility.GetValidAnswerFromUser(strOtherPlayersCommaSep);
		Player objChosenPlayer = Game.GetPlayer(Integer.parseInt(strChosenPlayerID));
		//Ask the chosen Player if he wish to pay $5
		System.out.println("Hello, "+objChosenPlayer.getPlayer_name()+" do you wish to pay $5 to "+this.getPlayer_name()+"?(Y/N).");
		System.out.println("If you chose not to pay "+this.getPlayer_name()+" will palce 'The Fools Guild' card in front of you & you cannot get rid of it later.");
		String ans = PresentationUtility.GetValidAnswerFromUser(",Y,N,");
		//if YES make payment
		if(ans.equalsIgnoreCase("Y"))
		{
			if(Game.PaymentPlayerToPlayer(this.getPlayer_id(),objChosenPlayer.getPlayer_id(),5))
			{
				System.out.println("Payment made successfully");
				success = true;
			}

		}

		//if NO place the Card in front of the Chosen Player				
		if(ans.equalsIgnoreCase("N") || !success)
		{
			String[] strAction = {"No Action"};
			grnCard.SetAction(strAction);
			grnCard.setPlayerID(objChosenPlayer.getPlayer_id());
			grnCard.SetActionDescription("You cannot play this card.");
			System.out.println("Card palced in front of "+ objChosenPlayer.getPlayer_name());
			success = true;
		}
		return success;
	}
	//	public boolean theFoolsGuildFunctionality(String CardID) throws IOException{
	//		boolean success = false;
	//		GreenCard grnCard = Game.GetGreenCard(CardID);		
	//		System.out.println("Enter playerId from whom you want $5 : ");
	//		BufferedReader brPlayerBuff = new BufferedReader(new InputStreamReader(System.in));
	//		String brPlayer = brPlayerBuff.readLine();
	//		for(Player player : Game.lstPlayers){
	//			if(player.getPlayer_id() == Integer.parseInt(brPlayer.toString())){
	//				if(player.getPlayer_amount() > 5){
	//					player.setPlayer_amount(player.getPlayer_amount() - 5);
	//					this.setPlayer_amount((this.getPlayer_amount() != null ? this.getPlayer_amount() : 0) + 5);
	//					success = true;
	//					break;
	//				}else{
	//					
	//					//player.setPlayer_comments("Have to give back $5 to player " + this.getPlayer_id());
	//				}
	//			}
	//		}
	//		return success;
	//	}

	//Choose a player. If he does not pay you $5 you can remove one of this buildings from the board.
	public boolean theFireBrigadeFunctionality() throws IOException{
		//Read the scroll & play another card
		boolean success = false;
		//Get Players having Buildings on Board
		String strPlayersWithBuildingCommaSep = Game.GetPlayerIDsHavingBuildingsOnBoard();
		//Remove current player's ID from List as he cannot choose himself
		strPlayersWithBuildingCommaSep = strPlayersWithBuildingCommaSep.replace(","+this.getPlayer_id()+",",",");
		//Display the other Players
		System.out.println("Choose a Player from whom you would like to take $5:");
		Game.DisplayPlayers(strPlayersWithBuildingCommaSep);
		//Read User input
		String strChosenPlayerID = PresentationUtility.GetValidAnswerFromUser(strPlayersWithBuildingCommaSep);
		Player objChosenPlayer = Game.GetPlayer(Integer.parseInt(strChosenPlayerID));
		//Ask the chosen Player if he wish to pay $5
		System.out.println("Hello, "+objChosenPlayer.getPlayer_name()+" do you wish to pay $5 to "+this.getPlayer_name()+"?(Y/N) "+this.getPlayer_name()+" will remove one of your Building if you chose not to pay.");
		String ans = PresentationUtility.GetValidAnswerFromUser(",Y,N,");
		//if YES make payment
		if(ans.equalsIgnoreCase("Y"))
		{
			if(Game.PaymentPlayerToPlayer(this.getPlayer_id(),objChosenPlayer.getPlayer_id(),5))
			{
				System.out.println("Payment made successfully");
				success = true;
			}

		}

		//if NO ask current Player to remove on of the Buildings of the Chosen Player
		String strAreaList = ",";
		if(ans.equalsIgnoreCase("N") || !success)
		{
			//Get Areas of all buildings on Board of the chosen Player
			ArrayList<Building> objBuildingList = Game.GetBuildingsByPlayerID(objChosenPlayer.getPlayer_id());

			for(Building objBuilding : objBuildingList)
			{
				if(objBuilding.getArea_id()!=0)
				{
					if(!strAreaList.contains(","+objBuilding.getArea_id()+","))
					{
						strAreaList+=objBuilding.getArea_id()+",";
					}
				}
			}

			//Display Areas
			System.out.println(objChosenPlayer.getPlayer_name()+" has buildings in following Areas. Enter Area ID from where you wish to remove a Building.");
			Game.DisplayAreas(strAreaList);
			//Read Area ID from Player
			String strAreaID = PresentationUtility.GetValidAnswerFromUser(strAreaList);
			//Remove Building from that Area
			for(Building objBuilding : Game.lstBuildings)
			{
				if(objBuilding.getArea_id()==Integer.parseInt(strAreaID) && objBuilding.getPlayer_id()==objChosenPlayer.getPlayer_id())
				{
					//Remove Building from Board
					objBuilding.setArea_id(0);
					success = true;
					break;
				}
			}

		}		
		return success;
	}





	//	public boolean theFireBrigadeFunctionality() throws IOException{
	//		//Read the scroll & play another card
	//		boolean success = false;
	//		System.out.println("Enter 1 to give $5 or 2 to remove the building");;
	//		BufferedReader brChoiceBuff = new BufferedReader(new InputStreamReader(System.in));
	//		String brChoice = brChoiceBuff.readLine();
	//		if(brChoice.toString().equals("1")){
	//			System.out.println("Enter playerId from whom you want $5 : ");
	//			BufferedReader brPlayer = new BufferedReader(new InputStreamReader(System.in));
	//			for(Player player : Game.lstPlayers){
	//				if(player.getPlayer_id() == Integer.parseInt(brPlayer.toString())){
	//					if(player.getPlayer_amount() > 5){
	//						player.setPlayer_amount(player.getPlayer_amount() - 5);
	//						this.setPlayer_amount((this.getPlayer_amount() != null ? this.getPlayer_amount() : 0) + 5);
	//						success = true;
	//						break;
	//					}
	//				}
	//			}
	//			if(!(success)){
	//				System.out.println("Enter the minionId to be removed from the board : ");
	//				BufferedReader brMinionIdToBeRemovedBuff = new BufferedReader(new InputStreamReader(System.in));
	//				String brMinionIdToBeRemoved = brMinionIdToBeRemovedBuff.readLine();
	//				for(Minion minion : Game.lstMinions){
	//					if(minion.getMinion_id() == Integer.parseInt(brMinionIdToBeRemoved.toString())){
	//						minion.setArea_id(0);
	//						success = true;
	//					}
	//				}
	//			}
	//		}
	//		return success;
	//	}

	/* Have to implement functionality and keep track of the discarded cards as well*/
	//Take three cards from the deck
	//	public boolean theHexFunctionality(){
	//		//Read the scroll & play another card
	//		boolean success = false;
	//		for(int i = 1; i <=3; i++){
	//			if(Game.lstGreenCards.size() > (3-i+1)){
	//				int cardIndexNumber = PresentationUtility.returnRandomNumber(0, Game.lstGreenCards.size() -1);
	//				if(cardIndexNumber > 0){
	//					GreenCard cardToAdd = Game.lstGreenCards.get(cardIndexNumber);
	//					this.setGreenCardListCommaSeparated(this.getGreenCardListCommaSeparated()+","+cardToAdd);
	//					Game.lstGreenCards.remove(cardIndexNumber);
	//					success = true;
	//				}
	//			}
	//			success = true;
	//		}
	//		return success;
	//	}
	//Take $3 from a player of your choice	
	public boolean theNoobyNoobsFunctionality() throws IOException{
		boolean success = false;
		String strValidPlayerIDs = ","; 
		System.out.println("Enter Player ID from whom you wish to take $3 : ");
		for(Player objPlayer : Game.lstPlayers)
		{
			if(objPlayer.getPlayer_name() != this.getPlayer_name())
			{
				strValidPlayerIDs+=objPlayer.getPlayer_id()+",";
				System.out.println(objPlayer.getPlayer_id()+" : "+objPlayer.getPlayer_name());
			}
		}

		BufferedReader brPlayerBuff = new BufferedReader(new InputStreamReader(System.in));
		String brPlayerID = "";
		while(true)
		{
			brPlayerID = brPlayerBuff.readLine();
			if(strValidPlayerIDs.contains(","+brPlayerID+","))
			{
				break;
			}
			else
			{
				System.out.println("Please enter a valid Player ID listed above:");
			}

		}

		if(Game.PaymentPlayerToPlayer(this.getPlayer_id(), Integer.parseInt(brPlayerID),3))
		{
			System.out.println("Payment of $3 successful.");
			success = true;
		}
		return success;
	}

	//	public boolean theNoobyNoobsFunctionality() throws IOException{
	//		boolean success = false;
	//		System.out.println("Enter playerId from whom you want $3 : ");
	//		BufferedReader brPlayerBuff = new BufferedReader(new InputStreamReader(System.in));
	//		String brPlayer = brPlayerBuff.readLine();
	//		for(Player player : Game.lstPlayers){
	//			if(player.getPlayer_id() == Integer.parseInt(brPlayer.toString())){
	//				player.setPlayer_amount((float) player.getPlayer_amount() - 3);
	//				this.setPlayer_amount((float) this.getPlayerAmount() + 3);
	//				success = true;
	//			}
	//		}
	//		return success;
	//	}

	//Discard one card
	public boolean theModoFunctionality(String CardID) throws IOException
	{			
		boolean success = false;
		BufferedReader brPlayerBuff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please select a Green Card which you wish to Discard:");
		String strValidGreenCardList = ",";
		Game.SetGreenCardIsPlayed(CardID, true);
		ArrayList<GreenCard> GCList = Game.GetGreenCardByPlayerID(this.getPlayer_id());
		for(GreenCard grnCard : GCList)
		{			
			String ActionList = Game.GetGreenCardActions(grnCard.GetCardID());
			strValidGreenCardList+=grnCard.GetCardID()+",";
			System.out.printf("%-5s%-5s%-40s%-5s%-50s%-5s%-60s\n",grnCard.GetCardID() ,  " : " ,  grnCard.getName() , " : " , ActionList," : ","Scroll Action : "+grnCard.GetActionDescription());			
		}		

		String strGreenCardID = "";
		while(true)
		{
			strGreenCardID = brPlayerBuff.readLine();
			if(strValidGreenCardList.contains(","+strGreenCardID+","))
			{
				success = true;
				break;
			}
			else
			{
				System.out.println("Please enter a valid Green Card ID listed above:");
			}

		}
		Game.SetGreenCardIsPlayed(strGreenCardID, true);
		return success;
	}

	//	public boolean theModoFunctionality(){
	//		boolean success = false;
	//		System.out.println("Do you want to continue? Please enter 'y' : ");
	//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//		if(br.toString().equals("y") || br.toString().equals("Y")){
	//			System.out.println("Enter CardId which you want to discard from your Green Card : "+this.getGreenCardListCommaSeparated());
	//			BufferedReader brCardId = new BufferedReader(new InputStreamReader(System.in));
	//			this.setGreenCardListCommaSeparated(removeOneCardFromCommaSeparatedString(this.getGreenCardListCommaSeparated(), brCardId.toString()));
	//		}
	//		return success;
	//	}

	//Functionality for Leonard of Quirm & theLibrarianFunctionality -- Draw 4 Cards
	//theHexFunctionality -- Draw 3 Cards
	//Take four cards from the draw deck	
	public boolean DrawRandomCardsFromDeck(int NoOfCardsToDraw){
		//Read the scroll & play another card
		boolean success = false;
		for(int i=0; i<NoOfCardsToDraw;i++)
		{
			//Pick a GreenCardFromDeck
			String PickNewCardID = "";
			PickNewCardID = Game.GetRandomGreenCardFromDeck();
			if(PickNewCardID!="")
			{
				Game.SetGreenCardToPlayer(PickNewCardID, this.getPlayer_id());				
				success = true;
			}
		}
		if(success)
			System.out.println(this.getPlayer_name() + " picked up new Green Cards");
		return success;
	}


	//	public boolean theLibrarianFunctionality(){
	//		//Read the scroll & play another card
	//		boolean success = false;
	//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//		for(int i = 1; i <=4; i++){
	//			if(Game.lstGreenCards.size() > (4-i+1)){
	//				int cardIndexNumber = PresentationUtility.returnRandomNumber(0, Game.lstGreenCards.size() -1);
	//				if(cardIndexNumber > 0){
	//					GreenCard cardToAdd = Game.lstGreenCards.get(cardIndexNumber);
	//					this.setGreenCardListCommaSeparated(this.getGreenCardListCommaSeparated()+","+cardToAdd);
	//					Game.lstGreenCards.remove(cardIndexNumber);
	//					success = true;
	//				}
	//			}
	//			success = true;
	//		}
	//		return success;
	//	}


	//Earn $1 for each trouble maker on the board
	public boolean theSacharissaCripslockFunctionality()
	{
		//Read the scroll & play another card
		boolean success = true;
		int countMoneyToBeGivenToCurrentPlayer = 0;
		for(TroubleMaker troubleMaker : Game.lstTroubleMaker){
			if(troubleMaker.getActive() && troubleMaker.getArea_id() > 0){
				countMoneyToBeGivenToCurrentPlayer += 1;
			}
			//this.setPlayer_amount((float) this.getPlayerAmount() + (countMoneyToBeGivenToCurrentPlayer * 1));
			//Using Payment method

		}
		Game.PaymentFromBank(this.getPlayer_id(), countMoneyToBeGivenToCurrentPlayer);
		return success;
	}

	// Same functionality for The Seamstresses Guild
	//Choose one player. Given them one of your cards. They must give you $2 in return

	public boolean theRosiePalmFunctionality() throws IOException
	{
		//1st Action to read scroll & then play another card
		boolean success = false;
		String strValidPlayerNames = ","; 
		System.out.println("Enter Player ID to whom you wish to give one Green card : ");
		for(Player objPlayer : Game.lstPlayers)
		{
			if(objPlayer.getPlayer_name() != this.getPlayer_name())
			{
				strValidPlayerNames+=objPlayer.getPlayer_id()+",";
				System.out.println(objPlayer.getPlayer_id()+" : "+objPlayer.getPlayer_name());
			}
		}

		BufferedReader brPlayerBuff = new BufferedReader(new InputStreamReader(System.in));
		String brPlayerID = "";
		while(true)
		{
			brPlayerID = brPlayerBuff.readLine();
			if(strValidPlayerNames.contains(","+brPlayerID+","))
			{
				break;
			}
			else
			{
				System.out.println("Please enter a valid Player ID listed above:");
			}

		}

		System.out.println("Please select a Green Card which you wish to give:");
		String strValidGreenCardList = ",";
		//Game.SetGreenCardIsPlayed(CardID, true);
		ArrayList<GreenCard> GCList = Game.GetGreenCardByPlayerID(this.getPlayer_id());
		for(GreenCard grnCard : GCList)
		{			
			String ActionList = Game.GetGreenCardActions(grnCard.GetCardID());
			strValidGreenCardList+=grnCard.GetCardID()+",";
			System.out.printf("%-5s%-5s%-40s%-5s%-50s%-5s%-60s\n",grnCard.GetCardID() ,  " : " ,  grnCard.getName() , " : " , ActionList," : ","Scroll Action : "+grnCard.GetActionDescription());			
		}

		System.out.print("Please enter the Green Card ID which you wish to give:");

		String strGreenCardID = "";
		while(true)
		{
			strGreenCardID = brPlayerBuff.readLine();
			if(strValidGreenCardList.contains(","+strGreenCardID+","))
			{
				break;
			}
			else
			{
				System.out.println("Please enter a valid Green Card ID listed above:");
			}

		}
		//If payment is successful perform the Action
		if(Game.PaymentPlayerToPlayer(this.getPlayer_id(),Integer.parseInt(brPlayerID),2))//Payment of $2
		{
			for(GreenCard grnCard : Game.lstGreenCards)
			{	
				if(grnCard.GetCardID()==strGreenCardID)
				{
					grnCard.setPlayerID(Integer.parseInt(brPlayerID));//Assign the Green Card to mentioned Player
					success = true;
					System.out.println("Card assigned successfully. Payment made $2.");
					break;
				}
			}
		}

		return success;
	}


	//	public boolean theRosiePalmFunctionality() throws IOException{
	//		//1st Action to read scroll & then play another card
	//		boolean success = false;
	//		System.out.println("Enter playerId from whom you want to give $2 and give one card : ");
	//		BufferedReader brPlayerBuff = new BufferedReader(new InputStreamReader(System.in));
	//		String brPlayer = brPlayerBuff.readLine();
	//		for(Player player : Game.lstPlayers){
	//			if(player.getPlayer_id() == Integer.parseInt(brPlayer.toString())){
	//				System.out.print("Enter one by one from the list of green card you have available : " + this.getGreenCardListCommaSeparated());
	//				BufferedReader brCard1SelectedBuff = new BufferedReader(new InputStreamReader(System.in));
	//				String brCard1Selected = brCard1SelectedBuff.readLine();
	//				player.setGreenCardListCommaSeparated(player.getGreenCardListCommaSeparated() + "," +brCard1Selected.toString());
	//				this.setGreenCardListCommaSeparated(removeOneCardFromCommaSeparatedString(this.getGreenCardListCommaSeparated(), brCard1Selected.toString()));
	//
	//				player.setPlayer_amount((float) player.getPlayer_amount());
	//				this.setPlayer_amount((float) (this.getPlayer_amount() != null ? this.getPlayer_amount() : 0) + 2);
	//				return (success = true);
	//			}
	//		}
	//		return success;
	//	}


	//Functionality -- You may exchange your personality card with one drawn randomly from those not in use
	public boolean theZorgoTheRetroFunctionality()
	{
		//1st Action to read scroll & then play another card
		boolean success = false;
		String strPersonalityCard = ""; 
		for(PersonalityCard PC : Game.lstPersonalityCard)
		{
			if(PC.getPlayerID()==this.getPlayer_id())
			{
				strPersonalityCard = PC.GetCardID();
				PC.setPlayerID(0); //Take away the Crad from Player
				break;
			}
		}

		for(PersonalityCard PC : Game.lstPersonalityCard)
		{
			if(PC.getPlayerID()==0 && PC.GetCardID()!=strPersonalityCard)
			{				
				PC.setPlayerID(this.getPlayer_id()); //Assign an unused Card to Player
				System.out.println("Hi, "+ this.getPlayer_name()+" will now play as '" + PC.getName()+"'");
				success = true; 
				break;
			}
		}	
		return success;
	}

	//	public boolean theZorgoTheRetroFunctionality(){
	//		//1st Action to read scroll & then play another card
	//		boolean success = false;
	//		PersonalityCard personalityCard = new PersonalityCard();
	//		if(Game.lstPersonalityCard.size() > 0){
	//			int personalityCardIndexNumber = PresentationUtility.returnRandomNumber(0, Game.lstPersonalityCard.size() -1);
	//			PersonalityCard personalityCard1 = Game.lstPersonalityCard.get(personalityCardIndexNumber);
	//
	//			personalityCard.SetCardID(this.getPlayer_personality_card_id().toString());
	//			Game.lstPersonalityCard.add(personalityCard);
	//
	//			this.setPlayer_personality_card_id(Integer.parseInt(personalityCard1.GetCardID()));
	//
	//			Game.lstPersonalityCard.remove(personalityCardIndexNumber);
	//		}
	//		return success;
	//	}


	/*
	 * 
	 * USE Game.GetRandomGreenCardFromDeck(); instead of below Function	 

	public static String takeOneGreenCardFromDeck(Game Ankhmorpork){

		Integer cardIndexNumber = PresentationUtility.returnRandomNumber(1, Ankhmorpork.lstGreenCards.size());
		GreenCard greenCardAccessed = Ankhmorpork.lstGreenCards.get(cardIndexNumber);
		return greenCardAccessed.GetCardID();	

	}
	 */

	//Shuffle the discard pile and draw four cards randomly. Place the remaining cards back as the discard pile
	public boolean theHistoryMonksFunctionality() throws IOException
	{
		boolean success = false;
		int count=0;
		//Check whether discarded pile has at least four Green Cards
		for(GreenCard GC : Game.lstGreenCards)
		{
			if(GC.IsPlayed)
			{				
				count++;
				if(count == 4)
				{
					success = true;
					break;
				}
			}
		}
		//Check whether discarded pile has at least four Green Cards
		if(success)
		{
			count = 0;
			for(GreenCard GC : Game.lstGreenCards)
			{
				if(GC.IsPlayed)
				{
					GC.setPlayerID(this.getPlayer_id());
					GC.IsPlayed = false;
					count++;
					if(count == 4)
					{					
						break;
					}
				}
			}
		}
		return success;
	}
	//	public boolean theHistoryMonksFunctionality() throws IOException{
	//		boolean success = false;
	//	
	//		List<Integer> discardedPileofGreenCardArr = new ArrayList<Integer>();
	//		String discardedPileOfGreenCards = "";
	//		String cardInDeckOrWithPlayer = "";
	//		System.out.println("Do you want to continue? Please enter 'y' : ");
	//		BufferedReader brBuff = new BufferedReader(new InputStreamReader(System.in));
	//		String br = brBuff.readLine();
	//		if(br.toString().equals("y") || br.toString().equals("Y")){
	//			for(GreenCard greenCard : Game.lstGreenCards){
	//				cardInDeckOrWithPlayer += greenCard.GetCardID() + ",";
	//			}
	//
	//			for(Player greenCardToExtract : Game.lstPlayers){
	//				cardInDeckOrWithPlayer += greenCardToExtract.getGreenCardListCommaSeparated() + ",";
	//			}
	//
	//			if(cardInDeckOrWithPlayer.endsWith(",")){
	//				cardInDeckOrWithPlayer = cardInDeckOrWithPlayer.substring(0, cardInDeckOrWithPlayer.length() -1);
	//			}
	//
	//			char[] cardInDeckOrWithPlayerChar = cardInDeckOrWithPlayer.toCharArray();
	//			Arrays.sort(cardInDeckOrWithPlayerChar);
	//
	//			String[] greenCardsInGameStrArr = cardInDeckOrWithPlayerChar.toString().split(",");
	//
	//			ArrayList<String> greenCardsInGameArr  = new ArrayList<String>();
	//			for(String greenCardInGame : greenCardsInGameStrArr){
	//				greenCardsInGameArr.add(greenCardInGame);
	//			}
	//
	//			for(int i = 48; i <= 1; i--){
	//				if(!(greenCardsInGameArr.contains(i))){
	//					discardedPileofGreenCardArr.add(i);
	//				}
	//			}
	//			if(discardedPileofGreenCardArr.size() > 0){
	//				discardedPileOfGreenCards = discardedPileofGreenCardArr.toString().substring(0, 6);
	//			}
	//
	//			this.setGreenCardListCommaSeparated(this.getGreenCardListCommaSeparated() + "," +discardedPileOfGreenCards);
	//
	//		}
	//		return success;
	//	}

	//Discard as many cards as you wish and take $2 / $1 for each one discarded
	public boolean theHarryKingOrShonkyShopFunctionality(String CardID, int Amount) throws IOException
	{
		//1st Action to read scroll & then play another card
		boolean success = false;
		System.out.println("Do you want to continue? Please enter 'y' : ");
		BufferedReader brBuff = new BufferedReader(new InputStreamReader(System.in));
		String br = brBuff.readLine();
		if(br.toString().equals("y") || br.toString().equals("Y")){
			//Set Current card as 'Played'
			Game.SetGreenCardIsPlayed(CardID, true);
			ArrayList<GreenCard> GCList = Game.GetGreenCardByPlayerID(this.getPlayer_id());
			int iDiscardCount = 0;
			for(GreenCard grnCard : GCList)
			{
				while(true)
				{
					String ActionList = Game.GetGreenCardActions(grnCard.GetCardID());
					System.out.print("Do you want to discard below Card :(Y/N) ");
					System.out.printf("%-5s%-5s%-40s%-5s%-50s%-5s%-60s\n",grnCard.CardID ,  " : " ,  grnCard.getName() , " : " , ActionList," : ","Scroll Action : "+grnCard.GetActionDescription());
					BufferedReader brCard1SelectedBuff = new BufferedReader(new InputStreamReader(System.in));
					String Input = brCard1SelectedBuff.readLine();
					if(Input.equalsIgnoreCase("Y"))
					{
						//Discard Card -- Set isPlayed to true
						Game.SetGreenCardIsPlayed(grnCard.GetCardID(), true);
						iDiscardCount++;
						success = true;
						break;
					}
					else if(Input.equalsIgnoreCase("N"))
					{
						success = true;
						break;
					}
					else
					{
						System.out.print("Invalid Input. Please try again.");
					}
				}
			}

			if(iDiscardCount>0)
			{
				//Make payment to Player
				Game.PaymentFromBank(this.getPlayer_id(), iDiscardCount*Amount);
				success = true;
			}			
		}
		return success;
	}

	//	public boolean theShonkyShopFunctionality() throws IOException{
	//		//1st Action to read scroll & then play another card
	//		boolean success = false;
	//		System.out.println("Do you want to continue? Please enter 'y' : ");
	//		BufferedReader brBuff = new BufferedReader(new InputStreamReader(System.in));
	//		String br = brBuff.readLine();
	//		if(br.toString().equals("y") || br.toString().equals("Y")){
	//			System.out.print("You have these green cards available : " + this.getGreenCardListCommaSeparated());
	//			String[] playerGreenCardArr = this.getGreenCardListCommaSeparated().split(",");
	//			for(int i = 0; i < playerGreenCardArr.length; i++){
	//				System.out.print("Do you want to discard Card Number : " + playerGreenCardArr[i]);
	//				BufferedReader brCard1SelectedBuff = new BufferedReader(new InputStreamReader(System.in));
	//				String brCard1Selected = brCard1SelectedBuff.readLine();
	//				if(brCard1Selected.toString().endsWith("y") || brCard1Selected.toString().endsWith("Y")){
	//					this.setGreenCardListCommaSeparated(removeOneCardFromCommaSeparatedString(this.getGreenCardListCommaSeparated(), playerGreenCardArr[i].toString()));
	//					this.setPlayer_amount((float) this.getPlayer_amount() + 1);
	//				}
	//			}
	//		}
	//		return success;
	//	}

	/**
	 * Place a minion functionality.
	 *
	 * @return true, if successful
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public boolean placeAMinionFunctionality() throws IOException
	{
		boolean success =false;
		String placingAMinionStr = "";
		placingAMinionStr = Game.GetMinionIDsNotOnBoard(this.getPlayer_id());
		//Check whether the Player has unused Minions in hand
		if(!placingAMinionStr.isEmpty())
		{	
			//System.out.println("You are allowed to place these minions which are not on board : " + placingAMinionStr);
			System.out.println("Enter a area in which you want to keep the minion : ");
			String AreaList = Game.GetValidAreasToPlaceMinion(this.getPlayer_id());//"1,2,3,4,5,6,7,8,9,10,11,12";//Game.AreaWithNoMinion();
			//System.out.println(AreaList);
			Game.DisplayAreas(AreaList);
			BufferedReader brBuff = new BufferedReader(new InputStreamReader(System.in));
			String br = brBuff.readLine();
			System.out.println(br);
			System.out.println(placingAMinionStr);
			if(AreaList.contains(br))
			{
				Minion objMinion = Game.GetMinionsByMinionID(Integer.parseInt(placingAMinionStr.substring(0,3)));
				objMinion.setArea_id(Integer.parseInt(br.toString()));										
				//Place or Remove Trouble Marker on Addition of Minion
				if(Game.AreaHasMinion(Integer.parseInt(br)))
				{						
					Game.SetMinion(objMinion);
					System.out.println(this.getPlayer_name()+"'s Minion was palced in "+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(br)));
					success = true;

					if(Game.AreaHasTroubleMarker(Integer.parseInt(br)))
					{
						Game.removeTroubleMarkerByAreaId(Integer.parseInt(br));							
						System.out.println("Trouble Marker was removed from : "+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(br)));													
					}
					else
					{
						PlaceATroubleMarkerInArea(Integer.parseInt(br));														
						System.out.println("Trouble Marker was placed in : "+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(br)));																				
					}

				}
				else
				{
					//Area has no minion previously so Trouble Marker won't come in picture 
					Game.SetMinion(objMinion);
					System.out.println(this.getPlayer_name()+"'s Minion was palced in "+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(br)));
					success = true;
				}
			}
		}
		//If the Player has no Minions in hand(All his Minions are on Board)
		else
		{
			//Ask the Player to move a Minion from existing areas having Minion
			System.out.println("You do not have a Minion in Hand!");
			System.out.println("Do you wish to move a Minion on Board?(Y/N)");
			String ans = PresentationUtility.GetValidAnswerFromUser(",Y,N,");
			if(ans.equalsIgnoreCase("Y"))
			{
				System.out.println("Enter the Area ID from which you wish to move the Minion:");
				String strAreasHavingPlayerMinions = Game.GetAreasHavingMinionOfPlayer(this.getPlayer_id());
				Game.DisplayAreas(strAreasHavingPlayerMinions);
				String strMoveFromArea = PresentationUtility.GetValidAnswerFromUser(strAreasHavingPlayerMinions);
				String strAdjcentAreas = PresentationUtility.GetAdjacentAreas(Integer.parseInt(strMoveFromArea));
				System.out.println("Minion can be moved to following adjacent areas:");
				Game.DisplayAreas(strAdjcentAreas);
				System.out.println("Enter the Area ID where you wish to move the Minion:");
				String strMoveToArea = PresentationUtility.GetValidAnswerFromUser(strAdjcentAreas);
				Minion objMinion = Game.GetPlayerMinionFromArea(this.getPlayer_id(), Integer.parseInt(strMoveFromArea));
				//Place/Remove Trouble marker from area from where Minion is removed
				if(Game.AreaHasTroubleMarker(Integer.parseInt(strMoveFromArea)))
				{
					Game.removeTroubleMarkerByAreaId(Integer.parseInt(strMoveFromArea));							
					System.out.println("Trouble Marker was removed from : "+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(strMoveFromArea)));													
				}
				else
				{
					PlaceATroubleMarkerInArea(Integer.parseInt(strMoveFromArea));														
					System.out.println("Trouble Marker was placed in : " + PresentationUtility.getCityAreaCardNameById(Integer.parseInt(strMoveFromArea)));																				
				}
				//Place/Remove a Trouble marker where Minion is placed
				if(Game.AreaHasMinion(Integer.parseInt(strMoveToArea)))
				{
					//Set Minion Area
					objMinion.setArea_id(Integer.parseInt(strMoveToArea));
					Game.SetMinion(objMinion);
					//Adjust Trouble MArker
					if(Game.AreaHasTroubleMarker(Integer.parseInt(strMoveToArea)))
					{
						Game.removeTroubleMarkerByAreaId(Integer.parseInt(strMoveToArea));							
						System.out.println("Trouble Marker was removed From : "+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(strMoveToArea)));													
					}
					else
					{
						PlaceATroubleMarkerInArea(Integer.parseInt(strMoveToArea));														
						System.out.println("Trouble Marker was placed in : " + PresentationUtility.getCityAreaCardNameById(Integer.parseInt(strMoveToArea)));																				
					}
				}
				else
				{
					//Set Minion in Game List
					objMinion.setArea_id(Integer.parseInt(strMoveToArea));
					Game.SetMinion(objMinion);
				}
			}
			else
			{
				System.out.println("'Place a Minion' action was not performed!");
				success = false;
			}
		}
		return success;
	}

	/**
	 * Place a building functionality.
	 *
	 * @return true, if successful
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public boolean placeABuildingFunctionality() throws IOException{
		boolean success = false;	
		String placingABuidingStr = "";
		//for(Building buildingObj : Game.lstBuildings)
		//{
		placingABuidingStr = Game.GetBuildingIDsNotOnBoard(this.getPlayer_id());
		if(!placingABuidingStr.isEmpty())
		{
			//System.out.println("You are allowed to place these buildings which are not on board : " + placingABuidingStr);

			//Get Valid Areas where current Player can place a building
			String AreaList = Game.GetValidAreasToPlaceBuilding(this.getPlayer_id());
			if(!AreaList.isEmpty())
			{
				System.out.println("Enter an area in which you want to keep the building  : ");
				System.out.println(AreaList);
				BufferedReader brBuff = new BufferedReader(new InputStreamReader(System.in));
				String br = brBuff.readLine();
				if(AreaList.contains(br))
				{
					Building objBuilding = Game.GetBuildingsByBuildingID(Integer.parseInt(placingABuidingStr.substring(0,3)));
					objBuilding.setArea_id(Integer.parseInt(br.toString()));
					CityAreaCard CityAreaCard = Game.GetCityAreaCardByCardID("c"+br);
					if(Game.PaymentToBank(this.getPlayer_id(), CityAreaCard.GetCost()))
					{
						//Update Building list in Game class
						Game.SetBuilding(objBuilding);
						//Update City Area Card list in Game class
						Game.SetCityAreaCard(CityAreaCard);
						System.out.println("Building placed successfully. Amount deducted "+CityAreaCard.GetCost());
						System.out.println("Player available amount : " + this.getPlayer_amount());
						System.out.println("Bank available amount : " + Game.GameBank.getBankAmount());
					}
					else
					{
						System.out.println("You do not have sufficient funds");
					}

					success=true;
					//Perform check on area id -- to do					
				}
				else
				{
					System.out.println("Incorrect Area ID. Please try again.");
					success = false;
				}

			}
			else
			{
				System.out.println("No Area available to place Building");				
				success = false;
			}
		}
		else
		{			
			System.out.println("You do not have a building piece to place.");
			success = false;
		}
		//}
		return success;
	}


	public boolean PlaceATroubleMarkerInArea(int AreaID)
	{
		boolean success = false;
		for(TroubleMaker TM : Game.lstTroubleMaker)
		{
			if(TM.getArea_id()==0)
			{
				TM.setArea_id(AreaID);
				success = true;
				break;
			}
		}
		return success;
	}
	/**
	 * Perform city area action.
	 *
	 * @param cityAreaId the city area id
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void performCityAreaAction(String cityAreaId) throws IOException{
		CityAreaCard cityAreaCard = new CityAreaCard();
		switch(cityAreaId)
		{
		case "c6" : cityAreaCard.TheHippoAction(this);
		case "c5" : cityAreaCard.TheScoursAction(this);
		case "c4" : cityAreaCard.SmallGodsAction(this);
		case "c3" : cityAreaCard.DragonLandingAction(this);
		case "c2" : cityAreaCard.UnrealEstate(this);
		case "c1" : cityAreaCard.DollySisterAction(this);
		case "c7" : cityAreaCard.TheShadesAction(this);
		case "c8" : cityAreaCard.DimwellAction(this);
		case "c9" : cityAreaCard.LongwallAction(this);
		case "c10" : cityAreaCard.IsleOfGodsAction(this);
		case "c11" : cityAreaCard.SevenSleepersAction(this);
		case "c12" : cityAreaCard.NapHillAction(this);
		}
	}
	
	public void randomCardToPlay(){
		String[] randomCardToSelect = new String[]{"2","4","6","9","10","11"};
		System.out.println("Rolling Dice ");
		Integer randomNumber = PresentationUtility.returnRandomNumber(1, randomCardToSelect.length);
		String randomCardNumberSelected = randomCardToSelect[randomNumber == randomCardToSelect.length ? randomNumber -1 : randomNumber];
		int randomCardNumberSelectedInt = Integer.parseInt(randomCardNumberSelected);
		String randomEventCardName = PresentationUtility.getRandomEventCardNameById(randomCardNumberSelectedInt);
		System.out.println("Random Event Card Selected by Rolling Dice : "+randomEventCardName);
		switch(randomCardNumberSelectedInt){
		case 2 : randomEventFog();
		case 4 : randomEventRiots();
		case 6 : randomEventTrolls();
		case 9 : randomEventTheDragon();
		case 10 : randomEventEarthquake();
		case 11 : randomEventExplosion();
		}
	}
	
	public void randomEventFog(){
		for(int i = 1; i <=5; i++){
			String pickNewCardID = Game.GetRandomGreenCardFromDeck();
			String cardName = PresentationUtility.getGreenCardNameById(Integer.parseInt(pickNewCardID));
			System.out.println("Card picked : "+cardName);
			for(GreenCard greenCard : Game.lstGreenCards){
				if(greenCard.GetCardID().equals(pickNewCardID)){
					greenCard.SetIsPlayed(true);
					System.out.println(cardName + "discarded");
				}
			}
		}
	}
	
	public void randomEventRiots(){
		Integer count = 0;
		System.out.println("Have patience, checking Riots Random Event Card");
		try {
			System.getProperties().wait(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(TroubleMaker troubleMaker : Game.lstTroubleMaker){
			if(troubleMaker.getArea_id() > 1){
				count++;
			}
		}
		if(count > 8){
			System.out.println("There were more than 8 Trouble Makers on Board. Game will end now... ");
			try {
				System.getProperties().wait(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.exit(0);
		}else{
			System.out.println("Your card went wasted because there weren't 8 or more Trouble Makers on board. ");
		}
	}
	
	public void randomEventTrolls(){
		for(int i = 1; i <=3; i++){
			System.out.println("Rolling Dice ");
			Integer randomNumber = PresentationUtility.returnRandomNumber(1, 12);
			System.out.println("Dice Value : " + randomNumber);
			for(Troll troll : Game.lstTrolls){
				if(troll.getArea_id() == 0){
					troll.setArea_id(randomNumber);
					System.out.println("Troll place in "+PresentationUtility.getCityAreaCardNameById(randomNumber));
				}
			}
		}
	}
	
	public void randomEventTheDragon(){
		System.out.println("Rolling Dice ");
		Integer randomNumber = PresentationUtility.returnRandomNumber(1, 12);
		System.out.println("Dice Value : " + randomNumber);
		for(Building building : Game.lstBuildings){
			if(building.getArea_id() == randomNumber){
				building.setArea_id(0);
			}
		}
		System.out.println("Building(s) Successfully Removed from Area : " + PresentationUtility.getCityAreaCardNameById(randomNumber));
		
		for(Demon demon : Game.lstDemons){
			if(demon.getArea_id() == randomNumber){
				demon.setArea_id(0);
			}
		}
		System.out.println("Demon(s) Successfully Removed from Area : " + PresentationUtility.getCityAreaCardNameById(randomNumber));
		
		for(Minion minion : Game.lstMinions){
			if(minion.getArea_id() == randomNumber){
				minion.setArea_id(0);
			}
		}
		System.out.println("Minion(s) Successfully Removed from Area : " + PresentationUtility.getCityAreaCardNameById(randomNumber));
		
		for(Troll troll : Game.lstTrolls){
			if(troll.getArea_id() == randomNumber){
				troll.setArea_id(0);
			}
		}
		System.out.println("Troll(s) Successfully Removed from Area : " + PresentationUtility.getCityAreaCardNameById(randomNumber));
		
		for(TroubleMaker troubleMaker : Game.lstTroubleMaker){
			if(troubleMaker.getArea_id() == randomNumber){
				troubleMaker.setArea_id(0);
			}
		}
		System.out.println("TroubleMaker(s) Successfully Removed from Area : " + PresentationUtility.getCityAreaCardNameById(randomNumber));
	}

	public void randomEventEarthquake(){
		randomEventExplosion();
		randomEventExplosion();
	}
	
	public void randomEventExplosion(){
		System.out.println("Rolling Dice ");
		Integer randomNumber = PresentationUtility.returnRandomNumber(1, 12);
		System.out.println("Dice Value : " + randomNumber);
		for(Building building : Game.lstBuildings){
			if(building.getArea_id() == randomNumber){
				building.setArea_id(0);
				System.out.println("Building Successfully Removed from Area : " + PresentationUtility.getCityAreaCardNameById(randomNumber));
				break;
			}
		}
	}
	
}
