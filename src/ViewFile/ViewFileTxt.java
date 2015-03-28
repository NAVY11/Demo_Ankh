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
		System.out.println(ViewState());
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
		saveTheDetailsInTextFile += playerGeneralInfo(lstPlayers);

		ArrayList<Minion> lstMinions = Game.lstMinions;
		saveTheDetailsInTextFile += minionGeneralInfo(lstMinions);
		
		ArrayList<TroubleMaker> lstTroubleMakers = Game.lstTroubleMaker;
		saveTheDetailsInTextFile += troubleMakerGeneralInfo(lstTroubleMakers);
		
		ArrayList<Building> lstBuildings = Game.lstBuildings;
		saveTheDetailsInTextFile += buildingGeneralInfo(lstBuildings);
		
		ArrayList<Demon> lstDemons = Game.lstDemons;
		saveTheDetailsInTextFile += demonGeneralInfo(lstDemons);

		ArrayList<Troll> lstTrolls = Game.lstTrolls;
		saveTheDetailsInTextFile += trollGeneralInfo(lstTrolls);
		
		for(Player player : Game.lstPlayers){
			saveTheDetailsInTextFile += "\nPlayer " + player.getPlayer_id() + "'s current inventory:";
			saveTheDetailsInTextFile += playerDetailsMinBuildDollar(player.getPlayer_id());
			saveTheDetailsInTextFile += playerDetailsCityAreaCards(player.getPlayer_id());
			saveTheDetailsInTextFile += playerDetailsGreenCards(player.getPlayer_id());
			saveTheDetailsInTextFile += "\n";
		}
		
		saveTheDetailsInTextFile += "\n";
		saveTheDetailsInTextFile += totalAmountBankOwns();
		saveTheDetailsInTextFile += "\n";
		return saveTheDetailsInTextFile;
	}
	
	/**
	 * Player general info.
	 *
	 * @param players the players
	 * @return the string
	 */
	public static String playerGeneralInfo(ArrayList<Player> players){
		
		String playerGeneralInfoStr = "Game State";
		int i = players.size()-1;
		
		playerGeneralInfoStr += "\n-----------------";
		playerGeneralInfoStr += "\nThere are "+players.size()+" players:";
		
		for(Player player: players){
			playerGeneralInfoStr += "\nPlayer "+(players.size() -i)+", "+player.getPlayer_name()+" ("+ player.getPlayer_color()+") is playing as "+ PresentationUtility.getPersonalityCardNameById(Integer.parseInt(player.getPersonalityCardListCommaSeparated()));
			i -= 1;
		}
		return playerGeneralInfoStr;
	}
	
	public static String minionGeneralInfo(ArrayList<Minion> minions){
		String minionGeneralInfoStr = "\n";
		HashMap<Integer, String> minionInfo = new HashMap<Integer, String>();
		
		minionGeneralInfoStr += "\n########## Minion Details ##########";
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
		for(int i = 1; i <=12; i++){
			minionGeneralInfoStr += "\n" + PresentationUtility.getCityAreaCardNameById(i) + " : " + (minionInfo.get(i) != null ? minionInfo.get(i) : "");
		}
		
		
		return minionGeneralInfoStr;
	}
	
	public static String troubleMakerGeneralInfo(ArrayList<TroubleMaker> troubleMakers){
		String troubleMakerGeneralInfoStr = "\n";
		
		troubleMakerGeneralInfoStr += "\n########## Trouble Maker Details ##########";
		HashMap<Integer, Boolean> troubleMakerDetails = new HashMap<Integer, Boolean>();
		
		boolean isTroubleMakerInArea = false;
		
		for(TroubleMaker troubleMaker : troubleMakers){ // TODO: Have to verify this condition, whether it is working perfectly or not
			if(troubleMaker.getArea_id() > 0 && troubleMakerDetails.size() > 0){
				if(troubleMakerDetails.containsKey(troubleMaker.getArea_id()) && !(troubleMakerDetails.get(troubleMaker.getArea_id())))
					isTroubleMakerInArea = true;
			}
			troubleMakerDetails.put(troubleMaker.getArea_id(), isTroubleMakerInArea);
		}
		
		for(int i = 1; i <=12; i++){
			troubleMakerGeneralInfoStr += "\n" + PresentationUtility.getCityAreaCardNameById(i) + " : " + (troubleMakerDetails.get(i) != null && troubleMakerDetails.get(i) ? "YES": "no");
		}
		
		return troubleMakerGeneralInfoStr;
	}
	
	public static String buildingGeneralInfo(ArrayList<Building> buildings){
		String buildingGeneralInfoStr = "\n";
		
		buildingGeneralInfoStr += "\n########## Building Details ##########";
		HashMap<Integer, String> buildingDetails = new HashMap<Integer, String>();
		
		boolean isBuildingInArea = false;
		String colorOfBuilding = "no";
		
		for(Building building : buildings){ // TODO: Have to verify this condition, whether it is working perfectly or not
			if(building.getArea_id() > 0 && buildingDetails.size() > 0){
				if(buildingDetails.containsKey(building.getArea_id()))
					for(Player player : Game.lstPlayers){
						if(player.getPlayer_id() == building.getPlayer_id()){
							colorOfBuilding = player.getPlayer_color().toUpperCase();
						}
					}
					isBuildingInArea = true;
			}
			buildingDetails.put(building.getArea_id(), colorOfBuilding);
		}
		
		for(int i = 1; i <=12; i++){
			buildingGeneralInfoStr += "\n" + PresentationUtility.getCityAreaCardNameById(i) + " : " + (buildingDetails.get(i) != null ? buildingDetails.get(i) : "no");
		}
		
		return buildingGeneralInfoStr;
	}
	
	public static String trollGeneralInfo(ArrayList<Troll> trolls){
		String trollGeneralInfoStr = "\n";
		
		trollGeneralInfoStr += "\n########## Troll Details ##########";
		HashMap<Integer, Integer> trollDetails = new HashMap<Integer, Integer>();
		
		int countOfTrollsInArea = 0;
		
		for(Troll troll : trolls){ // TODO: Have to verify this condition, whether it is working perfectly or not
			if(troll.getArea_id() > 0 && trollDetails.size() > 0){
				if(trollDetails.get(troll.getArea_id()) > 0)
					countOfTrollsInArea = trollDetails.get(troll.getArea_id()) + 1 ;
			}
			trollDetails.put(troll.getArea_id(), countOfTrollsInArea);
		}
		
		for(int i = 1; i <=12; i++){
			trollGeneralInfoStr += "\n" + PresentationUtility.getCityAreaCardNameById(i) + " : " + (trollDetails.get(i) != null ? "1" : "0");
		}
		
		return trollGeneralInfoStr + "\n";
	}
	
	public static String demonGeneralInfo(ArrayList<Demon> demons){
		String demonGeneralInfoStr = "\n";
		
		demonGeneralInfoStr += "\n########## Demon Details ##########";
		HashMap<Integer, Integer> demonDetails = new HashMap<Integer, Integer>();
		
		int countOfDemonsInArea = 0;
		
		for(Demon demon : demons){ // TODO: Have to verify this condition, whether it is working perfectly or not
			if(demon.getArea_id() > 0 && demonDetails.size() > 0){
				if(demonDetails.get(demon.getArea_id()) > 0)
					countOfDemonsInArea = demonDetails.get(demon.getArea_id()) + 1 ;
			}
			demonDetails.put(demon.getArea_id(), countOfDemonsInArea);
		}
		
		for(int i = 1; i <=12; i++){
			demonGeneralInfoStr += "\n" + PresentationUtility.getCityAreaCardNameById(i) + " : " + (demonDetails.get(i) != null ? "1" : "0");
		}
		
		return demonGeneralInfoStr;
	}
	
	public static String playerDetailsMinBuildDollar(Integer playerId){
		String playerDetailsMinBuildDollarStr = "\n\t";
		
		playerDetailsMinBuildDollarStr += "- "+Game.GetMinionsOnBoardByPlayerID(playerId).size() + " minion(s) "
											+ Game.GetBuildingsByPlayerID(playerId).size() + " building(s) "
											+ Game.GetPlayer(playerId).getPlayerAmount() + " Ankh-Morpork dollars";
		
		return playerDetailsMinBuildDollarStr;
	}
	
	public static String playerDetailsCityAreaCards(Integer playerId){
		String playerDetailsCityAreaCardsStr = "";
		ArrayList<CityAreaCard> cityAreaCardsByPlayerId = Game.GetCityAreaCardByPlayerID(playerId);
		if(cityAreaCardsByPlayerId.size() > 0){
			playerDetailsCityAreaCardsStr = "\n\t";
			playerDetailsCityAreaCardsStr += "- City Area Cards: ";
			for(CityAreaCard cityAreaCard : cityAreaCardsByPlayerId){
				playerDetailsCityAreaCardsStr += "\n\t" + cityAreaCard.getName();
			}
		}
		return playerDetailsCityAreaCardsStr;
	}
	
	public static String playerDetailsGreenCards(Integer playerId){
		String playerDetailsGreenCardsStr = "\n\t";
		playerDetailsGreenCardsStr += "- Player Cards: ";
		ArrayList<GreenCard> greenCardsByPlayerId = Game.GetGreenCardByPlayerID(playerId);
		for(GreenCard greenCard : greenCardsByPlayerId){
			playerDetailsGreenCardsStr += "\n\t" + greenCard.getName();
		}
		return playerDetailsGreenCardsStr;
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
	public static String playerDetails(ArrayList<Player> players){
		
		String playerDetails = "";
		int i = players.size()-1;
		for(Player player: players){
			playerDetails += "\nPlayer "+(players.size() -i)+"'s current Inventory:";
			//TODO : complete the changes here to extract Minions, Buildings of Players playerDetails += "\n\n\t- "+player.lstMinions.size()+" minions, "+player.lstBuildings.size()+" buildings, "+player.getPlayerAmount()+" dollars ";
			playerDetails += "\n\n\t-City Area Cards: \n\n\t\t" +PresentationUtility.getCityAreaCardNameById(Integer.parseInt(player.getCityAreaCardsListCommaSeparated()));
			playerDetails += "\n\n\t-Player Cards: ";
			playerDetails += "\n\t\tGreen Cards: "+ player.getGreenCardListCommaSeparated();
			playerDetails += "\n\t\tGreen Cards Names: " + PresentationUtility.getCommaSeparatedGreenCardNames(player.getGreenCardListCommaSeparated());
			//playerDetails += "\n\t\tBrown Cards "+ player.getBrownCardListCommaSeparated();
			playerDetails += "\n";
			i -= 1;
		}

		return playerDetails;
		
	}
	
	/**
	 * Total amount bank owns.
	 *
	 * @return the string
	 */
	public static String totalAmountBankOwns(){
		
		String totalAmountStr = "The bank has "+ Game.GameBank.getBankAmount()+" Ankh-Morpork dollars.";
		
		return totalAmountStr;
		
	}

}
