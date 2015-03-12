package ankhmorpork.GameObjects.Cards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import PresentationUtilityCommon.PresentationUtility;
import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.GameCards;
import ankhmorpork.GameObjects.Minion;
import ankhmorpork.GameObjects.Player;
import ankhmorpork.GameObjects.Troll;
import ankhmorpork.GameObjects.TroubleMaker;


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
	
	public boolean LongwallAction(Player objPlayer)
	{
		boolean status = false;
		try {			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput = br.readLine();
			if (userinput.equals('Y') || userinput.equals('y'))
			{
				int playerID = objPlayer.getPlayer_id();
				Game.PaymentFromBank(playerID, 1);
				System.out.print("Action Performed Successfully");
				status = true;
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	return status;
	}
	
	public boolean SevenSleepersAction(Player objPlayer)
	{
		boolean status = false;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput = br.readLine();
			if (userinput.equals('Y') || userinput.equals('y'))
			{
				int playerID = objPlayer.getPlayer_id();
				Game.PaymentFromBank(playerID, 3);
				System.out.print("Action Performed Successfully");
				status = true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	return status;
	}
	
	public boolean NapHillAction(Player objPlayer)
	{
		boolean status = false;
		try {
 			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput;
			userinput = br.readLine();
			if (userinput.equals('Y') || userinput.equals('y'))
			{
				int playerID = objPlayer.getPlayer_id();
				Game.PaymentFromBank(playerID, 1);
				System.out.print("Action Performed Successfully");
				status = true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	return status;
	}
	
	public boolean TheHippoAction(Player objPlayer)
	{
		boolean status = false;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput;
			userinput = br.readLine();
			if (userinput.equals('Y') || userinput.equals('y'))
			{
				int playerID = objPlayer.getPlayer_id();
				Game.PaymentFromBank(playerID, 2);
				System.out.print("Action Performed Successfully");
				status = true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	return status;
	}
	
	public boolean DragonLandingAction(Player objPlayer)
	{
		boolean status = false;		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput;
			userinput = br.readLine();
			if (userinput.equals('Y') || userinput.equals('y'))
			{
				int playerID = objPlayer.getPlayer_id();
				Game.PaymentFromBank(playerID, 2);
				System.out.print("Action Performed Successfully");
				status = true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	return status;
	}
	
	public boolean DimwellAction(Player objPlayer)
	{
		boolean status = false;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput = br.readLine();
			if (userinput.equals('Y') || userinput.equals('y'))
			{
				int playerID = objPlayer.getPlayer_id();
				Game.PaymentToBank(playerID, 3);
				ArrayList<Minion> minionsByPlayerList = Game.GetMinionsNotOnBoardByPlayerID(objPlayer.getPlayer_id());
				//System.out.println(" Minions not on board List" + );
				//	minionsByPlayerList.get(0).setPlayer_id(objPlayer.getPlayer_id());
				//	Minion objPlayerMinionId = new Minion();
				System.out.println("Enter AreaId where you want to place the minion 8,7,9,5 : ");
				BufferedReader areaidinput = new BufferedReader(new InputStreamReader(System.in));
				int areaIdToPlace = Integer.parseInt(areaidinput.readLine());
				if(PresentationUtility.canMinionBePlacedInAdjacentArea(objPlayer.getPlayer_id(), minionsByPlayerList.get(0).getMinion_id(), 0, areaIdToPlace)){
					minionsByPlayerList.get(0).setArea_id(areaIdToPlace);
				}
				System.out.print("Action Performed Successfully");
				status = true;	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	return status;
}

public boolean DollySisterAction(Player objPlayer)
	{
		boolean status = false;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Would you like to perform this action : Y/N ");
			String userinput = br.readLine();
			if (userinput.equals('Y') || userinput.equals('y'))
			{
				int playerID = objPlayer.getPlayer_id();
				Game.PaymentToBank(playerID, 3);
				ArrayList<Minion> minionsByPlayerList = Game.GetMinionsNotOnBoardByPlayerID(objPlayer.getPlayer_id());
				//System.out.println(" Minions not on board List" + );
				//	minionsByPlayerList.get(0).setPlayer_id(objPlayer.getPlayer_id());
				//	Minion objPlayerMinionId = new Minion();
				System.out.println("Enter AreaId where you want to place the minion 1,3,2,12 : ");
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				int areaIdToPlace = Integer.parseInt(br1.readLine());
				if(PresentationUtility.canMinionBePlacedInAdjacentArea(objPlayer.getPlayer_id(), minionsByPlayerList.get(0).getMinion_id(), 0, areaIdToPlace)){
					minionsByPlayerList.get(0).setArea_id(areaIdToPlace);
				}
				System.out.print("Action Performed Successfully");
				status = true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		return status;
}

public boolean TheScoursAction(Player objPlayer) throws IOException{
	boolean status = false;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Would you like to perform this action : Y/N ");
	String userinput = br.readLine();
	if (userinput.equals('Y') || userinput.equals('y')){
		ArrayList<GreenCard> CardList = Game.GetGreenCardByPlayerID(objPlayer.getPlayer_id());
		System.out.println("Which card do you want to discard :" + CardList);
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String cardID = br1.readLine();
		GreenCard objGC = Game.GetGreenCard(cardID);
		objGC.IsPlayed = true;
		int playerID = objPlayer.getPlayer_id();
		Game.PaymentFromBank(playerID, 2);
		status = true;
		System.out.println("Action Performed Successfully");
	}
	return status;
}

public boolean TheShadesAction(Player objPlayer) throws NumberFormatException, IOException{
	boolean status = false;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Would you like to perform this action : Y/N ");
	String userinput = br.readLine();
	if (userinput.equals('Y') || userinput.equals('y'))
	{
		//To draw one card from deck
		//String areaList = Game.getAreaIDForPlayer(objPlayer.getPlayer_id());
		//System.out.println("Enter areaId :" + areaList);
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		int areaID = Integer.parseInt(br1.readLine());
			String adjacentAreaidList = Game.getAdjacentAreas(7);
			System.out.println("Enter the areaID among the list you want place the troublemarker adjacent to it:" + adjacentAreaidList + 7);
					BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
					int adjacentAreaID = Integer.parseInt(br2.readLine());
					 TroubleMaker objTroubleMaker = Game.GetTroubleMakerNotOnBoard();
					 objTroubleMaker.setArea_id(adjacentAreaID);
					 status = true;
					 System.out.println("Action Performed Successfully");
	}
	
	return status;
}

public boolean SmallGodsAction(Player objPlayer) throws IOException{
		return true;
}

public boolean IsleOfGodsAction(Player objPlayer) throws IOException{
	boolean status = false;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Would you like to perform this action : Y/N ");
	String userinput = br.readLine();
	if (userinput.equals('Y') || userinput.equals('y'))
	{
		int playerID = objPlayer.getPlayer_id();
		Game.PaymentToBank(playerID, 2);
		String areaList = Game.GetTroubleMakerOnBoardAreaId();
		System.out.println("Enter areaID from which area you want to remove trouble marker" + areaList);
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		int areaID = Integer.parseInt(br1.readLine());
		if(Game.removeTroubleMarkerByAreaId(areaID)){
			status = true;
		}
		System.out.println("Action Performed Successfully");
		
	}
	return status;
}

public boolean UnrealEstate(Player objPlayer) throws IOException{
	boolean status = false;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Would you like to perform this action : Y/N ");
	String userinput = br.readLine();
	if (userinput.equals('Y') || userinput.equals('y'))
	{	
	Game g1 = new Game();
	String greenCard = Player.takeOneGreenCardFromDeck(g1);
	objPlayer.setGreenCardListCommaSeparated(objPlayer.getGreenCardListCommaSeparated() + "," + greenCard);
	//show list of cards
	//System.out.println("Which Card you want to discard");
	ArrayList<GreenCard> CardList = Game.GetGreenCardByPlayerID(objPlayer.getPlayer_id());
	System.out.println("Which card do you want to discard :" + CardList);
	BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
	String cardID = br1.readLine();
	GreenCard objGC = Game.GetGreenCard(cardID);
	objGC.IsPlayed = true;
	System.out.println("Action Performed Successfully");
	status = true;
	}
	return status;
}
	
}
