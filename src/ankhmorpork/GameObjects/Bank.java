package ankhmorpork.GameObjects;

import ankhmorpork.GameConstants.Constants;

public class Bank {
	Float player_amount;
	Float Bank_Amount;
	Integer player_personality_card_id;	
	String cityAreaCardsListCommaSeparated;
	String personalityCardListCommaSeparated;
	public Coins objGoldCoin = new Coins(Constants.GoldCoin());
	public Coins objSilverCoin = new Coins(Constants.SilverCoin());
	
	public String getCityAreaCardsListCommaSeparated() {
		return cityAreaCardsListCommaSeparated;
	}
	
	public void setCityAreaCardsListCommaSeparated(
			String cityAreaCardsListCommaSeparated) {
		this.cityAreaCardsListCommaSeparated = cityAreaCardsListCommaSeparated;
	}
	
	public String getPersonalityCardListCommaSeparated() {
		return personalityCardListCommaSeparated;
	}
	
	public void setPersonalityCardListCommaSeparated(
			String personalityCardListCommaSeparated) {
		this.personalityCardListCommaSeparated = personalityCardListCommaSeparated;
	}
	
	 public int getBankAmount()
     {
          int iTotalAmount = 0;
          iTotalAmount = this.objGoldCoin.getCoin_Available()*this.objGoldCoin.getCoin_Val() + this.objSilverCoin.getCoin_Val()*this.objSilverCoin.getCoin_Available();
          return iTotalAmount;
     }

	public void setBankAmount(float f) {
		// TODO Auto-generated method stub
		this.Bank_Amount = f;
	}

	
}
