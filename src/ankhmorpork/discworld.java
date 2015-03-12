/*
 * 
 */
package ankhmorpork;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.ParseException;

import PresentationUtilityCommon.PresentationUtility;
import ViewFile.DisplayViewFile;
import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.Player;

// TODO: Auto-generated Javadoc
/**
 * The Class discworld.
 */
public class discworld extends Applet implements ActionListener, WindowListener {
	
	
	/** The Ankh morpork. */
	Game AnkhMorpork = new Game();
	
	private static final long serialVersionUID = 1L;
	
	/** The Ankhmorpork frame. */
	static Frame AnkhmorporkFrame = new Frame( " Ank Morpork " );
	
	static discworldboard discworldboard = new discworldboard( );
	
	static final DoubleBufferPanel doublebufferpane = new DoubleBufferPanel();
	
	static final BufferPanel bufferpane = new BufferPanel();
	
	static final Frame initframe = new Frame();
	
	private Button Roll  = new Button( "Roll Dice" );

	static final Button start2 = new Button( "Two Player" );		
	
	static final Button start3 = new Button( "Three Player" );
	
	static final Button start4 = new Button( "Four Player" );
	
	static final Button load = new Button( "Load Game!" );
	
	static final Button Quit = new Button ("Close");
	
	static final Button Exit = new Button ("Exit Game"); 
	
	static final Button ViewState = new Button ("View State"); 
	
	static final Button Save = new Button ("Save Game"); 
	
	static final Button Info = new Button ("Rules");
	
	Image back;
	
	ArrayList<Integer> initializingBrownCardsArr = null;
	
	ArrayList<Integer> initializingGreenCardsArr = null;
	
	ArrayList<Integer> initializingCityAreaCardsArr = null;
	
	ArrayList<Integer> initializingPersonalityArr = null;
	
	public Boolean isLoadedGameInitialized = false;
	
	/**
	 * The main method.
	 *
	 * @param argv the arguments
	 */


	public static void main(String argv[]) 
    {
    	new discworld();
    }


	public void init() {

		initframe.setSize( 380, 390 );
		initframe.setBackground(new Color( (20), (100), (90) ));
		initframe.setLayout(new FlowLayout(FlowLayout.CENTER));
		initframe.setResizable(false);
		Panel initpanel = new Panel(new GridLayout(0,1));
		initpanel.add(new Label ("            "));
		initpanel.add(new Label ("            "));
		initpanel.add(start2);
		initpanel.add(start3);
		initpanel.add(start4);
		initpanel.add(load);
		initpanel.add(Exit);
		initframe.add(initpanel);
		initframe.setVisible( true );
		
		load.addActionListener(this);
		Exit.addActionListener(this);
		Info.addActionListener(this);
		start2.addActionListener( this );
		start3.addActionListener( this );
		start4.addActionListener( this );
		
		initializingBrownCardsArr = PresentationUtility.initializeAArrayWithValue(53);
		initializingGreenCardsArr = PresentationUtility.initializeAArrayWithValue(48);
		initializingCityAreaCardsArr = PresentationUtility.initializeAArrayWithValue(12);
		initializingPersonalityArr = PresentationUtility.initializeAArrayWithValue(7);
		
		AnkhmorporkFrame.addWindowListener( this );
	}
	
	/* (non-Javadoc)
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	public void paint(Graphics g){
		g.drawImage(back,15,15,this);
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed( ActionEvent e){
			if (e.getSource() == Exit){
				initframe.setVisible(false);    
			}
			
			if (e.getSource() == load){
				
					try {
						JFileChooser chooser = new JFileChooser();
					    chooser.setCurrentDirectory(new File("/home/me/Documents"));
					    int retrival = chooser.showOpenDialog(null);
					    if (retrival == JFileChooser.APPROVE_OPTION) {
					    		
					    		isLoadedGameInitialized = true;
					            FileReader objFileReader = new FileReader(chooser.getSelectedFile());
					            discworldboard.Loadgamefetch(objFileReader);
					            //AnkhMorpork = gameDetails;					            
								int i=1;
								for(Player objPlayer: AnkhMorpork.lstPlayers)
								{		
									System.out.println("Player "+ i + " Details");
									System.out.println("Player ID: "+objPlayer.getPlayer_id()+" Player Name:"+objPlayer.getPlayer_name()+" Player Color:"+objPlayer.getPlayer_color());
									System.out.println("Player ID:"+objPlayer.getPlayer_id()+" Gold Coin Details: "+objPlayer.objGoldCoin.getCoin_Available());
									i++;
								}
								Framebuilder();

					    } 
						
						
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
					
					
			}
					    
			if (e.getSource() == start2 || e.getSource() == start3 || e.getSource() == start4 ){
				//discworldboard = new discworldboard( );
				//Framebuilder();
				if(e.getSource() == start2){
				
					try {
						try {
							discworldboard.InitialiseGame(2);
						} catch (ParseException e1) {
							e1.printStackTrace();
						} catch (JSONException e1) {
							e1.printStackTrace();
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
											
				}else if(e.getSource() == start3){	
				
					try {
						try {
							discworldboard.InitialiseGame(3);
						} catch (ParseException e1) {
							e1.printStackTrace();
						} catch (JSONException e1) {
							e1.printStackTrace();
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				
				}else if(e.getSource() == start4){
				
					try {
						try {
							discworldboard.InitialiseGame(4);
						} catch (ParseException e1) {
							e1.printStackTrace();
						} catch (JSONException e1) {
							e1.printStackTrace();
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
			}
				
				Framebuilder();
				
		}
 		
	}
	
	/** The exit. */
	Button exit = new Button ("<< Return Back");

 		/**
		  * Framebuilder.
		  */
		 public void Framebuilder(){
			
 			initframe.setVisible( false );
 			doublebufferpane.setLayout(new BorderLayout());
 			bufferpane.setLayout( new BorderLayout() );	
 			
			AnkhmorporkFrame.setSize( 2000,1500 );
			
 			AnkhmorporkFrame.setBackground(new Color( (100), (180), (150) ) ); //blue color
 			AnkhmorporkFrame.setLayout( new FlowLayout(FlowLayout.CENTER));
 			AnkhmorporkFrame.add(doublebufferpane );
 			doublebufferpane.add( "Center", bufferpane );
 			bufferpane.add( discworldboard);
 			
 			
 			Panel buttons = new Panel(new GridLayout(0,1));
 									
 					buttons.add(Roll);
 					Roll.addActionListener(new ActionListener() {
 						public void actionPerformed( ActionEvent e ) {
 								if( !discworldboard.rolled ) {
 									discworldboard.Roll();
 								}
 						}});

 					buttons.add(Save);
 					Save.addActionListener(new ActionListener() {
 						public void actionPerformed( ActionEvent e ) {
 							try {
 								if(!(isLoadedGameInitialized)){
	 								JFileChooser chooser = new JFileChooser();
	 							    chooser.setCurrentDirectory(new File("/home/me/Documents"));
	 							    int retrival = chooser.showSaveDialog(null);
	 							    if (retrival == JFileChooser.APPROVE_OPTION) {
	 							        
	 							            FileWriter objFileWriter = new FileWriter(chooser.getSelectedFile()+".txt");
	 							            discworldboard.SaveGame(objFileWriter);
	
	 							    } 
 								}else{
 									//JSONObject infoBeforeSaving = discworldboard.LoadingBeforeSavingInfo();
 									DisplayViewFile abc = new DisplayViewFile();
 									//abc.ViewerBeforeSaving(infoBeforeSaving.toString());
 								}
 							} catch (IOException e1) {
 								// TODO Auto-generated catch block
 								e1.printStackTrace();
 							} catch (JSONException e1) {
 								// TODO Auto-generated catch block
 								e1.printStackTrace();
 							}
 						}});	
 					buttons.add(ViewState);
 					ViewState.addActionListener(new ActionListener() {
 						public void actionPerformed( ActionEvent e ) {
 							discworldboard.ViewGameState();
 						}});
 					buttons.add(Quit);
 					Quit.addActionListener(new ActionListener() {
 						public void actionPerformed( ActionEvent e ) {
 							discworldboard.quit();
 						}});
 						
 								
 					AnkhmorporkFrame.add(buttons);
 					AnkhmorporkFrame.setVisible( true );
 			}

 		 		
	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowClosing(java.awt.event.WindowEvent)
	 */
	public void windowClosing( WindowEvent e ) {
		System.exit( 0 );
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowIconified(java.awt.event.WindowEvent)
	 */
	public void windowIconified( WindowEvent e ) {}
	
	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowClosed(java.awt.event.WindowEvent)
	 */
	public void windowClosed( WindowEvent e ) {}
	
	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowActivated(java.awt.event.WindowEvent)
	 */
	public void windowActivated( WindowEvent e ) {}
	
	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowDeactivated(java.awt.event.WindowEvent)
	 */
	public void windowDeactivated( WindowEvent e ) {}
	
	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowDeiconified(java.awt.event.WindowEvent)
	 */
	public void windowDeiconified( WindowEvent e ) {}
	
	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowOpened(java.awt.event.WindowEvent)
	 */
	public void windowOpened( WindowEvent e ) {}
	
	/* (non-Javadoc)
	 * @see java.awt.Component#processKeyEvent(java.awt.event.KeyEvent)
	 */
	public void processKeyEvent (KeyEvent e) {
		if( e.getKeyChar() =='q' || e.getKeyChar() == 'Q'){
			AnkhmorporkFrame.setVisible (false);
		    System.exit(0);}
		}
}
