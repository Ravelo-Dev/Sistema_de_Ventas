
package GUI_InterForm;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import Mod_Consultas.*;
import Config.*;
import Interface.Operaciones_Clientes;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Form_Clientes extends JInternalFrame implements Operaciones_Clientes {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Clientes cl = new Clientes();
	ClientesBD NClientes = new ClientesBD();
	DefaultTableModel Modelo = new DefaultTableModel();
	private JTextField Txt_ID;
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
	 * 
	 * @return
	 */

	public Form_Clientes() {
		setClosable(true);
		setBounds(100, 100, 905, 665);
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

		JLabel Lbl_DNI_RUC = new JLabel("DNI/RNC");
		Lbl_DNI_RUC.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_DNI_RUC.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_DNI_RUC.setBounds(374, 97, 75, 19);
		Panel_Main_Clientes.add(Lbl_DNI_RUC);

		Txt_ID = new JTextField();
		Txt_ID.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_ID.setColumns(4);
		Txt_ID.setBorder(null);
		Txt_ID.setBounds(0, 0, 0, 0);
		Panel_Main_Clientes.add(Txt_ID);

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
		Tabla_Clientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int Fila = Tabla_Clientes.rowAtPoint(e.getPoint());
				Txt_ID.setText(Tabla_Clientes.getValueAt(Fila, 0).toString());
				Txt_DNI_RUC.setText(Tabla_Clientes.getValueAt(Fila, 1).toString());
				Txt_Nombre.setText(Tabla_Clientes.getValueAt(Fila, 2).toString());
				Txt_Telefono.setText(Tabla_Clientes.getValueAt(Fila, 3).toString());
				Txt_Direccion.setText(Tabla_Clientes.getValueAt(Fila, 4).toString());
				Txt_RazonSocial.setText(Tabla_Clientes.getValueAt(Fila, 5).toString());
			}
		});
		Tabla_Clientes.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "ID", "DNI/RUC", "NOMBRE", "TELEFONO", "DIRECCION", "RAZON SOCIAL" }));
		scrollPane_Clientes.setViewportView(Tabla_Clientes);

		JPanel Panel_LateralClientes = new JPanel();
		Panel_LateralClientes.setBackground(new Color(252, 172, 66));
		Panel_LateralClientes.setBounds(0, 0, 350, 652);
		Panel_Main_Clientes.add(Panel_LateralClientes);
		Panel_LateralClientes.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Form_Clientes.class.getResource("/Img/LosSocios_Design_FormClientes.png")));
		lblNewLabel.setBounds(0, 0, 350, 641);
		Panel_LateralClientes.add(lblNewLabel);

		JPanel Btn_Actualizar = new JPanel();
		Btn_Actualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if ("".equals(Txt_ID.getText())) {
					JOptionPane.showMessageDialog(null, "Selecione una registro, para actualizar");
				} else {

					if (!"".equals(Txt_DNI_RUC.getText()) || !"".equals(Txt_Nombre.getText())
							|| !"".equals(Txt_Telefono.getText()) || !"".equals(Txt_Direccion.getText())
							|| !"".equals(Txt_RazonSocial.getText())) {
						cl.setDni(Integer.parseInt(Txt_DNI_RUC.getText()));
						cl.setNombre(Txt_Nombre.getText());
						cl.setTelefono(Txt_Telefono.getText());
						cl.setDireccion(Txt_Direccion.getText());
						cl.setRazon(Txt_RazonSocial.getText());
						cl.setId(Integer.parseInt(Txt_ID.getText()));
						NClientes.Actualizar_Clientes(cl);
						CleanTable();
						CleanTEXTBOX();
						Listar_Clientes();
					}
				}

			}
		});
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
		Btn_Eliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!"".equals(Txt_ID.getText())) {
					int Pregunta = JOptionPane.showConfirmDialog(null, "Seguro que quieres eliminar este registro?");
					if (Pregunta == 0) {
						int Id = Integer.parseInt(Txt_ID.getText());
						NClientes.Eliminar_Clientes(Id);
						CleanTable();
						CleanTEXTBOX();
						Listar_Clientes();
					}
				}
			}
		});
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
		Btn_Nuevo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CleanTEXTBOX();
			}
		});
		Btn_Nuevo.setLayout(null);
		Btn_Nuevo.setBackground(new Color(252, 176, 66));
		Btn_Nuevo.setBounds(763, 580, 115, 33);
		Panel_Main_Clientes.add(Btn_Nuevo);

		JLabel Lbl_Btn_Nuevo = new JLabel("NUEVO");
		Lbl_Btn_Nuevo.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Nuevo.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Nuevo.setBounds(10, 0, 95, 33);
		Btn_Nuevo.add(Lbl_Btn_Nuevo);

		JPanel Btn_Registrar = new JPanel();
		Btn_Registrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!"".equals(Txt_DNI_RUC.getText()) || !"".equals(Txt_Nombre.getText())
						|| !"".equals(Txt_Telefono.getText()) || !"".equals(Txt_Direccion.getText())
						|| !"".equals(Txt_RazonSocial.getText())) {
					cl.setDni(Integer.parseInt(Txt_DNI_RUC.getText()));
					cl.setNombre(Txt_Nombre.getText());
					cl.setTelefono(Txt_Telefono.getText());
					cl.setDireccion(Txt_Direccion.getText());
					cl.setRazon(Txt_RazonSocial.getText());
					NClientes.Registrar_Clientes(cl);
					CleanTable();
					CleanTEXTBOX();
					Listar_Clientes();
					JOptionPane.showMessageDialog(null, "Cliente registrado satisfactoriamente.");
				} else {
					JOptionPane.showMessageDialog(null, "Asegurese de llenar todos los campos.");
				}
			}
		});
		Btn_Registrar.setBackground(new Color(252, 179, 66));
		Btn_Registrar.setForeground(new Color(255, 255, 255));
		Btn_Registrar.setBounds(374, 580, 116, 33);
		Panel_Main_Clientes.add(Btn_Registrar);
		Btn_Registrar.setLayout(null);

		JLabel Lbl_Btn_Registrar = new JLabel("REGISTRAR");
		Lbl_Btn_Registrar.setBounds(10, 0, 93, 33);
		Lbl_Btn_Registrar.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Registrar.setFont(new Font("Roboto", Font.PLAIN, 16));
		Btn_Registrar.add(Lbl_Btn_Registrar);

	}

	@Override
	public void Listar_Clientes() {
		// TODO Auto-generated method stub
		List<Clientes> ListarClientes = NClientes.Listar_Clientes();
		Modelo = (DefaultTableModel) Tabla_Clientes.getModel();
		Object[] OB = new Object[6];
		for (int i = 0; i < ListarClientes.size(); i++) {
			OB[0] = ListarClientes.get(i).getId();
			OB[1] = ListarClientes.get(i).getDni();
			OB[2] = ListarClientes.get(i).getNombre();
			OB[3] = ListarClientes.get(i).getTelefono();
			OB[4] = ListarClientes.get(i).getDireccion();
			OB[5] = ListarClientes.get(i).getRazon();
			Modelo.addRow(OB);
		}
		Tabla_Clientes.setModel(Modelo);
	}

	@Override
	public void CleanTEXTBOX() {
		// TODO Auto-generated method stub
		Txt_ID.setText("");
		Txt_DNI_RUC.setText("");
		Txt_Nombre.setText("");
		Txt_Telefono.setText("");
		Txt_Direccion.setText("");
		Txt_RazonSocial.setText("");
	}

	@Override
	public void CleanTable() {
		// TODO Auto-generated method stub
		for (int i = 0; i < Modelo.getRowCount(); i++) {
			Modelo.removeRow(i);
			i = i - 1;
		}
	}

}