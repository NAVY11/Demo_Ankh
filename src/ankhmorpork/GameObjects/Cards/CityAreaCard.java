package ankhmorpork.GameObjects.Cards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import PresentationUtilityCommon.PresentationUtility;
import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.Area;
import ankhmorpork.GameObjects.GameCards;
import ankhmorpork.GameObjects.Minion;
import ankhmorpork.GameObjects.Player;
import ankhmorpork.GameObjects.Troll;
import ankhmorpork.GameObjects.TroubleMaker;


// TODO: Auto-generated Javadoc
/**
 * The Class CityAreaCard.
 */
public class CityAreaCard extends Cards{
	
	@Override
	public String toString() {
		String strCityAreaCard = "{\"ActionID\":" + ActionID + ", \"ActionDescription\":"
				+"\""+ ActionDescription +"\""+ ", \"AreaID\":" + AreaID + ", \"AreaName\":"
				+"\""+ AreaName + "\""+", \"Cost\":" + Cost + ", \"CardID\":" + "\""+CardID
				+ "\""+", \"IsPlayed\":" + IsPlayed + ", \"PlayerID\":"
				+ PlayerID + "}";
		return strCityAreaCard.toString();		
//		return "{\"ActionID\":" + ActionID + ", ActionDescription:"
//				+ ActionDescription + ", AreaID:" + AreaID + ", AreaName:"
//				+ AreaName + ", Cost:" + Cost + ", CardID:" + CardID
//				+ ", IsPlayed:" + IsPlayed + ", PlayerID:"
//				+ PlayerID + "}";
	}

	/** The Action id. */
	private String ActionID;
	
	/** The Action description. */
	private String ActionDescription;
	
	/** The Area id. */
	private int AreaID;
	
	/** The Area name. */
	private String AreaName;
	
	/** The Cost. */
	private int Cost;
	
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
	public void SetActionID(String ID)
	{
		this.ActionID = ID;
	}
	
	/**
	 * Gets the action id.
	 *
	 * @return the string
	 */
	public String GetActionID()
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
	
	/**
	 * Sets the area id.
	 *
	 * @param ID the id
	 */
	public void SetAreaID(int ID)
	{
		this.AreaID = ID;
	}
	
	/**
	 * Gets the area id.
	 *
	 * @return the int
	 */
	public int GetAreaID()
	{
		return this.AreaID;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param AreaName the area name
	 */
	public void SetName(String AreaName)
	{
		this.AreaName = AreaName;
	}
	
	/**
	 * Gets the cost.
	 *
	 * @return the int
	 */
	public int GetCost()
	{
		return this.Cost;
	}
	
	/**
	 * Sets the cost.
	 *
	 * @param Cost the cost
	 */
	public void SetCost(int Cost)
	{
		this.Cost = Cost;
	}
	
	/**
	 * Gets the area name.
	 *
	 * @return the string
	 */
	public String GetAreaName()
	{
		return this.AreaName;
	}
	
	/**
	 * Longwall action.
	 *
	 * @param objPlayer the obj player
	 * @return true, if successful
	 */
	public boolean LongwallAction(Player objPlayer)
	{
		boolean status = false;
		Integer playerID = objPlayer.getPlayer_id();
		if(playerID != null)
		{
			Game.PaymentFromBank(playerID, 1);
			System.out.print("Action Performed");
			status = true;
		}
		else
		{
			System.out.println("PlayerId is Null");
			System.out.println("Action Failed");
			status = false;
		}
		return status;
	}

	/**
	 * Seven sleepers action.
	 *
	 * @param objPlayer the obj player
	 * @return true, if successful
	 */
	public boolean SevenSleepersAction(Player objPlayer)
	{
		boolean status = false;
		Integer playerID = objPlayer.getPlayer_id();
		if(playerID != null){
			Game.PaymentFromBank(playerID, 3);
			System.out.print("Action Performed");
			status = true;
		}
		else
		{
			System.out.println("PlayerId is Null");
			System.out.println("Action Failed");
			status = false;
		}
		return status;
	}

	/**
	 * Nap hill action.
	 *
	 * @param objPlayer the obj player
	 * @return true, if successful
	 */
	public boolean NapHillAction(Player objPlayer)
	{
		boolean status = false;
		Integer playerID = objPlayer.getPlayer_id();
		if(playerID != null)
		{
			Game.PaymentFromBank(playerID, 1);
			System.out.print("Action Performed");
			status = true;
		}
		else
		{
			System.out.println("PlayerId is Null");
			System.out.println("Action Failed");
			status = false;
		}
		return status;
	}

	/**
	 * The hippo action.
	 *
	 * @param objPlayer the obj player
	 * @return true, if successful
	 */
	public boolean TheHippoAction(Player objPlayer)
	{
		boolean status = false;
		Integer playerID = objPlayer.getPlayer_id();
		if(playerID != null)
		{
			Game.PaymentFromBank(playerID, 2);
			System.out.print("Action Performed");
			status = true;
		}
		else
		{
			System.out.println("PlayerId is Null");
			System.out.println("Action Failed");
			status = false;
		}
		return status;
	}

	/**
	 * Dragon landing action.
	 *
	 * @param objPlayer the obj player
	 * @return true, if successful
	 */
	public boolean DragonLandingAction(Player objPlayer)
	{
		boolean status = false;		
		Integer playerID = objPlayer.getPlayer_id();
		if(playerID != null) 
		{
			Game.PaymentFromBank(playerID, 2);
			System.out.print("Action Performed");
			status = true;
		}
		else
		{
			System.out.println("PlayerId is Null");
			System.out.println("Action Failed");
			status = false;
		}
		return status;
	}

	/**
	 * Dimwell action.
	 *
	 * @param objPlayer the obj player
	 * @return true, if successful
	 * @throws IOException 
	 */
	public boolean DimwellAction(Player objPlayer) throws IOException
	{
		boolean status = false;
		Integer playerID = objPlayer.getPlayer_id();
		if(playerID != null)
		{
			Game.PaymentToBank(playerID, 3);
			String placingAMinionStr = "";
			placingAMinionStr = Game.GetMinionIDsNotOnBoard(objPlayer.getPlayer_id());
			//Check whether the Player has unused Minions in hand
			if(!placingAMinionStr.isEmpty())
			{	
				//System.out.println("You are allowed to place these minions which are not on board : " + placingAMinionStr);
				String strAdjacentArea = Game.getAdjacentAreas(8);
				strAdjacentArea += ",8";
				Game.DisplayAreas(strAdjacentArea);
				//String AreaList = Game.GetValidAreasToPlaceMinion(this.getPlayer_id());//"1,2,3,4,5,6,7,8,9,10,11,12";//Game.AreaWithNoMinion();
				//System.out.println(AreaList);
				//Game.DisplayAreas(AreaList);
				System.out.println("Enter a area in which you want to keep the minion : ");
				BufferedReader brBuff = new BufferedReader(new InputStreamReader(System.in));
				String br = brBuff.readLine();
				System.out.println(br);
				System.out.println(placingAMinionStr);
				if(strAdjacentArea.contains(br))
				{
					Minion objMinion = Game.GetMinionsByMinionID(Integer.parseInt(placingAMinionStr.substring(0,3)));
					//objMinion.setArea_id(Integer.parseInt(br.toString()));										
					//Place or Remove Trouble Marker on Addition of Minion
					if(Game.AreaHasMinion(Integer.parseInt(br)))
					{						
						objMinion.setArea_id(Integer.parseInt(br.toString()));
						Game.SetMinion(objMinion);
						System.out.println(objPlayer.getPlayer_name()+"'s Minion was palced in "+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(br)));
						status = true;

						if(!Game.AreaHasTroubleMarker(Integer.parseInt(br)))
						{
							//Place a trouble Marker if not present initially
							objPlayer.PlaceATroubleMarkerInArea(Integer.parseInt(br));														
							System.out.println("Trouble Marker was placed in : "+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(br)));
						}
						System.out.print("Action Performed");
					}
					else
					{
						//Area has no minion previously so Trouble Marker won't come in picture
						objMinion.setArea_id(Integer.parseInt(br.toString()));
						Game.SetMinion(objMinion);
						System.out.println(objPlayer.getPlayer_name()+"'s Minion was palced in "+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(br)));
						status = true;
						System.out.print("Action Performed");
					}
				}
			}
			else
			{
				System.out.println("No minions available in hand");
				System.out.println("Action failed");
				status = false;
			}
		}
		else
		{
			System.out.println("PlayerId is Null");
			System.out.println("Action Failed");
			status = false;
		}
		return status;
	}

	//String[] areaarray = strAdjacentArea.split(",");
	//System.out.println("Enter AreaId where you want to place the minion 8,7,9,5 : ");
	//BufferedReader areaidinput = new BufferedReader(new InputStreamReader(System.in));
	//int areaIdToPlace = Integer.parseInt(areaidinput.readLine());
	//if(PresentationUtility.canMinionBePlacedInAdjacentArea(objPlayer.getPlayer_id(), minionsByPlayerList.get(0).getMinion_id(), 0, areaIdToPlace)){
	//	minionsByPlayerList.get(0).setArea_id(areaIdToPlace);
	//}
	//System.out.print("Action Performed Successfully");
	//status = true;
/**
 * Dolly sister action.
 *
 * @param objPlayer the obj player
 * @return true, if successful
 * @throws IOException 
 */
	public boolean DollySisterAction(Player objPlayer) throws IOException
	{
		boolean status = false;
		Integer playerID = objPlayer.getPlayer_id();
		if(playerID != null)
		{
			Game.PaymentToBank(playerID, 3);
			String placingAMinionStr = "";
			placingAMinionStr = Game.GetMinionIDsNotOnBoard(objPlayer.getPlayer_id());
			//Check whether the Player has unused Minions in hand
			if(!placingAMinionStr.isEmpty())
			{	
				//System.out.println("You are allowed to place these minions which are not on board : " + placingAMinionStr);
				String strAdjacentArea = Game.getAdjacentAreas(1);
				strAdjacentArea += ",1";
				Game.DisplayAreas(strAdjacentArea);
				//String AreaList = Game.GetValidAreasToPlaceMinion(this.getPlayer_id());//"1,2,3,4,5,6,7,8,9,10,11,12";//Game.AreaWithNoMinion();
				//System.out.println(AreaList);
				//Game.DisplayAreas(AreaList);
				System.out.println("Enter a area in which you want to keep the minion : ");
				BufferedReader brBuff = new BufferedReader(new InputStreamReader(System.in));
				String br = brBuff.readLine();
				System.out.println(br);
				System.out.println(placingAMinionStr);
				if(strAdjacentArea.contains(br))
				{
					Minion objMinion = Game.GetMinionsByMinionID(Integer.parseInt(placingAMinionStr.substring(0,3)));
					//objMinion.setArea_id(Integer.parseInt(br.toString()));										
					//Place or Remove Trouble Marker on Addition of Minion
					if(Game.AreaHasMinion(Integer.parseInt(br)))
					{						
						objMinion.setArea_id(Integer.parseInt(br.toString()));
						Game.SetMinion(objMinion);
						System.out.println(objPlayer.getPlayer_name()+"'s Minion was palced in "+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(br)));
						status = true;

						if(!Game.AreaHasTroubleMarker(Integer.parseInt(br)))
						{
							//Place a trouble Marker if not present initially
							objPlayer.PlaceATroubleMarkerInArea(Integer.parseInt(br));														
							System.out.println("Trouble Marker was placed in : "+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(br)));
						}
						System.out.print("Action Performed");
					}
					else
					{
						//Area has no minion previously so Trouble Marker won't come in picture
						objMinion.setArea_id(Integer.parseInt(br.toString()));
						Game.SetMinion(objMinion);
						System.out.println(objPlayer.getPlayer_name()+"'s Minion was palced in "+PresentationUtility.getCityAreaCardNameById(Integer.parseInt(br)));
						status = true;
						System.out.print("Action Performed");
					}
				}
			}
			else
			{
				System.out.println("No minions available in hand");
				System.out.println("Action failed");
				status = false;
			}
		}
		else
		{
			System.out.println("PlayerId is Null");
			System.out.println("Action Failed");
			status = false;
		}
		return status;
	}

	//String[] areaarray = strAdjacentArea.split(",");
	//System.out.println("Enter AreaId where you want to place the minion 8,7,9,5 : ");
	//BufferedReader areaidinput = new BufferedReader(new InputStreamReader(System.in));
	//int areaIdToPlace = Integer.parseInt(areaidinput.readLine());
	//if(PresentationUtility.canMinionBePlacedInAdjacentArea(objPlayer.getPlayer_id(), minionsByPlayerList.get(0).getMinion_id(), 0, areaIdToPlace)){
	//	minionsByPlayerList.get(0).setArea_id(areaIdToPlace);
	//}
	//System.out.print("Action Performed Successfully");
	//status = true;
	
	
/**
 * The scours action.
 *
 * @param objPlayer the obj player
 * @return true, if successful
 * @throws IOException Signals that an I/O exception has occurred.
 */
	public boolean TheScoursAction(Player objPlayer) throws IOException{

		boolean status = false;
		Integer playerID = objPlayer.getPlayer_id();
		if(playerID != null)
		{
			Game.PaymentFromBank(playerID, 2);
			BufferedReader brPlayerBuff = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please select a Green Card which you wish to Discard:");
			String strValidGreenCardList = ",";
			Game.SetGreenCardIsPlayed(CardID, true);
			ArrayList<GreenCard> greenCardList = Game.GetGreenCardByPlayerID(objPlayer.getPlayer_id());
			for(GreenCard grnCard : greenCardList)
			{			
				String ActionList = Game.GetGreenCardActions(grnCard.GetCardID());
				strValidGreenCardList+=grnCard.GetCardID()+",";
				System.out.printf("%-5s%-5s%-40s%-5s%-50s%-5s%-60s\n",grnCard.GetCardID() ,  " : " ,  grnCard.getName() , " : " , ActionList," : ","Scroll Action : "+grnCard.GetActionDescription());			
			}		
			String strGreenCardID = "";
			while(true)
			{
				strGreenCardID = brPlayerBuff.readLine();
				if(strValidGreenCardList.contains(","+strGreenCardID+","))
				{
					status = true;
					break;
				}
				else
				{
					System.out.println("Please enter a valid Green Card ID listed above:");
				}

			}
			Game.SetGreenCardIsPlayed(strGreenCardID, true);
			status = true;
			System.out.println("Action Performed");
		}
		else
		{
			System.out.println("PlayeId is Null");
			System.out.println("Action Failed");
			status = false;
		}
		return status;
	}

//	boolean status = false;
//	ArrayList<GreenCard> CardList = Game.GetGreenCardByPlayerID(objPlayer.getPlayer_id());
//	System.out.println("Which card do you want to discard :" + CardList);
//	BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//	String cardID = br1.readLine();
//	GreenCard objGC = Game.GetGreenCard(cardID);
//	objGC.IsPlayed = true;
//	int playerID = objPlayer.getPlayer_id();
//	Game.PaymentFromBank(playerID, 2);
//	status = true;
//	System.out.println("Action Performed Successfully");
//
//	return status;
//}

/**
 * The shades action.
 *
 * @param objPlayer the obj player
 * @return true, if successful
 * @throws NumberFormatException the number format exception
 * @throws IOException Signals that an I/O exception has occurred.
 */
	public boolean TheShadesAction(Player objPlayer) throws NumberFormatException, IOException{
			boolean status = false;
			//To draw one card from deck
			//String areaList = Game.getAreaIDForPlayer(objPlayer.getPlayer_id());
			//System.out.println("Enter areaId :" + areaList);
			//BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			//int areaID = Integer.parseInt(br1.readLine());
			String adjacentAreaidList = Game.getAdjacentAreas(7);
			System.out.println("Enter the areaID among the list where you want place the troublemarker adjacent to it:" + adjacentAreaidList + ",7");
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			int adjacentAreaID = Integer.parseInt(br2.readLine());
			objPlayer.PlaceATroubleMarkerInArea(adjacentAreaID);														
			System.out.println("Trouble Marker was placed in : "+PresentationUtility.getCityAreaCardNameById(adjacentAreaID));
			//TroubleMaker objTroubleMaker = Game.GetTroubleMakerNotOnBoard();
			//objTroubleMaker.setArea_id(adjacentAreaID);
			status = true;
			System.out.println("Action Performed");
		return status;
	}

/**
 * Small gods action.
 *
 * @param objPlayer the obj player
 * @return true, if successful
 * @throws IOException Signals that an I/O exception has occurred.
 */
public boolean SmallGodsAction(Player objPlayer) throws IOException{
		return true;
}

/**
 * Isle of gods action.
 *
 * @param objPlayer the obj player
 * @return true, if successful
 * @throws IOException Signals that an I/O exception has occurred.
 */
public boolean IsleOfGodsAction(Player objPlayer) throws IOException{
	boolean status = false;
	Integer playerID = objPlayer.getPlayer_id();
	if(playerID != null)
	{
		Game.PaymentToBank(playerID, 2);
		if(objPlayer.UserRemoveOneTroubleMarker())
		{
			System.out.println("Action Performed");
			status = true;
		}
		else{
			System.out.println("Action Failed");
			status = false;
		}
	}
	return status;
}
		//String areaList = Game.GetTroubleMakerOnBoardAreaId();
		//System.out.println("Enter areaID from which area you want to remove trouble marker" + areaList);
		//BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		//int areaID = Integer.parseInt(br1.readLine());
		//if(Game.removeTroubleMarkerByAreaId(areaID)){
		//	status = true;
		//}
	

/**
 * Unreal estate.
 *
 * @param objPlayer the obj player
 * @return true, if successful
 * @throws IOException Signals that an I/O exception has occurred.
 */
public boolean UnrealEstate(Player objPlayer) throws IOException{
	boolean status = false;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Would you like to perform this action : Y/N ");
	String userinput = br.readLine();
	if (userinput.equals('Y') || userinput.equals('y'))
	{	
		//Game g1 = new Game();
		String greenCard =Game.GetRandomGreenCardFromDeck(); //Player.takeOneGreenCardFromDeck(g1);
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
