/*
 * 
 */
package ankhmorpork.GameLoad;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.json.JSONException;
import org.json.simple.parser.ParseException;

import PresentationUtilityCommon.PresentationUtility;
import ankhmorpork.Game.Game;
import ankhmorpork.GameConstants.Constants;
import ankhmorpork.GameObjects.Area;
import ankhmorpork.GameObjects.Building;
import ankhmorpork.GameObjects.Coins;
import ankhmorpork.GameObjects.Demon;
import ankhmorpork.GameObjects.Minion;
import ankhmorpork.GameObjects.Player;
import ankhmorpork.GameObjects.Troll;
import ankhmorpork.GameObjects.TroubleMaker;
import ankhmorpork.GameObjects.Cards.CityAreaCard;
import ankhmorpork.GameObjects.Cards.GreenCard;

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
	 * @throws FileNotFoundException the file not found exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws ParseException the parse exception
	 * @throws JSONException the JSON exception
	 */
	public static void StartNewGame(String Players[], String Colors[], int iNoOfPlayers) throws FileNotFoundException, IOException, ParseException, JSONException
	{
//		Area[] AreaList = new Area[13];	
//		AreaList[0]=new Area(0,0,"Not on Board",0);
//		AreaList[1]=new Area(1,6,"Dolly Sisters",0);
//		AreaList[2]=new Area(2,18,"Unreal Estate",0);
//		AreaList[3]=new Area(3,12,"Dragon's Landing",0);
//		AreaList[4]=new Area(4,18,"Small Gods",0);
//		AreaList[5]=new Area(5,6,"The Scours",0);
//		AreaList[6]=new Area(6,12,"The Hippo",0);
//		AreaList[7]=new Area(7,6,"The Shades",0);
//		AreaList[8]=new Area(8,6,"Dimwel",0);
//		AreaList[9]=new Area(9,12,"Longwall",0);
//		AreaList[10]=new Area(10,12,"Isle of Gods",0);
//		AreaList[11]=new Area(11,18,"Seven Sleepers",0);
//		AreaList[12]=new Area(12,12,"Nap Hill",0);
		
		ArrayList<Integer> initializingBrownCardsArr = PresentationUtility.initializeAArrayWithValue(53);
		ArrayList<Integer> initializingGreenCardsArr = PresentationUtility.initializeAArrayWithValue(48);
		ArrayList<Integer> initializingCityAreaCardsArr = PresentationUtility.initializeAArrayWithValue(12);
		ArrayList<Integer> initializingPersonalityArr = PresentationUtility.initializeAArrayWithValue(7);
		
		String getFiveDifferentBrownNumbers = "", getFiveDifferentGreenNumbers = "", getRandomCityAreaCardsForPlayers = "";
		Integer getOneDifferentPersonalityCard;
		GameLoad.LoadNewGame_Cards();
		for(CityAreaCard areaCard : Game.lstCityAreaCards){
			System.out.println(areaCard);
		}
			//New Game
		//Game AnkhMorpork = new Game();
		//Initialize Trolls and Players
		for(int i=1; i<4; i++)
		{
			Troll objTroll = new Troll(i);
			Game.lstTrolls.add(objTroll);
		}
		
		//Initialize Demons
		for(int i=1; i<5; i++)
		{
			Demon objDemon = new Demon(i);
			Game.lstDemons.add(objDemon);
		}
		//Initialize Trouble Marker
		for(int i=1; i<5; i++)
		{
			TroubleMaker objTroubleMarker = new TroubleMaker(i);
			if(i==1 ||i==5||i==7)
			{
				objTroubleMarker.setArea_id(i);
			}
			Game.lstTroubleMaker.add(objTroubleMarker);
		}
		
		//Below line can be deleted**
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    //**
		
		//Initialize Bank Details
		Game.GameBank.objGoldCoin = new Coins(Constants.GoldCoin());
		Game.GameBank.objGoldCoin.setCoin_Available(getDefaultBankCoins(Constants.GoldCoin(),iNoOfPlayers));
		Game.GameBank.objSilverCoin = new Coins(Constants.SilverCoin());
		Game.GameBank.objSilverCoin.setCoin_Available(getDefaultBankCoins(Constants.SilverCoin(),iNoOfPlayers));
		
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
			Game.lstPlayers.add(objPlayer);	
		}
		//Initialze Minions and Buildings
				for(int PlayerID = 1; PlayerID<=iNoOfPlayers;PlayerID++)
				{
					//Create minions for this Player
					for(int i=1; i<=Constants.MinionsPerPlayer();i++)
					{
						Integer MinionID = 100*PlayerID + i;
						Integer BuildingID = MinionID;
						Integer AreaCode = 0;
						if(i<4)
						{
							if(i==1)
							{
								AreaCode=1;
							}
							else if(i==2)
							{
								AreaCode=5;
							}
							else if(i==3)
							{
								AreaCode=7;
							}
						}
						Player objPlayer = Game.GetPlayer(PlayerID);
						Minion objMinion = new Minion(MinionID,objPlayer.getPlayer_color(),AreaCode,PlayerID);
						Game.lstMinions.add(objMinion);
						Building objBuilding = new Building(BuildingID,objPlayer.getPlayer_color(),0,PlayerID);
						Game.lstBuildings.add(objBuilding);
					}

				}
		//To display Output in console
		int i=1;
		for(Player objPlayer: Game.lstPlayers)
		{		
			System.out.println("Player "+ i + " Details");
			System.out.println("Player ID: "+objPlayer.getPlayer_id()+" Player Name:"+objPlayer.getPlayer_name()+" Player Color:"+objPlayer.getPlayer_color());
			System.out.println("Minion Details of Player "+i);
			for(Minion objMinion:Game.lstMinions)
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
				//System.out.println("Random number : "+randomIndexNumber + " randomNumberAtIndexNumber "+randomNumberAtIndexNumber);
				
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
						//System.out.print("PlayerId : "+ objPlayer.getPlayer_id() + " - Brown Card: " + getFiveDifferentBrownNumbers + "\n");
						break;
					}
				}
			}
			while(true){
				Integer randomIndexNumber = PresentationUtility.returnRandomNumber(1, initializingGreenCardsArr.size()-1);
				Integer randomNumberAtIndexNumber = initializingGreenCardsArr.get(randomIndexNumber);
				
				if(randomNumberAtIndexNumber > 0){
					getFiveDifferentGreenNumbers += randomNumberAtIndexNumber+",";
					String getUniqueDifferentGreenNumberCard = randomNumberAtIndexNumber+",";;
					for(GreenCard greenCard1 : Game.lstGreenCards){
						if((greenCard1.GetCardID()+",").equals("g"+getUniqueDifferentGreenNumberCard)){
							greenCard1.setPlayerID(objPlayer.getPlayer_id());
							break;
						}
					}
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
					for(CityAreaCard cityAreaCard1 : Game.lstCityAreaCards){
						if((cityAreaCard1.GetCardID()+",").equals("c"+getRandomCityAreaCardsForPlayers)){
							cityAreaCard1.setPlayerID(objPlayer.getPlayer_id());
							break;
						}
					}
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
		/**
	 * Gets the default bank coins.
	 *
	 * @param CoinType the coin type
	 * @param iNoOfPlayers the i no of players
	 * @return the default bank coins
	 */
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

}
