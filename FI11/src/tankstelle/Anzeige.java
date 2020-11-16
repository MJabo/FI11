package tankstelle;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Anzeige {
	
	//Änderung

	private JFrame frame;
	private JTextField textFieldTankDiesel;
	private JLabel LabelTankDiesel;
	private JTextField textFieldTankSuper;
	private JLabel LabelTankSuper;
	private JTextField textFieldTankSuperE10;
	private JLabel LabelTankSuperE10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Anzeige window = new Anzeige();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Anzeige() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 290, 237);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTextFieldTankDiesel());
		frame.getContentPane().add(getLabelTankDiesel());
		frame.getContentPane().add(getTextFieldTankSuper());
		frame.getContentPane().add(getLabelTankSuper());
		frame.getContentPane().add(getTextFieldTankSuperE10());
		frame.getContentPane().add(getLabelTankSuperE10());
		frame.setVisible(true);
	}
	protected JTextField getTextFieldTankDiesel() {
		if (textFieldTankDiesel == null) {
			textFieldTankDiesel = new JTextField();
			textFieldTankDiesel.setBounds(123, 30, 86, 20);
			textFieldTankDiesel.setColumns(10);
		}
		return textFieldTankDiesel;
	}
	private JLabel getLabelTankDiesel() {
		if (LabelTankDiesel == null) {
			LabelTankDiesel = new JLabel("Diesel");
			LabelTankDiesel.setFont(new Font("Tahoma", Font.PLAIN, 13));
			LabelTankDiesel.setBounds(56, 32, 38, 14);
		}
		return LabelTankDiesel;
	}
	protected JTextField getTextFieldTankSuper() {
		if (textFieldTankSuper == null) {
			textFieldTankSuper = new JTextField();
			textFieldTankSuper.setBounds(123, 80, 86, 20);
			textFieldTankSuper.setColumns(10);
		}
		return textFieldTankSuper;
	}
	private JLabel getLabelTankSuper() {
		if (LabelTankSuper == null) {
			LabelTankSuper = new JLabel("Super");
			LabelTankSuper.setFont(new Font("Tahoma", Font.PLAIN, 13));
			LabelTankSuper.setBounds(56, 83, 38, 14);
		}
		return LabelTankSuper;
	}
	protected JTextField getTextFieldTankSuperE10() {
		if (textFieldTankSuperE10 == null) {
			textFieldTankSuperE10 = new JTextField();
			textFieldTankSuperE10.setBounds(123, 140, 86, 20);
			textFieldTankSuperE10.setColumns(10);
		}
		return textFieldTankSuperE10;
	}
	private JLabel getLabelTankSuperE10() {
		if (LabelTankSuperE10 == null) {
			LabelTankSuperE10 = new JLabel("SuperE10");
			LabelTankSuperE10.setFont(new Font("Tahoma", Font.PLAIN, 13));
			LabelTankSuperE10.setBounds(39, 143, 55, 14);
		}
		return LabelTankSuperE10;
	}
}
