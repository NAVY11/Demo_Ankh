/*
 * 
 */
package ankhmorpork;
import java.applet.Applet;
import java.awt.event.*;
import java.awt.image.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.awt.*;
import java.io.*;

// TODO: Auto-generated Javadoc
/**
 * The Class BufferPanel.
 */
public class BufferPanel extends Container {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The background. */
	Image background;
	
	/**
	 * Instantiates a new buffer panel.
	 */
	BufferPanel() {}
	
	/* (non-Javadoc)
	 * @see java.awt.Container#update(java.awt.Graphics)
	 */
	public void update(Graphics g) {
		paint(g);
	}
	
	/* (non-Javadoc)
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	public void paint(Graphics g) {
		super.paint(g); 
	}
}