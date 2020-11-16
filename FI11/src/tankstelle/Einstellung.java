package tankstelle;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSlider;

public class Einstellung {

	private JFrame frame;
	private JLabel LablePreisFestlegen;
	private JComboBox comboBoxSprit;
	private JTextField textFieldPreisProLiter;
	private JButton ButtonPreis;
	private JSlider sliderSprit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Einstellung window = new Einstellung();
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
	public Einstellung() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 228);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLablePreisFestlegen());
		frame.getContentPane().add(getComboBoxSprit());
		frame.getContentPane().add(getTextFieldPreisProLiter());
		frame.getContentPane().add(getButtonPreis());
		frame.getContentPane().add(getSliderSprit());
		frame.setVisible(true);
	}

	private JLabel getLablePreisFestlegen() {
		if (LablePreisFestlegen == null) {
			LablePreisFestlegen = new JLabel("Bitte w\u00E4hlen Sie den Preis pro Liter an");
			LablePreisFestlegen.setFont(new Font("Tahoma", Font.PLAIN, 14));
			LablePreisFestlegen.setBounds(26, 75, 223, 17);
		}
		return LablePreisFestlegen;
	}
	protected JComboBox getComboBoxSprit() {
		if (comboBoxSprit == null) {
			comboBoxSprit = new JComboBox();
			comboBoxSprit.setBounds(26, 32, 223, 22);
		}
		return comboBoxSprit;
	}
	protected JTextField getTextFieldPreisProLiter() {
		if (textFieldPreisProLiter == null) {
			textFieldPreisProLiter = new JTextField();
			textFieldPreisProLiter.setBounds(272, 118, 116, 20);
			textFieldPreisProLiter.setColumns(10);
		}
		return textFieldPreisProLiter;
	}
	protected JButton getButtonPreis() {
		if (ButtonPreis == null) {
			ButtonPreis = new JButton("Preis festlegen");
			ButtonPreis.setBounds(261, 32, 127, 23);
		}
		return ButtonPreis;
	}
	protected JSlider getSliderSprit() {
		if (sliderSprit == null) {
			sliderSprit = new JSlider();
			sliderSprit.setMaximum(200);
			sliderSprit.setBounds(26, 112, 223, 26);
		}
		return sliderSprit;
	}
}
