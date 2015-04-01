package ankhmorpork.GameLoad;

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
	 * @throws JSONException 
	 */
	public static boolean Validate(FileReader objFilereader) throws IOException, ParseException, JSONException
	{

				//FileReader objFilereader = new FileReader(File);
				JSONParser jsonparser = new JSONParser();		
				JSONObject json = (JSONObject)jsonparser.parse(objFilereader);		
				int trollcount = 0, demoncount = 0, playercount = 0, minioncount = 0;
				
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
				
				//Loading Minions
				JSONArray Minions = (JSONArray)json.get("Minion");
				Iterator iMinion = Minions.iterator();
				while (iMinion.hasNext())
				{
					minioncount ++;
				}
				
				System.out.println("troll count "+trollcount);
				System.out.println("demon count "+demoncount);
				System.out.println("players count "+playercount);
				System.out.println("minion count "+minioncount);

				if((trollcount==12) && (demoncount==4) && (playercount >1 && playercount<=4) && (minioncount==12 || minioncount==24 || minioncount==36 || minioncount==48))
				{
					return true;
				}
				else
					return false;
	
	}
	


	
}



