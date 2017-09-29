package utilerias;

import java.awt.Point;

import javax.swing.JLabel;

import laminas.Imagen;

public class ImagenPositionerTool {
	private Point originalPosition;
	private JLabel lbl;

	public ImagenPositionerTool(Point originalPosition, JLabel lbl) {
		super();
		this.originalPosition = originalPosition;
		this.lbl = lbl;
	}
	
	public void inferioX(int x) {
		if (x < 0) {
			lbl.setLocation(originalPosition);
			updateCoordinates();
		}
	}



	public void superiorX(int x, int limit) {
		if(x>limit){
			lbl.setLocation(originalPosition);
			updateCoordinates();
		}
	}

	public void superiorY(int y, int limit) {
		if(y>limit){
			lbl.setLocation(originalPosition);
			updateCoordinates();
		}
	}

	public void inferiorY(int y) {
		if (y < 0) {
			lbl.setLocation(originalPosition);
			updateCoordinates();
		}
	}

	
	private void updateCoordinates() {
		Imagen.xpos=originalPosition.x;
		Imagen.ypos=originalPosition.y;
	}

}
