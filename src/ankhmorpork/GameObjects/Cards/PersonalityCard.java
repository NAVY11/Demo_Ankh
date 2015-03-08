package ankhmorpork.GameObjects.Cards;


public class PersonalityCard extends Cards{
	private String PersonalityName;
	private String PersonalityMotive;
	
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
	
	public void SetPersonalityName(String PersonalityName)
	{
		this.PersonalityName = PersonalityName;
	}
	
	public String GetPersonalityName()
	{
		return this.PersonalityName;
	}
	
	public void SetPersonalityMotive(String PersonalityMotive)
	{
		this.PersonalityMotive = PersonalityMotive;
	}
	
	public String GetPersonalityMotive()
	{
		return this.PersonalityMotive;
	}
}
