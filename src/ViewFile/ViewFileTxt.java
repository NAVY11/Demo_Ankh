/*
 * 
 */
package ViewFile;

import java.util.ArrayList;

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

// TODO: Auto-generated Javadoc
/**
 * The Class ViewFileAmbg.
 */
public class ViewFileTxt {

	/*public static void main(String[] args) {

		String sb = dataToStoreInTextFile();
	    JFileChooser chooser = new JFileChooser();
	    chooser.setCurrentDirectory(new File("/home/me/Documents"));
	    int retrival = chooser.showSaveDialog(null);
	    if (retrival == JFileChooser.APPROVE_OPTION) {
	        try {
	            FileWriter fw = new FileWriter(chooser.getSelectedFile()+".txt");
	            fw.write(sb.toString());
	            fw.close();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }
	}
	*/
	
	/**
	 * View state.
	 *
	 * @return the string
	 */
	public static String ViewState(){
		//return dataToStoreInTextFile(lstPlayers);
		String saveTheDetailsInTextFile = "";
		ArrayList<Player> lstPlayers = Game.lstPlayers;
		saveTheDetailsInTextFile += playerGeneralInfo(lstPlayers);
		saveTheDetailsInTextFile += "\n\n";
		
		ArrayList<Minion> lstMinions = Game.lstMinions;
		ArrayList<Building> lstBuildings = Game.lstBuildings;
		ArrayList<Troll> lstTrolls = Game.lstTrolls;
		ArrayList<Demon> lstDemons = Game.lstDemons;
		ArrayList<TroubleMaker> lstTroubleMakers = Game.lstTroubleMaker;
		ArrayList<CityAreaCard> lstCityAreaCards = Game.lstCityAreaCards;
		
		for(Minion minion : Game.lstMinions){
			System.out.println("Minion Id : "+minion.getMinion_id());
			System.out.println("Minion Belongs To : "+minion.getPlayer_id());
			System.out.println("Minion Area Id : "+minion.getArea_id());
		}
		
		for(Building building : Game.lstBuildings){
			System.out.println("Building Id : "+building.getBuilding_id());
			System.out.println("Building Belongs To : "+building.getPlayer_id());
			System.out.println("Building Area Id : "+building.getArea_id());
		}
		
		for(Troll troll : Game.lstTrolls){
			System.out.println("Building Id : "+troll.getTroll_id());
			System.out.println("Building Area Id : "+troll.getArea_id());
		}
		
		for(Demon demon : Game.lstDemons){
			System.out.println("Demon Id : "+demon.getDemon_id());
			System.out.println("Demon Area Id : "+ demon.getArea_id());
		}
		
		for(TroubleMaker troubleMaker : Game.lstTroubleMaker){
			System.out.println("Troubler Maker Id : "+troubleMaker.getTm_id());
			System.out.println("Troubler Area Id : "+ troubleMaker.getArea_id());
		}
		
		
		
//		//saveTheDetailsInTextFile += areaDetails();
//		saveTheDetailsInTextFile += "\n\n";
//		saveTheDetailsInTextFile += playerDetails(lstPlayers);
//		saveTheDetailsInTextFile += "\n\n";
//		saveTheDetailsInTextFile += totalAmountBankOwns();//to be chkd
//		saveTheDetailsInTextFile += "\n\n";
//		
		return saveTheDetailsInTextFile;
	}
	
	/**
	 * Data to store in text file.
	 *
	 * @param players the players
	 * @return the string
	 */
//	public static String dataToStoreInTextFile(ArrayList<Player> lstPlayers){
//		String saveTheDetailsInTextFile = "";
//		
//		saveTheDetailsInTextFile += playerGeneralInfo(lstPlayers);
//		saveTheDetailsInTextFile += "\n\n";
//		saveTheDetailsInTextFile += currentAndNextPlayerTurn(lstPlayers);
//		saveTheDetailsInTextFile += "\n\n";
//		saveTheDetailsInTextFile += areaDetails();
//		saveTheDetailsInTextFile += "\n\n";
//		saveTheDetailsInTextFile += playerDetails(lstPlayers);
//		saveTheDetailsInTextFile += "\n\n";
//		saveTheDetailsInTextFile += totalAmountBankOwns(AnkhMorpork);
//		
//		return saveTheDetailsInTextFile;
//	}
	
	/**
	 * The method below is just an random input to play with the method.
	 *
	 * @return the array list
	 */
	
//	public static ArrayList<Player> InitializePlayers(){
//		ArrayList<Player> players = new ArrayList<Player>();
//		
//
////		Game Ankh = new Game();
////		try {
////			Ankh = GameLoad.LoadGame("Ankh11");
////			int i=1;
////			for(Player objPlayer: Ankh.lstPlayers)
////			{		
////				//System.out.println("Player "+ i + " Details");
////				//System.out.println("Player ID: "+objPlayer.getPlayer_id()+" Player Name:"+objPlayer.getPlayer_name()+" Player Color:"+objPlayer.getPlayer_color());
////				//System.out.println("Player ID: "+
////				objPlayer.getPlayer_id();
////				objPlayer.getPlayer_name();
////				objPlayer.getPlayer_color();
////				objPlayer.setPlayer_amount((float)1000.00);
////				players.add(objPlayer);
////				i++;
////			}
////			
////			
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		} catch (ParseException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		
//		
//		
//		
//		Player player1 = new Player(1, "naresh", "blue");
//		Player player2 = new Player(2, "vijay", "green");
//		Player player3 = new Player(3, "ashish", "red");
//		
//		player1.setPlayer_active(true);
//		player1.setPlayer_amount((float)1000.00);
//		player1.setPlayer_color("red");
//		player1.setPlayer_id(1);
//		player1.setPlayer_personality_card_id(1);
//		
//		player2.setPlayer_active(true);
//		player2.setPlayer_amount((float)2000.00);
//		player2.setPlayer_color("blue");
//		player2.setPlayer_id(2);
//		player2.setPlayer_personality_card_id(2);
//		
//		player3.setPlayer_active(true);
//		player3.setPlayer_amount((float)3000.00);
//		player3.setPlayer_color("green");
//		player3.setPlayer_id(3);
//		player3.setPlayer_personality_card_id(3);
//		
//		players.add(player1);
//		players.add(player2);
//		players.add(player3);		
//		
//		return players;
//	}
	
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
			playerGeneralInfoStr += "\nPlayer "+(players.size() -i)+", "+player.getPlayer_name()+", "+ player.getPlayer_color()+", "+ PresentationUtility.getPersonalityCardNameById(Integer.parseInt(player.getPersonalityCardListCommaSeparated()));
			i -= 1;
		}
		return playerGeneralInfoStr;
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
	
	/**
	 * Current player playing.
	 *
	 * @param players the players
	 * @return the string
	 */
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
			playerDetails += "\n\n\t- "+Game.lstMinions.size()+" minions, "+Game.lstBuildings.size()+" buildings, "+player.getPlayerAmount()+" dollars ";
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
