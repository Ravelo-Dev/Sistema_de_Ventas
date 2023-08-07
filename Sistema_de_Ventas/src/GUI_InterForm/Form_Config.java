package GUI_InterForm;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class Form_Config extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField Txt_RUC;
	private JTextField Txt_Nombre;
	private JTextField Txt_Telefono;
	private JTextField Txt_Direccion;
	private JTextField Txt_RazonSocial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Config frame = new Form_Config();
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
	public Form_Config() {
		setClosable(true);
		setBounds(100, 100, 950, 682);
		getContentPane().setLayout(null);
		
		JPanel Panel_Main_Cofig = new JPanel();
		Panel_Main_Cofig.setBounds(0, 0, 934, 652);
		getContentPane().add(Panel_Main_Cofig);
		Panel_Main_Cofig.setLayout(null);
		
		JPanel PanelLateral_Config = new JPanel();
		PanelLateral_Config.setBackground(new Color(252, 176, 66));
		PanelLateral_Config.setBounds(0, 0, 317, 652);
		Panel_Main_Cofig.add(PanelLateral_Config);
		
		JLabel Lbl_TituloMain = new JLabel("INFORMACION DE LA EMPRESA");
		Lbl_TituloMain.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_TituloMain.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		Lbl_TituloMain.setBounds(374, 30, 261, 19);
		Panel_Main_Cofig.add(Lbl_TituloMain);
		
		JLabel Lbl_RUC = new JLabel("RUC");
		Lbl_RUC.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_RUC.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_RUC.setBounds(374, 105, 39, 19);
		Panel_Main_Cofig.add(Lbl_RUC);
		
		Txt_RUC = new JTextField();
		Txt_RUC.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_RUC.setColumns(10);
		Txt_RUC.setBorder(null);
		Txt_RUC.setBounds(374, 134, 130, 33);
		Panel_Main_Cofig.add(Txt_RUC);
		
		JSeparator separator_txtRUC = new JSeparator();
		separator_txtRUC.setForeground(new Color(252, 176, 66));
		separator_txtRUC.setBackground(new Color(252, 176, 66));
		separator_txtRUC.setBounds(374, 167, 130, 13);
		Panel_Main_Cofig.add(separator_txtRUC);
		
		JLabel Lbl_Nombre = new JLabel("Nombre");
		Lbl_Nombre.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Nombre.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Nombre.setBounds(540, 105, 71, 19);
		Panel_Main_Cofig.add(Lbl_Nombre);
		
		Txt_Nombre = new JTextField();
		Txt_Nombre.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Nombre.setColumns(10);
		Txt_Nombre.setBorder(null);
		Txt_Nombre.setBounds(540, 135, 165, 33);
		Panel_Main_Cofig.add(Txt_Nombre);
		
		JSeparator separator_txtNombre = new JSeparator();
		separator_txtNombre.setForeground(new Color(252, 176, 66));
		separator_txtNombre.setBackground(new Color(252, 176, 66));
		separator_txtNombre.setBounds(540, 168, 165, 13);
		Panel_Main_Cofig.add(separator_txtNombre);
		
		JLabel Lbl_Telefono = new JLabel("Telefono");
		Lbl_Telefono.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Telefono.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Telefono.setBounds(739, 105, 71, 19);
		Panel_Main_Cofig.add(Lbl_Telefono);
		
		Txt_Telefono = new JTextField();
		Txt_Telefono.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Telefono.setColumns(10);
		Txt_Telefono.setBorder(null);
		Txt_Telefono.setBounds(739, 134, 140, 33);
		Panel_Main_Cofig.add(Txt_Telefono);
		
		JSeparator separator_txtTelefono = new JSeparator();
		separator_txtTelefono.setForeground(new Color(252, 176, 66));
		separator_txtTelefono.setBackground(new Color(252, 176, 66));
		separator_txtTelefono.setBounds(739, 167, 140, 13);
		Panel_Main_Cofig.add(separator_txtTelefono);
		
		Txt_Direccion = new JTextField();
		Txt_Direccion.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Direccion.setColumns(10);
		Txt_Direccion.setBorder(null);
		Txt_Direccion.setBounds(374, 214, 130, 33);
		Panel_Main_Cofig.add(Txt_Direccion);
		
		JLabel Lbl_Direccion = new JLabel("Direccion");
		Lbl_Direccion.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Direccion.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Direccion.setBounds(374, 185, 71, 19);
		Panel_Main_Cofig.add(Lbl_Direccion);
		
		JSeparator separator_txtDireccion = new JSeparator();
		separator_txtDireccion.setForeground(new Color(252, 176, 66));
		separator_txtDireccion.setBackground(new Color(252, 176, 66));
		separator_txtDireccion.setBounds(374, 247, 130, 13);
		Panel_Main_Cofig.add(separator_txtDireccion);
		
		JLabel Lbl_RazonSocial = new JLabel("Razon Social");
		Lbl_RazonSocial.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_RazonSocial.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_RazonSocial.setBounds(540, 185, 101, 19);
		Panel_Main_Cofig.add(Lbl_RazonSocial);
		
		Txt_RazonSocial = new JTextField();
		Txt_RazonSocial.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_RazonSocial.setColumns(10);
		Txt_RazonSocial.setBorder(null);
		Txt_RazonSocial.setBounds(540, 214, 166, 33);
		Panel_Main_Cofig.add(Txt_RazonSocial);
		
		JSeparator separator_txtRazonSocial = new JSeparator();
		separator_txtRazonSocial.setForeground(new Color(252, 176, 66));
		separator_txtRazonSocial.setBackground(new Color(252, 176, 66));
		separator_txtRazonSocial.setBounds(540, 247, 166, 13);
		Panel_Main_Cofig.add(separator_txtRazonSocial);
		
		JPanel Btn_Actualizar = new JPanel();
		Btn_Actualizar.setLayout(null);
		Btn_Actualizar.setBackground(new Color(252, 176, 66));
		Btn_Actualizar.setBounds(374, 287, 115, 33);
		Panel_Main_Cofig.add(Btn_Actualizar);
		
		JLabel Lbl_Btn_Actualizar = new JLabel("ACTUALIZAR");
		Lbl_Btn_Actualizar.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Actualizar.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Actualizar.setBounds(10, 0, 95, 33);
		Btn_Actualizar.add(Lbl_Btn_Actualizar);

	}

}
