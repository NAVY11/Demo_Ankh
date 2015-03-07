package ankhmorpork.GameObjects;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class CardsDetails {
	
//	public static void main(String args[]) throws JSONException, IOException, ParseException
//	{
//		ArrayList<String> a = new ArrayList();
//		a.add("g1");
//		a.add("g6");
//		greencard_details(a);
//	}
    static Object obj;
    static JSONParser parser = new JSONParser();
		
	public static void greencard_details(ArrayList<String> GreenCard) throws FileNotFoundException, IOException, ParseException, JSONException 
	{
		
		for(int i=0;i<GreenCard.size();i++)
	    {
			String card = GreenCard.get(i);
			obj = parser.parse(new FileReader("GreenCard.json"));

			org.json.JSONObject jsonObject =  new org.json.JSONObject(obj.toString());
			org.json.JSONObject green =  jsonObject.getJSONObject(card);

 
			System.out.println("Name " +(String) green.get("Name"));
			System.out.println("Description " +(String) green.get("Description"));
			JSONArray action = green.getJSONArray("Action");
			for(int j =0;j<action.length();j++)
			{
				System.out.println(action.getString(j));
			}
	    }

}

	
	public static void browncard_details(ArrayList<String> BrownCard) throws FileNotFoundException, IOException, ParseException, JSONException 
	{
		
		for(int i=0;i<BrownCard.size();i++)
	    {
			String card = BrownCard.get(i);
			obj = parser.parse(new FileReader("BrownCard.json"));

			org.json.JSONObject jsonObject =  new org.json.JSONObject(obj.toString());
			org.json.JSONObject brown =  jsonObject.getJSONObject(card);

 
			System.out.println("Name " +(String) brown.get("Name"));
			System.out.println("Description " +(String) brown.get("Description"));
			JSONArray action = brown.getJSONArray("Action");
			for(int j =0;j<action.length();j++)
			{
			System.out.println(action.getString(j));
			}
	    }

}
	
	public static void cityAreacard_details(ArrayList<String> cityAreaCard) throws FileNotFoundException, IOException, ParseException, JSONException 
	{
		
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

