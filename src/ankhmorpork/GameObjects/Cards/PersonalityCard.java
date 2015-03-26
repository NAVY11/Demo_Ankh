package ankhmorpork.GameObjects.Cards;


// TODO: Auto-generated Javadoc
/**
 * The Class PersonalityCard.
 */
public class PersonalityCard extends Cards{
	
	@Override
	public String toString() {
		return "PersonalityCard [PersonalityName=" + PersonalityName
				+ ", PersonalityMotive=" + PersonalityMotive + ", CardID="
				+ CardID + ", IsPlayed=" + IsPlayed + ", Name=" + Name
				+ ", PlayerID=" + PlayerID + "]";
	}

	/** The Personality name. */
	private String PersonalityName;
	
	/** The Personality motive. */
	private String PersonalityMotive;
	
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
	 * Sets the personality name.
	 *
	 * @param PersonalityName the personality name
	 */
	public void SetPersonalityName(String PersonalityName)
	{
		this.PersonalityName = PersonalityName;
	}
	
	/**
	 * Gets the personality name.
	 *
	 * @return the string
	 */
	public String GetPersonalityName()
	{
		return this.PersonalityName;
	}
	
	/**
	 * Sets the personality motive.
	 *
	 * @param PersonalityMotive the personality motive
	 */
	public void SetPersonalityMotive(String PersonalityMotive)
	{
		this.PersonalityMotive = PersonalityMotive;
	}
	
	/**
	 * Gets the personality motive.
	 *
	 * @return the string
	 */
	public String GetPersonalityMotive()
	{
		return this.PersonalityMotive;
	}
}
