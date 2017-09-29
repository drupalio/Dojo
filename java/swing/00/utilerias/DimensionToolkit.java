package utilerias;

import java.awt.Dimension;

public class DimensionToolkit {
	
	public static Dimension manufactureDimension(int slicesX,int slicesY){
		int x=(int) (ScreenToolkit.getScreenHeight()/slicesX);
		int y=(int) (ScreenToolkit.getScreenHeight()/slicesY);
		return new Dimension(x, y);
	}
	
	public static int calculateXLocation(Dimension dimension,int width){
		return dimension.width-(width/2);
	}
	
	public static int calculateYLocation(Dimension dimension,int height ){
		return dimension.height-(height/2);
	}
}
