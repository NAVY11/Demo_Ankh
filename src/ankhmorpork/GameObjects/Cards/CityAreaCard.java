package ankhmorpork.GameObjects.Cards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ankhmorpork.Game.Game;
import ankhmorpork.GameConstants.Constants;
import ankhmorpork.GameObjects.Bank;
import ankhmorpork.GameObjects.Coins;
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
		
		
		try {
			boolean status = false;
			Game gm1 = new Game();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput;
			userinput = br.readLine();
			if (userinput.equals('Y'))
			{
				Bank b1 = new Bank();
				int bankamt = b1.getBankAmount();
				bankamt = bankamt - 1;
				int currentplayer = CurrentPlayer.getPlayerAmount();
				currentplayer = currentplayer + 1;
				CurrentPlayer.setPlayer_amount(currentplayer);
				status = true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	public boolean SevenSleepersAction(Player CurrentPlayer)
	{
		
		
		try {
			boolean status = false;
			Game gm1 = new Game();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput;
			userinput = br.readLine();
			if (userinput.equals('Y'))
			{
				Bank b1 = new Bank();
				int bankamt = b1.getBankAmount();
				bankamt = bankamt - 3;
				int currentplayer = CurrentPlayer.getPlayerAmount();
				currentplayer = currentplayer + 3;
				CurrentPlayer.setPlayer_amount(currentplayer);
				status = true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	public boolean NapHillAction(Player CurrentPlayer)
	{
		try {
			boolean status = false;
			Game gm1 = new Game();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput;
			userinput = br.readLine();
			if (userinput.equals('Y'))
			{
				Bank b1 = new Bank();
				int bankamt = b1.getBankAmount();
				bankamt = bankamt - 1;
				int currentplayer = CurrentPlayer.getPlayerAmount();
				currentplayer = currentplayer + 1;
				CurrentPlayer.setPlayer_amount(currentplayer);
				status = true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	
	public boolean TheHippoAction(Player CurrentPlayer)
	{
		
		
		try {
			boolean status = false;
			Game gm1 = new Game();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput;
			userinput = br.readLine();
			if (userinput.equals('Y'))
			{
				Bank b1 = new Bank();
				int bankamt = b1.getBankAmount();
				bankamt = bankamt - 2;
				int currentplayer = CurrentPlayer.getPlayerAmount();
				currentplayer = currentplayer + 2;
				CurrentPlayer.setPlayer_amount(currentplayer);
				status = true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	public boolean DragonLandingAction(Player CurrentPlayer)
	{
		
		
		try {
			boolean status = false;
			Game gm1 = new Game();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput;
			userinput = br.readLine();
			if (userinput.equals('Y'))
			{
				Bank b1 = new Bank();
				int bankamt = b1.getBankAmount();
				bankamt = bankamt - 2;
				int currentplayer = CurrentPlayer.getPlayerAmount();
				currentplayer = currentplayer + 2;
				CurrentPlayer.setPlayer_amount(currentplayer);
				status = true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	
	
	
}
