package onlineKaufhaus;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Controller {

	private GUI grafik;
	
	public Controller()
	{
		grafik = new GUI();		
		LogoEinfuegen();
		
		
	}

	private void LogoEinfuegen() {
		ImageIcon imageIcon = new ImageIcon("src/onlineKaufhaus/Logo.jpg");
		grafik.getLblBild().setIcon(imageIcon);
	}
}
