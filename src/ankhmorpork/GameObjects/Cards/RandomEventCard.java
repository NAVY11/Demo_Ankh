package ankhmorpork.GameObjects.Cards;


// TODO: Auto-generated Javadoc
/**
 * The Class RandomEventCard.
 */
public class RandomEventCard extends Cards{

	@Override
	public String toString() {
		return "{\"EventID\":" +"\""+ EventID +"\""+ ", \"EventDescription\":"
				+"\""+ EventDescription +"\""+ ", \"CardID\":" + "\""+CardID + "\""+", \"IsPlayed\":"
				+ IsPlayed + ", \"Name\":" +"\""+ Name + "\""+", \"PlayerID\":" + PlayerID + "}";
	}

	/** The Event id. */
	private String EventID;
	
	/** The Event description. */
	private String EventDescription;
	
	/**
	 * Sets the card id.
	 *
	 * @param ID the id
	 */
	public void SetCardID(String ID)
	{
		this.CardID = ID;
	}
	
	/**
	 * Gets the card id.
	 *
	 * @return the string
	 */
	public String GetCardID()
	{
		return this.CardID;
	}
	
	/**
	 * Sets the is played.
	 *
	 * @param IsPlayed the is played
	 */
	public void SetIsPlayed(boolean IsPlayed)
	{
		this.IsPlayed = IsPlayed;
	}
	
	/**
	 * Gets the is played.
	 *
	 * @return true, if successful
	 */
	public boolean GetIsPlayed()
	{
		return this.IsPlayed;
	}
	
	/**
	 * Sets the event id.
	 *
	 * @param ID the id
	 */
	public void SetEventID(String ID)
	{
		this.EventID = ID;
	}
	
	/**
	 * Gets the event id.
	 *
	 * @return the string
	 */
	public String GetEventID()
	{
		return this.EventID;
	}
	
	/**
	 * Sets the event description.
	 *
	 * @param EventDescription the event description
	 */
	public void SetEventDescription(String EventDescription)
	{
		this.EventDescription = EventDescription;
	}
	
	/**
	 * Gets the event description.
	 *
	 * @return the string
	 */
	public String GetEventDescription()
	{
		return this.EventDescription;
	}
}
