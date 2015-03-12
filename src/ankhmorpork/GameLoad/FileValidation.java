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
 * The Class FileValidation.
 */
public class FileValidation {

	/**
	 * Validate.
	 *
	 * @param objFilereader the obj filereader
	 * @return true, if successful
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws ParseException the parse exception
	 */
	public static boolean Validate(FileReader objFilereader) throws IOException, ParseException
	{

				//FileReader objFilereader = new FileReader(File);		
				JSONParser jsonParser = new JSONParser();		
				JSONObject json = (JSONObject)jsonParser.parse(objFilereader);	
				int trollcount = 0, demoncount = 0, playercount = 0;
				
				//Loading TROLLS
				JSONArray Trolls = (JSONArray)json.get("Trolls");
				Iterator iTroll = Trolls.iterator();
				while (iTroll.hasNext())
				{
					trollcount ++;
				}
				
				//Loading DEMONS
				JSONArray Demons = (JSONArray)json.get("Demons");
				Iterator iDemon = Demons.iterator();
				while (iDemon.hasNext())
				{
					demoncount ++;
				}
				
				
				
				//Loading PLAYERS
				JSONArray Players = (JSONArray)json.get("Players");
				Iterator iPlayer = Players.iterator();
				while (iPlayer.hasNext())
				{
					playercount ++;
				}
				
				if((trollcount>1 && trollcount <=12) && (demoncount ==4) && (playercount >1 && playercount<=4))
				{
					return true;
				}
				else
					return false;
	
	}
	


	
}


