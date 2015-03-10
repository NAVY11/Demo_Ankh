package ankhmorpork.Game;
import java.util.ArrayList;

import ankhmorpork.GameObjects.*;
import ankhmorpork.GameObjects.Cards.*;

public class Game {

	public static ArrayList<Area> lstArea = new ArrayList<Area>();
	public static ArrayList<Demon> lstDemons = new ArrayList<Demon>();
	public static ArrayList<Troll> lstTrolls = new ArrayList<Troll>();
	public static ArrayList<Minion> lstMinions = new ArrayList<Minion>();
	public static ArrayList<Building> lstBuildings = new ArrayList<Building>();
	public static ArrayList<Player> lstPlayers = new ArrayList<Player>();
	public static ArrayList<TroubleMaker> lstTroubleMaker = new ArrayList<TroubleMaker>();
	public static ArrayList<CityAreaCard> lstCityAreaCards = new ArrayList<CityAreaCard>();
	public static ArrayList<GreenCard> lstGreenCards = new ArrayList<GreenCard>();
	public static ArrayList<BrownCard> lstBrownCards = new ArrayList<BrownCard>();
	public static ArrayList<RandomEventCard> lstRandomEventCards = new ArrayList<RandomEventCard>();
	public static ArrayList<PersonalityCard> lstPersonalityCard = new ArrayList<PersonalityCard>();
	public static Bank GameBank = new Bank();

	//Method to Get Player from Player ID
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
	
	//Method to Get Area from Area ID
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
		public static ArrayList<Minion> GetMinionsByMinionID(int MinionID)
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
		
		//Method to return comma separated String of Active Minion IDs in an Area
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
			return ActiveMinions.substring(0,ActiveMinions.length()-2);
		}
		
		//Method to return comma separated String of Active Minion IDs in an Area
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
		
		public static ArrayList<Building> GetBuildingsByBuildingID(int BuildingID)
		{
			ArrayList<Building> Buildings = new ArrayList<Building>();
			for(Building objBuilding : lstBuildings)
			{
				if(objBuilding.getBuilding_id() == BuildingID && objBuilding.getActive())
				{
					Buildings.add(objBuilding);
				}
			}					
			return Buildings;
		}
		
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
		
		public static boolean AreaHasDemon(Integer AreaID) 
		{
			ArrayList<Demon> lstDemon = new ArrayList<Demon>();
			lstDemon = GetDemonByAreaID(AreaID);
			if(!lstDemon.isEmpty())
				return true;
			else
				return false;
		}
		
		public static boolean AreaHasTroll(Integer AreaID) 
		{
			ArrayList<Troll> lstDemon = new ArrayList<Troll>();
			lstDemon = GetTrollByAreaID(AreaID);
			if(!lstDemon.isEmpty())
				return true;
			else
				return false;
		}
		
		//Method to return TroubleMaker based on AreaID
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
		
		//Method to return list of TroubleMakers
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
				
}
