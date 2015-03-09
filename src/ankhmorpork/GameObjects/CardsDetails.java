package ankhmorpork.GameObjects;
import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.Cards.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class CardsDetails {
	
	public static void main(String args[]) throws JSONException, IOException, ParseException
	{
		greencard_details();
	}

		
	public static Game greencard_details() throws FileNotFoundException, IOException, ParseException, JSONException 
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

	
	
	
	public static void cityAreacard_details(ArrayList<String> cityAreaCard) throws FileNotFoundException, IOException, ParseException, JSONException 
	{
	    Object obj;
	    JSONParser parser = new JSONParser();
		for(int i=0;i<cityAreaCard.size();i++)
	    {
			String card = cityAreaCard.get(i);
			obj = parser.parse(new FileReader("cityAreaCard.json"));


			org.json.JSONObject jsonObject =  new org.json.JSONObject(obj.toString());
			org.json.JSONObject cityareacard =  jsonObject.getJSONObject(card);


	    }

	}
	
	public static void randomEvent_details(ArrayList<String> randomEventCard) throws FileNotFoundException, IOException, ParseException, JSONException 
	{
	    Object obj;
	    JSONParser parser = new JSONParser();
		
		for(int i=0;i<randomEventCard.size();i++)
	    {
			String card = randomEventCard.get(i);
			obj = parser.parse(new FileReader("cityAreaCard.json"));

			System.out.println("-------USING JSON---------------------");

			org.json.JSONObject jsonObject =  new org.json.JSONObject(obj.toString());
			org.json.JSONObject randomevent =  jsonObject.getJSONObject(card);


	    }

	}
}

