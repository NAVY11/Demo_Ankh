/*
 * 
 */
package PresentationUtilityCommon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

// TODO: Auto-generated Javadoc
/**
 * The Class PresentationUtility.
 */
public class PresentationUtility {

	/** The number already being used in game. */
	static List<Integer> numberAlreadyBeingUsedInGame = new ArrayList<Integer>();
	
	/** The random number a. */
	static Integer randomNumberA = 0;
	
	/**Method to check if an element exists in a String array*/
	public static boolean ArrayHasElement(String[] Array, String Element)
	{
		boolean ElementFound = false;
		for(int i=0; i < Array.length; i++)
		{
			if(Array[i]==Element)
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
		
		if(!(numberAlreadyBeingUsedInGame.size() == 0)){
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
	        default: return IConstants.PersonalityCard7;
		}
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
			//System.out.print("Next Player would be : Player " + 1);
			return 1;
		}else{
			//System.out.print("Next Player would be : Player "+(currentPlayer+1));
			return (currentPlayer+1);  
		}
	}
	/**
	 * 
	 * Adjacent Minion Categorization

		1  --> 2, 3, 12
		2  --> 1, 3, 4, 10, 11, 12
		3  --> 1, 2, 4
		4  --> 2, 3, 5, 6, 10
		5  --> 4, 6, 7, 8, 10
		6  --> 4, 5, 7
		7  --> 5, 6, 8
		8  --> 5, 7, 9
		9  --> 8, 10, 11
		10 --> 2, 4, 5, 9, 11
		11 --> 2, 9, 10, 12
		12 --> 1, 2, 11

	 * Returns Whether the minion can be placed in the adjacent area or not
	 * @param currentPlayerId
	 * @param minionId
	 * @param currentAreaId
	 * @param areaToBePlacedIn
	 * @return
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
			if(areaToBePlacedIn == 1 || areaToBePlacedIn == 1 || areaToBePlacedIn == 11)
				return true;
		}else if(currentAreaId == -1){ //Means this is a new minion to be placed
			return true;
		}
		return false;
	}
	
	public static boolean isThisGreenCardAssassinationCard(int greenCardId){
		
		if(greenCardId == 7 || greenCardId == 12 || greenCardId == 22 || greenCardId == 28 || greenCardId == 47)
			return true;
		return false;
	}
	
	public static boolean isThisGreenCardTroubleMakerCard(int greenCardId){
		
		if(greenCardId == 6 || greenCardId == 13 || greenCardId == 47)
			return true;
		return false;
	}
	
	public static boolean isThisGreenCardPlacingAMinionCard(int greenCardId){
		
		if(greenCardId == 1 || greenCardId == 3 || greenCardId == 7 || greenCardId == 13 || greenCardId == 15 || greenCardId == 16 
				|| greenCardId == 20 || greenCardId == 23 || greenCardId == 26 || greenCardId == 27 || greenCardId == 32 || greenCardId == 37 
				|| greenCardId == 38 || greenCardId == 41 || greenCardId == 44 || greenCardId == 46 || greenCardId == 48)
			return true;
		return false;
	}
	
	public static boolean isThisGreenCardPlacingABuildingCard(int greenCardId){
		
		if(greenCardId == 8 || greenCardId == 14 || greenCardId == 17 || greenCardId == 24 
				|| greenCardId == 30 || greenCardId == 33 || greenCardId == 40 || greenCardId == 43)
			return true;
		return false;
	}
	
	public boolean isThisGreenCardInterruptCard(int greenCardId){
		
		if(greenCardId == 17 || greenCardId == 18 || greenCardId == 45)
			return true;
		return false;
	}
	
	public static boolean isThisGreenCardRandomEventCard(int greenCardId){
		
		if(greenCardId == 39)
			return true;
		return false;
	}
	
	public static Integer howMuchMoneyToTakeFromBank(int greenCardId){
		
		if(greenCardId == 28 || greenCardId == 47)
			return 1;
		else if(greenCardId == 7 || greenCardId == 22 || greenCardId == 33)
			return 2;
		else if(greenCardId == 12 || greenCardId == 16 || greenCardId == 27 || greenCardId == 42)
			return 3;
		else if(greenCardId == 40)
			return 5;
		return 0;
	}
	
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
}
