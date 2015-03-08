package ankhmorpork.GameObjects.Cards;

import java.util.Arrays;


public class GreenCard extends Cards {
	//private int ActionID;
	public String Action[];
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
		this.Action = a;
	}
	
    
	
	public String[] GetAction()
	{	
		return this.Action;
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
