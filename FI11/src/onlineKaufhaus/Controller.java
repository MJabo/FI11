package onlineKaufhaus;

import java.util.*;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class Controller {

	private ActionListener auswaehlen;
	private ActionListener entfernen;
	
	private GUI grafik;
	
	private Artikel artikel;
	private ArrayList<Artikel> listArtikel;
	private DefaultListModel<Artikel> defListArtikel;
	private DefaultListModel<Artikel> auswahl = new DefaultListModel<>();
	
	//private ArrayList<Artikel> listauswahl = new ArrayList<>();
	
	private  DateiHandler dateiHandler;
	private ActionListener wareAnzeigen;
	
	public ArrayList<Artikel> getListArtikel() {
		return listArtikel;
	}

	public void setListArtikel(ArrayList<Artikel> listArtikel) {
		this.listArtikel = listArtikel;
	}
	
	public DefaultListModel<Artikel> getAuswahl() {
		return auswahl;
	}

	/*
	public void setAuswahl(DefaultListModel<Artikel> auswahl) {
		this.auswahl = auswahl;
	}
	*/
	public Controller()
	{
		grafik = new GUI();		
		artikel = new Artikel();
		dateiHandler = new DHIO();
		
		
	
		LogoEinfuegen();
		Produktadd();
		grafik.getBtnNewButtonAddWare().addActionListener(e -> auswahlHinzufuegen(grafik.getListWarehouse().getSelectedValuesList()));
		grafik.getBtnNewButtonCancelWare().addActionListener(e -> auswahlEntfernen(grafik.getListShoppingCart().getSelectedValuesList()));
		grafik.getButtonSubmitOrder().addActionListener(e -> Produktsave());
		
		
	}
	
	private void auswahlEntfernen(List artikel)
	{
		try
		{
			List<Artikel> tempArtikel = (List<Artikel>) artikel;
			
			//System.out.println(tempArtikel);
		
			for(Artikel s: tempArtikel)
			{
				auswahl.removeElement(s);
				//System.out.println(s);
			}
			grafik.getListShoppingCart().setModel(auswahl);
		}
		catch(Exception ex)
		{
			System.out.println("Ware konnte nicht gelöscht werden");
		}
	}
	
	private void auswahlHinzufuegen(List artikel)
	{
		try
		{
			List<Artikel> tempArtikel = (List<Artikel>) artikel;
			//System.out.println(tempArtikel);
			grafik.getListShoppingCart().setModel(auswahl);
			for(Artikel s: tempArtikel)
			{
				auswahl.addElement(s);	
				//System.out.println(s);
			}
				
		}
		catch(Exception ex)
		{
			System.out.println("konnte nicht in den Warenkorb eingefügt werden");
		}
	}

	private void LogoEinfuegen() {
		
		ImageIcon imageIcon = new ImageIcon("src/onlineKaufhaus/Logo.jpg");
		imageIcon.setImage(imageIcon.getImage().getScaledInstance(274, 71, Image.SCALE_DEFAULT));
		grafik.getLblBild().setIcon(imageIcon);

	}
	
	private void Produktadd()
	{
		listArtikel = dateiHandler.dateilesen("src/onlineKaufhaus/Ware");
		try
		{
			defListArtikel = new DefaultListModel();
			for(Artikel s:listArtikel)
			{
				defListArtikel.addElement(s);
			}
			grafik.getListWarehouse().setModel(defListArtikel);
		}
		catch(Exception ex)
		{
			System.out.println("Liste konnte nicht erstellt werden");
		}
	}
	
	private void Produktsave() // Auswahl zur Abspeicherung
	{
		if(auswahl.isEmpty() == false && grafik.getTextFieldKundenname().getText().length() != 0)
		{
			JFileChooser chooser = new JFileChooser("C:\\Users\\Chris\\Desktop\\Java\\Kaufhauskunde");
			dateiHandler.dateiSchreiben(chooser.getCurrentDirectory().toString(),auswahl,grafik.getTextFieldKundenname().getText());
			chooser.showOpenDialog(null);
		
			
		}
		else
		{
			System.out.println("der Wahrenkorb ist leer!");
		}
		
		
	}


}
