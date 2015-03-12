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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.ParseException;

import ViewFile.DisplayViewFile;
import ViewFile.ViewFileTxt;
import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.*;
import ankhmorpork.GameObjects.Cards.GreenCard;
import ankhmorpork.GameLoad.*;


// TODO: Auto-generated Javadoc
/**
 * The Class discworldboard.
 */
public class discworldboard extends Component {
	
	private int Width  = 1200;
	//yogesh
	private int Height = 900;
	
	private discworld discworld;
	private static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	static final Frame quit = new Frame("Are you sure?");
	
	public boolean rolled = false;
	
		private int Dice1 = 0;


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
	public int StartingPlayer(int noOfPlayers)
	{
		return (int)(Math.random()*noOfPlayers + 1);
	}
	/**
	 * View game state.
	 *
	 * @param lstPlayers the lst players
	 */
	public void ViewGameState(Game AnkhMorpork){
		String viewStateData = ViewFileTxt.ViewState(AnkhMorpork);
		DisplayViewFile abc = new DisplayViewFile();
		abc.Viewer(viewStateData);
	}
	
	/**
	 * Save game.
	 *
	 * @param objFileWriter the obj file writer
	 * @param PlayedGame the played game
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws JSONException the JSON exception
	 */
	public void SaveGame(FileWriter objFileWriter, Game PlayedGame) throws IOException, JSONException{
		GameSave.SaveGame(objFileWriter, PlayedGame);
	}
	
	public static JSONObject LoadingBeforeSavingInfo(Game PlayedGame) throws IOException, JSONException{
		return GameSave.jsonObjectWhileSavingGame(PlayedGame);
	}
	
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
	 * @param AnkhMorpork the ankh morpork
	 * @throws IOException 
	 */
	public void InitialiseGame(int iNoOfPlayers, Game AnkhMorpork) throws IOException
	{					
		String[] Players = new String[10];
		String[] Colors = new String[10];
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		for(int i=1;i<=iNoOfPlayers;i++)
		{
		Players[i]= JOptionPane.showInputDialog("Please input Name for Player:" + i);
		Colors[i] = JOptionPane.showInputDialog("Please input Color for Player:" + i);
		}
	
		GameStart.StartNewGame(Players, Colors, iNoOfPlayers, AnkhMorpork);
		ViewFileTxt viewFileText = new ViewFileTxt();
		String currentPlayer = viewFileText.currentPlayerPlaying(AnkhMorpork.lstPlayers);
		System.out.println("The current Player Playing is player "+ currentPlayer);
		
		//Get Starting Player randomly
		int CurrentPlayer = StartingPlayer(iNoOfPlayers);
		System.out.println("Player "+ CurrentPlayer + " starts game");
		boolean GameEnds = false;
		
		while(!GameEnds)
		{
		//Show Board
		ViewFileTxt.ViewState(AnkhMorpork);        
		//Play Game						
		//Load Player details
		Player objPlayer = Game.lstPlayers.get(CurrentPlayer - 1);
		
		//********Which Card to Play?
		System.out.println("Which card to play?");
		
		//Show available cards
		StringBuilder sbValidIDs = new StringBuilder();
		for(GreenCard grnCard: Game.lstGreenCards)
		{	
			if(grnCard.getPlayerID()==objPlayer.getPlayer_id())
			{
				sbValidIDs.append(grnCard.GetCardID());			
				System.out.println(grnCard.CardID + " : " + grnCard.getName());
			}
		}
		
		//Accept Card to play from Player
		String CardID = null;
		while(true)
		{
			System.out.println("Enter a valid Card ID");
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
				System.out.println("Card " + grnCard.getName() + " has following actions :");
				System.out.println(ActionList);
				for(int i = 0; i<ActionArray.length; i++)
				{
					String ans = null;
					System.out.println("Do you wish to perform " + ActionArray[i] + " action? Y/N");
					while(true)
					{						
						ans = BR.readLine();
						if(ans=="Y" || ans=="N")
						{
							break;
						}
						else
							System.out.println("Incorrect input. Please try again.");
					}
					
					if(ans == "Y")
					{
						//Perform Action
						objPlayer.PerformCardAction(ActionArray[i], CardID);
						
					}
					else
						continue;
				}
					//Does a Player wish to interrupt?
						//If Yes : Which Player wants to interrupt?
							//Play Game		
		}
	}
	
	
	

	//start a new game
	/**
	 * New.
	 */
	public void New() {
		final Frame a = new Frame();
		final TextField tf1 = new TextField("Player 1", 20 );
		final TextField tf2 = new TextField("Player 2", 20 );
		final Button b = new Button( "Save Game");
		a.setSize( 800, 200 );
		a.setBackground( Color.lightGray );
		a.setLayout( new FlowLayout(FlowLayout.CENTER) );
		a.add( tf1);
		a.add( b );
		a.add( tf2 );
		a.setVisible( true );

		a.addWindowListener( new WindowAdapter() {
			public void windowClosing( WindowEvent e ) {
				a.setVisible( false );
				repaint();
			}
		});
		repaint();
	}
	
}

