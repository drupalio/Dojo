package ventanas;

import java.awt.Dimension;

import javax.swing.JFrame;

import laminas.Principal;
import utilerias.DimensionToolkit;
public class Ventana extends JFrame{
	
	private  Dimension location=DimensionToolkit.manufactureDimension(1, 2);
	/**
	 * 
	 */
	private static final long serialVersionUID = -1011029181330545949L;
	
	public Ventana() {
		setTitle("Elección");
		setSize(DimensionToolkit.manufactureDimension(1, 2));
		int xlocation=DimensionToolkit.calculateXLocation(location,this.getWidth());
		int ylocation=DimensionToolkit.calculateYLocation(location, this.getHeight());
		setLocation(xlocation, ylocation);
		add(new Principal());
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
