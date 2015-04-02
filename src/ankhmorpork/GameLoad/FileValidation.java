package ankhmorpork.GameLoad;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;













import javax.swing.JFileChooser;





//import org.json.JSONArray;
import org.json.simple.JSONArray;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import ankhmorpork.GameObjects.Building;
import ankhmorpork.GameObjects.Demon;
import ankhmorpork.GameObjects.Minion;
import ankhmorpork.GameObjects.Player;
import ankhmorpork.GameObjects.Troll;
import ankhmorpork.GameObjects.TroubleMaker;

// TODO: Auto-generated Javadoc
/**
 * The Class FileValidation.
 */
public class FileValidation {

	/**
	 * Validate.
	 *
	 * @param json the json
	 * @param objFilereader the obj filereader
	 * @return true, if successful
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws ParseException the parse exception
	 * @throws JSONException the JSON exception
	 */
	public static void Validate(JSONObject json,FileReader objFilereader) throws IOException, ParseException, JSONException
	{

				//FileReader objFilereader = new FileReader(File);
				int trollcount = 0, demoncount = 0,buildingcount =0,troublemakercount = 0, playercount = 0, minioncount = 0;
				boolean success;

				//Counting TROLLS
				JSONArray Trolls = (JSONArray)json.get("Trolls");
				Iterator iTroll = Trolls.iterator();
				while (iTroll.hasNext())
				{
					Troll objTroll = new Troll();
					JSONObject jsonTroll = (JSONObject)iTroll.next();
					trollcount ++;
				}
				
				//Counting DEMONS
				JSONArray Demons = (JSONArray)json.get("Demons");
				Iterator iDemon = Demons.iterator();
				while (iDemon.hasNext())
				{
					Demon objDemon = new Demon();
					JSONObject jsonTroll = (JSONObject)iDemon.next();
					demoncount ++;
				}
				
				//Counting Buildings
				JSONArray Buildings = (JSONArray)json.get("Building");
				Iterator iBuilding = Buildings.iterator();
				while (iBuilding.hasNext())
				{
										
					Building objBuilding = new Building();				
					JSONObject jsonBuilding = (JSONObject)iBuilding.next();			
					buildingcount++;
				}
				
				//Loading TroubleMarker
				JSONArray TroubleMaker = (JSONArray)json.get("TroubleMaker");
				Iterator iTroubleMaker = TroubleMaker.iterator();
				while (iTroubleMaker.hasNext())
				{
										
					TroubleMaker objTroubleMaker = new TroubleMaker();				
					JSONObject jsonTroubleMaker = (JSONObject)iTroubleMaker.next();
					troublemakercount++;
				}
				
				//Loading PLAYERS
				JSONArray Players = (JSONArray)json.get("Players");
				Iterator iPlayer = Players.iterator();
				while (iPlayer.hasNext())
				{
					Player Player = new Player();
					JSONObject jsonPlayer = (JSONObject)iPlayer.next();
					playercount ++;
				}
				
				//Loading Minions
				JSONArray Minions = (JSONArray)json.get("Minion");
				Iterator iMinion = Minions.iterator();
				while (iMinion.hasNext())
				{
					Minion objMinion = new Minion();
					JSONObject jsonMinion = (JSONObject)iMinion.next();
					minioncount ++;
				}
				

				if((trollcount==3) && (troublemakercount == 12) && (demoncount==4) && (playercount >=2 && playercount<=4) && (minioncount==12 || minioncount==24 || minioncount==36 || minioncount==48) && (buildingcount == 6 || buildingcount == 12 || buildingcount == 18 || buildingcount == 24  ))
				{
					success = true;
				}
				else
					success = false;
				
				while(!success)
							{
								System.out.println("Invalid File. Please Choose valid file");
								try {
									JFileChooser chooser = new JFileChooser();
								    chooser.setCurrentDirectory(new File("/home/me/Documents"));
								    int retrival = chooser.showOpenDialog(null);
								    if (retrival == JFileChooser.APPROVE_OPTION) {
								    		
								             objFilereader = new FileReader(chooser.getSelectedFile());
								     		 GameLoad.LoadGame(objFilereader);
					
								    } 	
								    else if(retrival == JFileChooser.CANCEL_OPTION)
								    {
								    	System.exit(0);
								    }
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								} 
								
								
							}
	
	}
	


	
}



