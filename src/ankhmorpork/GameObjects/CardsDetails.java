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
//		ArrayList<Integer> a = new ArrayList();
//		a.add(1);
//		a.add(6);
//		greencard_details(a);
//	}
    static Object obj;
    static JSONParser parser = new JSONParser();
		
	public static void greencard_details(ArrayList<Integer> a) throws FileNotFoundException, IOException, ParseException, JSONException 
	{
		
		for(int i=0;i<a.size();i++)
	    {
	    String card = "g" +a.get(i);
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

	
	public static void browncard_details(ArrayList<Integer> a) throws FileNotFoundException, IOException, ParseException, JSONException 
	{
		
		for(int i=0;i<a.size();i++)
	    {
	    String card = "b" +a.get(i);
		obj = parser.parse(new FileReader("BrownCard.json"));

	  	System.out.println("-------USING JSON---------------------");

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
	
	public static void cityAreacard_details(ArrayList<Integer> a) throws FileNotFoundException, IOException, ParseException, JSONException 
	{
		
		for(int i=0;i<a.size();i++)
	    {
	    String card = "g" +a.get(i);
		obj = parser.parse(new FileReader("cityAreaCard.json"));

	  	System.out.println("-------USING JSON---------------------");

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
}

