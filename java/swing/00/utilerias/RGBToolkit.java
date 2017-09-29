package utilerias;

import java.awt.Color;

import javax.swing.JOptionPane;

public class RGBToolkit {
	
	public static int isValid(String value){
		try {
			int numero=Integer.parseInt(value);
			if(numero<=255){
				return numero;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No es un numero  valido \n"+e);
		}
		return 255;
	}
	public static Color createColor(int r,int g,int b){
		return new Color(r, g, b);
	}
}
