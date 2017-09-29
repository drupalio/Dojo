package laminas;

import javax.swing.JPanel;
import javax.swing.JTextField;

import utilerias.RGBToolkit;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Nombre extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2473301576299874371L;
	private JTextField txtRojo;
	private JTextField txtVerde;
	private JTextField txtAzul;
	private int r=0;
	private int g=0;
	private int b=0;
	public Nombre() {
		setLayout(null);
		setBackground(Color.red);
		setPreferredSize(new Dimension(480, 357));
		txtRojo = new JTextField();
		txtVerde = new JTextField();
		txtAzul = new JTextField();
		JLabel lblRojo = new JLabel("Rojo");
		JLabel lblVerde = new JLabel("Verde");
		JLabel lblAzul = new JLabel("Azul");
		JLabel lblUrielWong = new JLabel("Uriel Mendoza");
		
		txtRojo.setBounds(38, 233, 86, 20);
		txtVerde.setBounds(201, 233, 86, 20);
		txtAzul.setBounds(380, 233, 86, 20);
		lblRojo.setBounds(37, 208, 46, 14);
		lblVerde.setBounds(201, 208, 46, 14);
		lblAzul.setBounds(380, 208, 46, 14);
		lblUrielWong.setBounds(145, 53, 197, 44);
		

		lblUrielWong.setFont(new Font("Arial", Font.PLAIN, 30));
		Color baseColor=new Color(r, g, b);
		lblUrielWong.setForeground(baseColor);
		
		txtRojo.setColumns(3);
		txtVerde.setColumns(3);
		txtAzul.setColumns(3);
		
		txtRojo.setText(String.valueOf(r));
		txtVerde.setText(String.valueOf(g));
		txtAzul.setText(String.valueOf(b));
		
		add(txtRojo);
		add(txtVerde);
		add(txtAzul);
		add(lblRojo);
		add(lblVerde);
		add(lblAzul);		
		add(lblUrielWong);
		
		
		txtRojo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				r=RGBToolkit.isValid(txtRojo.getText());
				lblUrielWong.setForeground(RGBToolkit.createColor(r, g, b));
				txtRojo.setText(String.valueOf(r));
			}
		});
		
		txtRojo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtRojo.setText("");
			}
		});
		
		txtVerde.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent ev) {
				g=RGBToolkit.isValid(txtVerde.getText());
				lblUrielWong.setForeground(RGBToolkit.createColor(r, g, b));
				txtVerde.setText(String.valueOf(g));
			}
		});
		
		txtVerde.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtVerde.setText("");
			}
		});
		
		
		txtAzul.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent ev) {
				b=RGBToolkit.isValid(txtAzul.getText());
				lblUrielWong.setForeground(RGBToolkit.createColor(r, g, b));
				txtAzul.setText(String.valueOf(b));
			}
		});
		
		txtAzul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAzul.setText("");
			}
		});
	}
	
	public void changeColor(Color c){
		this.setBackground(c);
	}
}
