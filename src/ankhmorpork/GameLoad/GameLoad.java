package ankhmorpork.GameLoad;
import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.*;
import ankhmorpork.GameObjects.Cards.BrownCard;
import ankhmorpork.GameObjects.Cards.CityAreaCard;
import ankhmorpork.GameObjects.Cards.GreenCard;
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
					
					//Loading MINIONS
					JSONArray Minions = (JSONArray)json.get("Minions_"+Player.getPlayer_id());
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
						Player.lstMinions.add(objMinion);
					}
					
					//Loading BUILDINGS
					JSONArray Buildings = (JSONArray)json.get("Buildings_"+Player.getPlayer_id());
					Iterator iBuilding = Buildings.iterator();
					while(iBuilding.hasNext())
					{										
						Building objBuilding = new Building();				
						JSONObject jsonBuilding = (JSONObject)iBuilding.next();				
						objBuilding.setBuilding_id(Integer.parseInt(jsonBuilding.get("building_id").toString()));
						objBuilding.setActive((Boolean)jsonBuilding.get("active"));
						objBuilding.setArea_id(Integer.parseInt(jsonBuilding.get("area_id").toString()));
						objBuilding.setColor((String)jsonBuilding.get("color"));				
						objBuilding.setPlayer_id(Integer.parseInt(jsonBuilding.get("player_id").toString()));
						Player.lstBuildings.add(objBuilding);
					}
					
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
	
	public static Game CityAreaCard_Details() throws FileNotFoundException, IOException, ParseException, JSONException 
	{
		Game LoadedGame = new Game();
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
			objCityAreaCard.SetAreaID(Integer.parseInt(cityAreaCards.get("AreaID").toString()));
			LoadedGame.lstCityAreaCards.add(objCityAreaCard);

	    }

		return LoadedGame;

}

	
	
	
	
	public static Game GreenCard_Details() throws FileNotFoundException, IOException, ParseException, JSONException 
	{
		Game LoadedGame = new Game();
	    Object obj;
	    JSONParser parser = new JSONParser();

		for(int i=1;i<49;i++)
	    {
			GreenCard gc = new GreenCard();
			String card = "g"+i;
			obj = parser.parse(new FileReader("GreenCard.json"));

			org.json.JSONObject jsonObject =  new org.json.JSONObject(obj.toString());
			org.json.JSONObject green =  jsonObject.getJSONObject(card);
			
			String s = (String) green.get("IsPlayed");
			gc.SetIsPlayed(Boolean.valueOf(Boolean.valueOf(s)));
			
			gc.SetActionDescription((String)green.get("ActionDescription"));
			
			gc.setName((String) green.get("Name"));
			
			gc.SetCardID(card);
			String a1 = (String) green.get("Action");
			String[] a2 = a1.split(",");
			gc.SetAction(a2);
			
			LoadedGame.lstGreenCards.add(gc);

	    }

		return LoadedGame;

}
	
	public static Game Browncard_Details() throws FileNotFoundException, IOException, ParseException, JSONException 
	{
		Game LoadedGame = new Game();
	    Object obj;
	    JSONParser parser = new JSONParser();

		for(int i=1;i<54;i++)
	    {
			BrownCard bc = new BrownCard();
			String card = "b"+i;
			obj = parser.parse(new FileReader("BrownCard.json"));

			org.json.JSONObject jsonObject =  new org.json.JSONObject(obj.toString());
			org.json.JSONObject brown =  jsonObject.getJSONObject(card);
			
			String s = (String) brown.get("IsPlayed");
			bc.SetIsPlayed(Boolean.valueOf(Boolean.valueOf(s)));
			
			bc.SetActionDescription((String)brown.get("ActionDescription"));
			
			bc.setName((String) brown.get("Name"));
			
			bc.SetCardID(card);
			String a1 = (String) brown.get("Action");
			String[] a2 = a1.split(",");
			bc.SetActionID(a2);
			
			LoadedGame.lstBrownCards.add(bc);

	    }

		return LoadedGame;

}
	
	public static Game RandomEventCard_Details() throws FileNotFoundException, IOException, ParseException, JSONException 
	{
		Game LoadedGame = new Game();
	    Object obj;
	    JSONParser parser = new JSONParser();

		for(int i=1;i<13;i++)
	    {
			RandomEventCard rec = new RandomEventCard();
			String card = "e"+i;
			obj = parser.parse(new FileReader("RandomEventCard.json"));

			org.json.JSONObject jsonObject =  new org.json.JSONObject(obj.toString());
			org.json.JSONObject randomevent =  jsonObject.getJSONObject(card);
			
			String s = (String) randomevent.get("IsPlayed");
			rec.SetIsPlayed(Boolean.valueOf(Boolean.valueOf(s)));
			
			rec.SetEventDescription((String)randomevent.get("EventDescription"));
			
			rec.setName((String) randomevent.get("Name"));
			
			rec.SetCardID(card);
			rec.SetEventID(card);

			
			LoadedGame.lstRandomEventCards.add(rec);

	    }

		return LoadedGame;

}
}
