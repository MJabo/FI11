package tankstelle;

import java.util.*;

import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;

public class Controller {
	
	
	private ActionListener preis;
	private Einstellung create;
	private Anzeige anzeige;
	private SmartphoneApp app;
	private Zapfsauule zapf;
	private DefaultComboBoxModel<Tankpreis> listTankpreis = new DefaultComboBoxModel<>();
	
	public Controller()
	{
		create = new Einstellung();
		anzeige = new Anzeige();
		app = new SmartphoneApp();
		zapf = new Zapfsauule();
		BenzinpreisListener temppreis = new BenzinpreisListener();
		
		
		spritErstellen();
		startpreis();
		
		//Verbindung zu List und Combobox erstellen
		create.getComboBoxSprit().setModel(listTankpreis);
		zapf.getComboBoxSpritsorte().setModel(listTankpreis);
		
		
		create.getComboBoxSprit().addActionListener(e -> slideSpritFestlegen()); //Erstes anzeigen der festgelegten kosten		
		//create.getSliderSprit().addChangeListener(e-> preisfestlegen((Tankpreis)create.getComboBoxSprit().getSelectedItem(), create.getSliderSprit().getValue()));// kürzere Version
		
		zapf.getTextField().setText("0");
		
		
		zapf.getButtonTanken().addMouseListener(new MouseAdapter() {
			
			
			
			@Override
			public void mousePressed(MouseEvent e)
			{
				double tank = Double.parseDouble((zapf.getTextField().getText()));
				tank = tank + 0.1;
				zapf.getTextField().setText(Double.toString(tank));
				
			}
		});
		create.getSliderSprit().addChangeListener(temppreis);		
	}
	
	
	class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			
			
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			//zapf.getTextField().setText((0.1));
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	public void spritErstellen()
	{
		listTankpreis.addElement(new Tankpreis("Diesel",1.09));
		listTankpreis.addElement(new Tankpreis("Super",1.29));
		listTankpreis.addElement(new Tankpreis("SuperE10",1.35));
	}
	
	
	public void slideSpritFestlegen()//Preis wird noch automatisch auf ! € gesetzt
	{
		Tankpreis tempdat = (Tankpreis) create.getComboBoxSprit().getSelectedItem();
		create.getSliderSprit().setValue((int) (tempdat.getPreis() * 100));
	}
	
	class BenzinpreisListener implements ChangeListener
	{

		@Override
		public void stateChanged(ChangeEvent e) {
			preisfestlegen((Tankpreis)create.getComboBoxSprit().getSelectedItem(), create.getSliderSprit().getValue());
			// Slider => Integer
			// Preis in Cent angeben und durch 100 teilen!
			
		}
		
	}
	
	
	
	public void startpreis()
	{
		anzeige.getTextFieldTankDiesel().setText(Double.toString(listTankpreis.getElementAt(0).getPreis()));
		app.getTextFieldAppDiesel().setText(Double.toString(listTankpreis.getElementAt(0).getPreis()));
		
		
		anzeige.getTextFieldTankSuper().setText(Double.toString(listTankpreis.getElementAt(1).getPreis()));
		app.getTextFieldSuper().setText(Double.toString(listTankpreis.getElementAt(1).getPreis()));
		
		
		anzeige.getTextFieldTankSuperE10().setText(Double.toString(listTankpreis.getElementAt(2).getPreis()));
		app.getTextFieldSuperE10().setText(Double.toString(listTankpreis.getElementAt(2).getPreis()));
	}
	
	public void preisfestlegen(Tankpreis auswahl,double preis)
	{
			
		auswahl.setPreis(preis/100);
		if(auswahl.getSprit() == "Diesel")
		{
			
			anzeige.getTextFieldTankDiesel().setText(Double.toString(auswahl.getPreis()));
			app.getTextFieldAppDiesel().setText(Double.toString(auswahl.getPreis()));
		}
		else if(auswahl.getSprit() == "Super")
		{
			anzeige.getTextFieldTankSuper().setText(Double.toString(auswahl.getPreis()));
			app.getTextFieldSuper().setText(Double.toString(auswahl.getPreis()));
		}
		else if(auswahl.getSprit() == "SuperE10")
		{
			anzeige.getTextFieldTankSuperE10().setText(Double.toString(auswahl.getPreis()));
			app.getTextFieldSuperE10().setText(Double.toString(auswahl.getPreis()));
		}
		
		create.getTextFieldPreisProLiter().setText(Double.toString(auswahl.getPreis()));
	}
}
