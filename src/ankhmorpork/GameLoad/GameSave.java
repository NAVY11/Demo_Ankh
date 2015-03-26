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
	public static void SaveGame(FileWriter objFileWriter) throws IOException, JSONException
	{												
			//Player Player1 = NewGame.lstPlayers.get(0);						
			
			//jsonWriter.write(jsonGame.toString());
			//jsonWriter.write(jsonPlayerMinionsXX.toString());
		objFileWriter.write(jsonObjectWhileSavingGame().toString());
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
	public static JSONObject jsonObjectWhileSavingGame()throws IOException, JSONException{
		//FileWriter jsonWriter = new FileWriter(objFileWriter);
		JSONObject jsonAddData = new JSONObject();
		
		//Saving TROLLS
		jsonAddData.put("Trolls",Game.lstTrolls.toString());
		
		//Saving DEMONS		
		jsonAddData.put("Demons",Game.lstDemons.toString());
				
		//Saving Players		
		jsonAddData.put("Players",Game.lstPlayers.toString());
		
		//Saving Building
		jsonAddData.put("Building",Game.lstBuildings.toString());
		
		//Saving Area
		jsonAddData.put("Area",Game.lstArea.toString());
		
		//Saving TroubleMaker
		jsonAddData.put("TroubleMaker",Game.lstTroubleMaker.toString());
		
		//Saving CityAreaCard
		jsonAddData.put("CityAreaCards",Game.lstCityAreaCards.toString());
		
		//Saving GreenCard
		jsonAddData.put("GreenCards",Game.lstGreenCards.toString());
		
		//Saving BrownCard -- Not needed now
		//jsonAddData.put("BrownCard",Game.lstBrownCards.toString());
		
		//Saving RandomEventCard
		jsonAddData.put("RandomEventCards",Game.lstRandomEventCards.toString());
		
		//Saving BrownCard
		jsonAddData.put("PersonalityCard",Game.lstPersonalityCard.toString());
		
		//Saving Minions
		jsonAddData.put("Minion", Game.lstMinions.toString());
		
		//Saving Bank Coin details
		jsonAddData.put("GoldCoins_Avail_Bank",Game.GameBank.objGoldCoin.toString());
		jsonAddData.put("SilverCoins_Avail_Bank",Game.GameBank.objSilverCoin.toString());
		
		return jsonAddData;
		

	}

}