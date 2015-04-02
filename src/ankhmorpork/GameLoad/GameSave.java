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

// TODO: Auto-generated Javadoc
//import jdk.nashorn.internal.runtime.Source;


/**
 * The Class GameSave.
 */
public class GameSave {

	/**
	 * Save game.
	 *
	 * @param objFileWriter the obj file writer
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws JSONException the JSON exception
	 */
	public static void SaveGame(FileWriter objFileWriter, Player objPlayer) throws IOException, JSONException
	{												
			
		String strCardDetails = 	",\"CityAreaCards\":"+Game.lstCityAreaCards.toString() +"," + "\"GreenCards\":"+Game.lstGreenCards.toString() +","+"\"RandomEventCards\":"+Game.lstRandomEventCards.toString()+","+"\"PersonalityCards\":"+Game.lstPersonalityCard.toString() +"}";
		String json = jsonObjectWhileSavingGame(objPlayer).toString();
		json = json.substring(0,json.length()-1);
				
		objFileWriter.write(json + strCardDetails);		
		objFileWriter.flush();
		objFileWriter.close();											

	}
	
	/**
	 * Json object while saving game.
	 *
	 * @return the JSON object
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws JSONException the JSON exception
	 */
	public static JSONObject jsonObjectWhileSavingGame(Player objPlayer)throws IOException, JSONException{
		//FileWriter jsonWriter = new FileWriter(objFileWriter);
		JSONObject jsonAddData = new JSONObject();
		
		//Saving TROLLS
		jsonAddData.put("Trolls",Game.lstTrolls);
		
		//Saving DEMONS		
		jsonAddData.put("Demons",Game.lstDemons);
				
		//Saving Players		
		jsonAddData.put("Players",Game.lstPlayers);
		
		//Saving Building
		jsonAddData.put("Building",Game.lstBuildings);
		
		//Saving Area
		jsonAddData.put("Area",Game.lstArea);
		
		//Saving TroubleMaker
		jsonAddData.put("TroubleMaker",Game.lstTroubleMaker);
		
		//Saving Minions
		jsonAddData.put("Minion", Game.lstMinions);
		
		//Saving Bank Coin details
		jsonAddData.put("GoldCoins_Avail_Bank",Game.GameBank.objGoldCoin.getCoin_Available());
		jsonAddData.put("SilverCoins_Avail_Bank",Game.GameBank.objSilverCoin.getCoin_Available());
		jsonAddData.put("Total_Avail_Bank", Game.GameBank.getBankAmount());
		
		//Current Player Playing
		Integer playerIdToSave = objPlayer.getPlayer_id() -1;
		if(playerIdToSave == 0){
			playerIdToSave = Game.lstPlayers.size();
		}
		jsonAddData.put("currentPlayerId", playerIdToSave);
		
		return jsonAddData;
		

	}

}