package ankhmorpork.GameLoad;
import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONArray;
//import org.json.simple.JSONArray;
import org.json.JSONException;
import org.json.JSONML;
import org.json.JSONObject;
//import org.json.simple.JSONObject;
import org.json.JSONString;
import org.json.JSONStringer;
import org.json.JSONTokener;
import org.json.JSONWriter;
import org.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Iterator;

//import jdk.nashorn.internal.runtime.Source;


public class GameSave {

	public static void SaveGame(FileWriter objFileWriter) throws IOException, JSONException
	{												
			//Player Player1 = NewGame.lstPlayers.get(0);						
			
			//jsonWriter.write(jsonGame.toString());
			//jsonWriter.write(jsonPlayerMinionsXX.toString());
		objFileWriter.write(jsonObjectWhileSavingGame().toString());
		objFileWriter.flush();
		objFileWriter.close();											

	}
	
	public static JSONObject jsonObjectWhileSavingGame()throws IOException, JSONException{
		//FileWriter jsonWriter = new FileWriter(objFileWriter);
		JSONObject jsonAddData = new JSONObject();
		
		//Saving TROLLS		
		jsonAddData.put("Trolls",Game.lstTrolls);
		
		//Saving DEMONS		
		jsonAddData.put("Demons",Game.lstDemons);
				
		//Saving Players		
		jsonAddData.put("Players",Game.lstPlayers);
		
		int PlayerID = 1;
		
		for(Player objPlayer: Game.lstPlayers)
		{
			
//			//Saving BUILDINGS			
//			jsonAddData.put("Buildings_"+PlayerID,objPlayer.lstBuildings);
//
//			//Saving MINIONS					
//			jsonAddData.put("Minions_"+PlayerID, objPlayer.lstMinions);
			
			//Saving GOLD COINS
			jsonAddData.put("GoldCoins_Avail_"+PlayerID,objPlayer.objGoldCoin.getCoin_Available());
			
			//Saving SILVER COINS
			jsonAddData.put("SilverCoins_Avail_"+PlayerID,objPlayer.objSilverCoin.getCoin_Available());
			
			PlayerID++;
			
		}
		

		//Saving Bank Coin details
		jsonAddData.put("GoldCoins_Avail_Bank",Game.GameBank.objGoldCoin.getCoin_Available());
		jsonAddData.put("SilverCoins_Avail_Bank",Game.GameBank.objSilverCoin.getCoin_Available());
		
		return jsonAddData;
		

	}

}
