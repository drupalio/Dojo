package laminas;

import javax.swing.JPanel;

import utilerias.DimensionToolkit;
import ventanas.Dialog;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3603816740465087662L;
	private Dialog ventanaImagen = new Dialog();
	private Dialog ventanaNombre = new Dialog();

	public Principal() {
		setPreferredSize(DimensionToolkit.manufactureDimension(1, 2));
		setLayout(null);

		JButton btnImagen = new JButton("Imagen");
		JButton btnNombre = new JButton("Nombre");

		btnImagen.setBounds(190, 157, 89, 23);
		btnNombre.setBounds(470, 157, 89, 23);

		add(btnNombre);
		add(btnImagen);

		ventanaImagen.setTitle("Imagen");
		ventanaNombre.setTitle("Nombre");

		ventanaImagen.add(new Imagen());
		Nombre nombrePanel=new Nombre();
		ventanaNombre.add(nombrePanel);

		ventanaImagen.setResizable(false);	
		ventanaImagen.pack();
		ventanaNombre.pack();

		ventanaNombre.addWindowStateListener(new WindowAdapter() {
			@Override
			public void windowStateChanged(WindowEvent ev) {
				int oldState = ev.getOldState();
				int newState = ev.getNewState();
				if ((oldState & JFrame.MAXIMIZED_BOTH) == 0 && (newState & JFrame.MAXIMIZED_BOTH) != 0) {
					nombrePanel.changeColor(Color.RED);
				} else if ((oldState & JFrame.MAXIMIZED_BOTH) != 0 && (newState & JFrame.MAXIMIZED_BOTH) == 0) {
					nombrePanel.changeColor(Color.blue);
				}
			}
		});
		btnImagen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent ev) {
				ventanaImagen.setVisible(true);
			}
		});

		btnNombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent ev) {
				ventanaNombre.setVisible(true);
			}
		});

	}
}
