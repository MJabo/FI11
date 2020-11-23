package onlineKaufhaus;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

public class Controller {

	private GUI grafik;
	private Artikel artikel;
	private ArrayList<Artikel> listArtikel;
	private DefaultListModel<Artikel> defListArtikel;
	private  DateiHandler dateiHandler;
	private ActionListener wareAnzeigen;
	
	public ArrayList<Artikel> getListArtikel() {
		return listArtikel;
	}

	public void setListArtikel(ArrayList<Artikel> listArtikel) {
		this.listArtikel = listArtikel;
	}

	public Controller()
	{
		grafik = new GUI();		
		artikel = new Artikel();
		dateiHandler = new DHIO();
	
		LogoEinfuegen();
		Produktadd();
	}

	private void LogoEinfuegen() {
		
		ImageIcon imageIcon = new ImageIcon("src/onlineKaufhaus/Logo.jpg");
		imageIcon.setImage(imageIcon.getImage().getScaledInstance(274, 71, Image.SCALE_DEFAULT));
		grafik.getLblBild().setIcon(imageIcon);

	}
	
	private void Produktadd()
	{
		listArtikel = dateiHandler.dateilesen(listArtikel,"src/onlineKaufhaus/Ware");
		defListArtikel = new DefaultListModel();
		for(Artikel s:listArtikel)
		{
			defListArtikel.addElement(s);
			System.out.println("Hallo");
		}
		grafik.getListWarehouse().setModel(defListArtikel);
	}
}
