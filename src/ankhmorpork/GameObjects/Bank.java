package ankhmorpork.GameObjects;

import ankhmorpork.GameConstants.Constants;

// TODO: Auto-generated Javadoc
/**
 * The Class Bank.
 */
public class Bank {
	
	/** The player_amount. */
	Float player_amount;
	
	/** The Bank_ amount. */
	Float Bank_Amount;
	
	/** The player_personality_card_id. */
	Integer player_personality_card_id;	
	
	/** The city area cards list comma separated. */
	String cityAreaCardsListCommaSeparated;
	
	/** The personality card list comma separated. */
	String personalityCardListCommaSeparated;
	
	/** The obj gold coin. */
	public Coins objGoldCoin = new Coins(Constants.GoldCoin());
	
	/** The obj silver coin. */
	public Coins objSilverCoin = new Coins(Constants.SilverCoin());
	
	/**
	 * Gets the city area cards list comma separated.
	 *
	 * @return the city area cards list comma separated
	 */
	public String getCityAreaCardsListCommaSeparated() {
		return cityAreaCardsListCommaSeparated;
	}
	
	/**
	 * Sets the city area cards list comma separated.
	 *
	 * @param cityAreaCardsListCommaSeparated the new city area cards list comma separated
	 */
	public void setCityAreaCardsListCommaSeparated(
			String cityAreaCardsListCommaSeparated) {
		this.cityAreaCardsListCommaSeparated = cityAreaCardsListCommaSeparated;
	}
	
	/**
	 * Gets the personality card list comma separated.
	 *
	 * @return the personality card list comma separated
	 */
	public String getPersonalityCardListCommaSeparated() {
		return personalityCardListCommaSeparated;
	}
	
	/**
	 * Sets the personality card list comma separated.
	 *
	 * @param personalityCardListCommaSeparated the new personality card list comma separated
	 */
	public void setPersonalityCardListCommaSeparated(
			String personalityCardListCommaSeparated) {
		this.personalityCardListCommaSeparated = personalityCardListCommaSeparated;
	}
	
	 /**
 	 * Gets the bank amount.
 	 *
 	 * @return the bank amount
 	 */
 	public int getBankAmount()
     {
          int iTotalAmount = 0;
          iTotalAmount = this.objGoldCoin.getCoin_Available()*this.objGoldCoin.getCoin_Val() + this.objSilverCoin.getCoin_Val()*this.objSilverCoin.getCoin_Available();
          return iTotalAmount;
     }

	/**
	 * Sets the bank amount.
	 *
	 * @param f the new bank amount
	 */
	public void setBankAmount(float f) {
		// TODO Auto-generated method stub
		this.Bank_Amount = f;
	}

	
}
