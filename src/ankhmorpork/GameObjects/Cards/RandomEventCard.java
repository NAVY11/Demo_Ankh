package ankhmorpork.GameObjects.Cards;


public class RandomEventCard extends Cards{

	private int EventID;
	private String EventDescription;
	
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
	
	public void SetEventID(int ID)
	{
		this.EventID = ID;
	}
	
	public int GetEventID()
	{
		return this.EventID;
	}
	
	public void SetEventDescription(String EventDescription)
	{
		this.EventDescription = EventDescription;
	}
	
	public String GetEventDescription()
	{
		return this.EventDescription;
	}
}
