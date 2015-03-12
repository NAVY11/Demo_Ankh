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

public class GameLoad {

	public static Game LoadGame(FileReader objFilereader) throws IOException, ParseException
	{

				Game LoadedGame = new Game();
				//FileReader objFilereader = new FileReader(File);		
				JSONParser jsonParser = new JSONParser();		
				JSONObject json = (JSONObject)jsonParser.parse(objFilereader);		
				
				//Loading Areas
				JSONArray Areas = (JSONArray)json.get("Areas");
				Iterator iAreas = Areas.iterator();
				while (iAreas.hasNext())
				{
					Area objAreas = new Area();
					JSONObject jsonTroll = (JSONObject)iAreas.next();
					objAreas.setAreaBelongsTo(Integer.parseInt(jsonTroll.get("belongs_to").toString()));
					objAreas.setAreaName((jsonTroll.get("area_name").toString()));	
					objAreas.setAreaCost(Integer.parseInt(jsonTroll.get("area_cost").toString()));			
					objAreas.setAreaID(Integer.parseInt(jsonTroll.get("area_id").toString()));
					LoadedGame.lstArea.add(objAreas);
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
					LoadedGame.lstTrolls.add(objTroll);
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
					LoadedGame.lstDemons.add(objDemon);
				}
				
				//Loading TroubleMarker
				JSONArray TroubleMarker = (JSONArray)json.get("TroubleMarker");
				Iterator iTroublemarker = TroubleMarker.iterator();
				while (iTroublemarker.hasNext())
				{
					TroubleMaker objTroublemaker = new TroubleMaker();
					JSONObject jsonTroll = (JSONObject)iDemon.next();
					objTroublemaker.setActive((Boolean)jsonTroll.get("active"));
					objTroublemaker.setTm_id(Integer.parseInt(jsonTroll.get("tm_id").toString()));			
					objTroublemaker.setArea_id(Integer.parseInt(jsonTroll.get("area_id").toString()));
					LoadedGame.lstTroubleMaker.add(objTroublemaker);
				}
				
				//Loading Minions
				JSONArray Minions = (JSONArray)json.get("Minions");
				Iterator iMinions = Minions.iterator();
				while (iMinions.hasNext())
				{
					Minion objMinions = new Minion();
					JSONObject jsonMinions = (JSONObject)iMinions.next();
					objMinions.setActive((Boolean)jsonMinions.get("active"));
					objMinions.setMinion_id(Integer.parseInt(jsonMinions.get("minion_id").toString()));			
					objMinions.setArea_id(Integer.parseInt(jsonMinions.get("area_id").toString()));
					objMinions.setColor((jsonMinions.get("color").toString()));
					objMinions.setPlayer_id(Integer.parseInt(jsonMinions.get("player_id").toString()));


					LoadedGame.lstMinions.add(objMinions);
				}
				
				//Loading Buildings
				JSONArray Buidings = (JSONArray)json.get("Buildings");
				Iterator iBuildings = Buidings.iterator();
				while (iBuildings.hasNext())
				{
					Building objBuildings = new Building();
					JSONObject jsonBuildings = (JSONObject)iBuildings.next();
					objBuildings.setActive((Boolean)jsonBuildings.get("active"));
					objBuildings.setBuilding_id(Integer.parseInt(jsonBuildings.get("building_id").toString()));			
					objBuildings.setArea_id(Integer.parseInt(jsonBuildings.get("area_id").toString()));
					objBuildings.setColor((jsonBuildings.get("color").toString()));
					objBuildings.setPlayer_id(Integer.parseInt(jsonBuildings.get("player_id").toString()));


					LoadedGame.lstBuildings.add(objBuildings);
				}
				
				//Loading CityAreaCards
				JSONArray CityAreaCard = (JSONArray)json.get("CityAreaCards");
				Iterator iCityAreaCard = CityAreaCard.iterator();
				while (iCityAreaCard.hasNext())
				{
					CityAreaCard objCityAreaCard = new CityAreaCard();
					JSONObject jsonCityAreaCard = (JSONObject)iCityAreaCard.next();
					objCityAreaCard.SetAreaID(Integer.parseInt(jsonCityAreaCard.get("AreaID").toString()));
					objCityAreaCard.SetCardID((jsonCityAreaCard.get("CardID").toString()));
					objCityAreaCard.SetActionID((jsonCityAreaCard.get("ActionID").toString()));
					objCityAreaCard.SetName((jsonCityAreaCard.get("AreaName").toString()));			
					objCityAreaCard.SetActionDescription((jsonCityAreaCard.get("ActionDescription").toString()));			
					objCityAreaCard.SetIsPlayed((Boolean)jsonCityAreaCard.get("IsPlayed"));
					objCityAreaCard.setName((jsonCityAreaCard.get("Name").toString()));			

					LoadedGame.lstCityAreaCards.add(objCityAreaCard);
				}
				
				//Loading GreenCards
				JSONArray GreenCard = (JSONArray)json.get("GreenCards");
				Iterator iGreenCard = GreenCard.iterator();
				while (iGreenCard.hasNext())
				{
					GreenCard objGreenCard = new GreenCard();
					JSONObject jsonGreenCard = (JSONObject)iGreenCard.next();
					objGreenCard.SetCardID((jsonGreenCard.get("CardID").toString()));
					//objGreenCard.SetActionID((jsonGreenCard.get("ActionID").toString()));
					objGreenCard.SetActionDescription((jsonGreenCard.get("ActionDescription").toString()));			
					objGreenCard.SetIsPlayed((Boolean)jsonGreenCard.get("IsPlayed"));
					objGreenCard.setName((jsonGreenCard.get("Name").toString()));			

					LoadedGame.lstGreenCards.add(objGreenCard);
				}
				
				//Loading BrownCards
				JSONArray BrownCard = (JSONArray)json.get("BrownCards");
				Iterator iBrownCard = BrownCard.iterator();
				while (iBrownCard.hasNext())
				{
					BrownCard objBrownCard = new BrownCard();
					JSONObject jsonBrownCard = (JSONObject)iBrownCard.next();
					objBrownCard.SetCardID((jsonBrownCard.get("CardID").toString()));
					//objBrownCard.SetActionID((jsonBrownCard.get("ActionID").toString()));
					objBrownCard.SetActionDescription((jsonBrownCard.get("ActionDescription").toString()));			
					objBrownCard.SetIsPlayed((Boolean)jsonBrownCard.get("IsPlayed"));
					objBrownCard.setName((jsonBrownCard.get("Name").toString()));			

					LoadedGame.lstBrownCards.add(objBrownCard);
				}
				
				//Loading PersonalityCards
				JSONArray PersonalityCard = (JSONArray)json.get("PersonalityCards");
				Iterator iPersonalityCard = BrownCard.iterator();
				while (iBrownCard.hasNext())
				{
					PersonalityCard objPersonalityCard = new PersonalityCard();
					JSONObject jsonPersonalityCard = (JSONObject)iBrownCard.next();
					objPersonalityCard.SetCardID((jsonPersonalityCard.get("CardID").toString()));
					objPersonalityCard.SetPersonalityName((jsonPersonalityCard.get("PersonalityName").toString()));
					objPersonalityCard.SetPersonalityMotive((jsonPersonalityCard.get("PersonalityMotive").toString()));			
					objPersonalityCard.SetIsPlayed((Boolean)jsonPersonalityCard.get("IsPlayed"));
					objPersonalityCard.setName((jsonPersonalityCard.get("Name").toString()));			

					LoadedGame.lstPersonalityCard.add(objPersonalityCard);
				}
				
				//Loading RandomEventCards
				JSONArray RandomEventCard = (JSONArray)json.get("RandomEventCards");
				Iterator iRandomEventCard = RandomEventCard.iterator();
				while (iRandomEventCard.hasNext())
				{
					RandomEventCard objRandomEventCard = new RandomEventCard();
					JSONObject jsonBrownCard = (JSONObject)iBrownCard.next();
					objRandomEventCard.SetCardID((jsonBrownCard.get("CardID").toString()));
					objRandomEventCard.SetEventID((jsonBrownCard.get("EventID").toString()));
					objRandomEventCard.SetEventDescription((jsonBrownCard.get("EventDescription").toString()));			
					objRandomEventCard.SetIsPlayed((Boolean)jsonBrownCard.get("IsPlayed"));
					objRandomEventCard.setName((jsonBrownCard.get("Name").toString()));			

					LoadedGame.lstRandomEventCards.add(objRandomEventCard);
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
					
//					//Loading MINIONS
//					JSONArray Minions = (JSONArray)json.get("Minions_"+Player.getPlayer_id());
//					Iterator iMinion = Minions.iterator();
//					while(iMinion.hasNext())
//					{
//						Minion objMinion = new Minion();
//						JSONObject jsonMinion = (JSONObject)iMinion.next();
//						objMinion.setActive((Boolean)jsonMinion.get("active"));
//						objMinion.setArea_id(Integer.parseInt(jsonMinion.get("area_id").toString()));
//						objMinion.setColor((String)jsonMinion.get("color"));
//						objMinion.setMinion_id(Integer.parseInt(jsonMinion.get("minion_id").toString()));
//						objMinion.setPlayer_id(Integer.parseInt(jsonMinion.get("player_id").toString()));
//						Player.lstMinions.add(objMinion);
//					}
//					
//					//Loading BUILDINGS
//					JSONArray Buildings = (JSONArray)json.get("Buildings_"+Player.getPlayer_id());
//					Iterator iBuilding = Buildings.iterator();
//					while(iBuilding.hasNext())
//					{										
//						Building objBuilding = new Building();				
//						JSONObject jsonBuilding = (JSONObject)iBuilding.next();				
//						objBuilding.setBuilding_id(Integer.parseInt(jsonBuilding.get("building_id").toString()));
//						objBuilding.setActive((Boolean)jsonBuilding.get("active"));
//						objBuilding.setArea_id(Integer.parseInt(jsonBuilding.get("area_id").toString()));
//						objBuilding.setColor((String)jsonBuilding.get("color"));				
//						objBuilding.setPlayer_id(Integer.parseInt(jsonBuilding.get("player_id").toString()));
//						Player.lstBuildings.add(objBuilding);
//					}
					
					//Loading Player GOLD COINS
					//JSONObject jsonGoldCoin = (JSONObject)json.get("GoldCoins_"+Player.getPlayer_id());
					Player.objGoldCoin.setCoin_Type(Constants.GoldCoin());
					Player.objGoldCoin.setCoin_Available(Integer.parseInt(json.get("GoldCoins_Avail_"+Player.getPlayer_id()).toString()));
					Player.objGoldCoin.setCoin_Val(Constants.GoldCoinValue());
					
					//Loading Player SILVER COINS															
					Player.objSilverCoin.setCoin_Type(Constants.SilverCoin());
					Player.objSilverCoin.setCoin_Available(Integer.parseInt(json.get("SilverCoins_Avail_"+Player.getPlayer_id()).toString()));
					Player.objSilverCoin.setCoin_Val(Constants.SilverCoinValue());
															
					LoadedGame.lstPlayers.add(Player);
					
				}
				
				//Loading BANK COINS
				LoadedGame.GameBank.objGoldCoin.setCoin_Type(Constants.GoldCoin());
				LoadedGame.GameBank.objGoldCoin.setCoin_Val(Constants.GoldCoinValue());
				LoadedGame.GameBank.objGoldCoin.setCoin_Available(Integer.parseInt(json.get("GoldCoins_Avail_Bank").toString()));
				
				LoadedGame.GameBank.objSilverCoin.setCoin_Type(Constants.SilverCoin());
				LoadedGame.GameBank.objSilverCoin.setCoin_Val(Constants.SilverCoinValue());
				LoadedGame.GameBank.objSilverCoin.setCoin_Available(Integer.parseInt(json.get("SilverCoins_Avail_Bank").toString()));
				
				return LoadedGame;	
	
	}
	

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
