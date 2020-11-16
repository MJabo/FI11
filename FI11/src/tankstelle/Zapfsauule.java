package tankstelle;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Zapfsauule {

	private JFrame frame;
	private JLabel LabelZapfsauule;
	private JComboBox comboBoxSpritsorte;
	private JTextField textField;
	private JButton ButtonTanken;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zapfsauule window = new Zapfsauule();
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
	public Zapfsauule() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 319, 189);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLabelZapfsauule());
		frame.getContentPane().add(getComboBoxSpritsorte());
		frame.getContentPane().add(getTextField());
		frame.getContentPane().add(getButtonTanken());
		frame.setVisible(true);
	}
	private JLabel getLabelZapfsauule() {
		if (LabelZapfsauule == null) {
			LabelZapfsauule = new JLabel("Zapfs\u00E4ule1");
			LabelZapfsauule.setFont(new Font("Tahoma", Font.PLAIN, 15));
			LabelZapfsauule.setBounds(21, 25, 98, 29);
		}
		return LabelZapfsauule;
	}
	protected JComboBox getComboBoxSpritsorte() {
		if (comboBoxSpritsorte == null) {
			comboBoxSpritsorte = new JComboBox();
			comboBoxSpritsorte.setBounds(134, 30, 107, 22);
		}
		return comboBoxSpritsorte;
	}
	protected JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(137, 83, 104, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	protected JButton getButtonTanken() {
		if (ButtonTanken == null) {
			ButtonTanken = new JButton("Tanken");
			ButtonTanken.setBounds(21, 82, 89, 23);
		}
		return ButtonTanken;
	}
}
