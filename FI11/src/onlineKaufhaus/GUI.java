package onlineKaufhaus;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JList listWarehouse;
	private JList listShoppingCart;
	private JButton btnNewButtonAddWare;
	private JButton btnNewButtonCancelWare;
	private JLabel labelShoppingCart;
	private JTextField textFieldKundenname;
	private JLabel lblNewLabel;
	private JButton buttonSubmitOrder;
	private JLabel lblBild;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 742, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getListWarehouse());
		frame.getContentPane().add(getListShoppingCart());
		frame.getContentPane().add(getBtnNewButtonAddWare());
		frame.getContentPane().add(getBtnNewButtonCancelWare());
		frame.getContentPane().add(getLabelShoppingCart());
		frame.getContentPane().add(getTextFieldKundenname());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getButtonSubmitOrder());
		frame.getContentPane().add(getLblBild());
		frame.setVisible(true);
	}

	protected JList getListWarehouse() {
		if (listWarehouse == null) {
			listWarehouse = new JList();
			listWarehouse.setBounds(30, 106, 274, 219);
		}
		return listWarehouse;
	}
	protected JList getListShoppingCart() {
		if (listShoppingCart == null) {
			listShoppingCart = new JList();
			listShoppingCart.setBounds(414, 106, 274, 219);
		}
		return listShoppingCart;
	}
	protected JButton getBtnNewButtonAddWare() {
		if (btnNewButtonAddWare == null) {
			btnNewButtonAddWare = new JButton(">");
			btnNewButtonAddWare.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnNewButtonAddWare.setBounds(315, 133, 89, 23);
		}
		return btnNewButtonAddWare;
	}
	protected JButton getBtnNewButtonCancelWare() {
		if (btnNewButtonCancelWare == null) {
			btnNewButtonCancelWare = new JButton("<");
			btnNewButtonCancelWare.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButtonCancelWare.setBounds(315, 228, 89, 23);
		}
		return btnNewButtonCancelWare;
	}
	protected JLabel getLabelShoppingCart() {
		if (labelShoppingCart == null) {
			labelShoppingCart = new JLabel("Warenkorb");
			labelShoppingCart.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelShoppingCart.setBounds(415, 72, 133, 23);
		}
		return labelShoppingCart;
	}
	protected JTextField getTextFieldKundenname() {
		if (textFieldKundenname == null) {
			textFieldKundenname = new JTextField();
			textFieldKundenname.setBounds(136, 344, 209, 20);
			textFieldKundenname.setColumns(10);
		}
		return textFieldKundenname;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Kundenname:");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel.setBounds(30, 341, 96, 23);
		}
		return lblNewLabel;
	}
	protected JButton getButtonSubmitOrder() {
		if (buttonSubmitOrder == null) {
			buttonSubmitOrder = new JButton("Bestellung abschicken");
			buttonSubmitOrder.setBounds(424, 343, 264, 23);
		}
		return buttonSubmitOrder;
	}
	protected JLabel getLblBild() {
		if (lblBild == null) {
			lblBild = new JLabel("New label");
			/*ImageIcon imageIcon = new ImageIcon("src/onlineKaufhaus/Logo.jpg");
			imageIcon.setImage(imageIcon.getImage().getScaledInstance(274, 71, Image.SCALE_DEFAULT));
			lblBild.setIcon(imageIcon);*/
			lblBild.setBounds(30, 24, 274, 71);
		}
		return lblBild;
	}
}
