package tankstelle;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class SmartphoneApp {

	private JFrame frame;
	private JLabel LabelAppDiesel;
	private JTextField textFieldAppDiesel;
	private JLabel LabelAppSuper;
	private JTextField textFieldSuper;
	private JLabel LabelAppSuperE10;
	private JTextField textFieldSuperE10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SmartphoneApp window = new SmartphoneApp();
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
	public SmartphoneApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 233);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLabelAppDiesel());
		frame.getContentPane().add(getTextFieldAppDiesel());
		frame.getContentPane().add(getLabelAppSuper());
		frame.getContentPane().add(getTextFieldSuper());
		frame.getContentPane().add(getLabelAppSuperE10());
		frame.getContentPane().add(getTextFieldSuperE10());
		frame.setVisible(true);
	}

	private JLabel getLabelAppDiesel() {
		if (LabelAppDiesel == null) {
			LabelAppDiesel = new JLabel("Diesel");
			LabelAppDiesel.setBackground(Color.WHITE);
			LabelAppDiesel.setFont(new Font("Tahoma", Font.PLAIN, 17));
			LabelAppDiesel.setBounds(27, 21, 86, 82);
		}
		return LabelAppDiesel;
	}
	protected JTextField getTextFieldAppDiesel() {
		if (textFieldAppDiesel == null) {
			textFieldAppDiesel = new JTextField();
			textFieldAppDiesel.setBounds(27, 120, 86, 20);
			textFieldAppDiesel.setColumns(10);
		}
		return textFieldAppDiesel;
	}
	private JLabel getLabelAppSuper() {
		if (LabelAppSuper == null) {
			LabelAppSuper = new JLabel("Super");
			LabelAppSuper.setBackground(Color.WHITE);
			LabelAppSuper.setFont(new Font("Tahoma", Font.PLAIN, 17));
			LabelAppSuper.setBounds(170, 21, 86, 82);
		}
		return LabelAppSuper;
	}
	protected JTextField getTextFieldSuper() {
		if (textFieldSuper == null) {
			textFieldSuper = new JTextField();
			textFieldSuper.setColumns(10);
			textFieldSuper.setBounds(170, 120, 86, 20);
		}
		return textFieldSuper;
	}
	private JLabel getLabelAppSuperE10() {
		if (LabelAppSuperE10 == null) {
			LabelAppSuperE10 = new JLabel("SuperE10");
			LabelAppSuperE10.setFont(new Font("Tahoma", Font.PLAIN, 17));
			LabelAppSuperE10.setBounds(306, 21, 86, 82);
		}
		return LabelAppSuperE10;
	}
	protected JTextField getTextFieldSuperE10() {
		if (textFieldSuperE10 == null) {
			textFieldSuperE10 = new JTextField();
			textFieldSuperE10.setColumns(10);
			textFieldSuperE10.setBounds(306, 120, 86, 20);
		}
		return textFieldSuperE10;
	}
}
