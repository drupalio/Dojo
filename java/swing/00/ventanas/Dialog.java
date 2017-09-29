 package ventanas;

import java.awt.Dimension;

import javax.swing.JFrame;

import utilerias.DimensionToolkit;

public class Dialog extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2418506233798081446L;
	
	private  Dimension location=DimensionToolkit.manufactureDimension(1, 2);
	public Dialog() {
		setVisible(false);
		int xlocation=DimensionToolkit.calculateXLocation(location,this.getWidth());
		int ylocation=DimensionToolkit.calculateYLocation(location, this.getHeight());
		setLocation(xlocation, ylocation);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
}
