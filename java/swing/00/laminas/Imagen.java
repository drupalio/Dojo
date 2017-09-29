package laminas;

import javax.swing.JPanel;

import utilerias.ImagenPositionerTool;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class Imagen extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7059829807401164590L;
	public static int xpos;
	public static int ypos;
	private int sizex=412;
	private int sizey=357;
	public Imagen() {
		setLayout(null);
		setPreferredSize(new Dimension(sizex, sizey));
		JButton btnArriba = new JButton("Arriba");
		JButton btnAbajo = new JButton("Abajo");
		JButton btnDerecha = new JButton("Derecha");
		JButton btnIzquierda = new JButton("Izquierda");
		
		btnArriba.setBounds(165, 334, 89, 23);
		btnAbajo.setBounds(165, 277, 89, 23);
		btnDerecha.setBounds(260, 307, 89, 23);
		btnIzquierda.setBounds(65, 307, 89, 23);
		
		add(btnArriba);
		add(btnAbajo);
		add(btnDerecha);
		add(btnIzquierda);
		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon(Imagen.class.getResource("/media/success.png")));
		lblImg.setBounds(100, 45, 232, 235);
		add(lblImg);
		
		ImagenPositionerTool positioner=new ImagenPositionerTool(lblImg.getLocation(),lblImg);
		
		
		
		
		
		xpos=lblImg.getLocation().x;
		ypos=lblImg.getLocation().y;
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(Imagen.class.getResource("/media/texture.jpg")));
		bg.setBounds(0, 0, sizex, sizey);
		add(bg);
		
		btnDerecha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblImg.setLocation(xpos+=10,ypos);
				positioner.superiorX(xpos, sizex);
				e.getComponent().repaint();
			}
		});
		
		btnAbajo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblImg.setLocation(xpos,ypos+=10);
				positioner.superiorY(ypos, sizey);
				e.getComponent().repaint();
			}
		});
		
		btnIzquierda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblImg.setLocation(xpos-=10,ypos);
				positioner.inferioX(xpos);
				e.getComponent().repaint();
			}
		});
		btnArriba.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblImg.setLocation(xpos,ypos-=10);
				positioner.inferiorY(ypos);
				e.getComponent().repaint();
			}
		});
	}
}
