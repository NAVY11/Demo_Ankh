package ankhmorpork.GameLoad;
import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.*;
import ankhmorpork.GameObjects.Cards.BrownCard;
import ankhmorpork.GameObjects.Cards.CityAreaCard;
import ankhmorpork.GameObjects.Cards.GreenCard;
import ankhmorpork.GameObjects.Cards.PersonalityCard;
import ankhmorpork.GameObjects.Cards.RandomEventCard;
import ankhmorpork.GameConstants.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;




//import org.json.JSONArray;
import org.json.simple.JSONArray;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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
	 */
	public static void LoadGame(FileReader objFilereader) throws IOException, ParseException
	{

				//FileReader objFilereader = new FileReader(File);		
				JSONParser jsonParser = new JSONParser();		
				JSONObject json = (JSONObject)jsonParser.parse(objFilereader);		
				
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
					System.out.println(jsonCityAreaCard);
					objCityAreaCard.SetAreaID(Integer.parseInt(jsonCityAreaCard.get("AreaID").toString()));
					objCityAreaCard.setPlayerID(Integer.parseInt(jsonCityAreaCard.get("PlayerID").toString()));
					objCityAreaCard.SetCost(Integer.parseInt(jsonCityAreaCard.get("Cost").toString()));

					objCityAreaCard.SetCardID((jsonCityAreaCard.get("CardID").toString()));
					objCityAreaCard.SetActionID((jsonCityAreaCard.get("ActionID").toString()));
					objCityAreaCard.SetName((jsonCityAreaCard.get("AreaName").toString()));			
					objCityAreaCard.SetActionDescription((jsonCityAreaCard.get("ActionDescription").toString()));			
					objCityAreaCard.SetIsPlayed((Boolean)jsonCityAreaCard.get("IsPlayed"));
					objCityAreaCard.setName((jsonCityAreaCard.get("CardID").toString()));			

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
					objGreenCard.setName((jsonGreenCard.get("CardID").toString()));			

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
						JSONObject jsonBrownCard = (JSONObject)iRandomEventCard.next();
						objRandomEventCard.SetCardID((jsonBrownCard.get("CardID").toString()));
						objRandomEventCard.setPlayerID(Integer.parseInt(jsonBrownCard.get("PlayerID").toString()));
						objRandomEventCard.SetEventID((jsonBrownCard.get("EventID").toString()));
						objRandomEventCard.SetEventDescription((jsonBrownCard.get("EventDescription").toString()));			
						objRandomEventCard.SetIsPlayed((Boolean)jsonBrownCard.get("IsPlayed"));
						objRandomEventCard.setName((jsonBrownCard.get("CardID").toString()));			
	
						Game.lstRandomEventCards.add(objRandomEventCard);
					}
				}
				
				
				
				//Loading PLAYERS
				JSONArray Players = (JSONArray)json.get("Players");
				Iterator iPlayer = Players.iterator();
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
					
															
					Game.lstPlayers.add(Player);
					
				}
				
				
				//Loading BANK COINS
				Game.GameBank.objGoldCoin.setCoin_Type(Constants.GoldCoin());
				Game.GameBank.objGoldCoin.setCoin_Val(Constants.GoldCoinValue());
				Game.GameBank.objGoldCoin.setCoin_Available(Integer.parseInt(json.get("GoldCoins_Avail_Bank").toString()));
				
				Game.GameBank.objSilverCoin.setCoin_Type(Constants.SilverCoin());
				Game.GameBank.objSilverCoin.setCoin_Val(Constants.SilverCoinValue());
				Game.GameBank.objSilverCoin.setCoin_Available(Integer.parseInt(json.get("SilverCoins_Avail_Bank").toString()));
				
	
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
