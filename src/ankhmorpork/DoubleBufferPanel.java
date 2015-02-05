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
 * The Class DoubleBufferPanel.
 */
public class DoubleBufferPanel extends Panel {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The offscreen. */
	Image offscreen;
	
	/* (non-Javadoc)
	 * @see java.awt.Container#invalidate()
	 */
	public void invalidate() {
		super.invalidate();
		offscreen = null;
	}
	
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
		if(offscreen == null) {
			offscreen = createImage(getSize().width, getSize().height);
		}
		Graphics og = offscreen.getGraphics();
		og.setClip(0,0,getSize().width, getSize().height);
		super.paint(og);
		g.drawImage(offscreen, 0, 0, null);
		og.dispose();
	}
}
