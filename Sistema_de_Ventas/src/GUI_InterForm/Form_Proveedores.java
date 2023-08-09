package GUI_InterForm;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Form_Proveedores extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Proveedores frame = new Form_Proveedores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Form_Proveedores() {
		setBounds(100, 100, 450, 300);

	}

}
