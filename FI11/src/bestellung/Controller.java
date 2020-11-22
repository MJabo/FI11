package bestellung;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class Controller {

	private ActionListener entfernen;
	private ActionListener hinzufuegen;
	private PizzaBestellung pizzaBestellung; //GUI
	
	private DefaultComboBoxModel<PizzaSorte> dcmPizza = new DefaultComboBoxModel<>();
	private DefaultComboBoxModel<Groesse> dcmGroesse = new DefaultComboBoxModel<>();
	private DefaultComboBoxModel<Extras> dcmExtras = new DefaultComboBoxModel<>();
	
	
	private DefaultListModel<Bestellung> listbestellung = new DefaultListModel<>();
	
	public Controller()
	{	
		pizzaBestellung = new PizzaBestellung();
		
		hinzufuegen = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				hinzufuegen();	
			}
		};
		
		
		entfernen = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				entfernen();	
			}
		};
		
		
		
		
		
		
		//pizzaBestellung.getBtnNewButtonEntfernen().addActionListener(entfernen);
		//pizzaBestellung.getBtnNewHinzufuegen().addActionListener(hinzufuegen);
		
		pizzaDateiLesen();
		generateMethods();
		generateSelection();
		generateConaction();
		
		
	}
	
	/*
	 * for(PizzaSorte p : "listPizza") //listPizza kann array oder List<> Objekt  ausﬂer DefaultModel();
	 * {
	 * 
	 * }
	 */
	
	public void pizzaDateiLesen()
	{
		try
		{
			String zeile = null;
			BufferedReader in = new BufferedReader(new FileReader("src/bestellung/Pizzasorten"));
			
			try
			{
				while((zeile = in.readLine()) != null) // lesen einer Zeile bis \n
				{
					String [] splited = zeile.split(";");
					dcmPizza.addElement(new PizzaSorte(splited[0],Double.parseDouble(splited[2])));
					
				}
				
			}
			catch(Exception e)
			{
				System.out.println("Zeile konnte nicht gesplitted werden!");
			}
			finally
			{
				in.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("Datei wurde nicht gefunden!");
		}
	}
	
	public void generateMethods()
	{
		pizzaBestellung.setHinzufuegenListener(hinzufuegen);
		pizzaBestellung.setEntfernenListener(entfernen);
	}
	
	public void generateConaction()
	{
		pizzaBestellung.getComboBoxPizza().setModel(dcmPizza);
		pizzaBestellung.getComboBoxGroesse().setModel(dcmGroesse);
		pizzaBestellung.getComboBoxExtras().setModel(dcmExtras);
		pizzaBestellung.getListWarenkorb().setModel(listbestellung);
	}
	
	public void generateSelection()
	{
		/*
		dcmPizza.addElement(new PizzaSorte("Schinken", 8.50));
		dcmPizza.addElement(new PizzaSorte("assf", 8.50));
		dcmPizza.addElement(new PizzaSorte("Sdsfg", 8.50));
		dcmPizza.addElement(new PizzaSorte("shASRT", 8.50));
		*/
		
		dcmGroesse.addElement(new Groesse("Klein", -1));
		dcmGroesse.addElement(new Groesse("Mittel", 0));
		dcmGroesse.addElement(new Groesse("Groﬂ", 2));
		
		dcmExtras.addElement(new Extras("---",0.00));
		dcmExtras.addElement(new Extras("K‰se", 0.50));
		dcmExtras.addElement(new Extras("Schinken", 0.50));
		dcmExtras.addElement(new Extras("Pilze",0.50));
	}

	public void entfernen()
	{
		try
		{
			Bestellung bestellung = (Bestellung) pizzaBestellung.getListWarenkorb().getSelectedValue();			
			listbestellung.removeElement(bestellung);
			pizzaBestellung.getTextFieldGesamtpreis().setText(bestellung.stonieren(bestellung) + "");
		}
		catch(Exception e)
		{
			System.out.println("Fehler");
		}
	}
	
	public void hinzufuegen()
	{
		try
		{
			PizzaSorte p = (PizzaSorte) pizzaBestellung.getComboBoxPizza().getSelectedItem();
			Groesse g = (Groesse) pizzaBestellung.getComboBoxGroesse().getSelectedItem();	
			Extras e = (Extras) pizzaBestellung.getComboBoxExtras().getSelectedItem() ;
			
			Bestellung bestellung = new Bestellung(p,g,e);
			listbestellung.addElement(bestellung);
			pizzaBestellung.getTextFieldGesamtpreis().setText(bestellung.getGesamtPreis() + "");
		}
		catch(Exception e)
		{
			System.out.println("Fehler");
		}
	}
	
	

	
	
	
	
	
	
	
}
