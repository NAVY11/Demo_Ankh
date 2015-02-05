/*
 * 
 */
package ViewFile;

/* JEditorPaneSave.java
 * Copyright (c) 2014, HerongYang.com, All Rights Reserved.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.AbstractButton;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;

/**
 * The Class SaveFileAmbg.
 */
public class SaveFileAmbg implements ActionListener {
   
   /** The my frame. */
   JFrame myFrame = null;
   
   /** The my pane. */
   JEditorPane myPane = null;
   
   /** The before saving frame. */
   JFrame beforeSavingFrame = null;
   
   /** The before saving pane. */
   JEditorPane beforeSavingPane = null;

   /**
    * Viewer.
    *
    * @param dataToView the data to view
    */
   public void ViewerBeforeSaving(String dataToView) {
	  beforeSavingFrame = new JFrame("Ankh_Morpork Saving Fomat");
	  beforeSavingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  beforeSavingFrame.setSize(900,800);
      
	  beforeSavingPane = new JEditorPane();
	  beforeSavingPane.setContentType("text/plain");
	  beforeSavingPane.setText(dataToView);
      beforeSavingFrame.setContentPane(beforeSavingPane);

      JScrollPane JScrollBar = new JScrollPane(beforeSavingPane);
      beforeSavingFrame.setContentPane(JScrollBar);

      JMenuBar myBar = new JMenuBar();
      JMenu myMenu = getFileMenuBeforeSaving();
      myBar.add(myMenu); 
      beforeSavingFrame.setJMenuBar(myBar);
      beforeSavingFrame.setVisible(true);
   }
   
   public void Viewer(String dataToView) {
	      myFrame = new JFrame("Ankh_Morpork View Game State");
	      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      myFrame.setSize(900,800);
	      
	      myPane = new JEditorPane();
	      myPane.setContentType("text/plain");
	      myPane.setText(dataToView);
	      myFrame.setContentPane(myPane);

	      JScrollPane JScrollBar = new JScrollPane(myPane);
	      myFrame.setContentPane(JScrollBar);

	      JMenuBar myBar = new JMenuBar();
	      JMenu myMenu = getFileMenu();
	      myBar.add(myMenu); 
	      myFrame.setJMenuBar(myBar);
	      myFrame.setVisible(true);
	   }
   
   /**
    * Gets the file menu.
    *
    * @return the file menu
    */
   private JMenu getFileMenu() {
      JMenu myMenu = new JMenu("File");
      
      JMenuItem myItem = new JMenuItem("Exit");
      myItem.addActionListener(this);
      myMenu.add(myItem);
      /*
      
      myItem = new JMenuItem("Edit");
      myItem.addActionListener(this);
      myMenu.add(myItem);
      
      
      myItem = new JMenuItem("Save & Exit");
      myItem.addActionListener(this);
      myMenu.add(myItem);
      */
      
      return myMenu;
   }
   
   private JMenu getFileMenuBeforeSaving() {
	      JMenu myMenu = new JMenu("File");
	      
	      JMenuItem myItem = new JMenuItem("Exit");
	      myItem.addActionListener(this);
	      myMenu.add(myItem);
	    
	      myItem = new JMenuItem("Save & Exit");
	      myItem.addActionListener(this);
	      myMenu.add(myItem);
	      
	      return myMenu;
	   }
   
   /* (non-Javadoc)
    * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
    */
   public void actionPerformed(ActionEvent e) {
      String cmd = ((AbstractButton) e.getSource()).getText();
      try {
         if (cmd.equals("Open")) {
            FileReader in = new FileReader("JEditorPane.txt");
            char[] buffer = new char[1024];
            int n = in.read(buffer);
            String text = new String(buffer, 0, n);
            myPane.setText(text);
            in.close();
         } else if (cmd.equals("Save & Exit")) {
        	beforeSavingFrame.setVisible(false);
            JFileChooser chooser = new JFileChooser();
    	    chooser.setCurrentDirectory(new File("/home/me/Documents"));
    	    int retrival = chooser.showSaveDialog(null);
    	    if (retrival == JFileChooser.APPROVE_OPTION) {
    	        try {
    	            FileWriter fw = new FileWriter(chooser.getSelectedFile()+".ambg");
    	            fw.write(beforeSavingPane.getText().toString());
    	            fw.close();
    	        } catch (Exception ex) {
    	            ex.printStackTrace();
    	        }
    	    }
         } else if (cmd.equals("Exit")){
        	 myFrame.setVisible(false);
         }
      } catch (Exception f) {
      	 f.printStackTrace();
      }
   }
}