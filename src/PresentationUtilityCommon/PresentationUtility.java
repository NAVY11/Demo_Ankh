/*
 * 
 */
package PresentationUtilityCommon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.Player;
import ankhmorpork.GameObjects.Cards.GreenCard;

// TODO: Auto-generated Javadoc
/**
 * The Class PresentationUtility.
 */
public class PresentationUtility {

	/** The number already being used in game. */
	static List<Integer> numberAlreadyBeingUsedInGame = new ArrayList<Integer>();

	/** The random number a. */
	static Integer randomNumberA = 0;

	/**
	 * Method to check if an element exists in a String array.
	 *
	 * @param Array the array
	 * @param Element the element
	 * @return true, if successful
	 */
	public static boolean ArrayHasElement(String[] Array, String Element)
	{
		boolean ElementFound = false;
		for(int i=0; i < Array.length; i++)
		{
			if(Array[i].equals(Element))
			{
				ElementFound = true;
				break;
			}				
		}

		return ElementFound;
	}


	/**
	 * Random integer generator.
	 *
	 * @param startNumber the start number
	 * @param endNumber the end number
	 * @return true, if successful
	 */
	public static boolean randomIntegerGenerator(Integer startNumber, Integer endNumber){

		int randomNumber = 0;
		if (startNumber > endNumber) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		Random random = new Random();
		long range = (long)endNumber - (long)startNumber + 1;
		long fraction = (long)(range * random.nextDouble());
		randomNumber =  (int)(fraction + startNumber); 
		randomNumberA = randomNumber;

		if(numberAlreadyBeingUsedInGame != null && !(numberAlreadyBeingUsedInGame.size() == 0)){
			if(numberAlreadyBeingUsedInGame.contains(randomNumber)){
				return false;
			}else{
				numberAlreadyBeingUsedInGame.add(randomNumber);
				return true;
			}
		}else{
			numberAlreadyBeingUsedInGame.add(randomNumber);
			return true;
		}
	}

	/**
	 * Return random number.
	 *
	 * @param startNumber the start number
	 * @param endNumber the end number
	 * @return the integer
	 */
	public static Integer returnRandomNumber(Integer startNumber, Integer endNumber){
		if(randomIntegerGenerator(startNumber, endNumber)){
			return randomNumberA;
		}else{
			randomIntegerGenerator(startNumber, endNumber);
		}
		return 0;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		for(int i = 1; i<=10; i++){
			returnRandomNumber(1, 3);
		}
	}

	/**
	 * Gets the personality card name by id.
	 *
	 * @param personalityCardId the personality card id
	 * @return the personality card name by id
	 */
	public static String getPersonalityCardNameById(Integer personalityCardId){

		switch (personalityCardId) {
		case 1:  return IConstants.PersonalityCard1;
		case 2:  return IConstants.PersonalityCard2;
		case 3:  return IConstants.PersonalityCard3;
		case 4:  return IConstants.PersonalityCard4;
		case 5:  return IConstants.PersonalityCard5;
		case 6:  return IConstants.PersonalityCard6;
		case 7:  return IConstants.PersonalityCard7;
		default: return "Invalid Personality ID";
		}
	}
	
	/**
	 * Gets the personality motive by id.
	 *
	 * @param personalityCardId the personality card id
	 * @return the personality motive by id
	 */
	public static String getPersonalityMotiveById(Integer personalityCardId){

		switch (personalityCardId) {
		case 1:  return IConstants.PersonalityMotive1;
		case 2:  return IConstants.PersonalityMotive2;
		case 3:  return IConstants.PersonalityMotive3;
		case 4:  return IConstants.PersonalityMotive4;
		case 5:  return IConstants.PersonalityMotive5;
		case 6:  return IConstants.PersonalityMotive6;
		case 7:  return IConstants.PersonalityMotive7;
		default: return "Invalid Personality ID";
		}
	}

	/**
	 * Gets the random event card name by id.
	 *
	 * @param randomEventCardId the random event card id
	 * @return the random event card name by id
	 */
	public static String getRandomEventCardNameById(Integer randomEventCardId){

		switch (randomEventCardId) {
		case 1:  return IConstants.e1Str;
		case 2:  return IConstants.e2Str;
		case 3:  return IConstants.e3Str;
		case 4:  return IConstants.e4Str;
		case 5:  return IConstants.e5Str;
		case 6:  return IConstants.e6Str;
		case 7:  return IConstants.e7Str;
		case 8:  return IConstants.e8Str;
		case 9:  return IConstants.e9Str;
		case 10:  return IConstants.e10Str;
		case 11:  return IConstants.e11Str;
		case 12:  return IConstants.e12Str;
		default: return IConstants.e2Str;
		}
	}

	//Get comma separated string with distinct values
	/**
	 * Gets the distinct comma separated values.
	 *
	 * @param strCommaSeparatedString the str comma separated string
	 * @return the distinct comma separated values
	 */
	public static String getDistinctCommaSeparatedValues(String strCommaSeparatedString)
	{
		String strDistinctValues = ",";
		String[] arryDistinctValues = strCommaSeparatedString.split(",");
		for(int i =0; i<arryDistinctValues.length;i++)
		{
			if(!strDistinctValues.contains(","+arryDistinctValues[i]+"," ))
			{
				strDistinctValues+=arryDistinctValues[i]+",";
			}
		}

		if(strDistinctValues.length()>1)
		{
			strDistinctValues = strDistinctValues.substring(1,strDistinctValues.length()-1);
		}

		return strDistinctValues;
	}

	/**
	 * Gets the city area card name by id.
	 *
	 * @param cityAreaCard the city area card
	 * @return the city area card name by id
	 */
	public static String getCityAreaCardNameById(Integer cityAreaCard){

		switch (cityAreaCard) {
		case 1:  return IConstants.cityCardArea1;
		case 2:  return IConstants.cityCardArea2;
		case 3:  return IConstants.cityCardArea3;
		case 4:  return IConstants.cityCardArea4;
		case 5:  return IConstants.cityCardArea5;
		case 6:  return IConstants.cityCardArea6;
		case 7:  return IConstants.cityCardArea7;
		case 8:  return IConstants.cityCardArea8;
		case 9:  return IConstants.cityCardArea9;
		case 10:  return IConstants.cityCardArea10;
		case 11:  return IConstants.cityCardArea11;
		case 12: return IConstants.cityCardArea12;
		default: return "";
		}
	}

	//Get valid answer from user
	/**
	 * Gets the valid answer from user.
	 *
	 * @param strValidAnswersCommaSeparated the str valid answers comma separated
	 * @return the string
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static String GetValidAnswerFromUser(String strValidAnswersCommaSeparated) throws IOException	
	{
		String ans= "";
		if(!strValidAnswersCommaSeparated.startsWith(","))
		{
			strValidAnswersCommaSeparated = ","+strValidAnswersCommaSeparated;
		}
		
		if(!strValidAnswersCommaSeparated.endsWith(","))
		{
			strValidAnswersCommaSeparated = strValidAnswersCommaSeparated+",";
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			ans = br.readLine();
			if(!ans.equals(null)||!ans.equals(""))
			{
				if(strValidAnswersCommaSeparated.contains("," + ans.trim() + ","))
				{
					return ans;				
				}
				else
				{
					System.out.println("Invalid input. Please try again.");
				}
			}
			else
			{
				System.out.println("Invalid input. Please try again.");
			}
		}
	}	


	/**
	 * Gets the green card name by id.
	 *
	 * @param greenCardId the green card id
	 * @return the green card name by id
	 */
	public static String getGreenCardNameById(Integer greenCardId){

		switch (greenCardId) {
		case 1:  return IConstants.g1Str;
		case 2:  return IConstants.g2Str;
		case 3:  return IConstants.g3Str;
		case 4:  return IConstants.g4Str;
		case 5:  return IConstants.g5Str;
		case 6:  return IConstants.g6Str;
		case 7:  return IConstants.g7Str;
		case 8:  return IConstants.g8Str;
		case 9:  return IConstants.g9Str;
		case 10:  return IConstants.g10Str;
		case 11:  return IConstants.g11Str;
		case 12:  return IConstants.g12Str;
		case 13:  return IConstants.g13Str;
		case 14:  return IConstants.g14Str;
		case 15:  return IConstants.g15Str;
		case 16:  return IConstants.g16Str;
		case 17:  return IConstants.g17Str;
		case 18:  return IConstants.g18Str;
		case 19:  return IConstants.g19Str;
		case 20:  return IConstants.g20Str;
		case 21:  return IConstants.g21Str;
		case 22:  return IConstants.g22Str;
		case 23:  return IConstants.g23Str;
		case 24:  return IConstants.g24Str;
		case 25:  return IConstants.g25Str;
		case 26:  return IConstants.g26Str;
		case 27:  return IConstants.g27Str;
		case 28:  return IConstants.g28Str;
		case 29:  return IConstants.g29Str;
		case 30:  return IConstants.g30Str;
		case 31:  return IConstants.g31Str;
		case 32:  return IConstants.g32Str;
		case 33:  return IConstants.g33Str;
		case 34:  return IConstants.g34Str;
		case 35:  return IConstants.g35Str;
		case 36:  return IConstants.g36Str;
		case 37:  return IConstants.g37Str;
		case 38:  return IConstants.g38Str;
		case 39:  return IConstants.g39Str;
		case 40:  return IConstants.g40Str;
		case 41:  return IConstants.g41Str;
		case 42:  return IConstants.g42Str;
		case 43:  return IConstants.g43Str;
		case 44:  return IConstants.g44Str;
		case 45:  return IConstants.g45Str;
		case 46:  return IConstants.g46Str;
		default: return "";
		}
	}

	/**
	 * Initialize a hashmap with value.
	 *
	 * @param numberToInitialize the number to initialize
	 * @return the hash map
	 */
	public static HashMap<Integer, Boolean> initializeAHashmapWithValue(Integer numberToInitialize){

		HashMap<Integer, Boolean> mapToIntialize = new HashMap<Integer, Boolean>();

		for (int i = 1; i<numberToInitialize; i++){
			mapToIntialize.put(i, false);
		}
		return mapToIntialize;
	}

	/**
	 * Initialize a array with value.
	 *
	 * @param numberToInitialize the number to initialize
	 * @return the array list
	 */
	public static ArrayList<Integer> initializeAArrayWithValue(Integer numberToInitialize){

		ArrayList<Integer> arrToIntialize = new ArrayList<Integer>();

		for (int i = 1; i <= numberToInitialize; i++){
			arrToIntialize.add(i);
		}

		return arrToIntialize;
	}

	/**
	 * Next player turn.
	 *
	 * @param currentPlayer the current player
	 * @param numberOfPlayers the number of players
	 * @return the integer
	 */
	public static Integer nextPlayerTurn(Integer currentPlayer, Integer numberOfPlayers){
		if(currentPlayer == numberOfPlayers){
			return 1;
		}else{
			return (currentPlayer+1);  
		}
	}

	/**
	 * Adjacent Minion Categorization
	 * 
	 * 		1  --> 2, 3, 12
	 * 		2  --> 1, 3, 4, 10, 11, 12
	 * 		3  --> 1, 2, 4
	 * 		4  --> 2, 3, 5, 6, 10
	 * 		5  --> 4, 6, 7, 8, 10
	 * 		6  --> 4, 5, 7
	 * 		7  --> 5, 6, 8
	 * 		8  --> 5, 7, 9
	 * 		9  --> 8, 10, 11
	 * 		10 --> 2, 4, 5, 9, 11
	 * 		11 --> 2, 9, 10, 12
	 * 		12 --> 1, 2, 11
	 * Returns Whether the minion can be placed in the adjacent area or not.
	 *
	 * @param currentPlayerId the current player id
	 * @param minionId the minion id
	 * @param currentAreaId the current area id
	 * @param areaToBePlacedIn the area to be placed in
	 * @return true, if successful
	 */
	public static boolean canMinionBePlacedInAdjacentArea(Integer currentPlayerId, Integer minionId, Integer currentAreaId, int areaToBePlacedIn){

		if(currentAreaId == 1){
			if(areaToBePlacedIn == 2 || areaToBePlacedIn == 3 || areaToBePlacedIn == 12)
				return true;
		}else if(currentAreaId == 2){
			if(areaToBePlacedIn == 1 || areaToBePlacedIn == 3 || areaToBePlacedIn == 4  || areaToBePlacedIn == 10 || areaToBePlacedIn == 11 || areaToBePlacedIn == 12)
				return true;
		}else if(currentAreaId == 3){
			if(areaToBePlacedIn == 1 || areaToBePlacedIn == 2 || areaToBePlacedIn == 4)
				return true;
		}else if(currentAreaId == 4){
			if(areaToBePlacedIn == 2 || areaToBePlacedIn == 3 || areaToBePlacedIn == 5 || areaToBePlacedIn == 6 || areaToBePlacedIn == 10)
				return true;
		}else if(currentAreaId == 5){
			if(areaToBePlacedIn == 4 || areaToBePlacedIn == 6 || areaToBePlacedIn == 7 || areaToBePlacedIn == 8 || areaToBePlacedIn == 10)
				return true;
		}else if(currentAreaId == 6){
			if(areaToBePlacedIn == 4 || areaToBePlacedIn == 5 || areaToBePlacedIn == 7)
				return true;
		}else if(currentAreaId == 7){
			if(areaToBePlacedIn == 5 || areaToBePlacedIn == 6 || areaToBePlacedIn == 8)
				return true;
		}else if(currentAreaId == 8){
			if(areaToBePlacedIn == 5 || areaToBePlacedIn == 7 || areaToBePlacedIn == 9)
				return true;
		}else if(currentAreaId == 9){
			if(areaToBePlacedIn == 8 || areaToBePlacedIn == 10 || areaToBePlacedIn == 11)
				return true;
		}else if(currentAreaId == 10){
			if(areaToBePlacedIn == 2 || areaToBePlacedIn == 4 || areaToBePlacedIn == 5 || areaToBePlacedIn == 9 || areaToBePlacedIn == 11)
				return true;
		}else if(currentAreaId == 11){
			if(areaToBePlacedIn == 2 || areaToBePlacedIn == 9 || areaToBePlacedIn == 10 || areaToBePlacedIn == 12)
				return true;
		}else if(currentAreaId == 12){
			if(areaToBePlacedIn == 1 || areaToBePlacedIn == 2 || areaToBePlacedIn == 11)
				return true;
		}else if(currentAreaId == -1){ //Means this is a new minion to be placed
			return true;
		}
		return false;
	}

	/**
	 * Gets the adjacent areas.
	 *
	 * @param iAreaID the i area id
	 * @return the adjacent areas
	 */
	public static String GetAdjacentAreas(int iAreaID){

		switch(iAreaID)
		{
		case 1 : return ",2,3,12,";
		case 2 : return ",1,3,4,10,11,12,";
		case 3 : return ",1,2,4,";
		case 4 : return ",2,3,5,6,10,";
		case 5 : return ",4,6,7,8,10,";
		case 6 : return ",4,5,7,";
		case 7 : return ",5,6,8,";
		case 8 : return ",7,9,5,";
		case 9 : return ",8,10,11,";
		case 10 : return ",2,4,5,9,";
		case 11 : return ",2,9,10,12,";
		case 12 : return ",1,2,11,";	
		default : return "";
		}
	}



	/**
	 * Checks if is this green card assassination card.
	 *
	 * @param greenCardId the green card id
	 * @return true, if is this green card assassination card
	 */
	public static boolean isThisGreenCardAssassinationCard(int greenCardId){

		if(greenCardId == 7 || greenCardId == 12 || greenCardId == 22 || greenCardId == 28 || greenCardId == 47)
			return true;
		return false;
	}

	/**
	 * Checks if is this green card trouble maker card.
	 *
	 * @param greenCardId the green card id
	 * @return true, if is this green card trouble maker card
	 */
	public static boolean isThisGreenCardTroubleMakerCard(int greenCardId){

		if(greenCardId == 6 || greenCardId == 13 || greenCardId == 47)
			return true;
		return false;
	}

	/**
	 * Checks if is this green card placing a minion card.
	 *
	 * @param greenCardId the green card id
	 * @return true, if is this green card placing a minion card
	 */
	public static boolean isThisGreenCardPlacingAMinionCard(int greenCardId){

		if(greenCardId == 1 || greenCardId == 3 || greenCardId == 7 || greenCardId == 13 || greenCardId == 15 || greenCardId == 16 
				|| greenCardId == 20 || greenCardId == 23 || greenCardId == 26 || greenCardId == 27 || greenCardId == 32 || greenCardId == 37 
				|| greenCardId == 38 || greenCardId == 41 || greenCardId == 44 || greenCardId == 46 || greenCardId == 48)
			return true;
		return false;
	}

	/**
	 * Checks if is this green card placing a building card.
	 *
	 * @param greenCardId the green card id
	 * @return true, if is this green card placing a building card
	 */
	public static boolean isThisGreenCardPlacingABuildingCard(int greenCardId){

		if(greenCardId == 8 || greenCardId == 14 || greenCardId == 17 || greenCardId == 24 
				|| greenCardId == 30 || greenCardId == 33 || greenCardId == 40 || greenCardId == 43)
			return true;
		return false;
	}

	/**
	 * Checks if is this green card interrupt card.
	 *
	 * @param greenCardId the green card id
	 * @return true, if is this green card interrupt card
	 */
	public static boolean isThisGreenCardInterruptCard(int greenCardId){

		if(greenCardId == 17 || greenCardId == 18 || greenCardId == 45)
			return true;
		return false;
	}

	/**
	 * Checks if is this green card random event card.
	 *
	 * @param greenCardId the green card id
	 * @return true, if is this green card random event card
	 */
	public static boolean isThisGreenCardRandomEventCard(int greenCardId){

		if(greenCardId == 39)
			return true;
		return false;
	}

	/**
	 * How much money to take from bank.
	 *
	 * @param greenCardIdStr the green card id str
	 * @return the integer
	 */
	public static Integer howMuchMoneyToTakeFromBank(String greenCardIdStr){

		if(greenCardIdStr.equals("g28") || greenCardIdStr.equals("g47"))
			return 1;
		else if(greenCardIdStr.equals("g7") || greenCardIdStr.equals("g22") || greenCardIdStr.equals("g33"))
			return 2;
		else if(greenCardIdStr.equals("g12") || greenCardIdStr.equals("g16") || greenCardIdStr.equals("g27") || greenCardIdStr.equals("g42"))
			return 3;
		else if(greenCardIdStr.equals("g40"))
			return 5;
		return 0;
	}

	/**
	 * Gets the comma separated green card names.
	 *
	 * @param greenCardListCommaSeparated the green card list comma separated
	 * @return the comma separated green card names
	 */
	public static String getCommaSeparatedGreenCardNames(String greenCardListCommaSeparated){
		String namesOfGreenCardsList = "";
		String[] greenCardListCommaSeparatedArr = greenCardListCommaSeparated.split(",");

		for(String greenCardListCommaSeparatedA : greenCardListCommaSeparatedArr){
			int greenCardListCommaSeparatedInt = Integer.parseInt(greenCardListCommaSeparatedA);
			namesOfGreenCardsList += getGreenCardNameById(greenCardListCommaSeparatedInt) + ", ";
		}

		if (namesOfGreenCardsList.endsWith(", ")) {
			namesOfGreenCardsList = namesOfGreenCardsList.substring(0, namesOfGreenCardsList.length()-2); 
		}

		return namesOfGreenCardsList;
	}

	/**
	 * Draw as many card as needed.
	 *
	 * @param Ankhmorpork the ankhmorpork
	 * @param currentPlayer the current player
	 * @return the string
	 */
	public String drawAsManyCardAsNeeded(Game Ankhmorpork, Player currentPlayer){
		String playerGreenCardUpdatedList = currentPlayer.getGreenCardListCommaSeparated();
		if(currentPlayer.getGreenCardListCommaSeparated().length() < 9){
			String[] currentPlayerGreenCardArr = currentPlayer.getGreenCardListCommaSeparated().split(",");
			if(currentPlayerGreenCardArr.length < 5){
				while(!(currentPlayer.getGreenCardListCommaSeparated().length() < 9)){
					Integer cardIndexNumber = PresentationUtility.returnRandomNumber(1, Ankhmorpork.lstGreenCards.size());
					GreenCard greenCardAccessed = Ankhmorpork.lstGreenCards.get(cardIndexNumber);
					if(currentPlayer.getGreenCardListCommaSeparated().length() == 0){
						playerGreenCardUpdatedList = greenCardAccessed.GetCardID() + ",";
					}else{
						playerGreenCardUpdatedList = "," + greenCardAccessed.GetCardID();
					}
				}
			}
		}
		return playerGreenCardUpdatedList;
	}

	/**
	 * Take one green card from deck.
	 *
	 * @param Ankhmorpork the ankhmorpork
	 * @return the string
	 */
	public static String takeOneGreenCardFromDeck(Game Ankhmorpork){

		Integer cardIndexNumber = PresentationUtility.returnRandomNumber(1, Ankhmorpork.lstGreenCards.size());
		GreenCard greenCardAccessed = Ankhmorpork.lstGreenCards.get(cardIndexNumber);
		return greenCardAccessed.GetCardID();	

	}
	
	/**
	 * Checks if is file name valid.
	 *
	 * @param fileName the file name
	 * @return true, if is file name valid
	 */
	public static boolean isFileNameValid(String fileName) {
        boolean validationResult = false;
        if(fileName.endsWith("txt")){
        	validationResult = true;
        }
        return validationResult;
    }
	
	

}
