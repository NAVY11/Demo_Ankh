package ankhmorpork.GameObjects.Cards;

import java.util.Arrays;


// TODO: Auto-generated Javadoc
/**
 * The Class GreenCard.
 */
public class GreenCard extends Cards {
	@Override
	public String toString() {
		return "{\"ActionID\":" + "\""+Arrays.toString(ActionID)
				+"\""+ ", \"ActionDescription\":" +"\""+ ActionDescription +"\""+ ", \"CardID\":"
				+"\""+ CardID +"\""+ ", \"IsPlayed\":" + IsPlayed + ", \"Name\":" +"\""+ Name
				+"\""+ ", \"PlayerID\":" + PlayerID + "}";
	}

	//private int ActionID;
	/** The Action id. */
	private String[] ActionID;
	
	/** The Action description. */
	private String ActionDescription = new String();
	
	
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
	 * Sets the action.
	 *
	 * @param a the a
	 */
	public void SetAction(String[] a)
	{
		//this.Action = Arrays.copyOf(a, a.length);
		this.ActionID = a;
	}
	
    
	
	/**
	 * Gets the action.
	 *
	 * @return the string[]
	 */
	public String[] GetAction()
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
