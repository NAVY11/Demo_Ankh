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
		//Read entered Area ID
		AreaID = br.readLine() ;
		boolean TMOnBoard = false;
		StringBuilder sbValidAreas = new StringBuilder();
		for(TroubleMaker objTM : Game.lstTroubleMaker)
		{
			if(objTM.getArea_id()!=0 && objTM.getActive() && (HasOtherPlayersMinion(this,objTM.getArea_id())||Game.AreaHasTroll(objTM.getArea_id())||Game.AreaHasDemon(objTM.getArea_id())))
			{
				//Display Areas which have Trouble Marker and Minion of other players
				TMOnBoard = true; //At least 1 Trouble marker is present on board
				sbValidAreas.append(objTM.getArea_id());
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
			
			while(true)
			{				
				String[] ValidAreas = sbValidAreas.toString().split(",");
				
				if(PresentationUtility.ArrayHasElement(ValidAreas, AreaID))
				{					
					break;					
				}
				else
				{
					System.out.println("Enter a valid Area ID shown above.");
				}					
			}
			
			System.out.println("Select whom to assassinate:");
			ArrayList<Minion> Minions = GetOtherPlayersMinion(this, Integer.parseInt(AreaID));
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
			boolean Break = false;
			while(true)
			{
			System.out.println("To assassinate Enter 'M' for Minion, 'D' for Demon, 'T' for Troll");
			String input = br.readLine();
			switch(input)
			{
			case "M" : if(AskForInterrupt()){if(GetInterrupter()){success = false; Break =true;}else{success = AssassinateMinion(Minions); Break = true;}}else{success = AssassinateMinion(Minions); Break = true;}						
			case "T" : if(AskForInterrupt()){if(GetInterrupter()){success = false; Break =true;}else{success = AssassinateTroll(Trolls); Break = true;}}else{success = AssassinateTroll(Trolls); Break = true;}
			case "D" : if(AskForInterrupt()){if(GetInterrupter()){success = false; Break =true;}else{success = AssassinateDemon(Demons); Break = true;}}else{success = AssassinateDemon(Demons); Break = true;}
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
			int getAmount = PresentationUtility.howMuchMoneyToTakeFromBank(CardID);
			//this.
			return true;
		}
		//Player performs action
		public boolean PerformCardAction(String ActionID, String CardID) throws IOException
		{
			boolean success = true;
			if(ActionID.equalsIgnoreCase("Scroll"))
			{
			switch(CardID)
			{
				case "g1" :this.mrBoggisFunctionality();break;
				case "g2" :this.mrBentFunctionality();break;
				case "g3" :this.theBeggersGuildFunctionality();break;
				case "g4" :this.mrBentFunctionality();break;
				case "g5" :this.theAnkhMorporkSunshineDragonSanctuaryFunctionality();break;								
				case "g9" :this.theDuckmanFunctionality();break;
				case "g10" :this.theDrumknottFunctionality();break;
				case "g11" :this.theCMOTDibblerFunctionality();break;
				case "g14" :this.theMrsCakeFunctionality();break;
				case "g19" :this.theDuckmanFunctionality();break;
				case "g20" :this.theFoolsGuildFunctionality();break;
				case "g21" :this.theFireBrigadeFunctionality();break;
				case "g23" :this.theHistoryMonksFunctionality();break;
				//case "g24" : this.get
				case "g25" :this.theCMOTDibblerFunctionality();break;
				//case "g26" : this. harry king
				case "g30" :this.theDyskFunctionality();break;
				case "g31" :this.theNoobyNoobsFunctionality();break;
				case "g32" :this.theModoFunctionality();break;
				case "g34" :this.theLibrarianFunctionality();break;
				case "g35" :this.theLibrarianFunctionality();break;
				//case "g36" : this.thes shonky shop
				case "g37" :this.theSacharissaCripslockFunctionality();break;
				case "g38" :this.theRosiePalmFunctionality();break;
				case "g39" :this.theDyskFunctionality();break;
				case "g41" :this.theBeggersGuildFunctionality();break;
				case "g43" :this.theZorgoTheRetroFunctionality();break;
				case "g44" :this.theFoolsGuildFunctionality();break;
				case "g46" :this.theRosiePalmFunctionality();break;
				case "g48" :this.mrBoggisFunctionality();break;
				}
			}
			else
			{
				switch(ActionID)
				{
				case "Assassination" : this.Assassination();break;
				case "Remove one trouble marker" : this.UserRemoveOneTroubleMarker();break;
				case "Take money" : this.TakeMoneyFromBank(CardID);break;
//				case "Random Event" : 
				case "Play another card" : this.PlayAnotherCard(CardID);break;
//				case "Interrupt " : 
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
				if(grnCard.getPlayerID()==this.getPlayer_id())
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
		public boolean mrBoggisFunctionality(){
			//1st Action to read scroll & then to place minion
			boolean success = false;
			for(Player player : Game.lstPlayers){
				if(!(player.getPlayer_id() == this.getPlayer_id())){
					this.setPlayer_amount((float) (this.getPlayer_amount() != null ? this.getPlayer_amount() : 0) + 2);
					player.setPlayer_amount((float)(player.getPlayerAmount() - 2));
				}
				success = true;
			}
			return success;
		}
		
		// Same Functionality for The Bank of Ankh-Morpork
		public boolean mrBentFunctionality(){
			//1st Action to read scroll & then play another card
			boolean success = false;
			this.setPlayer_amount((float)(this.getPlayer_amount() != null ? this.getPlayer_amount() : 0) + 10);
			Game.GameBank.setBankAmount((float)Game.GameBank.getBankAmount() - 10);
			this.setPlayer_comments("You had played Mr. Bent/The Bank of AnkhMorpork You need to $12 back to Bank Or either you lose 15 points.");
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
		public boolean theBeggersGuildFunctionality() throws IOException{
			//1st Action to read scroll & then play another card
			boolean success = false;
			System.out.println("Enter playerId from whom you want two card : ");
			BufferedReader brPlayerBuff = new BufferedReader(new InputStreamReader(System.in));
			String brPlayer = brPlayerBuff.readLine();
			for(Player player : Game.lstPlayers){
				if(player.getPlayer_id() == Integer.parseInt(brPlayer.toString())){
					System.out.print("Enter one by one from the list of green card you have available : " + player.getGreenCardListCommaSeparated());
					BufferedReader brCard1Selected = new BufferedReader(new InputStreamReader(System.in));
					String brCard1SelectedReadLine = brCard1Selected.readLine();
					this.setGreenCardListCommaSeparated(this.getGreenCardListCommaSeparated() + "," +brCard1SelectedReadLine.toString());
					player.setGreenCardListCommaSeparated(removeOneCardFromCommaSeparatedString(player.getGreenCardListCommaSeparated(), brCard1Selected.toString()));
					
					System.out.print("Enter 2nd card from the list of green card you have available : " + player.getGreenCardListCommaSeparated());
					BufferedReader brCard2Selected = new BufferedReader(new InputStreamReader(System.in));
					String brCard2SelectedReadLine = brCard1Selected.readLine();
					this.setGreenCardListCommaSeparated(this.getGreenCardListCommaSeparated() + "," +brCard2SelectedReadLine.toString());
					player.setGreenCardListCommaSeparated(removeOneCardFromCommaSeparatedString(player.getGreenCardListCommaSeparated(), brCard2Selected.toString()));
					return (success = true);
				}
			}
			return success;
		}
			
			
			public boolean theAnkhMorporkSunshineDragonSanctuaryFunctionality() throws IOException{
				//1st Action to read scroll & then play another card
				boolean success = false;
				for(Player player : Game.lstPlayers){
					if(!(this.getPlayer_id() == player.getPlayer_id())){
						System.out.println("Player " + player.getPlayer_id() + ": Select y to give $1 or n to give any one of your card : ");
						BufferedReader brGiveMoney = new BufferedReader(new InputStreamReader(System.in));
						String brGiveMoneyReadLine = brGiveMoney.readLine();
						if(brGiveMoneyReadLine.toString().equals("y") || brGiveMoneyReadLine.toString().equals("Y")){
							this.setPlayer_amount((float)(this.getPlayer_amount() != null ? this.getPlayer_amount() : 0) + 1);
							player.setPlayer_amount((float)player.getPlayer_amount() - 1);
						}else{
							System.out.print("Enter one by one from the list of green card you have available : " + player.getGreenCardListCommaSeparated());
							BufferedReader brCard1Selected = new BufferedReader(new InputStreamReader(System.in));
							String brCard1SelectedReadLine = brGiveMoney.readLine();
							this.setGreenCardListCommaSeparated(this.getGreenCardListCommaSeparated() + "," +brCard1SelectedReadLine.toString());
							player.setGreenCardListCommaSeparated(removeOneCardFromCommaSeparatedString(player.getGreenCardListCommaSeparated(), brCard1SelectedReadLine.toString()));
						}
					}
					success = true;
				}
				return success;
			}
			
			// Same Functionality for The Opera House
			public boolean theDyskFunctionality(){
				//Place a building & then read the scroll
				boolean success = false;
				int  count = 0;
				for(Minion minion : Game.lstMinions){
					if(minion.getArea_id() == IConstants.cityCardAreaId9){
						count += 1;
					}
				this.setPlayer_amount((float) (this.getPlayer_amount() != null ? this.getPlayer_amount() : 0) + (count*1) );
				success = true;
				}
				return success;
			}
			
			//Foul Ole Ron & RinceWind has the same functionality
			public boolean theDuckmanFunctionality() throws IOException{
				//Read the scroll
				boolean success = false;
				Minion minionObj = null;
				System.out.println("Enter the minionId you wish to move of another player : ");
				BufferedReader brMinionIdBuff = new BufferedReader(new InputStreamReader(System.in));
				String brMinionId = brMinionIdBuff.readLine();
				System.out.println("Enter the areaId you wish to move of another player minion : ");
				BufferedReader brAreaIdBuf = new BufferedReader(new InputStreamReader(System.in));
				String brAreaId = brAreaIdBuf.readLine();
				
				for(Minion minion : Game.lstMinions){
					if(minion.getMinion_id() == Integer.parseInt(brMinionId.toString())){
						minionObj = minion;
						break;
					}
				}
				
				boolean checkWhetherMinionCanBeRemoved = PresentationUtility.canMinionBePlacedInAdjacentArea(minionObj.getPlayer_id(), Integer.parseInt(brMinionId.toString()), minionObj.getArea_id(), Integer.parseInt(brAreaId.toString()));
				if(checkWhetherMinionCanBeRemoved){
					minionObj.setArea_id(Integer.parseInt(brAreaId.toString()));
					success = true;
				}
				return success;
			}
			
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
			public boolean theCMOTDibblerFunctionality() throws IOException{
				//Read the scroll
				boolean success = false;
				System.out.println("Enter 1 to roll the dice or 2 to remove your minion from the board : ");
				BufferedReader brChoiceBuff = new BufferedReader(new InputStreamReader(System.in));
				String brChoice = brChoiceBuff.readLine();
				if(brChoice.toString().equals("1")){
					Integer rollingDiceNumber = PresentationUtility.returnRandomNumber(1, 12);
					if(rollingDiceNumber >= 7){
						this.setPlayer_amount((float) (this.getPlayer_amount() != null ? this.getPlayer_amount() : 0) + 4);
						Game.GameBank.setBankAmount((float) Game.GameBank.getBankAmount() - 4);
						success = true;
					}else if(rollingDiceNumber == 1){
						this.setPlayer_amount((float) (this.getPlayer_amount() != null ? this.getPlayer_amount() : 0) - 2);
						Game.GameBank.setBankAmount((float) Game.GameBank.getBankAmount() + 2);
						success = true;
					}
				}else if(brChoice.toString().equals("2")){
					System.out.println("Enter the minionId to be removed from the board : ");
					BufferedReader brMinionIdToBeRemovedBuff = new BufferedReader(new InputStreamReader(System.in));
					String brMinionIdToBeRemoved = brMinionIdToBeRemovedBuff.readLine();
					for(Minion minion : Game.lstMinions){
						if(minion.getMinion_id() == Integer.parseInt(brMinionIdToBeRemoved.toString())){
							minion.setArea_id(0);
							success = true;
						}
					}
				}
				return success;
			}
			
			public boolean theMrsCakeFunctionality(){
				//Read the scroll
				boolean success = false;
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
			public boolean theFoolsGuildFunctionality() throws IOException{
				boolean success = false;
				System.out.println("Enter playerId from whom you want $5 : ");
				BufferedReader brPlayerBuff = new BufferedReader(new InputStreamReader(System.in));
				String brPlayer = brPlayerBuff.readLine();
				for(Player player : Game.lstPlayers){
					if(player.getPlayer_id() == Integer.parseInt(brPlayer.toString())){
						if(player.getPlayer_amount() > 5){
							player.setPlayer_amount(player.getPlayer_amount() - 5);
							this.setPlayer_amount((this.getPlayer_amount() != null ? this.getPlayer_amount() : 0) + 5);
							success = true;
							break;
						}else{
							player.setPlayer_comments("Have to give back $5 to player " + this.getPlayer_id());
						}
					}
				}
				return success;
			}
			
			public boolean theFireBrigadeFunctionality() throws IOException{
				//Read the scroll & play another card
				boolean success = false;
				System.out.println("Enter 1 to give $5 or 2 to remove the building");;
				BufferedReader brChoiceBuff = new BufferedReader(new InputStreamReader(System.in));
				String brChoice = brChoiceBuff.readLine();
				if(brChoice.toString().equals("1")){
					System.out.println("Enter playerId from whom you want $5 : ");
					BufferedReader brPlayer = new BufferedReader(new InputStreamReader(System.in));
					for(Player player : Game.lstPlayers){
						if(player.getPlayer_id() == Integer.parseInt(brPlayer.toString())){
							if(player.getPlayer_amount() > 5){
								player.setPlayer_amount(player.getPlayer_amount() - 5);
								this.setPlayer_amount((this.getPlayer_amount() != null ? this.getPlayer_amount() : 0) + 5);
								success = true;
								break;
							}
						}
					}
					if(!(success)){
						System.out.println("Enter the minionId to be removed from the board : ");
						BufferedReader brMinionIdToBeRemovedBuff = new BufferedReader(new InputStreamReader(System.in));
						String brMinionIdToBeRemoved = brMinionIdToBeRemovedBuff.readLine();
						for(Minion minion : Game.lstMinions){
							if(minion.getMinion_id() == Integer.parseInt(brMinionIdToBeRemoved.toString())){
								minion.setArea_id(0);
								success = true;
							}
						}
					}
				}
				return success;
			}
			
			/* Have to implement functionality and keep track of the discarded cards as well*/
			
			public boolean theHexFunctionality(){
				//Read the scroll & play another card
				boolean success = false;
				for(int i = 1; i <=3; i++){
					if(Game.lstGreenCards.size() > (3-i+1)){
						int cardIndexNumber = PresentationUtility.returnRandomNumber(0, Game.lstGreenCards.size() -1);
						if(cardIndexNumber > 0){
							GreenCard cardToAdd = Game.lstGreenCards.get(cardIndexNumber);
							this.setGreenCardListCommaSeparated(this.getGreenCardListCommaSeparated()+","+cardToAdd);
							Game.lstGreenCards.remove(cardIndexNumber);
							success = true;
						}
					}
					success = true;
				}
				return success;
			}
			
			public boolean theNoobyNoobsFunctionality() throws IOException{
				boolean success = false;
				System.out.println("Enter playerId from whom you want $3 : ");
				BufferedReader brPlayerBuff = new BufferedReader(new InputStreamReader(System.in));
				String brPlayer = brPlayerBuff.readLine();
				for(Player player : Game.lstPlayers){
					if(player.getPlayer_id() == Integer.parseInt(brPlayer.toString())){
						player.setPlayer_amount((float) player.getPlayer_amount() - 3);
						this.setPlayer_amount((float) this.getPlayerAmount() + 3);
						success = true;
					}
				}
				return success;
			}
			
			public boolean theModoFunctionality(){
				boolean success = false;
				System.out.println("Do you want to continue? Please enter 'y' : ");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				if(br.toString().equals("y") || br.toString().equals("Y")){
					System.out.println("Enter CardId which you want to discard from your Green Card : "+this.getGreenCardListCommaSeparated());
					BufferedReader brCardId = new BufferedReader(new InputStreamReader(System.in));
					this.setGreenCardListCommaSeparated(removeOneCardFromCommaSeparatedString(this.getGreenCardListCommaSeparated(), brCardId.toString()));
				}
				return success;
			}
			
			//Same Functionality for Leonard of Quirm 
			public boolean theLibrarianFunctionality(){
				//Read the scroll & play another card
				boolean success = false;
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				for(int i = 1; i <=4; i++){
					if(Game.lstGreenCards.size() > (4-i+1)){
						int cardIndexNumber = PresentationUtility.returnRandomNumber(0, Game.lstGreenCards.size() -1);
						if(cardIndexNumber > 0){
							GreenCard cardToAdd = Game.lstGreenCards.get(cardIndexNumber);
							this.setGreenCardListCommaSeparated(this.getGreenCardListCommaSeparated()+","+cardToAdd);
							Game.lstGreenCards.remove(cardIndexNumber);
							success = true;
						}
					}
					success = true;
				}
				return success;
			}
			
			public boolean theSacharissaCripslockFunctionality(){
				//Read the scroll & play another card
				boolean success = false;
				int countMoneyToBeGivenToCurrentPlayer = 0;
				for(TroubleMaker troubleMaker : Game.lstTroubleMaker){
					if(troubleMaker.getActive() && troubleMaker.getArea_id() > 0){
						countMoneyToBeGivenToCurrentPlayer += 1;
					}
					this.setPlayer_amount((float) this.getPlayerAmount() + (countMoneyToBeGivenToCurrentPlayer * 1));
				}
				return success;
			}
			
			// Same functionality for The Seamstresses Guild
			public boolean theRosiePalmFunctionality() throws IOException{
				//1st Action to read scroll & then play another card
				boolean success = false;
				System.out.println("Enter playerId from whom you want to give $2 and give one card : ");
				BufferedReader brPlayerBuff = new BufferedReader(new InputStreamReader(System.in));
				String brPlayer = brPlayerBuff.readLine();
				for(Player player : Game.lstPlayers){
					if(player.getPlayer_id() == Integer.parseInt(brPlayer.toString())){
						System.out.print("Enter one by one from the list of green card you have available : " + this.getGreenCardListCommaSeparated());
						BufferedReader brCard1SelectedBuff = new BufferedReader(new InputStreamReader(System.in));
						String brCard1Selected = brCard1SelectedBuff.readLine();
						player.setGreenCardListCommaSeparated(player.getGreenCardListCommaSeparated() + "," +brCard1Selected.toString());
						this.setGreenCardListCommaSeparated(removeOneCardFromCommaSeparatedString(this.getGreenCardListCommaSeparated(), brCard1Selected.toString()));
						
						player.setPlayer_amount((float) player.getPlayer_amount());
						this.setPlayer_amount((float) (this.getPlayer_amount() != null ? this.getPlayer_amount() : 0) + 2);
						return (success = true);
					}
				}
				return success;
			}
			
			public boolean theZorgoTheRetroFunctionality(){
				//1st Action to read scroll & then play another card
				boolean success = false;
				PersonalityCard personalityCard = new PersonalityCard();
					if(Game.lstPersonalityCard.size() > 0){
						int personalityCardIndexNumber = PresentationUtility.returnRandomNumber(0, Game.lstPersonalityCard.size() -1);
						PersonalityCard personalityCard1 = Game.lstPersonalityCard.get(personalityCardIndexNumber);
						
						personalityCard.SetCardID(this.getPlayer_personality_card_id().toString());
						Game.lstPersonalityCard.add(personalityCard);
						
						this.setPlayer_personality_card_id(Integer.parseInt(personalityCard1.GetCardID()));

						Game.lstPersonalityCard.remove(personalityCardIndexNumber);
					}
				return success;
			}
			
			
			public static String takeOneGreenCardFromDeck(Game Ankhmorpork){

				Integer cardIndexNumber = PresentationUtility.returnRandomNumber(1, Ankhmorpork.lstGreenCards.size());
				GreenCard greenCardAccessed = Ankhmorpork.lstGreenCards.get(cardIndexNumber);
				return greenCardAccessed.GetCardID();	
				
			}
			
			public boolean theHistoryMonksFunctionality() throws IOException{
				boolean success = false;
				List<Integer> discardedPileofGreenCardArr = new ArrayList<Integer>();
				String discardedPileOfGreenCards = "";
				String cardInDeckOrWithPlayer = "";
				System.out.println("Do you want to continue? Please enter 'y' : ");
				BufferedReader brBuff = new BufferedReader(new InputStreamReader(System.in));
				String br = brBuff.readLine();
				if(br.toString().equals("y") || br.toString().equals("Y")){
					for(GreenCard greenCard : Game.lstGreenCards){
						cardInDeckOrWithPlayer += greenCard.GetCardID() + ",";
					}
					
					for(Player greenCardToExtract : Game.lstPlayers){
						cardInDeckOrWithPlayer += greenCardToExtract.getGreenCardListCommaSeparated() + ",";
					}
					
					if(cardInDeckOrWithPlayer.endsWith(",")){
						cardInDeckOrWithPlayer = cardInDeckOrWithPlayer.substring(0, cardInDeckOrWithPlayer.length() -1);
					}
					
					char[] cardInDeckOrWithPlayerChar = cardInDeckOrWithPlayer.toCharArray();
					Arrays.sort(cardInDeckOrWithPlayerChar);

					String[] greenCardsInGameStrArr = cardInDeckOrWithPlayerChar.toString().split(",");
					
					ArrayList<String> greenCardsInGameArr  = new ArrayList<String>();
					for(String greenCardInGame : greenCardsInGameStrArr){
						greenCardsInGameArr.add(greenCardInGame);
					}
					
					for(int i = 48; i <= 1; i--){
						if(!(greenCardsInGameArr.contains(i))){
							discardedPileofGreenCardArr.add(i);
						}
					}
					if(discardedPileofGreenCardArr.size() > 0){
						discardedPileOfGreenCards = discardedPileofGreenCardArr.toString().substring(0, 6);
					}
					
					this.setGreenCardListCommaSeparated(this.getGreenCardListCommaSeparated() + "," +discardedPileOfGreenCards);
					
				}
				return success;
			}
			
			public boolean theHarryKingFunctionality() throws IOException{
				//1st Action to read scroll & then play another card
				boolean success = false;
				System.out.println("Do you want to continue? Please enter 'y' : ");
				BufferedReader brBuff = new BufferedReader(new InputStreamReader(System.in));
				String br = brBuff.readLine();
				if(br.toString().equals("y") || br.toString().equals("Y")){
					System.out.print("You have these green cards available : " + this.getGreenCardListCommaSeparated());
					String[] playerGreenCardArr = this.getGreenCardListCommaSeparated().split(",");
					for(int i = 0; i < playerGreenCardArr.length; i++){
						System.out.print("Do you want to discard Card Number : " + playerGreenCardArr[i]);
						BufferedReader brCard1SelectedBuff = new BufferedReader(new InputStreamReader(System.in));
						String brCard1Selected = brCard1SelectedBuff.readLine();
						if(brCard1Selected.toString().endsWith("y") || brCard1Selected.toString().endsWith("Y")){
							this.setGreenCardListCommaSeparated(removeOneCardFromCommaSeparatedString(this.getGreenCardListCommaSeparated(), playerGreenCardArr[i].toString()));
							this.setPlayer_amount((float) this.getPlayer_amount() + 2);
						}
					}
				}
				return success;
			}
			
			public boolean theShonkyShopFunctionality() throws IOException{
				//1st Action to read scroll & then play another card
				boolean success = false;
				System.out.println("Do you want to continue? Please enter 'y' : ");
				BufferedReader brBuff = new BufferedReader(new InputStreamReader(System.in));
				String br = brBuff.readLine();
				if(br.toString().equals("y") || br.toString().equals("Y")){
					System.out.print("You have these green cards available : " + this.getGreenCardListCommaSeparated());
					String[] playerGreenCardArr = this.getGreenCardListCommaSeparated().split(",");
					for(int i = 0; i < playerGreenCardArr.length; i++){
						System.out.print("Do you want to discard Card Number : " + playerGreenCardArr[i]);
						BufferedReader brCard1SelectedBuff = new BufferedReader(new InputStreamReader(System.in));
						String brCard1Selected = brCard1SelectedBuff.readLine();
						if(brCard1Selected.toString().endsWith("y") || brCard1Selected.toString().endsWith("Y")){
							this.setGreenCardListCommaSeparated(removeOneCardFromCommaSeparatedString(this.getGreenCardListCommaSeparated(), playerGreenCardArr[i].toString()));
							this.setPlayer_amount((float) this.getPlayer_amount() + 1);
						}
					}
				}
				return success;
			}
			
	/**
	 * Place a minion functionality.
	 *
	 * @return true, if successful
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
			public boolean placeAMinionFunctionality() throws IOException{
				boolean success =false;
				String placingAMinionStr = "";
				for(Minion minionObj : Game.lstMinions){
					if(minionObj.getPlayer_id() == this.getPlayer_id() && minionObj.getArea_id() == 0){
						placingAMinionStr += minionObj.getArea_id() + ",";
					}
					if(placingAMinionStr.endsWith(",")){
						placingAMinionStr = placingAMinionStr.substring(0, placingAMinionStr.length()-1);
					}
	if(!placingAMinionStr.isEmpty())
	{	
	//System.out.println("You are allowed to place these minions which are not on board : " + placingAMinionStr);
					System.out.println("Enter a area in which you want to keep the minion : ");
	String AreaList = Game.AreaWithNoMinion();
	System.out.println(AreaList);
					BufferedReader brBuff = new BufferedReader(new InputStreamReader(System.in));
					String br = brBuff.readLine();
	if(AreaList.contains(br))
	{
	Minion objMinion = Game.GetMinionsByMinionID(Integer.parseInt(placingAMinionStr.substring(0,2)));
	objMinion.setArea_id(Integer.parseInt(br.toString()));
	TroubleMaker objTM = new TroubleMaker();
	if(Game.AreaHasMinion(Integer.parseInt(br)))
	{
	if(Game.AreaHasTroubleMarker(Integer.parseInt(br)))
	{
	Game.removeTroubleMarkerByAreaId(Integer.parseInt(br));
	System.out.println("Trouble Marker was removed");
	Game.SetMinion(objMinion);
	success= true;
	}
	else
	{
	PlaceATroubleMarkerInArea(Integer.parseInt(br));
	System.out.println("Trouble Marker was placed");
	Game.SetMinion(objMinion);
	success= true;
	}
	
	}
	
	}
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
	for(Building buildingObj : Game.lstBuildings)
	{
					if(buildingObj.getPlayer_id() == this.getPlayer_id() && buildingObj.getArea_id() == 0){
	placingABuidingStr += buildingObj.getBuilding_id() + ",";
					}
					if(placingABuidingStr.endsWith(",")){
						placingABuidingStr = placingABuidingStr.substring(0, placingABuidingStr.length()-1);
					}
	if(!placingABuidingStr.isEmpty())
	{
	//System.out.println("You are allowed to place these buildings which are not on board : " + placingABuidingStr);
					System.out.println("Enter a area in which you want to keep the building : ");
	String AreaList = Game.AreaWithNoBuilding();
	System.out.println(AreaList);
					BufferedReader brBuff = new BufferedReader(new InputStreamReader(System.in));
					String br = brBuff.readLine();
	if(AreaList.contains(br))
	{
	Building objBuilding = Game.GetBuildingsByBuildingID(Integer.parseInt(placingABuidingStr.substring(0,2)));
	objBuilding.setArea_id(Integer.parseInt(br.toString()));
	CityAreaCard CityAreaCard = Game.GetCityAreaCardByCardID("c"+br);
	if(Game.PaymentToBank(this.getPlayer_id(), CityAreaCard.GetCost()))
	{
	Game.SetBuilding(objBuilding);
	System.out.println("Building placed successfully. Amount deducted "+CityAreaCard.GetCost());
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
	System.out.println("You have no Building to palce");
	success = false;
	}
	
	}
	else
	{
	System.out.println("No Area available to place Building");
	success = false;
	}
				}
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
			
	
}
