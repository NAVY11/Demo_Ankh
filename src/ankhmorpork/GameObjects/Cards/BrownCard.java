package ankhmorpork.GameObjects.Cards;


// TODO: Auto-generated Javadoc
/**
 * The Class BrownCard.
 */
public class BrownCard extends Cards{
	
	/** The Action id. */
	private String ActionID[];
	
	/** The Action description. */
	private String ActionDescription;
	
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
	 * Sets the action id.
	 *
	 * @param ID the id
	 */
	public void SetActionID(String[] ID)
	{
		this.ActionID = ID;
	}
	
	/**
	 * Gets the action id.
	 *
	 * @return the string[]
	 */
	public String[] GetActionID()
	{
		return this.ActionID;
	}
	
	/**
	 * Sets the action description.
	 *
	 * @param EventDescription the event description
	 */
	public void SetActionDescription(String EventDescription)
	{
		this.ActionDescription = EventDescription;
	}
	
	/**
	 * Gets the action description.
	 *
	 * @return the string
	 */
	public String GetActionDescription()
	{
		return this.ActionDescription;
	}
}
