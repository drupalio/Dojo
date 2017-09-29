package utilerias;

import java.awt.Toolkit;

public class ScreenToolkit {
	private static Toolkit screen = Toolkit.getDefaultToolkit();
	
	public static double getScreenWidth(){
		return screen.getScreenSize().getWidth();
	}
	
	public static double getScreenHeight(){
		return screen.getScreenSize().getHeight();
	}
	
}
