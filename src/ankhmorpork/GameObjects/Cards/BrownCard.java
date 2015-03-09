package ankhmorpork.GameObjects.Cards;


public class BrownCard extends Cards{
	private String ActionID[];
	private String ActionDescription;
	
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
	
	public void SetActionID(String[] ID)
	{
		this.ActionID = ID;
	}
	
	public String[] GetActionID()
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
