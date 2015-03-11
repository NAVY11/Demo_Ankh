package ankhmorpork.GameObjects.Cards;

import java.util.Arrays;


public class GreenCard extends Cards {
	//private int ActionID;
	private String[] ActionID;
	private String ActionDescription = new String();
	
	public void SetCardID(String ID)
	{
		this.CardID = ID;
	}
	
	public String GetCardID()
	{
		return this.CardID;
	}
		
	public void SetIsPlayed(boolean IsPlayed)
	{
		this.IsPlayed = IsPlayed;
	}
	
	public boolean GetIsPlayed()
	{
		return this.IsPlayed;
	}
	
	public void SetAction(String[] a)
	{
		//this.Action = Arrays.copyOf(a, a.length);
		this.ActionID = a;
	}
	
    
	
	public String[] GetAction()
	{	
		return this.ActionID;
	}
	
	public void SetActionDescription(String EventDescription)
	{
		this.ActionDescription = EventDescription;
	}
	
	public String GetActionDescription()
	{
		return this.ActionDescription;
	}
}
