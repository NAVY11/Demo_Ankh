package ankhmorpork.GameObjects.Cards;

public class Cards {
	public String CardID;	
	public boolean IsPlayed;
	public String Name;
	public int PlayerID;
	
	public String getName()
	{
		return this.Name;
	}
	public void setName(String Name)
	{
		this.Name = Name;
	}
	public int getPlayerID()
	{
		return this.PlayerID;
	}
	public void setPlayerID(int PlayerID)
	{
		this.PlayerID = PlayerID;
	}
}
