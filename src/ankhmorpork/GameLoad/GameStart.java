/*
 * 
 */
package ankhmorpork.GameLoad;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.json.JSONException;
import org.json.simple.parser.ParseException;

import PresentationUtilityCommon.PresentationUtility;
import ankhmorpork.Game.Game;
import ankhmorpork.GameConstants.Constants;
import ankhmorpork.GameObjects.*;

// TODO: Auto-generated Javadoc
/**
 * The Class GameStart.
 */
public class GameStart {

	
	//Start New Game
	/**
	 * Start new game.
	 *
	 * @param Players the players
	 * @param Colors the colors
	 * @param iNoOfPlayers the i no of players
	 * @param AnkhMorpork the ankh morpork
	 */
	public static void StartNewGame(String Players[], String Colors[], int iNoOfPlayers,Game AnkhMorpork)
	{
		Area[] AreaList = new Area[13];	
		AreaList[0]=new Area(0,0,"Not on Board",0);
		AreaList[1]=new Area(1,6,"Dolly Sisters",0);
		AreaList[2]=new Area(2,18,"Unreal Estate",0);
		AreaList[3]=new Area(3,12,"Dragon's Landing",0);
		AreaList[4]=new Area(4,18,"Small Gods",0);
		AreaList[5]=new Area(5,6,"The Scours",0);
		AreaList[6]=new Area(6,12,"The Hippo",0);
		AreaList[7]=new Area(7,6,"The Shades",0);
		AreaList[8]=new Area(8,6,"Dimwel",0);
		AreaList[9]=new Area(9,12,"Longwall",0);
		AreaList[10]=new Area(10,12,"Isle of Gods",0);
		AreaList[11]=new Area(11,18,"Seven Sleepers",0);
		AreaList[12]=new Area(12,12,"Nap Hill",0);
		
		ArrayList<Integer> initializingBrownCardsArr = PresentationUtility.initializeAArrayWithValue(53);
		ArrayList<Integer> initializingGreenCardsArr = PresentationUtility.initializeAArrayWithValue(48);
		ArrayList<Integer> initializingCityAreaCardsArr = PresentationUtility.initializeAArrayWithValue(12);
		ArrayList<Integer> initializingPersonalityArr = PresentationUtility.initializeAArrayWithValue(7);
		
		String getFiveDifferentBrownNumbers = "", getFiveDifferentGreenNumbers = "", getRandomCityAreaCardsForPlayers = "";
		Integer getOneDifferentPersonalityCard;
		
			//New Game
		//Game AnkhMorpork = new Game();
		//Initialize Trolls and Players
		for(int i=1; i<4; i++)
		{
			Troll objTroll = new Troll(i);
			AnkhMorpork.lstTrolls.add(objTroll);
		}
		
		//Initialize Demons
		for(int i=1; i<5; i++)
		{
			Demon objDemon = new Demon(i);
			AnkhMorpork.lstDemons.add(objDemon);
		}
		
		//Below line can be deleted**
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    //**
		
		//Initialize Bank Details
		AnkhMorpork.GameBank.objGoldCoin = new Coins(Constants.GoldCoin());
		AnkhMorpork.GameBank.objGoldCoin.setCoin_Available(getDefaultBankCoins(Constants.GoldCoin(),iNoOfPlayers));
		AnkhMorpork.GameBank.objSilverCoin = new Coins(Constants.SilverCoin());
		AnkhMorpork.GameBank.objSilverCoin.setCoin_Available(getDefaultBankCoins(Constants.SilverCoin(),iNoOfPlayers));
		
	    //Initialize Players			    
		for(int i=1;i<=iNoOfPlayers;i++)
		{
			//System.out.println("Enter Name for Player "+i);
			//String Name = br.readLine();
			//System.out.println("Enter Color for Player "+i);
			//String Color = br.readLine();
			String Name = Players[i];
			String Color = Colors[i];
			Player objPlayer = new Player(i,Name,Color);
			AnkhMorpork.lstPlayers.add(objPlayer);	
		}
		
		//To display Output in console
		int i=1;
		for(Player objPlayer: AnkhMorpork.lstPlayers)
		{		
			System.out.println("Player "+ i + " Details");
			System.out.println("Player ID: "+objPlayer.getPlayer_id()+" Player Name:"+objPlayer.getPlayer_name()+" Player Color:"+objPlayer.getPlayer_color());
			System.out.println("Minion Details of Player "+i);
			for(Minion objMinion:objPlayer.lstMinions)
			{
				System.out.println("MinionID:"+objMinion.getMinion_id()+" MinionArea: "+objMinion.getArea_id()+" MinionColor: "+objMinion.getColor()+" PlayerID: "+objMinion.getPlayer_id());
			}
			getFiveDifferentBrownNumbers = "";
			getFiveDifferentGreenNumbers = "";
			getRandomCityAreaCardsForPlayers = "";
			
			int countBrownCard = 0;
			int countGreenCard = 0;
			int countCityAreaCard = 0;
			while(true){
				Integer randomIndexNumber = PresentationUtility.returnRandomNumber(1, initializingBrownCardsArr.size()-1);				
				Integer randomNumberAtIndexNumber = initializingBrownCardsArr.get(randomIndexNumber);
				System.out.println("Random number : "+randomIndexNumber + " randomNumberAtIndexNumber "+randomNumberAtIndexNumber);
				
				if(randomNumberAtIndexNumber > 0){
					getFiveDifferentBrownNumbers += randomNumberAtIndexNumber+",";
					countBrownCard += 1;
					initializingBrownCardsArr.remove(randomNumberAtIndexNumber);
				
					if(countBrownCard == 5){
						if (getFiveDifferentBrownNumbers.endsWith(",")) {
							getFiveDifferentBrownNumbers = getFiveDifferentBrownNumbers.substring(0, getFiveDifferentBrownNumbers.length() - 1);
						}
						
						objPlayer.setBrownCardListCommaSeparated(getFiveDifferentBrownNumbers);
						//Create Brown Card Object and assign cards
						System.out.print("PlayerId : "+ objPlayer.getPlayer_id() + " - Brown Card: " + getFiveDifferentBrownNumbers + "\n");
						break;
					}
				}
			}
			while(true){
				Integer randomIndexNumber = PresentationUtility.returnRandomNumber(1, initializingGreenCardsArr.size()-1);
				Integer randomNumberAtIndexNumber = initializingGreenCardsArr.get(randomIndexNumber);
				
				if(randomNumberAtIndexNumber > 0){
					getFiveDifferentGreenNumbers += randomNumberAtIndexNumber+",";
					countGreenCard += 1;
					initializingGreenCardsArr.remove(randomNumberAtIndexNumber);
				
					if(countGreenCard == 5){
						if (getFiveDifferentGreenNumbers.endsWith(",")) {
							getFiveDifferentGreenNumbers = getFiveDifferentGreenNumbers.substring(0, getFiveDifferentGreenNumbers.length() - 1);
						}
						objPlayer.setGreenCardListCommaSeparated(getFiveDifferentGreenNumbers);
						//Create Green Card Object and assign cards
						System.out.print("PlayerId : "+ objPlayer.getPlayer_id() + " - Green Card: " + getFiveDifferentGreenNumbers + "\n");
						break;
					}
				}
			}
			
			while(true){
				Integer randomIndexNumberForCityAreaCard = PresentationUtility.returnRandomNumber(1, initializingCityAreaCardsArr.size()-1);
				Integer randomNumberAtIndexNumberForCityAreaCard = initializingCityAreaCardsArr.get(randomIndexNumberForCityAreaCard);
				
				if(randomNumberAtIndexNumberForCityAreaCard > 0){
					getRandomCityAreaCardsForPlayers = randomNumberAtIndexNumberForCityAreaCard+",";
					countCityAreaCard += 1;
					initializingCityAreaCardsArr.remove(randomNumberAtIndexNumberForCityAreaCard);
				
					if(countCityAreaCard == 1){
						if (getRandomCityAreaCardsForPlayers.endsWith(",")) {
							getRandomCityAreaCardsForPlayers = getRandomCityAreaCardsForPlayers.substring(0, getRandomCityAreaCardsForPlayers.length() - 1);
						}
						objPlayer.setCityAreaCardsListCommaSeparated(getRandomCityAreaCardsForPlayers);
						//Create Green Card Object and assign cards
						System.out.print("PlayerId : "+ objPlayer.getPlayer_id() + " - City Area Card: " + getRandomCityAreaCardsForPlayers + "\n");
						break;
					}
				}
			}

			Integer randomIndexNumber = PresentationUtility.returnRandomNumber(1, initializingPersonalityArr.size()-1);
			Integer randomNumberAtIndexNumber = initializingPersonalityArr.get(randomIndexNumber);
			
			if(randomNumberAtIndexNumber > 0){
				getOneDifferentPersonalityCard = randomNumberAtIndexNumber;
				initializingPersonalityArr.remove(randomNumberAtIndexNumber);
				objPlayer.setPersonalityCardListCommaSeparated(getOneDifferentPersonalityCard+"");
				//Create One Different Personality Card
				System.out.print("PlayerId : "+ objPlayer.getPlayer_id() + " - Personality Card: " + getOneDifferentPersonalityCard + "\n");
			}
			
			i++;
		}
		
		return;
	}

	//Method to get Bank Amounts
		public static int getDefaultBankCoins(String CoinType, int iNoOfPlayers)
		{
			if(CoinType==Constants.GoldCoin())
			{
				//Game has 17 Gold Coins, Each player gets 1 Gold Coin at the Start of The Game
				return 17 - iNoOfPlayers*1;
			}
			else if(CoinType==Constants.SilverCoin())
			{
				//Game has 35 Silver Coins, Each player gets 5 Silver Coins at the Start of The Game
				return 35 - iNoOfPlayers*5;
			}
			else return 0;
		}

//	public static void Set_Players_details(String Players[], String Colors[], int input)
//	{
//	
//	Area[] AreaList = new Area[13];	
//	AreaList[0]=new Area(0,0,"Not on Board",0);
//	AreaList[1]=new Area(1,6,"Dolly Sisters",0);
//	AreaList[2]=new Area(2,18,"Unreal Estate",0);
//	AreaList[3]=new Area(3,12,"Dragon's Landing",0);
//	AreaList[4]=new Area(4,18,"Small Gods",0);
//	AreaList[5]=new Area(5,6,"The Scours",0);
//	AreaList[6]=new Area(6,12,"The Hippo",0);
//	AreaList[7]=new Area(7,6,"The Shades",0);
//	AreaList[8]=new Area(8,6,"Dimwel",0);
//	AreaList[9]=new Area(9,12,"Longwall",0);
//	AreaList[10]=new Area(10,12,"Isle of Gods",0);
//	AreaList[11]=new Area(11,18,"Seven Sleepers",0);
//	AreaList[12]=new Area(12,12,"Nap Hill",0);
//	
//		//New Game
//	Game Ankh = new Game();
//	//Initialize Trolls and Players
//	for(int i=1; i<4; i++)
//	{
//		Troll objTroll = new Troll(i);
//		Ankh.lstTrolls.add(objTroll);
//	}
//	
//	//Initialize Demons
//	for(int i=1; i<5; i++)
//	{
//		Demon objDemon = new Demon(i);
//		Ankh.lstDemons.add(objDemon);
//	}
//	
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    
//	
//	
//    //Initialize Players
//	//System.out.println("Welcome to Ankh-Morpork");	
//	//System.out.println("Enter number of Players:");
//	//Integer input=0;
//    //try {
//	//	input = Integer.parseInt(br.readLine());
//		
//	//} catch (IOException e) {
//	//	// TODO Auto-generated catch block
//	//	e.printStackTrace();
//	//}	
//    
//	for(int i=1;i<=input;i++)
//	{
//		//System.out.println("Enter Name for Player "+i);
//		//String Name = br.readLine();
//		//System.out.println("Enter Color for Player "+i);
//		//String Color = br.readLine();
//		String Name = Players[i];
//		String Color = Colors[i];
//		Player objPlayer = new Player(i,Name,Color);
//		Ankh.lstPlayers.add(objPlayer);	
//	}
//	
//	
//	int i=1;
//	for(Player objPlayer: Ankh.lstPlayers)
//	{		
//		System.out.println("Player "+ i + " Details");
//		System.out.println("Player ID: "+objPlayer.getPlayer_id()+" Player Name:"+objPlayer.getPlayer_name()+" Player Color:"+objPlayer.getPlayer_color());
//		System.out.println("Minion Details of Player "+i);
//		for(Minion objMinion:objPlayer.lstMinions)
//		{
//			System.out.println("MinionID:"+objMinion.getMinion_id()+" MinionArea: "+objMinion.getArea_id()+" MinionColor: "+objMinion.getColor()+" PlayerID: "+objMinion.getPlayer_id());
//		}
//		i++;		
//	}
//	System.out.println("Similar for rest");
//	//Know working directory
//	String current = System.getProperty("user.dir");
//    System.out.println("Current working directory in Java : " + current);
//	System.out.println("Saving to jason file");
//	try {
//		GameSave.SaveGame("Ankh13",Ankh);
//		System.out.println("Load Test");
//		//ReLoading Ankh
//		Ankh = GameLoad.LoadGame("Ankh12",Ankh);
//		i=1;
//		for(Player objPlayer: Ankh.lstPlayers)
//		{		
//			System.out.println("Player "+ i + " Details");
//			System.out.println("Player ID: "+objPlayer.getPlayer_id()+" Player Name:"+objPlayer.getPlayer_name()+" Player Color:"+objPlayer.getPlayer_color());
//			System.out.println("Player ID:"+objPlayer.getPlayer_id()+" Gold Coin Details: "+objPlayer.objGoldCoin.getCoin_Available());
//			i++;
//		}
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	 catch (JSONException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} 
//	catch (ParseException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	}
}
