package GUI_InterForm;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;

public class Form_Clientes extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField Txt_DNI_RUC;
	private JTextField Txt_Nombre;
	private JTextField Txt_Telefono;
	private JTextField Txt_Direccion;
	private JTextField Txt_RazonSocial;
	private JTable Tabla_Clientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Clientes frame = new Form_Clientes();
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
	public Form_Clientes() {
		setClosable(true);
		setBounds(100, 100, 950, 682);
		getContentPane().setLayout(null);
		
		JPanel Panel_Main_Clientes = new JPanel();
		Panel_Main_Clientes.setBounds(0, 0, 934, 652);
		getContentPane().add(Panel_Main_Clientes);
		Panel_Main_Clientes.setLayout(null);
		
		JLabel Lbl_TituloMain = new JLabel("REGISTRA LOS CLIENTES");
		Lbl_TituloMain.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_TituloMain.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		Lbl_TituloMain.setBounds(374, 32, 230, 19);
		Panel_Main_Clientes.add(Lbl_TituloMain);
		
		JLabel Lbl_DNI_RUC = new JLabel("DNI/RUC");
		Lbl_DNI_RUC.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_DNI_RUC.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_DNI_RUC.setBounds(374, 97, 75, 19);
		Panel_Main_Clientes.add(Lbl_DNI_RUC);
		
		Txt_DNI_RUC = new JTextField();
		Txt_DNI_RUC.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_DNI_RUC.setColumns(10);
		Txt_DNI_RUC.setBorder(null);
		Txt_DNI_RUC.setBounds(374, 122, 145, 33);
		Panel_Main_Clientes.add(Txt_DNI_RUC);
		
		JSeparator separator_txtDNI_RUC = new JSeparator();
		separator_txtDNI_RUC.setForeground(new Color(252, 176, 66));
		separator_txtDNI_RUC.setBackground(new Color(252, 176, 66));
		separator_txtDNI_RUC.setBounds(374, 155, 145, 13);
		Panel_Main_Clientes.add(separator_txtDNI_RUC);
		
		JLabel Lbl_Nombre = new JLabel("Nombre");
		Lbl_Nombre.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Nombre.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Nombre.setBounds(554, 97, 69, 19);
		Panel_Main_Clientes.add(Lbl_Nombre);
		
		Txt_Nombre = new JTextField();
		Txt_Nombre.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Nombre.setColumns(10);
		Txt_Nombre.setBorder(null);
		Txt_Nombre.setBounds(554, 122, 145, 33);
		Panel_Main_Clientes.add(Txt_Nombre);
		
		JSeparator separator_txtNombre = new JSeparator();
		separator_txtNombre.setForeground(new Color(252, 176, 66));
		separator_txtNombre.setBackground(new Color(252, 176, 66));
		separator_txtNombre.setBounds(554, 155, 145, 13);
		Panel_Main_Clientes.add(separator_txtNombre);
		
		JLabel Lbl_Telefono = new JLabel("Telefono");
		Lbl_Telefono.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Telefono.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Telefono.setBounds(733, 97, 69, 19);
		Panel_Main_Clientes.add(Lbl_Telefono);
		
		Txt_Telefono = new JTextField();
		Txt_Telefono.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Telefono.setColumns(10);
		Txt_Telefono.setBorder(null);
		Txt_Telefono.setBounds(733, 122, 145, 33);
		Panel_Main_Clientes.add(Txt_Telefono);
		
		JSeparator separator_txtTelefono = new JSeparator();
		separator_txtTelefono.setForeground(new Color(252, 176, 66));
		separator_txtTelefono.setBackground(new Color(252, 176, 66));
		separator_txtTelefono.setBounds(733, 155, 145, 13);
		Panel_Main_Clientes.add(separator_txtTelefono);
		
		JLabel Lbl_Direccion = new JLabel("Direccion");
		Lbl_Direccion.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Direccion.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Direccion.setBounds(374, 171, 75, 19);
		Panel_Main_Clientes.add(Lbl_Direccion);
		
		Txt_Direccion = new JTextField();
		Txt_Direccion.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Direccion.setColumns(10);
		Txt_Direccion.setBorder(null);
		Txt_Direccion.setBounds(374, 196, 145, 33);
		Panel_Main_Clientes.add(Txt_Direccion);
		
		JSeparator separator_txtDireccion = new JSeparator();
		separator_txtDireccion.setForeground(new Color(252, 176, 66));
		separator_txtDireccion.setBackground(new Color(252, 176, 66));
		separator_txtDireccion.setBounds(374, 229, 145, 13);
		Panel_Main_Clientes.add(separator_txtDireccion);
		
		JLabel Lbl_RazonSocial = new JLabel("Razon Social");
		Lbl_RazonSocial.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_RazonSocial.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_RazonSocial.setBounds(554, 171, 93, 19);
		Panel_Main_Clientes.add(Lbl_RazonSocial);
		
		Txt_RazonSocial = new JTextField();
		Txt_RazonSocial.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_RazonSocial.setColumns(10);
		Txt_RazonSocial.setBorder(null);
		Txt_RazonSocial.setBounds(554, 196, 145, 33);
		Panel_Main_Clientes.add(Txt_RazonSocial);
		
		JSeparator separator_txtRazonSocial = new JSeparator();
		separator_txtRazonSocial.setForeground(new Color(252, 176, 66));
		separator_txtRazonSocial.setBackground(new Color(252, 176, 66));
		separator_txtRazonSocial.setBounds(554, 229, 145, 13);
		Panel_Main_Clientes.add(separator_txtRazonSocial);
		
		JScrollPane scrollPane_Clientes = new JScrollPane();
		scrollPane_Clientes.setBounds(374, 283, 504, 267);
		Panel_Main_Clientes.add(scrollPane_Clientes);
		
		Tabla_Clientes = new JTable();
		Tabla_Clientes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"DNI/RUC", "NOMBRE", "TELEFONO", "DIRECCION", "RAZON SOCIAL"
			}
		));
		scrollPane_Clientes.setViewportView(Tabla_Clientes);
		
		JPanel Panel_LateralClientes = new JPanel();
		Panel_LateralClientes.setBackground(new Color(252, 172, 66));
		Panel_LateralClientes.setBounds(0, 0, 317, 652);
		Panel_Main_Clientes.add(Panel_LateralClientes);
		
		JPanel Btn_Guardar = new JPanel();
		Btn_Guardar.setLayout(null);
		Btn_Guardar.setBackground(new Color(252, 176, 66));
		Btn_Guardar.setBounds(374, 580, 115, 33);
		Panel_Main_Clientes.add(Btn_Guardar);
		
		JLabel Lbl_Btn_Guardar = new JLabel("GUARDAR");
		Lbl_Btn_Guardar.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Guardar.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Guardar.setBounds(10, 0, 95, 33);
		Btn_Guardar.add(Lbl_Btn_Guardar);
		
		JPanel Btn_Actualizar = new JPanel();
		Btn_Actualizar.setLayout(null);
		Btn_Actualizar.setBackground(new Color(252, 176, 66));
		Btn_Actualizar.setBounds(500, 580, 123, 33);
		Panel_Main_Clientes.add(Btn_Actualizar);
		
		JLabel Lbl_Btn_Actualizar = new JLabel("ACTUALIZAR");
		Lbl_Btn_Actualizar.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Actualizar.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Actualizar.setBounds(10, 0, 95, 33);
		Btn_Actualizar.add(Lbl_Btn_Actualizar);
		
		JPanel Btn_Eliminar = new JPanel();
		Btn_Eliminar.setLayout(null);
		Btn_Eliminar.setBackground(new Color(252, 176, 66));
		Btn_Eliminar.setBounds(640, 580, 115, 33);
		Panel_Main_Clientes.add(Btn_Eliminar);
		
		JLabel Lbl_Btn_Eliminar = new JLabel("ELIMINAR");
		Lbl_Btn_Eliminar.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Eliminar.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Eliminar.setBounds(10, 0, 95, 33);
		Btn_Eliminar.add(Lbl_Btn_Eliminar);
		
		JPanel Btn_Nuevo = new JPanel();
		Btn_Nuevo.setLayout(null);
		Btn_Nuevo.setBackground(new Color(252, 176, 66));
		Btn_Nuevo.setBounds(763, 580, 115, 33);
		Panel_Main_Clientes.add(Btn_Nuevo);
		
		JLabel Lbl_Btn_Nuevo = new JLabel("NUEVO");
		Lbl_Btn_Nuevo.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Nuevo.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Nuevo.setBounds(10, 0, 95, 33);
		Btn_Nuevo.add(Lbl_Btn_Nuevo);

	}
}
