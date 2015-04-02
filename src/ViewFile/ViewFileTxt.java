/*
 * 
 */
package ViewFile;

import java.util.ArrayList;
import java.util.HashMap;

import PresentationUtilityCommon.PresentationUtility;
import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.Area;
import ankhmorpork.GameObjects.Building;
import ankhmorpork.GameObjects.Demon;
import ankhmorpork.GameObjects.Minion;
import ankhmorpork.GameObjects.Player;
import ankhmorpork.GameObjects.Troll;
import ankhmorpork.GameObjects.TroubleMaker;
import ankhmorpork.GameObjects.Cards.CityAreaCard;
import ankhmorpork.GameObjects.Cards.GreenCard;

// TODO: Auto-generated Javadoc
/**
 * The Class ViewFileAmbg.
 */
public class ViewFileTxt {

	public void printViewState(){
		//System.out.println(ViewState());
	}
	/**
	 * View state.
	 *
	 * @param lstPlayers the lst players
	 * @return the string
	 */
	public static String ViewState(){
		//return dataToStoreInTextFile(lstPlayers);
		String saveTheDetailsInTextFile = "";
		
		ArrayList<Player> lstPlayers = Game.lstPlayers;
		playerGeneralInfo(lstPlayers);

		ArrayList<Minion> lstMinions = Game.lstMinions;
		HashMap<Integer, String> minionInfo = minionGeneralInfo(lstMinions);
		
		ArrayList<TroubleMaker> lstTroubleMakers = Game.lstTroubleMaker;
		HashMap<Integer, Boolean> troubleInfo = troubleMakerGeneralInfo(lstTroubleMakers);
		
		ArrayList<Building> lstBuildings = Game.lstBuildings;
		HashMap<Integer, String> buildingInfo = buildingGeneralInfo(lstBuildings);
		
		ArrayList<Demon> lstDemons = Game.lstDemons;
		HashMap<Integer, Integer> demonInfo = demonGeneralInfo(lstDemons);

		ArrayList<Troll> lstTrolls = Game.lstTrolls;
		HashMap<Integer, Integer> trollInfo =  trollGeneralInfo(lstTrolls);
		
		System.out.printf("\n\n");
		System.out.printf("Current state of the game board:");
		System.out.printf("\n\n");
		System.out.printf("%-18s", "Area");
		System.out.printf("\t%-11s", "Minion");
		System.out.printf("\t%-4s", "Trouble");
		System.out.printf("\t%-12s", "Building");
		System.out.printf("\t%-4s", "Demons");
		System.out.printf("\t%-4s", "Trolls");
		System.out.printf("\n");
		
		for(int i = 1; i <=12; i++){
			System.out.printf("\n");
			System.out.printf("%-18s", PresentationUtility.getCityAreaCardNameById(i));
			System.out.printf("\t%-11s", minionInfo.get(i) != null ? minionInfo.get(i) : "none");
			System.out.printf("\t%-4s", (troubleInfo.get(i) != null && troubleInfo.get(i) ? "YES": "no"));
			System.out.printf("\t%-12s", (buildingInfo.get(i) != null ? buildingInfo.get(i) : "no"));
			System.out.printf("\t%-4s", (demonInfo.get(i) != null? "1" : "0"));
			System.out.printf("\t%-4s", (trollInfo.get(i) != null && trollInfo.get(i) > 0? "1" : "0"));
		}
		
		for(Player player : Game.lstPlayers){
			System.out.printf("\n"+ player.getPlayer_name()+", Player " + player.getPlayer_id() + "'s current inventory:");
			playerDetailsMinBuildDollar(player.getPlayer_id());
			playerDetailsCityAreaCards(player.getPlayer_id());
			playerDetailsGreenCards(player.getPlayer_id());
			System.out.printf("\n");
		}
		
		System.out.printf("\n");
		totalAmountBankOwns();
		System.out.printf("\n\n");
		return saveTheDetailsInTextFile;
	}
	
	/**
	 * Player general info.
	 *
	 * @param players the players
	 * @return the string
	 */
	public static void playerGeneralInfo(ArrayList<Player> players){
		
		System.out.printf("Game State");
		int i = players.size()-1;
		
		System.out.printf("\n-----------------");
		System.out.printf("\nThere are "+players.size()+" players:");
		
		for(Player player: players){
			System.out.printf("\nPlayer "+(players.size() -i)+", "+player.getPlayer_name()+" ("+ player.getPlayer_color()+") is playing as "+ PresentationUtility.getPersonalityCardNameById(Integer.parseInt(player.getPersonalityCardListCommaSeparated())));
			i -= 1;
		}
	}
	
	public static HashMap<Integer, String> minionGeneralInfo(ArrayList<Minion> minions){
		HashMap<Integer, String> minionInfo = new HashMap<Integer, String>();
		
		for(int i = 1; i <= 12; i++){
			String minionsInAreaId = "";
			for(Minion minion : minions){
				if(i == minion.getArea_id()){
					String color = minion.getColor().substring(0, 1);
					minionsInAreaId += color.toUpperCase() + ",";
				}
			}
			if(minionsInAreaId.endsWith(",")){
				minionsInAreaId = minionsInAreaId.substring(0, minionsInAreaId.length()-1);
			}
			minionInfo.put(i, minionsInAreaId);
		}
		return minionInfo;
	}
	
	public static HashMap<Integer, Boolean> troubleMakerGeneralInfo(ArrayList<TroubleMaker> troubleMakers){
		HashMap<Integer, Boolean> troubleMakerDetails = new HashMap<Integer, Boolean>();
		
		boolean isTroubleMakerInArea = false;
		
		for(TroubleMaker troubleMaker : troubleMakers){ // TODO: Have to verify this condition, whether it is working perfectly or not
			if(troubleMaker.getArea_id() > 0){
					isTroubleMakerInArea = true;
			}
			troubleMakerDetails.put(troubleMaker.getArea_id(), isTroubleMakerInArea);
		}
		
		return troubleMakerDetails;
	}
	
	public static HashMap<Integer, String> buildingGeneralInfo(ArrayList<Building> buildings){
		HashMap<Integer, String> buildingDetails = new HashMap<Integer, String>();
		
		boolean isBuildingInArea = false;
		String colorOfBuilding = "no";
		
		for(Building building : buildings){ // TODO: Have to verify this condition, whether it is working perfectly or not
			if(building.getArea_id() > 0){
				for(Player player : Game.lstPlayers){
					if(player.getPlayer_id() == building.getPlayer_id()){
						colorOfBuilding = player.getPlayer_color().toUpperCase();
					}
				}
				isBuildingInArea = true;
			}
			buildingDetails.put(building.getArea_id(), colorOfBuilding);
		}
		
		return buildingDetails;
	}
	
	public static HashMap<Integer, Integer> trollGeneralInfo(ArrayList<Troll> trolls){
		HashMap<Integer, Integer> trollDetails = new HashMap<Integer, Integer>();
		
		int countOfTrollsInArea = 0;
		
		for(Troll troll : trolls){ // TODO: Have to verify this condition, whether it is working perfectly or not
			if(troll.getArea_id() > 0){
				countOfTrollsInArea += 1 ;
			}
			trollDetails.put(troll.getArea_id(), countOfTrollsInArea);
		}
		
		return trollDetails;
	}
	
	public static HashMap<Integer, Integer> demonGeneralInfo(ArrayList<Demon> demons){
		HashMap<Integer, Integer> demonDetails = new HashMap<Integer, Integer>();
		
		int countOfDemonsInArea = 0;
		
		for(Demon demon : demons){ // TODO: Have to verify this condition, whether it is working perfectly or not
			if(demon.getArea_id() > 0 && demonDetails.size() > 0){
				if(demonDetails.get(demon.getArea_id()) > 0)
					countOfDemonsInArea = demonDetails.get(demon.getArea_id()) + 1 ;
			}
			demonDetails.put(demon.getArea_id(), countOfDemonsInArea);
		}
		
		return demonDetails;
	}
	
	public static void playerDetailsMinBuildDollar(Integer playerId){
		System.out.printf("\n\t");
		
		System.out.printf("- "+(12-Game.GetMinionsOnBoardByPlayerID(playerId).size()) + " minion(s) "
											+ (6-Game.GetBuildingsByPlayerIDAndActiveAndOnBoard(playerId).size()) + " building(s) "
											+ Game.GetPlayer(playerId).getPlayer_amount() + " Ankh-Morpork dollars");
		
	}
	
	public static void playerDetailsCityAreaCards(Integer playerId){
		ArrayList<CityAreaCard> cityAreaCardsByPlayerId = Game.GetCityAreaCardByPlayerID(playerId);
		if(cityAreaCardsByPlayerId.size() > 0){
			System.out.printf("\n\t");
			System.out.printf("- City Area Cards: ");
			for(CityAreaCard cityAreaCard : cityAreaCardsByPlayerId){
				System.out.printf("\n\t\t" + cityAreaCard.GetAreaName());
			}
		}
	}
	
	public static void playerDetailsGreenCards(Integer playerId){
		System.out.printf("\n\t");
		System.out.printf("- Player Cards: ");
		ArrayList<GreenCard> greenCardsByPlayerId = Game.GetGreenCardByPlayerID(playerId);
		for(GreenCard greenCard : greenCardsByPlayerId){
			System.out.printf("\n\t\t" + greenCard.getName());
		}
	}
	
	/**
	 * Current and next player turn.
	 *
	 * @param players the players
	 * @return the string
	 */
	public static String currentAndNextPlayerTurn(ArrayList<Player> players){
		String currentAndNextPlayerTurnStr = "";
		
		PresentationUtility.nextPlayerTurn(2, players.size());
		if(2 == players.size()){
			currentAndNextPlayerTurnStr += "\n\nPlayer Turn Stats: \nCurrent Player Playing : Player 2";
			currentAndNextPlayerTurnStr += "\nNext Player will be : Player 1";
		}else{
			currentAndNextPlayerTurnStr += "\n\nPlayer Turn Stats: \nCurrent Player Playing : Player 2";
			currentAndNextPlayerTurnStr += "\nNext Player will be : Player "+(2+1);
		}
		
		return currentAndNextPlayerTurnStr ;
	}
	
	public static String currentPlayerPlaying(ArrayList<Player> players){
		String currentPlayerPlaying = "";
		
		if(2 == players.size()){
			currentPlayerPlaying = "1";
		}else{
			currentPlayerPlaying = (PresentationUtility.nextPlayerTurn(2, players.size())).toString();
		}
		
		return currentPlayerPlaying ;
	}

	/**
	 * Area details.
	 *
	 * @return the string
	 */
	public static String areaDetails(){
		
		String areaDetails = "\n\nCurrent State of the Game Board: ";
		areaDetails += "\n\tArea\t\tminions\ttrouble?\tbuildings?\tdemons\ttrolls";
		
		for(int i = 1; i < 12; i++){
			areaDetails += "\n\t"+paddingToMakeSixteen(PresentationUtility.getCityAreaCardNameById(i))+"\t"
					+((PresentationUtility.getCityAreaCardNameById(i)).length() > 13 ? ""	: "\t")
					+Area.getListOfMinionsByAreaId(i)+ "\t"
					+Area.getListOfTroubleMakersByAreaId(i)+ "\t"
					+Area.getListOfBuildingsByAreaId(i)+ "\t"
					+Area.getListOfDemonsByAreaId(i)+ "\t"
					+Area.getListOfTrollsByAreaId(i)+ "\t";
		}
		return areaDetails;
	}
	
	/**
	 * Padding to make sixteen.
	 *
	 * @param areaName the area name
	 * @return the string
	 */
	public static String paddingToMakeSixteen(String areaName){
		
		String emptyString = "";
		//System.out.print("\nCard Name : "+areaName+" \tCard Size: "+areaName.length());
		if(areaName.length() < 16){
			for(int i = 1; i <= 16-areaName.length(); i++){
				areaName += " ";
			}
		}
		//System.out.print("\nCard Name : "+areaName+" \tCard Size: "+(areaName+emptyString).length());
		return areaName;
	}
	
	/**
	 * Player details.
	 *
	 * @param players the players
	 * @return the string
	 */
	public static void playerDetails(ArrayList<Player> players){
		
		int i = players.size()-1;
		for(Player player: players){
			System.out.printf("\nPlayer "+(players.size() -i)+"'s current Inventory:");
			//TODO : complete the changes here to extract Minions, Buildings of Players playerDetails += "\n\n\t- "+player.lstMinions.size()+" minions, "+player.lstBuildings.size()+" buildings, "+player.getPlayerAmount()+" dollars ";
			System.out.printf("\n");
			System.out.printf("\n\n\t-City Area Cards: \n\n\t\t" +PresentationUtility.getCityAreaCardNameById(Integer.parseInt(player.getCityAreaCardsListCommaSeparated())));
			System.out.printf("\n\n\t-Player Cards: ");
			System.out.printf("\n\t\tGreen Cards: "+ player.getGreenCardListCommaSeparated());
			System.out.printf("\n\t\tGreen Cards Names: " + PresentationUtility.getCommaSeparatedGreenCardNames(player.getGreenCardListCommaSeparated()));
			System.out.printf("\n");
			i -= 1;
		}
	}
	
	/**
	 * Total amount bank owns.
	 *
	 * @return the string
	 */
	public static void totalAmountBankOwns(){
		System.out.printf("The bank has "+ Game.GameBank.getBankAmount()+" Ankh-Morpork dollars.");
		
	}

}
