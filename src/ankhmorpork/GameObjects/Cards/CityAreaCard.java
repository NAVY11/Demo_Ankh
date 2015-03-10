package ankhmorpork.GameObjects.Cards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import PresentationUtilityCommon.PresentationUtility;
import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.Bank;
import ankhmorpork.GameObjects.Minion;
import ankhmorpork.GameObjects.Player;


public class CityAreaCard extends Cards{
	private String ActionID;
	private String ActionDescription;
	private int AreaID;
	private String AreaName;
	private int Cost;
	
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
	
	public void SetActionID(String ID)
	{
		this.ActionID = ID;
	}
	
	public String GetActionID()
	{
		return this.ActionID;
	}
	
	public void SetActionDescription(String EventDescription)
	{
		this.ActionDescription = EventDescription;
	}
	
	public String GetActionDescription()
	{
		return this.ActionDescription;
	}
	
	public void SetAreaID(int ID)
	{
		this.AreaID = ID;
	}
	
	public int GetAreaID()
	{
		return this.AreaID;
	}
	
	public void SetName(String AreaName)
	{
		this.AreaName = AreaName;
	}
	
	public int GetCost()
	{
		return this.Cost;
	}
	
	public void SetCost(int Cost)
	{
		this.Cost = Cost;
	}
	
	public String GetAreaName()
	{
		return this.AreaName;
	}
	
	public boolean LongwallAction(Player CurrentPlayer)
	{
		boolean status = false;
		try {			
//			Game gm1 = new Game();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput = br.readLine();
			if (userinput.equals('Y'))
			{
				int noOfSilverCoins = Game.GameBank.objSilverCoin.getCoin_Available();
				if (noOfSilverCoins > 0 )
				{
					
					int noOfPlayerCoins = CurrentPlayer.objSilverCoin.getCoin_Available();
					noOfPlayerCoins = noOfPlayerCoins + 1;
					CurrentPlayer.objSilverCoin.setCoin_Available(noOfPlayerCoins);
				}
				noOfSilverCoins = noOfSilverCoins - 1;
				Game.GameBank.objSilverCoin.setCoin_Available(noOfSilverCoins);
//				int bankamt = b1.getBankAmount();
//				bankamt = bankamt - 1;
//				int currentplayer = CurrentPlayer.getPlayerAmount();
//				currentplayer = currentplayer + 1;
//				CurrentPlayer.setPlayer_amount(currentplayer);
				status = true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public boolean SevenSleepersAction(Player CurrentPlayer)
	{
		boolean status = false;
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput = br.readLine();
			if (userinput.equals('Y'))
			{
				int noOfSilverCoins = Game.GameBank.objSilverCoin.getCoin_Available();
				if (noOfSilverCoins > 0 )
				{
					
					int noOfPlayerCoins = CurrentPlayer.objSilverCoin.getCoin_Available();
					noOfPlayerCoins = noOfPlayerCoins + 3;
					CurrentPlayer.objSilverCoin.setCoin_Available(noOfPlayerCoins);
				}
				noOfSilverCoins = noOfSilverCoins - 3;
				Game.GameBank.objSilverCoin.setCoin_Available(noOfSilverCoins);
				
//				Bank b1 = new Bank();
//				int bankamt = b1.getBankAmount();
//				bankamt = bankamt - 3;
//				int currentplayer = CurrentPlayer.getPlayerAmount();
//				currentplayer = currentplayer + 3;
//				CurrentPlayer.setPlayer_amount(currentplayer);
				status = true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public boolean NapHillAction(Player CurrentPlayer)
	{
		boolean status = false;
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput;
			userinput = br.readLine();
			if (userinput.equals('Y'))
			{
				int noOfSilverCoins = Game.GameBank.objSilverCoin.getCoin_Available();
				if (noOfSilverCoins > 0 )
				{
					int noOfPlayerCoins = CurrentPlayer.objSilverCoin.getCoin_Available();
					noOfPlayerCoins = noOfPlayerCoins + 1;
					CurrentPlayer.objSilverCoin.setCoin_Available(noOfPlayerCoins);
				}
				noOfSilverCoins = noOfSilverCoins - 1;
				Game.GameBank.objSilverCoin.setCoin_Available(noOfSilverCoins);

//				Bank b1 = new Bank();
//				int bankamt = b1.getBankAmount();
//				bankamt = bankamt - 1;
//				int currentplayer = CurrentPlayer.getPlayerAmount();
//				currentplayer = currentplayer + 1;
//				CurrentPlayer.setPlayer_amount(currentplayer);
				status = true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	
	public boolean TheHippoAction(Player CurrentPlayer)
	{
		boolean status = false;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput;
			userinput = br.readLine();
			if (userinput.equals('Y'))
			{
				int noOfSilverCoins = Game.GameBank.objSilverCoin.getCoin_Available();
				if (noOfSilverCoins > 0 )
				{
					int noOfPlayerCoins = CurrentPlayer.objSilverCoin.getCoin_Available();
					noOfPlayerCoins = noOfPlayerCoins + 2;
					CurrentPlayer.objSilverCoin.setCoin_Available(noOfPlayerCoins);
				}
				noOfSilverCoins = noOfSilverCoins - 2;
				Game.GameBank.objSilverCoin.setCoin_Available(noOfSilverCoins);
				
//				Bank b1 = new Bank();
//				int bankamt = b1.getBankAmount();
//				bankamt = bankamt - 2;
//				int currentplayer = CurrentPlayer.getPlayerAmount();
//				currentplayer = currentplayer + 2;
//				CurrentPlayer.setPlayer_amount(currentplayer);
				status = true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public boolean DragonLandingAction(Player CurrentPlayer)
	{
		boolean status = false;		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput;
			userinput = br.readLine();
			if (userinput.equals('Y'))
			{
				int noOfSilverCoins = Game.GameBank.objSilverCoin.getCoin_Available();
				if (noOfSilverCoins > 0 )
				{
					int noOfPlayerCoins = CurrentPlayer.objSilverCoin.getCoin_Available();
					noOfPlayerCoins = noOfPlayerCoins + 2;
					CurrentPlayer.objSilverCoin.setCoin_Available(noOfPlayerCoins);
				}
				noOfSilverCoins = noOfSilverCoins - 2;
				Game.GameBank.objSilverCoin.setCoin_Available(noOfSilverCoins);
//				
//				Bank b1 = new Bank();
//				int bankamt = b1.getBankAmount();
//				bankamt = bankamt - 2;
//				int currentplayer = CurrentPlayer.getPlayerAmount();
//				currentplayer = currentplayer + 2;
//				CurrentPlayer.setPlayer_amount(currentplayer);
				status = true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public boolean DimwellAction(Player objCurrentPlayer, Minion objCurrentPlayerMinionId)
	{
		boolean status = false;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput = br.readLine();
			if (userinput.equals('Y'))
			{
				System.out.println("Enter AreaId where you want to place the minion 8,7,9,5 : ");
				BufferedReader areaidinput = new BufferedReader(new InputStreamReader(System.in));
				int areaIdToPlace = Integer.parseInt(areaidinput.readLine());
				if(PresentationUtility.canMinionBePlacedInAdjacentArea(objCurrentPlayer.getPlayer_id(), objCurrentPlayerMinionId.getMinion_id(), 0, areaIdToPlace)){
				objCurrentPlayerMinionId.setArea_id(areaIdToPlace);
			}
				
			int noOfSilverCoins = Game.GameBank.objSilverCoin.getCoin_Available();
			if (noOfSilverCoins > 0 )
			{
				int noOfPlayerCoins = objCurrentPlayer.objSilverCoin.getCoin_Available();
				noOfPlayerCoins = noOfPlayerCoins + 3;
				objCurrentPlayer.objSilverCoin.setCoin_Available(noOfPlayerCoins);
			}
			noOfSilverCoins = noOfSilverCoins - 3;
			Game.GameBank.objSilverCoin.setCoin_Available(noOfSilverCoins);
				
//				Bank b1 = new Bank();
//				int bankamt = b1.getBankAmount();
//				bankamt = bankamt + 3;
//				int currentplayer = objCurrentPlayer.getPlayerAmount();
//				currentplayer = currentplayer - 3;
//				objCurrentPlayer.setPlayer_amount(currentplayer);
				status = true;
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
}

public boolean DollySisterAction(Player objCurrentPlayer, Minion objCurrentPlayerMinionId)
	{
		boolean status = false;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput = br.readLine();
			if (userinput.equals('Y'))
			{
				System.out.println("Enter AreaId where you want to place the minion 1,3,2,12 : ");
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				int areaIdToPlace = Integer.parseInt(br1.readLine());
				if(PresentationUtility.canMinionBePlacedInAdjacentArea(objCurrentPlayer.getPlayer_id(), objCurrentPlayerMinionId.getMinion_id(), 0, areaIdToPlace)){
					objCurrentPlayerMinionId.setArea_id(areaIdToPlace);
				}
				
				int noOfSilverCoins = Game.GameBank.objSilverCoin.getCoin_Available();
				if (noOfSilverCoins > 0 )
				{
					int noOfPlayerCoins = objCurrentPlayer.objSilverCoin.getCoin_Available();
					noOfPlayerCoins = noOfPlayerCoins + 3;
					objCurrentPlayer.objSilverCoin.setCoin_Available(noOfPlayerCoins);
				}
				noOfSilverCoins = noOfSilverCoins - 3;
				Game.GameBank.objSilverCoin.setCoin_Available(noOfSilverCoins);
				
//				Bank b1 = new Bank();
//				int bankamt = b1.getBankAmount();
//				bankamt = bankamt + 3;
//				int currentplayer = objCurrentPlayer.getPlayerAmount();
//				currentplayer = currentplayer - 3;
//				objCurrentPlayer.setPlayer_amount(currentplayer);
				status = true;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
}


public boolean UnrealEstateAction(Player objPlayer) throws IOException{
	boolean status = false;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Would you like to perform this action : Y/N ");
	String userinput = br.readLine();
	if (userinput.equals('Y'))
	{
	//String CardList = Game.getGreenCardIDForPlayer(objPlayer.getPlayer_id());
	//System.out.println("Which card do you want to discard :" + CardList);
	BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
	//String userinput = br1.readLine();
	//GreenCard objGC = Game.getGreenCardByCardID(userinput);
	//objGC.IsPlayed = true;

	int noOfSilverCoins = Game.GameBank.objSilverCoin.getCoin_Available();
	if (noOfSilverCoins > 0 )
	{
		int noOfPlayerCoins = objPlayer.objSilverCoin.getCoin_Available();
		noOfPlayerCoins = noOfPlayerCoins + 3;
		objPlayer.objSilverCoin.setCoin_Available(noOfPlayerCoins);
	}
	noOfSilverCoins = noOfSilverCoins - 3;
	Game.GameBank.objSilverCoin.setCoin_Available(noOfSilverCoins);
	
	status = true;
	
	}
	return status;
}

public boolean SmallGodsAction(Player objCurrentPlayer, Minion objCurrentPlayerMinionId){
	boolean status = false;
	return status;
}

public boolean TheScoursAction(Player objCurrentPlayer, Minion objCurrentPlayerMinionId){
	boolean status = false;
	
	
	return status;
}

public boolean TheShadesAction(Player objCurrentPlayer, Minion objCurrentPlayerMinionId){
	boolean status = false;
	return status;
}

public boolean IsleOfGodsAction(Player objCurrentPlayer, Minion objCurrentPlayerMinionId){
	boolean status = false;
	return status;
}




	
}
