package ankhmorpork.GameObjects.Cards;


public class RandomEventCard extends Cards{

	private String EventID;
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
	
	public void SetEventID(String ID)
	{
		this.EventID = ID;
	}
	
	public String GetEventID()
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
