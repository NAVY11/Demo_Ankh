package ankhmorpork.GameObjects.Cards;


public class GreenCard extends Cards {
	//private int ActionID;
	private String[] Action = new String[3];
	private String ActionDescription = new String();
	
	public void SetCardID(int ID)
	{
		this.CardID = ID;
	}
	
	public int GetCardID()
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
	
	public void SetAction(String[] Action)
	{
		this.Action = Action;
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
