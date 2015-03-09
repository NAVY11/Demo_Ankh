package ankhmorpork.GameObjects.Cards;


public class CityAreaCard extends Cards{
	private String ActionID;
	private String ActionDescription;
	private int AreaID;
	private String AreaName;
	
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
	
	public void SetActionID(String ID)
	{
		this.ActionID = ID;
	}
	
	public String GetActionID()
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
	
	public void SetAreaID(int ID)
	{
		this.AreaID = ID;
	}
	
	public int GetAreaID()
	{
		return this.AreaID;
	}
	
	public void SetName(String AreaName)
	{
		this.AreaName = AreaName;
	}
	
	public String GetAreaName()
	{
		return this.AreaName;
	}
}
