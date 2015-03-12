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
	
	//Method to Set Player from Player ID
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
			return CardList.substring(0, CardList.length()-2);
			
			
		}
		
		//Method to assign random Green Card from Deck
		public static String GetRandomGreenCardFromDeck()
		{
			String CardList = GetGreenCardsIDsFromDeck();			
				String[] lstCardID = CardList.split(",");
				
			Integer cardIndexNumber = PresentationUtility.returnRandomNumber(1,lstCardID.length);
			return lstCardID[cardIndexNumber];						
		}
		
		//Method to assign Green Card to player
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
		public static boolean PaymentToBank(int PaidByPlayer, int Amount)
		{			
			Player objPaidByPlayer =GetPlayer(PaidByPlayer);
						
			if(objPaidByPlayer.getPlayerAmount()> Amount)
			{
				objPaidByPlayer.setPlayer_amount(objPaidByPlayer.getPlayer_amount()-Amount);
				Game.GameBank.setBankAmount(Game.GameBank.getBankAmount()+ Amount);
				Game.SetPlayer(objPaidByPlayer);
				return true;
			}
			else
			{
				return false;
			}
		}
		
		//Method to take Payment from Bank
				public static boolean PaymentFromBank(int PayToPlayer, int Amount)
				{			
					Player objPayToPlayer =GetPlayer(PayToPlayer);
								
					if(Game.GameBank.getBankAmount()> Amount)
					{
						objPayToPlayer.setPlayer_amount(objPayToPlayer.getPlayer_amount()+Amount);
						Game.GameBank.setBankAmount(Game.GameBank.getBankAmount()- Amount);
						Game.SetPlayer(objPayToPlayer);
						return true;
					}
					else
					{
						return false;
					}
				}

}
