package ankhmorpork.Game;
import java.util.ArrayList;

import PresentationUtilityCommon.PresentationUtility;
import ankhmorpork.GameConstants.Constants;
import ankhmorpork.GameObjects.Area;
import ankhmorpork.GameObjects.Bank;
import ankhmorpork.GameObjects.Building;
import ankhmorpork.GameObjects.Demon;
import ankhmorpork.GameObjects.Minion;
import ankhmorpork.GameObjects.Player;
import ankhmorpork.GameObjects.Troll;
import ankhmorpork.GameObjects.TroubleMaker;
import ankhmorpork.GameObjects.Cards.BrownCard;
import ankhmorpork.GameObjects.Cards.CityAreaCard;
import ankhmorpork.GameObjects.Cards.GreenCard;
import ankhmorpork.GameObjects.Cards.PersonalityCard;
import ankhmorpork.GameObjects.Cards.RandomEventCard;

// TODO: Auto-generated Javadoc
/**
 * The Class Game.
 */
public class Game {

	/** The lst area. */
	public static ArrayList<Area> lstArea = new ArrayList<Area>();

	/** The lst demons. */
	public static ArrayList<Demon> lstDemons = new ArrayList<Demon>();
	
	/** The lst trolls. */
	public static ArrayList<Troll> lstTrolls = new ArrayList<Troll>();
	
	/** The lst minions. */
	public static ArrayList<Minion> lstMinions = new ArrayList<Minion>();
	
	/** The lst buildings. */
	public static ArrayList<Building> lstBuildings = new ArrayList<Building>();
	
	/** The lst players. */
	public static ArrayList<Player> lstPlayers = new ArrayList<Player>();
	
	/** The lst trouble maker. */
	public static ArrayList<TroubleMaker> lstTroubleMaker = new ArrayList<TroubleMaker>();
	
	/** The lst city area cards. */
	public static ArrayList<CityAreaCard> lstCityAreaCards = new ArrayList<CityAreaCard>();
	
	/** The lst green cards. */
	public static ArrayList<GreenCard> lstGreenCards = new ArrayList<GreenCard>();
	
	/** The lst brown cards. */
	public static ArrayList<BrownCard> lstBrownCards = new ArrayList<BrownCard>();
	
	/** The lst random event cards. */
	public static ArrayList<RandomEventCard> lstRandomEventCards = new ArrayList<RandomEventCard>();
	
	/** The lst personality card. */
	public static ArrayList<PersonalityCard> lstPersonalityCard = new ArrayList<PersonalityCard>();
	
	/** The Game bank. */
	public static Bank GameBank = new Bank();
		
	
	
			
	//Method to Get Player from Player ID
	/**
	 * Gets the player.
	 *
	 * @param PlayerID the player id
	 * @return the player
	 */
	public static Player GetPlayer(int PlayerID)
	{
		Player Player = new Player();
		for(Player objPlayer : lstPlayers)
		{
			if(objPlayer.getPlayer_id()== PlayerID)
			{
				Player = objPlayer;
				break;
			}
		}
		
		return Player;
	}
	
	//Method to Set Player from Player ID
	/**
	 * Sets the player.
	 *
	 * @param Player the player
	 */
	public static void SetPlayer(Player Player)
	{		
		for(Player objPlayer : lstPlayers)
		{
			if(objPlayer.getPlayer_id()== Player.getPlayer_id())
			{
				objPlayer = Player;
				break;
			}
		}
			
	}
	
	//Method to Get Area from Area ID
		/**
	 * Gets the area.
	 *
	 * @param AreaID the area id
	 * @return the area
	 */
		public static Area GetArea(int AreaID)
		{
			Area Area = new Area();
			for(Area objArea : lstArea)
			{
				if(objArea.getAreaID()== AreaID)
				{
					Area = objArea;
					break;
				}
			}
			
			return Area;
		}
		
				//Method to Get Minion from Minion ID
		/**
		 * Gets the minions by minion id.
		 *
		 * @param MinionID the minion id
		 * @return the array list
		 */
		public static Minion GetMinionsByMinionID(int MinionID)
		{
			Minion Minion = new Minion();
			for(Minion objMinion : lstMinions)
			{
				if(objMinion.getMinion_id()== MinionID)
				{
					return objMinion;
				}
			}
					
			return Minion;
		}
		
		/**
		 * Gets the minions by player id.
		 *
		 * @param PlayerID the player id
		 * @return the array list
		 */
		public static ArrayList<Minion> GetMinionsArrByMinionID(int MinionID)
		{
			ArrayList<Minion> Minions = new ArrayList<Minion>();
			for(Minion objMinion : lstMinions)
			{
				if(objMinion.getMinion_id()== MinionID)
				{
					Minions.add(objMinion);
				}
			}
					
			return Minions;
		}
		
		public static Player getPlayerObjByMinionId(int minionId){
			Player playerObj = null;
			
			for(Player objPlayer : lstPlayers){
				Minion minionObj = GetMinionsByMinionID(minionId);
				if(objPlayer.getPlayer_id() == minionObj.getPlayer_id()){
					return objPlayer;
				}
			}
			return playerObj;
		}
		
		public static ArrayList<Minion> GetMinionsByPlayerID(int PlayerID)
		{
			ArrayList<Minion> Minions = new ArrayList<Minion>();
			for(Minion objMinion : lstMinions)
			{
				if(objMinion.getPlayer_id()== PlayerID && objMinion.getActive())
				{
					Minions.add(objMinion);
				}
			}
					
			return Minions;
		}
		
		/**
		 * Gets the minions not on board by player id.
		 *
		 * @param PlayerID the player id
		 * @return the array list
		 */
		public static ArrayList<Minion> GetMinionsNotOnBoardByPlayerID(int PlayerID)
		{
			ArrayList<Minion> Minions = new ArrayList<Minion>();
			for(Minion objMinion : lstMinions)
			{
				if(objMinion.getPlayer_id()== PlayerID && objMinion.getActive() && objMinion.getArea_id()==0)
				{
					Minions.add(objMinion);
				}
			}
					
			return Minions;
		}
		
		public static ArrayList<Minion> GetMinionsOnBoardByPlayerID(int PlayerID)
		{
			ArrayList<Minion> Minions = new ArrayList<Minion>();
			for(Minion objMinion : lstMinions)
			{
				if(objMinion.getPlayer_id()== PlayerID && objMinion.getActive() && objMinion.getArea_id() > 0)
				{
					Minions.add(objMinion);
				}
			}
					
			return Minions;
		}
		
		/**
		 * Gets the minions by area id.
		 *
		 * @param AreaID the area id
		 * @return the array list
		 */
		public static ArrayList<Minion> GetMinionsByAreaID(int AreaID)
		{
			ArrayList<Minion> Minions = new ArrayList<Minion>();
			for(Minion objMinion : lstMinions)
			{
				if(objMinion.getArea_id()== AreaID && objMinion.getActive())
				{
					Minions.add(objMinion);
				}
			}
					
			return Minions;
		}
		
		//Method to get one Player Minion form an Area
		public static Minion GetPlayerMinionFromArea(int iPlayerID, int iAreaID)
		{
			Minion objMinion = new Minion();
			for(Minion Minion : lstMinions)
			{
				if(Minion.getArea_id()==iAreaID && Minion.getPlayer_id()==iPlayerID)
				{
					objMinion = Minion;
					break;
				}
			}
			
			return objMinion;
		}
		
		//Method to return comma separated String of Active Minion IDs in an Area
		/**
		 * Gets the active minions string by area id.
		 *
		 * @param AreaID the area id
		 * @return the string
		 */
		public static String GetActiveMinionsStringByAreaID(int AreaID)
		{
			StringBuilder strActiveMinions = new StringBuilder();
			for(Minion objMinion : lstMinions)
			{
				if(objMinion.getActive()&& objMinion.getArea_id()== AreaID)
				{
					strActiveMinions.append(objMinion.getMinion_id() + ",");
				}
			}
			String ActiveMinions = strActiveMinions.toString();
			//Remove the trailing "," and return the string
			return ActiveMinions.substring(0,ActiveMinions.length()-2);
		}
		
		//Method to return comma separated String of Active Minion IDs of a Player
		/**
		 * Gets the active minions string by player id.
		 *
		 * @param PlayerID the player id
		 * @return the string
		 */
		public static String GetActiveMinionsStringByPlayerID(int PlayerID)
		{
			StringBuilder strActiveMinions = new StringBuilder();
			for(Minion objMinion : lstMinions)
			{
				if(objMinion.getActive()&& objMinion.getPlayer_id()== PlayerID)
				{
					strActiveMinions.append(objMinion.getMinion_id() + ",");
				}
			}
			String ActiveMinions = strActiveMinions.toString();
			//Remove the trailing "," and return the string
			return ActiveMinions.substring(0,ActiveMinions.length()-1);
		}
		
		//Method to return comma separated String of Active Minion IDs in an Area
		/**
		 * Gets the active buildings string by area id.
		 *
		 * @param AreaID the area id
		 * @return the string
		 */
		public static String GetActiveBuildingsStringByAreaID(int AreaID)
		{
			StringBuilder strActiveBuildings = new StringBuilder();
			for(Building objBuilding : lstBuildings)
			{
				if(objBuilding.getActive()&& objBuilding.getArea_id()== AreaID)
				{
					strActiveBuildings.append(objBuilding.getBuilding_id() + ",");
				}
			}
			String ActiveBuildings = strActiveBuildings.toString();
			//Remove the trailing "," and return the string
			return ActiveBuildings.substring(0,ActiveBuildings.length()-2);
		}
		//Method to return comma separated String of Active Building IDs of a Player
		/**
		 * Gets the active buildings string by player id.
		 *
		 * @param PlayerID the player id
		 * @return the string
		 */
		public static String GetActiveBuildingsStringByPlayerID(int PlayerID)
		{
			StringBuilder strActiveBuildings = new StringBuilder();
			for(Building objBuilding : lstBuildings)
			{
				if(objBuilding.getActive()&& objBuilding.getPlayer_id()== PlayerID)
				{
					strActiveBuildings.append(objBuilding.getBuilding_id() + ",");
				}
			}
			String ActiveBuildings = strActiveBuildings.toString();
			//Remove the trailing "," and return the string
			return ActiveBuildings.substring(0,ActiveBuildings.length()-2);
		}
		
		/**
		 * Sets the building.
		 *
		 * @param Building the building
		 * @return true, if successful
		 */
		public static boolean SetBuilding(Building Building)
		{
			boolean success = false;
			for(Building objBuilding : Game.lstBuildings)
			{
				if(objBuilding.getBuilding_id()==Building.getBuilding_id())
				{
					objBuilding = Building;
					success = true;
					break;
				}
			}
			return success;
		}			
		
		public static boolean SetMinion(Minion Minion)
		{
			boolean success = false;
			for(Minion objMinion : Game.lstMinions)
			{
				if(objMinion.getMinion_id()==Minion.getMinion_id())
				{
					objMinion = Minion;
					success = true;
					break;
				}
			}
			return success;
		}
		
		/**
		 * Gets the buildings by building id.
		 *
		 * @param BuildingID the building id
		 * @return the building
		 */
		public static Building GetBuildingsByBuildingID(int BuildingID)
		{
			Building Building = new Building();
			for(Building objBuilding : lstBuildings)
			{
				if(objBuilding.getBuilding_id() == BuildingID && objBuilding.getActive())
				{
					Building = objBuilding;
					break;
				}
			}					
			return Building;
		}
		
		/**
		 * Gets the buildings by area id.
		 *
		 * @param AreaID the area id
		 * @return the array list
		 */
		public static ArrayList<Building> GetBuildingsByAreaID(int AreaID)
		{
			ArrayList<Building> Buildings = new ArrayList<Building>();
			for(Building objBuilding : lstBuildings)
			{
				if(objBuilding.getArea_id()== AreaID && objBuilding.getActive())
				{
					Buildings.add(objBuilding);
				}
			}					
			return Buildings;
		}
		
		/**
		 * Gets the buildings by player id.
		 *
		 * @param PlayerID the player id
		 * @return the array list
		 */
		public static ArrayList<Building> GetBuildingsByPlayerID(int PlayerID)
		{
			ArrayList<Building> Buildings = new ArrayList<Building>();
			for(Building objBuilding : lstBuildings)
			{
				if(objBuilding.getArea_id()== PlayerID && objBuilding.getActive())
				{
					Buildings.add(objBuilding);
				}
			}					
			return Buildings;
		}
		
		/**
		 * Area with no building.
		 *
		 * @return the string
		 */
		public static String AreaWithNoBuilding()
		{
			String strAreaList = "1,2,3,4,5,6,7,8,9,10,11,12,";
			for(Building Building : Game.lstBuildings)
			{
				if(Building.getArea_id()!=0)
				{
					if(strAreaList.contains(Building.getArea_id()+","))
					{
						strAreaList.replace(Building.getArea_id()+",", "");
					}
				}
			}
			return strAreaList;
		}
		
		public static boolean AreaHasABuilding(int AreaID)
		{	
			boolean Found = false;
			for(Building Building : Game.lstBuildings)
			{
				if(Building.getArea_id()==AreaID)
				{
					Found = true;
					break;
				}
			}
			return Found;
		}
		
		public static String GetValidAreasToPlaceBuilding(int PlayerID)
		{
			String strValidAreas = "";
			String strAreasHavingMinion = "";
			strAreasHavingMinion = GetAreasHavingMinionOfPlayer(PlayerID);
			String[] arryAreasHavingMinion = strAreasHavingMinion.split(",");
			//String strValidAreas = "";
			for(int i=0; i<arryAreasHavingMinion.length;i++)
			{
				if(!AreaHasABuilding(Integer.parseInt(arryAreasHavingMinion[i]))&&!AreaHasTroubleMarker(Integer.parseInt(arryAreasHavingMinion[i]))&&AreaHasMinionOfPlayer(Integer.parseInt(arryAreasHavingMinion[i]), PlayerID))
				{
					strValidAreas+=arryAreasHavingMinion[i]+",";
				}
			}
			
			if(!strValidAreas.isEmpty())
			{
				strValidAreas.substring(0,strValidAreas.length()-1);
			}
			return strValidAreas;
		}
		
		public static String GetAreasHavingMinionOfPlayer(int PlayerID)
		{
			String strValidAreas = "";
			for(Minion objMinion : Game.lstMinions)
			{
				if(objMinion.getPlayer_id()==PlayerID && objMinion.getArea_id()!=0)
				{
					if(!strValidAreas.contains(objMinion.getArea_id()+","))
					{
						strValidAreas+=objMinion.getArea_id()+",";
					}
				}
			}
			
			if(!strValidAreas.isEmpty())
			{
				strValidAreas.substring(0,strValidAreas.length()-1);
			}
			
			return strValidAreas;
		}
		
		public static String GetValidAreasToPlaceMinion(int PlayerID)
		{
			String strValidAreas = "";
			String strAreasHavingMinion = "";
			strAreasHavingMinion = GetAreasHavingMinionOfPlayer(PlayerID);			
			
			if(!strAreasHavingMinion.isEmpty())
			{
				String[] arryAreasHavingMinion = strAreasHavingMinion.split(",");
				for(int i =0; i<arryAreasHavingMinion.length;i++)
				{
					strValidAreas+=arryAreasHavingMinion[i]+","+PresentationUtility.GetAdjacentAreas(Integer.parseInt(arryAreasHavingMinion[i]))+",";
				}
			}
			
			if(!strValidAreas.isEmpty())
			{
				//Get distinct areas from strValidAreas
				strValidAreas = PresentationUtility.getDistinctCommaSeparatedValues(strValidAreas.substring(0,strValidAreas.length()-1));
			}
			
			return strValidAreas;
		}			
		
		//Display Area names to User
		public static void DisplayAreas(String strAreaIDsCommaSeparated)
		{
			String[] AreaID = strAreaIDsCommaSeparated.split(",");
			
			for(int i = 0; i<AreaID.length; i++)
			{
				System.out.println(AreaID[i] + " : " + PresentationUtility.getCityAreaCardNameById(Integer.parseInt(AreaID[i])));
			}
	}

	//Display Area names to User
	public static void DisplayPlayers(String strPlayerIDsCommaSeparated)
	{
		if(strPlayerIDsCommaSeparated.startsWith(","))
		{
			strPlayerIDsCommaSeparated=strPlayerIDsCommaSeparated.substring(1);
		}
		String[] PlayerID = strPlayerIDsCommaSeparated.split(",");

		for(int i = 0; i<PlayerID.length; i++)
		{
			Player objPlayer = Game.GetPlayer(Integer.parseInt(PlayerID[i]));
			System.out.println(PlayerID[i] + " : " + objPlayer.getPlayer_name());
		}
	}

	//		//Display Area names to User
	//		public static void DisplayGreenCards(String strGCIDsCommaSeparated)
	//		{
	//			String[] GreenCardID = strGCIDsCommaSeparated.split(",");
	//			
	//			for(int i = 0; i<GreenCardID.length; i++)
	//			{
	//				System.out.println(GreenCardID[i] + " : " + getG)));
	//			}
	//		}

	public static String GetMinionIDsNotOnBoard(int PlayerID)
	{
		String placingAMinionStr = "";
		for(Minion minionObj : Game.lstMinions){
			if(minionObj.getPlayer_id() == PlayerID && minionObj.getArea_id() == 0){
				placingAMinionStr += minionObj.getMinion_id() + ",";
			}
			if(placingAMinionStr.endsWith(",")){
				placingAMinionStr = placingAMinionStr.substring(0, placingAMinionStr.length()-1);
			}
		}
		return placingAMinionStr;
	}
	public static String AreaWithNoMinion()
	{
		String strAreaList = "1,2,3,4,5,6,7,8,9,10,11,12,";
		for(Minion Minion : Game.lstMinions)
		{
			if(Minion.getArea_id()!=0)
			{
				if(strAreaList.contains(Minion.getArea_id()+","))
				{
					strAreaList.replace(Minion.getArea_id()+",", "");
				}
			}
		}
		return strAreaList;
	}
	
	public static String GetPlayerIDsHavingMinionsOnBoard()
	{
		String strPlayerID =",";			
		for(Minion objMinion : Game.lstMinions)
		{
			if(objMinion.getPlayer_id()!=0)
			{
				if(!strPlayerID.contains(objMinion.getPlayer_id().toString()))
				{
					strPlayerID+=objMinion.getPlayer_id()+",";
				}

			}
		}

		return strPlayerID;
	}
		/**
		 * Gets the buildings not on board by player id.
		 *
		 * @param PlayerID the player id
		 * @return the array list
		 */
		
		public static String GetBuildingIDsNotOnBoard(int PlayerID)
		{
			String placingABuidingStr="";
			for(Building buildingObj : Game.lstBuildings)
			{
				if(buildingObj.getPlayer_id() == PlayerID && buildingObj.getArea_id() == 0){
					placingABuidingStr += buildingObj.getBuilding_id() + ",";
				}
				if(placingABuidingStr.endsWith(",")){
					placingABuidingStr = placingABuidingStr.substring(0, placingABuidingStr.length()-1);
				}
			}
			return placingABuidingStr;
		}
		
		public static ArrayList<Building> GetBuildingsNotOnBoardByPlayerID(int PlayerID)
		{
			ArrayList<Building> Buildings = new ArrayList<Building>();
			for(Building objBuilding : lstBuildings)
			{
				if(objBuilding.getArea_id()== PlayerID && objBuilding.getActive() && objBuilding.getArea_id()==0)
				{
					Buildings.add(objBuilding);
				}
			}					
			return Buildings;
		}
		
	public static String GetPlayerIDsHavingBuildingsOnBoard()
	{
		String strPlayerID =",";			
		for(Building objBuilding : Game.lstBuildings)
		{
			if(objBuilding.getPlayer_id()!=0)
			{
				if(!strPlayerID.contains(objBuilding.getPlayer_id().toString()))
				{
					strPlayerID+=objBuilding.getPlayer_id()+",";
				}

			}
		}

		return strPlayerID;
	}
		/**
		 * Gets the troll by troll id.		 
		 * @param TrollID the troll id
		 * @return the troll
		 */
		public static Troll GetTrollByTrollID(int TrollID)
		{
			Troll Troll = new Troll();
			for(Troll objTroll : lstTrolls)
			{
				if(objTroll.getTroll_id()== TrollID && objTroll.getActive())
				{
					Troll = objTroll;
				}
			}					
			return Troll;
		}
		
		/**
		 * Gets the demon by demon id.		 
		 * @param DemonID the demon id
		 * @return the demon
		 */
		public static Demon GetDemonByDemonID(int DemonID)
		{
			Demon Demon = new Demon();
			for(Demon objDemon : lstDemons)
			{
				if(objDemon.getDemon_id()== DemonID && objDemon.getActive())
				{
					Demon = objDemon;
				}
			}					
			return Demon;
		}
		
		/**
		 * Gets the demon by area id.
		 *
		 * @param AreaID the area id
		 * @return the array list
		 */
		public static ArrayList<Demon> GetDemonByAreaID(int AreaID)
		{
			ArrayList<Demon> Demons = new ArrayList<Demon>();
			for(Demon objDemon : lstDemons)
			{
				if(objDemon.getArea_id()== AreaID && objDemon.getActive())
				{
					Demons.add(objDemon);
				}
			}					
			return Demons;
		}
		
		/**
		 * Gets the troll by area id.
		 *
		 * @param AreaID the area id
		 * @return the array list
		 */
		public static ArrayList<Troll> GetTrollByAreaID(int AreaID)
		{
			ArrayList<Troll> Trolls = new ArrayList<Troll>();
			for(Troll objTroll : lstTrolls)
			{
				if(objTroll.getArea_id()== AreaID && objTroll.getActive())
				{
					Trolls.add(objTroll);
				}
			}					
			return Trolls;
		}
		
		/**
		 * Area has demon.
		 *
		 * @param AreaID the area id
		 * @return true, if successful
		 */
		public static boolean AreaHasDemon(Integer AreaID) 
		{
			ArrayList<Demon> lstDemon = new ArrayList<Demon>();
			lstDemon = GetDemonByAreaID(AreaID);
			if(!lstDemon.isEmpty())
				return true;
			else
				return false;
		}
		
		/**
		 * Area has minion.
		 *
		 * @param AreaID the area id
		 * @return true, if successful
		 */
		public static boolean AreaHasMinion(Integer AreaID) 
		{
			ArrayList<Minion> lstMinion = new ArrayList<Minion>();
			lstMinion = GetMinionsByAreaID(AreaID);
			if(!lstMinion.isEmpty())
				return true;
			else
				return false;
		}
		
		public static boolean AreaHasMinionOfPlayer(Integer AreaID, int PlayerID) 
		{			
			boolean found = false;
			ArrayList<Minion> lstMinion = new ArrayList<Minion>();
			lstMinion = GetMinionsByAreaID(AreaID);
			for(Minion Minion : lstMinion)
			{
				if(Minion.getPlayer_id()==PlayerID)
				{
					found = true;
					break;
				}
			}
			return found;
		}
		/**
		 * Area has troll.
		 *
		 * @param AreaID the area id
		 * @return true, if successful
		 */
		public static boolean AreaHasTroll(Integer AreaID) 
		{
			ArrayList<Troll> lstDemon = new ArrayList<Troll>();
			lstDemon = GetTrollByAreaID(AreaID);
			if(!lstDemon.isEmpty())
				return true;
			else
				return false;
		}
		
		/**
		 * Area has trouble marker.
		 *
		 * @param AreaID the area id
		 * @return true, if successful
		 */
		public static boolean AreaHasTroubleMarker(Integer AreaID) 
		{
			boolean success=false;
			for(TroubleMaker TM : Game.lstTroubleMaker)
			{
				if(TM.getArea_id()==AreaID)
					{
						success = true;
						break;
					}								
			}
			
			return success;
				
		}
		
		//Method to return TroubleMaker based on AreaID
		/**
		 * Gets the trouble marker.
		 *
		 * @param AreaID the area id
		 * @return the trouble maker
		 */
		public static TroubleMaker GetTroubleMarker(int AreaID)
		{
			TroubleMaker objTroubleMaker = new TroubleMaker();
			for(TroubleMaker objTM : Game.lstTroubleMaker)
			{
				if(objTM.getArea_id()==AreaID)
				{
					objTroubleMaker = objTM;
				}
			}
			return objTroubleMaker;
		}
		
		/**
		 * Removes the trouble marker by area id.
		 *
		 * @param areaId the area id
		 * @return true, if successful
		 */
		public static boolean removeTroubleMarkerByAreaId(int areaId){
			boolean success = false;
				for(TroubleMaker troubleMaker : Game.lstTroubleMaker){
					if(troubleMaker.getArea_id() == areaId){
						troubleMaker.setArea_id(0);
						success = true;
					}
				}
			return success;
		}
		
		
		public static PersonalityCard GetPersonalityCardByPlayerID(int PlayerID)
		{
			PersonalityCard objPersonalityCard = new PersonalityCard();
			for(PersonalityCard PersonalityCard : lstPersonalityCard)
			{
				if(PersonalityCard.getPlayerID()==PlayerID)
				{
					objPersonalityCard = PersonalityCard;
					break;
				}
			}
			
			return objPersonalityCard;
		
		}
		
		/**
		 * Gets the trouble maker on board area id.
		 *
		 * @return the string
		 */
		public static String GetTroubleMakerOnBoardAreaId()
		{
			String sbAreaListStr = "";
			StringBuilder sbAreaList = new StringBuilder();
			TroubleMaker objTroubleMaker = new TroubleMaker();
			for(TroubleMaker objTM : Game.lstTroubleMaker)
			{
				if(objTM.getArea_id()!=0)
				{
					sbAreaList.append(objTroubleMaker.getArea_id()+ ",");					
				}
			}
			
			sbAreaListStr = sbAreaList.toString();
			if(sbAreaListStr.endsWith(",")){
				sbAreaListStr = sbAreaListStr.substring(0, sbAreaListStr.length()-1);
			}
			return sbAreaListStr;
		}
		
		
		//Method to return list of TroubleMakers
		/**
		 * Gets the trouble maker not on board.
		 *
		 * @return the trouble maker
		 */
		public static TroubleMaker GetTroubleMakerNotOnBoard()
		{
			TroubleMaker objTroubleMaker = new TroubleMaker();
			for(TroubleMaker objTM : Game.lstTroubleMaker)
			{
				if(objTM.getArea_id()==0)
				{
					objTroubleMaker = objTM;
					break;
				}
			}
			//This object can be null
			return objTroubleMaker;
		}
				
		//Method to check whether Green cards are available in stack
		/**
		 * Checks if is green card in deck.
		 *
		 * @return true, if successful
		 */
		public static boolean IsGreenCardInDeck()
		{
			boolean found = false;
			for(GreenCard GC : lstGreenCards)
			{
				if(GC.IsPlayed)
				{
					found = true;
					break;
				}
			}
			
			return found;
		}
		
		//Method to get Green Card by Card ID
		/**
		 * Gets the green card.
		 *
		 * @param CardID the card id
		 * @return the green card
		 */
		public static GreenCard GetGreenCard(String CardID)
		{
			GreenCard objGC = new GreenCard();
			for(GreenCard grnCard : lstGreenCards)
			{
				if(grnCard.GetCardID().equals(CardID) && !grnCard.IsPlayed)
				{
					objGC = grnCard;
					break;
				}
			}
			
			return objGC;
		}
		
		//Method to set card played
		/**
		 * Sets the green card is played.
		 *
		 * @param CardID the card id
		 * @param IsPlayed the is played
		 */
		public static void SetGreenCardIsPlayed(String CardID, boolean IsPlayed)
		{
			for(GreenCard GC : Game.lstGreenCards)
			{
				if(GC.GetCardID().equals(CardID))
				{
					GC.SetIsPlayed(IsPlayed);
					GC.setPlayerID(0);
					break;
				}
			}
		}
		
		//Method to Get GreenCardIDs in Deck
		/**
		 * Gets the green cards i ds from deck.
		 *
		 * @return the string
		 */
		public static String GetGreenCardsIDsFromDeck()
		{
			String CardList ="";
			StringBuilder sbCardIDs = new StringBuilder();
			for(GreenCard GC : Game.lstGreenCards)
			{
				if(GC.IsPlayed==false && GC.getPlayerID()==0)
				{
					sbCardIDs.append(GC.GetCardID()+",");
				}
			}
			
			CardList = sbCardIDs.toString();
			return CardList.substring(0, CardList.length()-1);
			
			
		}
		
		//Method to assign random Green Card from Deck
		/**
		 * Gets the random green card from deck.
		 *
		 * @return the string
		 */
		public static String GetRandomGreenCardFromDeck()
		{
			String CardList = GetGreenCardsIDsFromDeck();			
				String[] lstCardID = CardList.split(",");
				
Integer cardIndexNumber = PresentationUtility.returnRandomNumber(0,lstCardID.length-1);
			return lstCardID[cardIndexNumber];						
		}
		
		//Method to assign Green Card to player
		/**
		 * Sets the green card to player.
		 *
		 * @param CardID the card id
		 * @param PlayerID the player id
		 * @return true, if successful
		 */
		public static boolean SetGreenCardToPlayer(String CardID, int PlayerID)
		{
			boolean success=false;
			for(GreenCard GC : Game.lstGreenCards)
			{
				if(GC.GetCardID().equals(CardID))
				{
					GC.setPlayerID(PlayerID);
					success = true;
					break;
				}
			}
			return success;
		}
		
		//Method to get Green CArd Actions
		/**
		 * Gets the green card actions.
		 *
		 * @param GreenCardID the green card id
		 * @return the string
		 */
		public static String GetGreenCardActions(String GreenCardID)
		{
			GreenCard GC = Game.GetGreenCard(GreenCardID);
			String[] ActionArray = GC.GetAction();
			StringBuilder sbActions = new StringBuilder();			
			for(int i = 0; i < ActionArray.length; i++)
			{
				sbActions.append(ActionArray[i] + ", ");
			}
			
			return sbActions.toString();
		}
		
		/**
		 * Gets the green card by player id.
		 *
		 * @param PlayerID the player id
		 * @return the array list
		 */
		public static ArrayList<GreenCard> GetGreenCardByPlayerID(int PlayerID)
		{
			ArrayList<GreenCard> lstGreenCard = new ArrayList<GreenCard>();
			for(GreenCard GreenCard : lstGreenCards)
			{
				if(GreenCard.getPlayerID()==PlayerID)
				{
					lstGreenCard.add(GreenCard);
				}
			}
			
			return lstGreenCard;
		
		}
		
		

		//Method to get Player Green Card count
		/**
		 * Gets the player green card count.
		 *
		 * @param PlayerID the player id
		 * @return the int
		 */
		public static int GetPlayerGreenCardCount(int PlayerID)
		{
			int count = 0;
			for(GreenCard grnCard: Game.lstGreenCards)
			{	
				if(grnCard.getPlayerID()==PlayerID && !grnCard.GetIsPlayed())
				{
					count++;
				}
			}
			return count;
		}
		
		/**
		 * Gets the city area card by player id.
		 *
		 * @param PlayerID the player id
		 * @return the array list
		 */
		public static ArrayList<CityAreaCard> GetCityAreaCardByPlayerID(int PlayerID)
		{
			ArrayList<CityAreaCard> lstCityAreaCard = new ArrayList<CityAreaCard>();
			for(CityAreaCard CityAreaCard : lstCityAreaCards)
			{
				if(CityAreaCard.getPlayerID()==PlayerID)
				{
					lstCityAreaCard.add(CityAreaCard);
				}
			}
			
			return lstCityAreaCard;
		}
									
		/**
		 * Gets the city area card by card id.
		 *
		 * @param CardID the card id
		 * @return the city area card
		 */
		public static CityAreaCard GetCityAreaCardByCardID(String CardID)
		{
			CityAreaCard objCityAreaCard = new CityAreaCard();
			for(CityAreaCard CityAreaCard : lstCityAreaCards)
			{
				if(CityAreaCard.GetCardID().equals(CardID))
				{
					objCityAreaCard = CityAreaCard;
					break;
				}
			}			
			return objCityAreaCard;
		}
		
		/**
		 * Sets the city area card.
		 *
		 * @param objCityAreaCard the obj city area card
		 */
		public static void SetCityAreaCard(CityAreaCard objCityAreaCard)
		{
			
			for(CityAreaCard CityAreaCard : lstCityAreaCards)
			{
				if(CityAreaCard.GetCardID().equals(objCityAreaCard.GetCardID()))
				{
					CityAreaCard = objCityAreaCard;
					break;
				}
			}
			
		}
		
		/**
		 * Gets the adjacent areas.
		 *
		 * @param areaID the area id
		 * @return the adjacent areas
		 */
		public static String getAdjacentAreas(int areaID){
			String adjacentAreasList = "";
			if(areaID == 1){
				adjacentAreasList = "2,3,12";
			}else if(areaID == 2){
				adjacentAreasList = "1,3,4,10,11,12";
			}else if(areaID == 3){
				adjacentAreasList = "1,2,4";
			}else if(areaID == 4){
				adjacentAreasList = "2,3,5,6,10";
			}else if(areaID == 5){
				adjacentAreasList = "4,6,7,8,10";
			}else if(areaID == 6){
				adjacentAreasList = "4,5,7";
			}else if(areaID == 7){
				adjacentAreasList = "5,6,8";
			}else if(areaID == 8){
				adjacentAreasList = "5,7,9";
			}else if(areaID == 9){
				adjacentAreasList = "8,10,11";
			}else if(areaID == 10){
				adjacentAreasList = "2,4,5,9,11";
			}else if(areaID == 11){
				adjacentAreasList = "2,9,10,12";
			}else if(areaID == 12){
				adjacentAreasList = "1,2,11";
			}
			return adjacentAreasList;
		}
		
		//Method to make Payment
		/**
		 * Payment player to player.
		 *
		 * @param PayToPlayerID the pay to player id
		 * @param PaidByPlayer the paid by player
		 * @param Amount the amount
		 * @return true, if successful
		 */
		public static boolean PaymentPlayerToPlayer(int PayToPlayerID, int PaidByPlayer, int Amount)
		{
			Player objPayToPlayer = GetPlayer(PayToPlayerID);
			Player objPaidByPlayer =GetPlayer(PaidByPlayer);
						
			if(objPaidByPlayer.getPlayerAmount()> Amount)
			{
				objPaidByPlayer.setPlayer_amount(objPaidByPlayer.getPlayer_amount()-Amount);
				objPayToPlayer.setPlayer_amount(objPayToPlayer.getPlayer_amount()+ Amount);
				Game.SetPlayer(objPaidByPlayer);
				Game.SetPlayer(objPayToPlayer);
				System.out.println("Transaction successful. Transaction Amount :" + Amount);
				System.out.println(objPaidByPlayer.getPlayer_name() + " available amount : " + objPaidByPlayer.getPlayer_amount());
				System.out.println(objPayToPlayer.getPlayer_name() + " available amount : " + objPayToPlayer.getPlayer_amount());
				return true;
//				while(Amount/5 > 0 && objPaidByPlayer.objGoldCoin.getCoin_Available()>0)
//				{
//					//Add 1 Gold Coin to Player
//					objPaidByPlayer.objGoldCoin.setCoin_Available(objPaidByPlayer.objGoldCoin.getCoin_Available()-1);
//					//Deduct amount
//					Amount-=Constants.GoldCoinValue();
//				}
//				
//				while(Amount>0)
//				{
//					//Add 1 Gold Coin to Player
//					objPaidByPlayer.objSilverCoin.setCoin_Available(objPaidByPlayer.objSilverCoin.getCoin_Available()-1);
//					//Deduct amount
//					Amount-=Constants.SilverCoinValue();
//				}
			
			}			
			else
			{
				return false;
			}
		}
		
		//Method to make Payment to Bank
		/**
		 * Payment to bank.
		 *
		 * @param PaidByPlayer the paid by player
		 * @param Amount the amount
		 * @return true, if successful
		 */
		public static boolean PaymentToBank(int PaidByPlayer, int Amount)
		{			
			Player objPaidByPlayer =GetPlayer(PaidByPlayer);
						
			if(objPaidByPlayer.getPlayerAmount()> Amount)
			{
				objPaidByPlayer.setPlayer_amount(objPaidByPlayer.getPlayer_amount()-Amount);
				Game.GameBank.setBankAmount(Game.GameBank.getBankAmount()+ Amount);
				Game.SetPlayer(objPaidByPlayer);
				System.out.println("Transaction successful. Transaction Amount :" + Amount);
				System.out.println(objPaidByPlayer.getPlayer_name() + " available amount : " + objPaidByPlayer.getPlayer_amount());
				System.out.println("Bank available amount : " + Game.GameBank.getBankAmount());
				return true;
			}
			else
			{
				return false;
			}
		}
		
		//Method to take Payment from Bank
				/**
		 * Payment from bank.
		 *
		 * @param PayToPlayer the pay to player
		 * @param Amount the amount
		 * @return true, if successful
		 */
				public static boolean PaymentFromBank(int PayToPlayer, int Amount)
				{			
					Player objPayToPlayer =GetPlayer(PayToPlayer);
								
					if(Game.GameBank.getBankAmount()> Amount)
					{
						objPayToPlayer.setPlayer_amount(objPayToPlayer.getPlayer_amount()+Amount);
						Game.GameBank.setBankAmount(Game.GameBank.getBankAmount()- Amount);
						Game.SetPlayer(objPayToPlayer);
						System.out.println("Transaction successful. Transaction Amount :" + Amount);
						System.out.println(objPayToPlayer.getPlayer_name() + " available amount : " + objPayToPlayer.getPlayer_amount());
						System.out.println("Bank available amount : " + Game.GameBank.getBankAmount());
						return true;
					}
					else
					{
						return false;
					}
				}

}
