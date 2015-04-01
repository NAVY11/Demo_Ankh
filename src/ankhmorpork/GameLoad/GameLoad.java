package ankhmorpork.GameLoad;
import PresentationUtilityCommon.PresentationUtility;
import ViewFile.ViewFileTxt;
import ankhmorpork.discworldboard;
import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.*;
import ankhmorpork.GameObjects.Cards.BrownCard;
import ankhmorpork.GameObjects.Cards.CityAreaCard;
import ankhmorpork.GameObjects.Cards.GreenCard;
import ankhmorpork.GameObjects.Cards.PersonalityCard;
import ankhmorpork.GameObjects.Cards.RandomEventCard;
import ankhmorpork.GameConstants.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;







import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



//import org.json.JSONArray;
import org.json.simple.JSONArray;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import winningCondition.WinningCondition;
import winningCondition.WinningConditionFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class GameLoad.
 */
public class GameLoad {

	/**
	 * Load game.
	 *
	 * @param objFilereader the obj filereader
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws ParseException the parse exception
	 * @throws JSONException 
	 */
	public static void LoadGame(FileReader objFilereader) throws IOException, ParseException, JSONException
	{

				//FileReader objFilereader = new FileReader(File);		
				JSONParser jsonParser = new JSONParser();		
				JSONObject json = (JSONObject)jsonParser.parse(objFilereader);		

				//Loading Personality
				JSONArray PersonalityCards = (JSONArray)json.get("PersonalityCards");
				Iterator iPersonalityCard = PersonalityCards.iterator();
				while (iPersonalityCard.hasNext())
				{
					PersonalityCard objPersonalityCard = new PersonalityCard();
					JSONObject jsonPersonalityCard = (JSONObject)iPersonalityCard.next();
					objPersonalityCard.SetCardID(jsonPersonalityCard.get("CardID").toString());
					objPersonalityCard.SetIsPlayed((Boolean)jsonPersonalityCard.get("IsPlayed"));
					objPersonalityCard.setPlayerID(Integer.parseInt(jsonPersonalityCard.get("PlayerID").toString()));
					objPersonalityCard.SetPersonalityName((jsonPersonalityCard.get("PersonalityName").toString()));
					objPersonalityCard.setName((jsonPersonalityCard.get("Name").toString()));
					Game.lstPersonalityCard.add(objPersonalityCard);
				}
				
				//Loading TROLLS
				JSONArray Trolls = (JSONArray)json.get("Trolls");
				Iterator iTroll = Trolls.iterator();
				while (iTroll.hasNext())
				{
					Troll objTroll = new Troll();
					JSONObject jsonTroll = (JSONObject)iTroll.next();
					objTroll.setActive((Boolean)jsonTroll.get("active"));
					objTroll.setTroll_id(Integer.parseInt(jsonTroll.get("troll_id").toString()));			
					objTroll.setArea_id(Integer.parseInt(jsonTroll.get("area_id").toString()));
					Game.lstTrolls.add(objTroll);
				}
				
				//Loading DEMONS
				JSONArray Demons = (JSONArray)json.get("Demons");
				Iterator iDemon = Demons.iterator();
				while (iDemon.hasNext())
				{
					Demon objDemon = new Demon();
					JSONObject jsonTroll = (JSONObject)iDemon.next();
					objDemon.setActive((Boolean)jsonTroll.get("active"));
					objDemon.setDemon_id(Integer.parseInt(jsonTroll.get("demon_id").toString()));			
					objDemon.setArea_id(Integer.parseInt(jsonTroll.get("area_id").toString()));
					Game.lstDemons.add(objDemon);
				}
				
				//Loading Building
				JSONArray Buildings = (JSONArray)json.get("Building");
				Iterator iBuilding = Buildings.iterator();
				while (iBuilding.hasNext())
				{
										
					Building objBuilding = new Building();				
					JSONObject jsonBuilding = (JSONObject)iBuilding.next();				
					objBuilding.setBuilding_id(Integer.parseInt(jsonBuilding.get("building_id").toString()));
					objBuilding.setActive((Boolean)jsonBuilding.get("active"));
					objBuilding.setArea_id(Integer.parseInt(jsonBuilding.get("area_id").toString()));
					objBuilding.setColor((String)jsonBuilding.get("color"));				
					objBuilding.setPlayer_id(Integer.parseInt(jsonBuilding.get("player_id").toString()));
					Game.lstBuildings.add(objBuilding);
				}
				
				//Loading TroubleMarker
				JSONArray TroubleMaker = (JSONArray)json.get("TroubleMaker");
				Iterator iTroubleMaker = TroubleMaker.iterator();
				while (iTroubleMaker.hasNext())
				{
										
					TroubleMaker objTroubleMaker = new TroubleMaker();				
					JSONObject jsonTroubleMaker = (JSONObject)iTroubleMaker.next();				
					objTroubleMaker.setTm_id(Integer.parseInt(jsonTroubleMaker.get("tm_id").toString()));
					objTroubleMaker.setActive((Boolean)jsonTroubleMaker.get("active"));
					objTroubleMaker.setArea_id(Integer.parseInt(jsonTroubleMaker.get("area_id").toString()));
					Game.lstTroubleMaker.add(objTroubleMaker);
				}
				
				//Loading Area
//				JSONArray Area = (JSONArray)json.get("Area");
//				Iterator iArea = Area.iterator();
//				while (iArea.hasNext())
//				{
//										
//					Area objArea = new Area();				
//					JSONObject jsonArea = (JSONObject)iTroubleMaker.next();				
//					objArea.setAreaCost(Integer.parseInt(jsonArea.get("area_cost").toString()));
//					objArea.setAreaID(Integer.parseInt(jsonArea.get("area_id").toString()));
//					objArea.setAreaName((String)jsonArea.get("area_name"));
//					objArea.setAreaBelongsTo(Integer.parseInt(jsonArea.get("belongs_to").toString()));
//					Game.lstArea.add(objArea);
//				}
				
				//Loading MINIONS
				JSONArray Minions = (JSONArray)json.get("Minion");
				Iterator iMinion = Minions.iterator();
				while(iMinion.hasNext())
				{
					Minion objMinion = new Minion();
					JSONObject jsonMinion = (JSONObject)iMinion.next();
					objMinion.setActive((Boolean)jsonMinion.get("active"));
					objMinion.setArea_id(Integer.parseInt(jsonMinion.get("area_id").toString()));
					objMinion.setColor((String)jsonMinion.get("color"));
					objMinion.setMinion_id(Integer.parseInt(jsonMinion.get("minion_id").toString()));
					objMinion.setPlayer_id(Integer.parseInt(jsonMinion.get("player_id").toString()));
					Game.lstMinions.add(objMinion);
				}
//				
				//Loading CityAreaCards
				JSONArray CityAreaCard = (JSONArray)json.get("CityAreaCards");
				Iterator iCityAreaCard = CityAreaCard.iterator();
				while (iCityAreaCard.hasNext())
				{
					CityAreaCard objCityAreaCard = new CityAreaCard();
					JSONObject jsonCityAreaCard = (JSONObject)iCityAreaCard.next();
					objCityAreaCard.SetAreaID(Integer.parseInt(jsonCityAreaCard.get("AreaID").toString()));
					objCityAreaCard.setPlayerID(Integer.parseInt(jsonCityAreaCard.get("PlayerID").toString()));
					objCityAreaCard.SetCost(Integer.parseInt(jsonCityAreaCard.get("Cost").toString()));

					objCityAreaCard.SetCardID((jsonCityAreaCard.get("CardID").toString()));
					objCityAreaCard.SetActionID((jsonCityAreaCard.get("ActionID").toString()));
					objCityAreaCard.SetName((jsonCityAreaCard.get("AreaName").toString()));			
					objCityAreaCard.SetActionDescription((jsonCityAreaCard.get("ActionDescription").toString()));			
					objCityAreaCard.SetIsPlayed((Boolean)jsonCityAreaCard.get("IsPlayed"));
					//objCityAreaCard.setName((jsonCityAreaCard.get("CardID").toString()));			

					Game.lstCityAreaCards.add(objCityAreaCard);
				}
				
				//Loading GreenCards
				JSONArray GreenCard = (JSONArray)json.get("GreenCards");
				Iterator iGreenCard = GreenCard.iterator();
				while (iGreenCard.hasNext())
				{
					GreenCard objGreenCard = new GreenCard();
					JSONObject jsonGreenCard = (JSONObject)iGreenCard.next();
					objGreenCard.SetCardID((jsonGreenCard.get("CardID").toString()));
					objGreenCard.setPlayerID(Integer.parseInt(jsonGreenCard.get("PlayerID").toString()));
					objGreenCard.SetAction((jsonGreenCard.get("ActionID").toString().split(",")));
					objGreenCard.SetActionDescription((jsonGreenCard.get("ActionDescription").toString()));			
					objGreenCard.SetIsPlayed((Boolean)jsonGreenCard.get("IsPlayed"));
					objGreenCard.setName((jsonGreenCard.get("Name").toString()));			

					Game.lstGreenCards.add(objGreenCard);
				}
				
//				//Loading BrownCards
//				JSONArray BrownCard = (JSONArray)json.get("BrownCards");
//				Iterator iBrownCard = BrownCard.iterator();
//				while (iBrownCard.hasNext())
//				{
//					BrownCard objBrownCard = new BrownCard();
//					JSONObject jsonBrownCard = (JSONObject)iBrownCard.next();
//					objBrownCard.SetCardID((jsonBrownCard.get("CardID").toString()));
//					objBrownCard.setPlayerID(Integer.parseInt(jsonBrownCard.get("PlayerID").toString()));
//					//objBrownCard.SetActionID((jsonBrownCard.get("ActionID").toString()));
//					objBrownCard.SetActionDescription((jsonBrownCard.get("ActionDescription").toString()));			
//					objBrownCard.SetIsPlayed((Boolean)jsonBrownCard.get("IsPlayed"));
//					objBrownCard.setName((jsonBrownCard.get("Name").toString()));			
//
//					Game.lstBrownCards.add(objBrownCard);
//				}
				
				//Loading PersonalityCards
//				JSONArray PersonalityCard = (JSONArray)json.get("PersonalityCards");
//				if(PersonalityCard.size() > 0){
//					Iterator iPersonalityCard = PersonalityCard.iterator();
//					while (iPersonalityCard.hasNext())
//					{
//						PersonalityCard objPersonalityCard = new PersonalityCard();
//						JSONObject jsonPersonalityCard = (JSONObject)iPersonalityCard.next();
//						//objPersonalityCard.SetCardID((jsonPersonalityCard.get("CardID").toString()));
//						//objPersonalityCard.setPlayerID(Integer.parseInt(jsonPersonalityCard.get("PlayerID").toString()));
//						//objPersonalityCard.SetPersonalityName((jsonPersonalityCard.get("PersonalityName").toString()));
//						//objPersonalityCard.SetPersonalityMotive((jsonPersonalityCard.get("PersonalityMotive").toString()));			
//						//objPersonalityCard.SetIsPlayed((Boolean)jsonPersonalityCard.get("IsPlayed"));
//						//objPersonalityCard.setName((jsonPersonalityCard.get("Name").toString()));			
//	
//						Game.lstPersonalityCard.add(objPersonalityCard);
//					}
//				}
//				
				//Loading RandomEventCards
				JSONArray RandomEventCard = (JSONArray)json.get("RandomEventCards");
				if(RandomEventCard.size() > 0){
					Iterator iRandomEventCard = RandomEventCard.iterator();
					while (iRandomEventCard.hasNext())
					{
						RandomEventCard objRandomEventCard = new RandomEventCard();
						JSONObject jsonRandomEventCard = (JSONObject)iRandomEventCard.next();
						objRandomEventCard.SetCardID((jsonRandomEventCard.get("CardID").toString()));
						objRandomEventCard.setPlayerID(Integer.parseInt(jsonRandomEventCard.get("PlayerID").toString()));
						objRandomEventCard.SetEventID((jsonRandomEventCard.get("EventID").toString()));
						objRandomEventCard.SetEventDescription((jsonRandomEventCard.get("EventDescription").toString()));			
						objRandomEventCard.SetIsPlayed((Boolean)jsonRandomEventCard.get("IsPlayed"));
						objRandomEventCard.setName((jsonRandomEventCard.get("Name").toString()));			
	
						Game.lstRandomEventCards.add(objRandomEventCard);
					}
				}
				
				
				
				//Loading PLAYERS
				JSONArray Players = (JSONArray)json.get("Players");
				Iterator iPlayer = Players.iterator();
				int iNoOfPlayers = 0;
				while (iPlayer.hasNext())
				{
					Player Player = new Player();
					JSONObject jsonPlayer = (JSONObject)iPlayer.next();
					Player.setPlayer_id(Integer.parseInt(jsonPlayer.get("player_id").toString()));
					Player.setPlayer_name((String)jsonPlayer.get("player_name"));
					Player.setPlayer_color((String)jsonPlayer.get("player_color"));
					Player.setBrownCardListCommaSeparated((String)jsonPlayer.get("brownCardListCommaSeparated"));
					Player.setGreenCardListCommaSeparated((String)jsonPlayer.get("greenCardListCommaSeparated"));
					Player.setPersonalityCardListCommaSeparated((String)jsonPlayer.get("personalityCardListCommaSeparated"));
					Player.setCityAreaCardsListCommaSeparated((String) jsonPlayer.get("cityAreaCardsListCommaSeparated"));
					Player.setPlayer_active((Boolean)jsonPlayer.get("player_active"));
					Player.setPlayer_amount(Float.parseFloat(jsonPlayer.get("player_amount").toString()));
															
					Game.lstPlayers.add(Player);
					iNoOfPlayers++;
				}
				
				
				//Loading BANK COINS
				Game.GameBank.objGoldCoin.setCoin_Type(Constants.GoldCoin());
				Game.GameBank.objGoldCoin.setCoin_Val(Constants.GoldCoinValue());
				Game.GameBank.objGoldCoin.setCoin_Available(Integer.parseInt(json.get("GoldCoins_Avail_Bank").toString()));
				
				Game.GameBank.objSilverCoin.setCoin_Type(Constants.SilverCoin());
				Game.GameBank.objSilverCoin.setCoin_Val(Constants.SilverCoinValue());
				Game.GameBank.objSilverCoin.setCoin_Available(Integer.parseInt(json.get("SilverCoins_Avail_Bank").toString()));
				
				Game.GameBank.setBankAmount(Integer.parseInt(json.get("Total_Avail_Bank").toString()));
				
				 int currentPlayerTurn = Integer.parseInt(json.get("currentPlayerId").toString());
				 LoadedGame(iNoOfPlayers, currentPlayerTurn);
	}
	
	public static void LoadedGame(int iNoOfPlayers, int currentPlayerTurn) throws IOException, ParseException, JSONException
	{					



		//Get Starting Player randomly
		//System.out.println("Player "+ CurrentPlayer + " starts game");
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

		boolean GameEnds = false;
		System.out.println("===========================================================================================");
		System.out.println("Welcome to Ankh-Morpork, the largest, smelliest, and most ‘interesting’ city on Discworld.");
		System.out.println("===========================================================================================");
		while(!GameEnds)
		{

			currentPlayerTurn = PresentationUtility.nextPlayerTurn(currentPlayerTurn, iNoOfPlayers); 
			//Show Board
			System.out.print(ViewFileTxt.ViewState());
			//Play Game						
			//Load Player details
			Player objPlayer = Game.lstPlayers.get(currentPlayerTurn - 1);
			System.out.println("Enter 'saveGame' to save the Current State. Else write 'cont' to continue ");
			BufferedReader brOption = new BufferedReader(new InputStreamReader(System.in));
			String brOptionSelected = brOption.readLine();
			if(brOptionSelected.equals("saveGame")){
				JFileChooser chooser = new JFileChooser();
				chooser.setCurrentDirectory(new File("/home/me/Documents"));
				int retrival = chooser.showSaveDialog(null);
				if (retrival == JFileChooser.APPROVE_OPTION) {

					FileWriter objFileWriter = new FileWriter(chooser.getSelectedFile()+".txt");
					discworldboard.SaveGame(objFileWriter, objPlayer);

				}
			}
			System.out.println("It is "+objPlayer.getPlayer_name()+"'s turn");
			//Check Winning condition for Current Player
			WinningCondition objWins = WinningConditionFactory.getWinningCircumstance(objPlayer);
			if( objWins.isWinner(objPlayer.getPlayer_id()))
			{
				PersonalityCard objPC = Game.GetPersonalityCardByPlayerID(objPlayer.getPlayer_id());
				System.out.println("Victory condition achieved! "+objPlayer.getPlayer_name()+" playing as "+ objPC.GetPersonalityName() + " wins the Game!" );
				System.exit(0);
			}
			
			//********Which Card to Play?
			//System.out.println("Which card to play?");

			//Show available city area cards
			StringBuilder sbValidCityAreaIDs = new StringBuilder();
			StringBuilder sbPlayedCityAreaIDs = new StringBuilder();

			boolean hasCityAreaCard = false;
			System.out.println("                         City Area Cards ");
			for(CityAreaCard cityAreaCard : Game.lstCityAreaCards)
			{	
				if(cityAreaCard.getPlayerID()==objPlayer.getPlayer_id())
				{
					sbValidCityAreaIDs.append(cityAreaCard.GetCardID());
					hasCityAreaCard = true;
					System.out.printf("%-5s%-5s%-20s%-5s%-60s\n",cityAreaCard.CardID ,  " : " ,  cityAreaCard.GetAreaName(), " : "," Action Description : "+cityAreaCard.GetActionDescription());

					//System.out.println(cityAreaCard.CardID + " : " + cityAreaCard.GetAreaName() + " : " + cityAreaCard.GetActionDescription());
				}
			}


			

			//Show available greeen cards
			System.out.println("                         Green Cards ");
			boolean success = false;
			while(!success)
			{
				StringBuilder sbValidIDs = new StringBuilder();
				for(GreenCard grnCard: Game.lstGreenCards)
				{	
					if(grnCard.getPlayerID()==objPlayer.getPlayer_id())
					{
						sbValidIDs.append(grnCard.GetCardID());		
						String ActionList = Game.GetGreenCardActions(grnCard.GetCardID());
						System.out.printf("%-5s%-5s%-20s%-5s%-50s%-5s%-50s\n",grnCard.CardID ,  " : " ,  grnCard.getName() , " : " , ActionList," : ","Scroll Action : "+grnCard.GetActionDescription());

						//System.out.println("Card '" + grnCard.getName() + "' has following actions :");
						//System.out.print(ActionList);
					}
				}
				System.out.println("\n");
				if(hasCityAreaCard){
					//Accept City Area Card to play from Player
					String CardID = null;
					while(sbValidCityAreaIDs.length() != 0)
					{
						
						System.out.println("If you want to play your City Area Cards then Input the Card ID else press 'Enter' to continue");
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						CardID = br.readLine().toString();
						if((sbValidCityAreaIDs.toString()).contains(CardID) && !CardID.equals(""))
						{
							objPlayer.performCityAreaAction(CardID);
							sbPlayedCityAreaIDs.append(CardID);
							sbValidCityAreaIDs.delete(sbValidCityAreaIDs.indexOf(CardID),sbValidCityAreaIDs.indexOf(CardID) + 2 );

						}
						else if(CardID.equals(""))
							break;
						
					}
				}

				//Accept Card to play from Player
				String CardID = null;
				while(true)
				{
					System.out.println("Enter a Green Card ID");
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
				System.out.println("Card '" + grnCard.getName() + "' has following actions :");
				System.out.println(ActionList);
				boolean actionPerformed = false;				
				for(int i = 0; i<ActionArray.length; i++)
				{
					String ans = null;
					if(i!=ActionArray.length-1 || actionPerformed)
					{
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
					}
					else
					{
						System.out.println("Performing action "+ ActionArray[i]);
						ans="Y";
					}
					if(ans.equalsIgnoreCase("Y"))
					{
						actionPerformed = true;
						//Does a Player wish to interrupt? //TO DO
						//If Yes : Which Player wants to interrupt?
						//Perform Action
						success = objPlayer.PerformCardAction(ActionArray[i], CardID);

					}
					else
						continue;
				}

				if(success)
				{							
					//Set Current card as 'Played'
					if(hasCityAreaCard){
						//Accept City Area Card to play from Player
						String CardID1 = null;
						System.out.println("                         City Area Cards ");
						for(CityAreaCard cityAreaCard : Game.lstCityAreaCards)
						{
							if(cityAreaCard.getPlayerID()==objPlayer.getPlayer_id())
							{
								if(sbPlayedCityAreaIDs.indexOf(cityAreaCard.CardID) == -1)
								{
									System.out.printf("%-5s%-5s%-20s%-5s%-60s\n",cityAreaCard.CardID ,  " : " ,  cityAreaCard.GetAreaName(), " : "," Action Description : "+cityAreaCard.GetActionDescription());
								}
							}
						}
						while(sbValidCityAreaIDs.length() != 0)
						{
							
							System.out.println("If you want to play your City Area Cards then Input the Card ID else press 'Enter' to continue");
							BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
							CardID1 = br.readLine().toString();
							if((sbValidCityAreaIDs.toString()).contains(CardID1) && !CardID1.equals(""))
							{
								objPlayer.performCityAreaAction(CardID1);
								sbPlayedCityAreaIDs.append(CardID1);
								sbValidCityAreaIDs.delete(sbValidCityAreaIDs.indexOf(CardID1),sbValidCityAreaIDs.indexOf(CardID1) + 2 );

							}
							else 
								if(CardID1.equals(""))
								break;
							
						}
					}
					Game.SetGreenCardIsPlayed(CardID, true);
					//Get number of Green Crads available with Player
					int CardsInHand = Game.GetPlayerGreenCardCount(objPlayer.getPlayer_id());

					//Pick as many cards from deck so that the Player holds 5 Cards
					for(int i=0; i< 5 - CardsInHand;i++)
					{
						//Pick a GreenCardFromDeck
						String PickNewCardID = Game.GetRandomGreenCardFromDeck();
						Game.SetGreenCardToPlayer(PickNewCardID, objPlayer.getPlayer_id());
					}
				}
				else
				{
					System.out.println("Opss! Acion failed. Please try again.");
				}

			}					
		}
	}


	

	/**
	 * Load new game_ cards.
	 *
	 * @throws FileNotFoundException the file not found exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws ParseException the parse exception
	 * @throws JSONException the JSON exception
	 */
	public static void LoadNewGame_Cards() throws FileNotFoundException, IOException, ParseException, JSONException 
	{
	    Object obj;
	    JSONParser parser = new JSONParser();

		for(int i=1;i<13;i++)
	    {
			CityAreaCard objCityAreaCard = new CityAreaCard();
			String card = "c"+i;
			obj = parser.parse(new FileReader("CityAreaCards.json"));

			org.json.JSONObject jsonObject =  new org.json.JSONObject(obj.toString());
			org.json.JSONObject cityAreaCards =  jsonObject.getJSONObject(card);
						
			objCityAreaCard.SetActionID((String)cityAreaCards.get("ActionID"));
			objCityAreaCard.SetName((String)cityAreaCards.get("AreaName"));
			objCityAreaCard.SetActionDescription((String)cityAreaCards.get("ActionDescription"));
			objCityAreaCard.SetCardID(card);
			//System.out.println(cityAreaCards.get("AreaID"));
			objCityAreaCard.SetAreaID(Integer.parseInt(cityAreaCards.get("AreaID").toString()));
			//System.out.println(cityAreaCards.get("Cost"));
			objCityAreaCard.SetCost(Integer.parseInt(cityAreaCards.get("Cost").toString()));

			Game.lstCityAreaCards.add(objCityAreaCard);

	    }


		for(int i=1;i<49;i++)
	    {
			GreenCard objGreenCard = new GreenCard();
			String card = "g"+i;
			obj = parser.parse(new FileReader("GreenCard.json"));

			org.json.JSONObject jsonObject =  new org.json.JSONObject(obj.toString());
			org.json.JSONObject green =  jsonObject.getJSONObject(card);
			
			String s = (String) green.get("IsPlayed");
			objGreenCard.SetIsPlayed(Boolean.valueOf(Boolean.valueOf(s)));
			
			objGreenCard.SetActionDescription((String)green.get("ActionDescription"));
			
			objGreenCard.setName((String) green.get("Name"));
			
			objGreenCard.SetCardID(card);
			String a1 = (String) green.get("ActionID");
			String[] a2 = a1.split(",");
			objGreenCard.SetAction(a2);
			
			Game.lstGreenCards.add(objGreenCard);

	    }


		
//		for(int i=1;i<54;i++)
//	    {
//			BrownCard objBrownCard = new BrownCard();
//			String card = "b"+i;
//			obj = parser.parse(new FileReader("BrownCard.json"));
//
//			org.json.JSONObject jsonObject =  new org.json.JSONObject(obj.toString());
//			org.json.JSONObject brown =  jsonObject.getJSONObject(card);
//			
//			String s = (String) brown.get("IsPlayed");
//			objBrownCard.SetIsPlayed(Boolean.valueOf(Boolean.valueOf(s)));
//			
//			objBrownCard.SetActionDescription((String)brown.get("ActionDescription"));
//			
//			objBrownCard.setName((String) brown.get("Name"));
//			
//			objBrownCard.SetCardID(card);
//			String a1 = (String) brown.get("Action");
//			String[] a2 = a1.split(",");
//			objBrownCard.SetActionID(a2);
//			
//			Game.lstBrownCards.add(objBrownCard);
//
//	    }


		for(int i=1;i<13;i++)
	    {
			RandomEventCard objRandomEventCard = new RandomEventCard();
			String card = "e"+i;
			obj = parser.parse(new FileReader("RandomEventCard.json"));

			org.json.JSONObject jsonObject =  new org.json.JSONObject(obj.toString());
			org.json.JSONObject randomevent =  jsonObject.getJSONObject(card);
			
			String s = (String) randomevent.get("IsPlayed");
			objRandomEventCard.SetIsPlayed(Boolean.valueOf(Boolean.valueOf(s)));
			
			objRandomEventCard.SetEventDescription((String)randomevent.get("EventDescription"));
			
			objRandomEventCard.setName((String) randomevent.get("Name"));
			
			objRandomEventCard.SetCardID(card);
			objRandomEventCard.SetEventID(card);

			
			Game.lstRandomEventCards.add(objRandomEventCard);

	    }

}
	
}
