/*
 * 
 */
package ankhmorpork;
import java.awt.AWTEvent;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.ParseException;

import PresentationUtilityCommon.PresentationUtility;
import ViewFile.DisplayViewFile;
import ViewFile.ViewFileTxt;
import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.*;
import ankhmorpork.GameObjects.Cards.CityAreaCard;
import ankhmorpork.GameObjects.Cards.GreenCard;
import ankhmorpork.GameLoad.*;


// TODO: Auto-generated Javadoc
/**
 * The Class discworldboard.
 */
public class discworldboard extends Component {

	/** The Width. */
	private int Width  = 1200;
	//yogesh
	/** The Height. */
	private int Height = 900;

	/** The discworld. */
	private discworld discworld;

	/** The br. */
	private static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

	/** The Constant quit. */
	static final Frame quit = new Frame("Are you sure?");

	/** The rolled. */
	public boolean rolled = false;

	/** The Dice1. */
	private int Dice1 = 0;


	/**
	 * Instantiates a new discworldboard.
	 */
	public discworldboard( ) {


		enableEvents( AWTEvent.MOUSE_EVENT_MASK );
		enableEvents( AWTEvent.KEY_EVENT_MASK );
		repaint();
	}



	/* (non-Javadoc)
	 * @see java.awt.Component#paint(java.awt.Graphics)
	 */
	public void paint( Graphics g ) {
		//Draw the board
		//			g.drawImage(board,1,1,this);
		g.setColor( new Color( (80), (180), (210) ) ); 

		//			g.setColor(Color.lightGray);

		g.setColor( new Color( (100), (30), (100) ) );
		g.fill3DRect( 10, 10, 200, 200, true );				//12
		g.fill3DRect( 210, 10, 250, 100, true );				//12



		g.setColor( new Color( (100), (50), (50) ) );
		g.fill3DRect( 460, 10, 200, 200, true );				//1
		g.setColor( new Color( (80), (80), (80) ) );
		g.fill3DRect( 10, 210, 200, 200, true );				//11

		g.setColor( new Color( (80), (180), (110) ) ); 
		g.fill3DRect( 210, 110, 250, 150, true );				//2

		g.setColor( new Color( (80), (100), (210) ) ); 
		g.fill3DRect( 210, 260, 150, 200, true );				//10


		g.setColor( new Color( (200), (30), (200) ) );
		g.fill3DRect( 360, 210, 150, 160, true );				//4
		g.setColor( new Color( (150), (50), (150) ) );
		g.fill3DRect( 510, 210, 150, 140, true );				//3.
		g.setColor( new Color( (120), (30), (200) ) );

		g.fill3DRect( 10, 410, 200, 250, true );				//9
		g.setColor( new Color( (70), (50), (140) ) );

		g.fill3DRect( 210, 460, 150, 200, true );				//8	

		g.setColor( new Color( (160), (30), (100) ) );
		g.fill3DRect( 360, 370, 150, 150, true );				//5	

		g.setColor( new Color( (60), (30), (100) ) );
		g.fill3DRect( 360, 520, 150, 140, true );				//7

		g.setColor( new Color( (100), (50), (60) ) );
		g.fill3DRect( 510, 350, 150, 310, true );				//6


		//Draw the dice
		g.setColor(Color.black);
		g.setFont( new Font( "verdana", Font.BOLD, 20) );
		g.drawString("1",465, 35);
		g.drawString("Dolly Sisters",495, 65);	

		g.drawString("2",215, 135);
		g.drawString("Unreal Estate",245, 165);
		g.drawString("Unreal Estate",245, 165);


		g.drawString("3",515, 235);
		g.drawString("Dragon's",540, 255);


		g.drawString("4",365, 235);
		g.drawString("Small Gods",370, 270);
		g.drawString("Small Gods",370, 270);

		g.drawString("5",365, 395);
		g.drawString("The Scours",370, 425);

		g.drawString("6",515, 375);
		g.drawString("The Hippo",535, 415);

		g.drawString("7",365, 545);
		g.drawString("The Shades",370, 580);

		g.drawString("8",215, 485);
		g.drawString("Dimwell",245, 515);

		g.drawString("9",15, 435);
		g.drawString("Longwall",45, 465);

		g.drawString("10",215, 285);
		g.drawString("Isle of Gods",220, 325);

		g.drawString("11",15, 235);
		g.drawString("Seven Sleepers",25, 270);

		g.drawString("12",15, 35);
		g.drawString("Nap Hill",45, 75);




		g.setColor( new Color( (230), (230), (230) ) );
		g.setFont( new Font( "verdana", Font.BOLD, 20 ) );


	}



	//The usual component methods
	/* (non-Javadoc)
	 * @see java.awt.Component#contains(int, int)
	 */
	public boolean contains( int x, int y ) {
		if( x>0  &&  x<Width  &&  y>0  &&  y<Height ) 
			return true;
		return false;
	}

	/* (non-Javadoc)
	 * @see java.awt.Component#getPreferredSize()
	 */
	public Dimension getPreferredSize() {
		return new Dimension( Width, Height );
	}

	/* (non-Javadoc)
	 * @see java.awt.Component#getMinimumSize()
	 */
	public Dimension getMinimumSize() {
		return new Dimension( Width, Height );
	}



	//quiting the program;
	/**
	 * Quit.
	 */
	public void quit() {
		final Frame quit = new Frame();
		final Label question = new Label("Are you sure you want to end this game?" );
		final Button yes = new Button("Yes" );
		final Button no = new Button( "NO" );
		quit.setSize( 400, 90 );
		quit.setBackground( Color.lightGray );
		quit.setLayout( new FlowLayout(FlowLayout.CENTER) );
		quit.add( question);
		quit.add( yes );
		quit.add( no );
		quit.setVisible( true );
		no.addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent e ) {
				quit.setVisible(false);
			}

		});
		yes.addActionListener ( new ActionListener() {
			public void actionPerformed ( ActionEvent e) {
				//System.out.println("quit");
				quit.setVisible(false);
				discworld.AnkhmorporkFrame.setVisible(false);//System.exit(0);
			}
		});
		quit.addWindowListener( new WindowAdapter() {
			public void windowClosing( WindowEvent e ) {
				quit.setVisible( false );
				repaint();
			}
		});
		repaint();
	}
	//either the 'roll' button was clicked or 'r' was pressed.
	/**
	 * Roll.
	 */
	public void Roll() {
		Dice1 = ( int )( Math.random() * 12 + 1 );
		rolled = true;

		repaint();
	}
	//Method to decide who starts game
	/**
	 * Starting player.
	 *
	 * @param noOfPlayers the no of players
	 * @return the int
	 */
	public int StartingPlayer(int noOfPlayers)
	{
		return (int)(Math.random()*noOfPlayers + 1);
	}

	/**
	 * View game state.
	 */
	public void ViewGameState(){
		String viewStateData = ViewFileTxt.ViewState();
		DisplayViewFile abc = new DisplayViewFile();
		abc.Viewer(viewStateData);
	}

	/**
	 * Save game.
	 *
	 * @param objFileWriter the obj file writer
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws JSONException the JSON exception
	 */
	public static void SaveGame(FileWriter objFileWriter) throws IOException, JSONException{
		GameSave.SaveGame(objFileWriter);
	}

	//	public static JSONObjectLoadingBeforeSavingInfo()Game PlayedGame throws IOException, JSONException{
	//		return GameSave.jsonObjectWhileSavingGame()PlayedGame;
	//	}

	/**
	 * Loadgamefetch.
	 *
	 * @param objFileReader the obj file reader
	 * @return the game
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws ParseException the parse exception
	 */
	public void Loadgamefetch(FileReader objFileReader) throws IOException, ParseException
	{
		GameLoad.LoadGame(objFileReader);
	}

	/**
	 * Initialise game.
	 *
	 * @param iNoOfPlayers the i no of players
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws ParseException the parse exception
	 * @throws JSONException the JSON exception
	 */
	public void InitialiseGame(int iNoOfPlayers) throws IOException, ParseException, JSONException
	{					
		String[] Players = new String[10];
		String[] Colors = new String[10];
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		for(int i=1;i<=iNoOfPlayers;i++)
		{
			Players[i]= JOptionPane.showInputDialog("Please input Name for Player:" + i);
			Colors[i] = JOptionPane.showInputDialog("Please input Color for Player:" + i);
		}

		GameStart.StartNewGame(Players, Colors, iNoOfPlayers);
		ViewFileTxt viewFileText = new ViewFileTxt();
		String currentPlayer = viewFileText.currentPlayerPlaying(Game.lstPlayers);
		System.out.println("The current Player Playing is player "+ currentPlayer);


		//Get Starting Player randomly
		int CurrentPlayer = StartingPlayer(iNoOfPlayers);
		//System.out.println("Player "+ CurrentPlayer + " starts game");
		boolean GameEnds = false;
		System.out.println("===========================================================================================");
		System.out.println("Welcome to Ankh-Morpork, the largest, smelliest, and most ‘interesting’ city on Discworld.");
		System.out.println("===========================================================================================");
		while(!GameEnds)
		{

			CurrentPlayer = PresentationUtility.nextPlayerTurn(CurrentPlayer, iNoOfPlayers); 
			//Show Board
			System.out.print(ViewFileTxt.ViewState());
			//Play Game						
			//Load Player details
			Player objPlayer = Game.lstPlayers.get(CurrentPlayer - 1);
			System.out.println("Enter 'saveGame' to save the Current State. Else write 'cont' to continue ");
			BufferedReader brOption = new BufferedReader(new InputStreamReader(System.in));
			String brOptionSelected = brOption.readLine();
			if(brOptionSelected.equals("saveGame")){
				JFileChooser chooser = new JFileChooser();
				chooser.setCurrentDirectory(new File("/home/me/Documents"));
				int retrival = chooser.showSaveDialog(null);
				if (retrival == JFileChooser.APPROVE_OPTION) {

					FileWriter objFileWriter = new FileWriter(chooser.getSelectedFile()+".txt");
					discworldboard.SaveGame(objFileWriter);

				}
			}
			System.out.println("It is "+objPlayer.getPlayer_name()+"'s turn");
			//********Which Card to Play?
			System.out.println("Which card to play?");

			//Show available city area cards
			StringBuilder sbValidCityAreaIDs = new StringBuilder();
			boolean hasCityAreaCard = false;
			for(CityAreaCard cityAreaCard : Game.lstCityAreaCards)
			{	
				if(cityAreaCard.getPlayerID()==objPlayer.getPlayer_id())
				{
					sbValidCityAreaIDs.append(cityAreaCard.GetCardID());
					hasCityAreaCard = true;
					System.out.println(cityAreaCard.CardID + " : " + cityAreaCard.getName());
				}
			}

			if(hasCityAreaCard){
				//Accept City Area Card to play from Player
				String CardID = null;
				while(true)
				{
					System.out.println("Enter a City Area Card ID");
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					CardID = br.readLine().toString();
					if((sbValidCityAreaIDs.toString()).contains(CardID))
					{
						break;
					}
				}
			}

			//Show available greeen cards
			boolean success = false;
			while(!success)
			{
				StringBuilder sbValidIDs = new StringBuilder();
				for(GreenCard grnCard: Game.lstGreenCards)
				{	
					if(grnCard.getPlayerID()==objPlayer.getPlayer_id() && !grnCard.IsPlayed)
					{
						sbValidIDs.append(grnCard.GetCardID());		
						String ActionList = Game.GetGreenCardActions(grnCard.GetCardID());
						System.out.printf("%-5s%-5s%-40s%-5s%-50s%-5s%-60s\n",grnCard.CardID ,  " : " ,  grnCard.getName() , " : " , ActionList," : ","Scroll Action : "+grnCard.GetActionDescription());

						//System.out.println("Card '" + grnCard.getName() + "' has following actions :");
						//System.out.print(ActionList);
					}
				}

				//Accept Card to play from Player
				String CardID = null;
				while(true)
				{
					System.out.println("Enter a Green Card ID");
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					CardID = br.readLine().toString();
					if((sbValidIDs.toString()).contains(CardID))
					{
						break;
					}
				}
				//Which Action to perform?
				GreenCard grnCard = Game.GetGreenCard(CardID);
				String[] ActionArray = grnCard.GetAction();
				String ActionList = Game.GetGreenCardActions(CardID);
				System.out.println("Card '" + grnCard.getName() + "' has following actions :");
				System.out.println(ActionList);
				boolean actionPerformed = false;				
				for(int i = 0; i<ActionArray.length; i++)
				{
					String ans = null;
					if(i!=ActionArray.length-1 || actionPerformed)
					{
						System.out.println("Do you wish to perform " + ActionArray[i] + " action? Y/N");
						while(true)
						{						
							ans = BR.readLine();
							if(ans.equalsIgnoreCase("Y") || ans.equalsIgnoreCase("N"))
							{
								break;
							}
							else
								System.out.println("Incorrect input. Please try again.");
						}
					}
					else
					{
						System.out.println("Performing action "+ ActionArray[i]);
						ans="Y";
					}
					if(ans.equalsIgnoreCase("Y"))
					{
						actionPerformed = true;
						//Does a Player wish to interrupt? //TO DO
						//If Yes : Which Player wants to interrupt?
						//Perform Action
						success = objPlayer.PerformCardAction(ActionArray[i], CardID);

					}
					else
						continue;
				}

				if(success)
				{							
					//Set Current card as 'Played'
					Game.SetGreenCardIsPlayed(CardID, true);
					//Get number of Green Crads available with Player
					int CardsInHand = Game.GetPlayerGreenCardCount(objPlayer.getPlayer_id());

					//Pick as many cards from deck so that the Player holds 5 Cards
					for(int i=0; i< 5 - CardsInHand;i++)
					{
						//Pick a GreenCardFromDeck
						String PickNewCardID = Game.GetRandomGreenCardFromDeck();
						Game.SetGreenCardToPlayer(PickNewCardID, objPlayer.getPlayer_id());
					}
				}
				else
				{
					System.out.println("Opss! Acion failed. Please try again.");
				}

			}					
		}
	}


}

