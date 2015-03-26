/*
 * 
 */
package ankhmorpork.GameObjects;
import ankhmorpork.GameConstants.Constants;
// TODO: Auto-generated Javadoc

/**
 * The Class Coins.
 */
public class Coins {
		
		/** The coin_type. */
		private String coin_type;
		
		/** The coin_val. */
		private Integer coin_val;
		
		/** The coin_available. */
		private Integer coin_available;
		
		/**
		 * Gets the coin_ available.
		 *
		 * @return the coin_ available
		 */
		public Integer getCoin_Available()
		{
			return this.coin_available;
		}
		
		/**
		 * Sets the coin_ available.
		 *
		 * @param coin_available the new coin_ available
		 */
		public void setCoin_Available(Integer coin_available)
		{
			this.coin_available=coin_available;
		}
		
		/**
		 * Gets the coin_ val.
		 *
		 * @return the coin_ val
		 */
		public Integer getCoin_Val()
		{
			return this.coin_val;
		}
		
		@Override
		public String toString() {
			return "Coins [coin_type=" + coin_type + ", coin_val=" + coin_val
					+ ", coin_available=" + coin_available + "]";
		}

		/**
		 * Sets the coin_ val.
		 *
		 * @param coin_val the new coin_ val
		 */
		public void setCoin_Val(Integer coin_val)
		{
			this.coin_val=coin_val;
		}
		
		/**
		 * Gets the coin_ type.
		 *
		 * @return the coin_ type
		 */
		public String getCoin_Type()
		{
			return this.coin_type;
		}
		
		/**
		 * Sets the coin_ type.
		 *
		 * @param coin_type the new coin_ type
		 */
		public void setCoin_Type(String coin_type)
		{
			this.coin_type=coin_type;
		}
		
		//Constructor
		/**
		 * Instantiates a new coins.
		 *
		 * @param CoinType the coin type
		 */
		public Coins(String CoinType)
		{
			if(CoinType==Constants.GoldCoin())
			{
				this.coin_type=Constants.GoldCoin();
				this.coin_val=Constants.GoldCoinValue();
				this.coin_available=Constants.GoldCoinAvail();
			}
			if(CoinType==Constants.SilverCoin())
			{
				this.coin_type=Constants.SilverCoin();
				this.coin_val=Constants.SilverCoinValue();
				this.coin_available=Constants.SilverCoinAvail();
			}
		}
		
		/**
		 * Instantiates a new coins.
		 */
		public Coins() {
			// TODO Auto-generated constructor stub
		}
}
