package ankhmorpork.GameLoad;
import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.*;
import ankhmorpork.GameConstants.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

//import org.json.JSONArray;
import org.json.simple.JSONArray;
import org.json.JSONException;
import org.json.JSONML;
//import org.json.JSONObject;
import org.json.simple.JSONObject;
import org.json.JSONString;
import org.json.JSONStringer;
import org.json.JSONTokener;
import org.json.JSONWriter;
import org.*;
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
}
