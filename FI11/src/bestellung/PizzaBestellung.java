package bestellung;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PizzaBestellung {

	private JFrame frame;
	private JLabel NewLabelPizza;
	private JLabel lblNewLabel;
	private JComboBox comboBoxPizza;
	private JLabel lNewLabelGrosse;
	private JComboBox comboBoxGroesse;
	private JTextField textField;
	private JList listWarenkorb;
	private JLabel NewLabelGesamtpreis;
	private JTextField textFieldGesamtpreis;
	private JButton NewButtoDrucken;
	private JButton NewButtonHardcopy;
	private JComboBox comboBoxExtras;
	private JButton btnNewHinzufuegen;
	private JButton btnNewButtonEntfernen;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaBestellung window = new PizzaBestellung();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public PizzaBestellung() {
		initialize();
	}
	/*
	 * f
	 * 
	 * 
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 519, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getNewLabelPizza());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getComboBoxPizza());
		frame.getContentPane().add(getLNewLabelGrosse());
		frame.getContentPane().add(getComboBoxGroesse());
		frame.getContentPane().add(getTextField());
		frame.getContentPane().add(getListWarenkorb());
		frame.getContentPane().add(getNewLabelGesamtpreis());
		frame.getContentPane().add(getTextFieldGesamtpreis());
		frame.getContentPane().add(getNewButtoDrucken());
		frame.getContentPane().add(getNewButtonHardcopy());
		frame.getContentPane().add(getComboBoxExtras());
		frame.getContentPane().add(getBtnNewHinzufuegen());
		frame.getContentPane().add(getBtnNewButtonEntfernen());
		frame.setVisible(true);
	}

	private JLabel getNewLabelPizza() {
		if (NewLabelPizza == null) {
			NewLabelPizza = new JLabel("Pizza:");
			NewLabelPizza.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			NewLabelPizza.setBounds(28, 23, 46, 14);
		}
		return NewLabelPizza;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Extras:");
			lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			lblNewLabel.setBounds(28, 55, 46, 14);
		}
		return lblNewLabel;
	}
	protected JComboBox getComboBoxPizza() {
		if (comboBoxPizza == null) {
			comboBoxPizza = new JComboBox();
			comboBoxPizza.setBounds(104, 19, 160, 22);
		}
		return comboBoxPizza;
	}
	private JLabel getLNewLabelGrosse() {
		if (lNewLabelGrosse == null) {
			lNewLabelGrosse = new JLabel("Gr\u00F6\u00DFe");
			lNewLabelGrosse.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			lNewLabelGrosse.setBounds(296, 23, 46, 14);
		}
		return lNewLabelGrosse;
	}
	protected JComboBox getComboBoxGroesse() {
		if (comboBoxGroesse == null) {
			comboBoxGroesse = new JComboBox();
			comboBoxGroesse.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			comboBoxGroesse.setBounds(377, 19, 89, 22);
		}
		return comboBoxGroesse;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(377, 52, 89, 24);
			textField.setColumns(10);
		}
		return textField;
	}
	protected JList getListWarenkorb() {
		if (listWarenkorb == null) {
			listWarenkorb = new JList();
			listWarenkorb.setBounds(28, 88, 330, 111);
		}
		return listWarenkorb;
	}
	protected JLabel getNewLabelGesamtpreis() {
		if (NewLabelGesamtpreis == null) {
			NewLabelGesamtpreis = new JLabel("Gesamtpreis:");
			NewLabelGesamtpreis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			NewLabelGesamtpreis.setBounds(28, 224, 74, 14);
		}
		return NewLabelGesamtpreis;
	}
	protected JTextField getTextFieldGesamtpreis() {
		if (textFieldGesamtpreis == null) {
			textFieldGesamtpreis = new JTextField();
			textFieldGesamtpreis.setBounds(116, 221, 128, 20);
			textFieldGesamtpreis.setColumns(10);
		}
		return textFieldGesamtpreis;
	}
	private JButton getNewButtoDrucken() {
		if (NewButtoDrucken == null) {
			NewButtoDrucken = new JButton("Drucken");
			NewButtoDrucken.setBounds(250, 220, 108, 23);
		}
		return NewButtoDrucken;
	}
	private JButton getNewButtonHardcopy() {
		if (NewButtonHardcopy == null) {
			NewButtonHardcopy = new JButton("Hardcopy");
			NewButtonHardcopy.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			NewButtonHardcopy.setBounds(377, 220, 89, 23);
		}
		return NewButtonHardcopy;
	}
	protected JComboBox getComboBoxExtras() {
		if (comboBoxExtras == null) {
			comboBoxExtras = new JComboBox();
			comboBoxExtras.setBounds(104, 51, 254, 22);
		}
		return comboBoxExtras;
	}
	
	public void setHinzufuegenListener(ActionListener a) 
	{
		getBtnNewHinzufuegen().addActionListener(a); //
	}
	private JButton getBtnNewHinzufuegen() {
		if (btnNewHinzufuegen == null) {
			btnNewHinzufuegen = new JButton("Hinzuf\u00FCgen");
			btnNewHinzufuegen.setBounds(377, 87, 89, 23);
		}
		return btnNewHinzufuegen;
	}
	public void setEntfernenListener(ActionListener a)
	{
		getBtnNewButtonEntfernen().addActionListener(a);
	}
	private JButton getBtnNewButtonEntfernen() {
		if (btnNewButtonEntfernen == null) {
			btnNewButtonEntfernen = new JButton("Entfernen");
			btnNewButtonEntfernen.setBounds(377, 121, 89, 23);
		}
		return btnNewButtonEntfernen;
	}
}
