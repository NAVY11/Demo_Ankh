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
			System.out.print("Next Player would be : Player " + 1);
			return 1;
		}else{
			System.out.print("Next Player would be : Player "+(currentPlayer+1));
			return (currentPlayer+1);  
		}
	}
	/*
		public static void main(String argv[]){
			nextPlayerTurn(4, 4);
		}
	*/
}
