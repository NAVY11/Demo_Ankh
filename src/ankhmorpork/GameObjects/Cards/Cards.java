package ankhmorpork.GameObjects.Cards;

// TODO: Auto-generated Javadoc
/**
 * The Class Cards.
 */
public class Cards {
	
	/** The Card id. */
	public String CardID;	
	
	/** The Is played. */
	public boolean IsPlayed;
	
	/** The Name. */
	public String Name;
	
	/** The Player id. */
	public int PlayerID;
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName()
	{
		return this.Name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param Name the new name
	 */
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	/**
	 * Gets the player id.
	 *
	 * @return the player id
	 */
	public int getPlayerID()
	{
		return this.PlayerID;
	}
	
	/**
	 * Sets the player id.
	 *
	 * @param PlayerID the new player id
	 */
	public void setPlayerID(int PlayerID)
	{
		this.PlayerID = PlayerID;
	}
}
