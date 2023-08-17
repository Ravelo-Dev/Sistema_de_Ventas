package GUI_InterForm;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.List;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Mod_Consultas.Proveedor;
import Config.ProveedorBD;
import Interface.Operaciones_Proveedores;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Form_Proveedores extends JInternalFrame implements Operaciones_Proveedores{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Proveedor pd = new Proveedor();
	ProveedorBD NProveedores = new ProveedorBD();
	DefaultTableModel Modelo = new DefaultTableModel();
	private JTextField Txt_ID;
	private JTextField Txt_RUC;
	private JTextField Txt_Nombre;
	private JTextField Txt_Telefono;
	private JTextField Txt_Direccion;
	private JTextField Txt_RazonSocial;
	private JTable Tabla_Proveedores;

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
	
	
	/*
	 * Create the frame.
	 */
	public Form_Proveedores() {
		setClosable(true);
		setBounds(100, 100, 950, 682);
		getContentPane().setLayout(null);

		JPanel Panel_Main_Proveedores = new JPanel();
		Panel_Main_Proveedores.setBounds(0, 0, 934, 652);
		getContentPane().add(Panel_Main_Proveedores);
		Panel_Main_Proveedores.setLayout(null);

		JPanel PanelLateral_Proveedores = new JPanel();
		PanelLateral_Proveedores.setBackground(new Color(252, 176, 66));
		PanelLateral_Proveedores.setBounds(0, 0, 317, 652);
		Panel_Main_Proveedores.add(PanelLateral_Proveedores);

		JLabel Lbl_TituloMain = new JLabel("PROVEEDORES");
		Lbl_TituloMain.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_TituloMain.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		Lbl_TituloMain.setBounds(378, 42, 125, 19);
		Panel_Main_Proveedores.add(Lbl_TituloMain);
		
		Txt_ID = new JTextField();
		Txt_ID.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_ID.setColumns(4);
		Txt_ID.setBorder(null);
		Txt_ID.setBounds(0, 0, 0, 0);
		Panel_Main_Proveedores.add(Txt_ID);


		JLabel Lbl_RUC = new JLabel("RUC");
		Lbl_RUC.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_RUC.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_RUC.setBounds(378, 116, 43, 19);
		Panel_Main_Proveedores.add(Lbl_RUC);

		Txt_RUC = new JTextField();
		Txt_RUC.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_RUC.setColumns(10);
		Txt_RUC.setBorder(null);
		Txt_RUC.setBounds(378, 138, 155, 33);
		Panel_Main_Proveedores.add(Txt_RUC);

		JSeparator separator_txtRUC = new JSeparator();
		separator_txtRUC.setForeground(new Color(252, 176, 66));
		separator_txtRUC.setBackground(new Color(252, 176, 66));
		separator_txtRUC.setBounds(378, 171, 155, 13);
		Panel_Main_Proveedores.add(separator_txtRUC);

		JLabel Lbl_Nombre = new JLabel("Nombre");
		Lbl_Nombre.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Nombre.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Nombre.setBounds(559, 116, 63, 19);
		Panel_Main_Proveedores.add(Lbl_Nombre);

		Txt_Nombre = new JTextField();
		Txt_Nombre.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Nombre.setColumns(10);
		Txt_Nombre.setBorder(null);
		Txt_Nombre.setBounds(559, 138, 155, 33);
		Panel_Main_Proveedores.add(Txt_Nombre);

		JSeparator separator_txtNombre = new JSeparator();
		separator_txtNombre.setForeground(new Color(252, 176, 66));
		separator_txtNombre.setBackground(new Color(252, 176, 66));
		separator_txtNombre.setBounds(559, 171, 155, 13);
		Panel_Main_Proveedores.add(separator_txtNombre);

		JLabel Lbl_Telefono = new JLabel("Telefono");
		Lbl_Telefono.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Telefono.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Telefono.setBounds(740, 116, 69, 19);
		Panel_Main_Proveedores.add(Lbl_Telefono);

		Txt_Telefono = new JTextField();
		Txt_Telefono.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Telefono.setColumns(10);
		Txt_Telefono.setBorder(null);
		Txt_Telefono.setBounds(740, 138, 143, 33);
		Panel_Main_Proveedores.add(Txt_Telefono);

		JSeparator separator_txtTelefono = new JSeparator();
		separator_txtTelefono.setForeground(new Color(252, 176, 66));
		separator_txtTelefono.setBackground(new Color(252, 176, 66));
		separator_txtTelefono.setBounds(740, 171, 143, 13);
		Panel_Main_Proveedores.add(separator_txtTelefono);

		JLabel Lbl_Direccion = new JLabel("Direccion");
		Lbl_Direccion.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Direccion.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Direccion.setBounds(378, 189, 69, 19);
		Panel_Main_Proveedores.add(Lbl_Direccion);

		Txt_Direccion = new JTextField();
		Txt_Direccion.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Direccion.setColumns(10);
		Txt_Direccion.setBorder(null);
		Txt_Direccion.setBounds(378, 210, 155, 33);
		Panel_Main_Proveedores.add(Txt_Direccion);

		JSeparator separator_txtDireccion = new JSeparator();
		separator_txtDireccion.setForeground(new Color(252, 176, 66));
		separator_txtDireccion.setBackground(new Color(252, 176, 66));
		separator_txtDireccion.setBounds(378, 243, 155, 13);
		Panel_Main_Proveedores.add(separator_txtDireccion);

		JLabel Lbl_RazonSocial = new JLabel("Razon Social");
		Lbl_RazonSocial.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_RazonSocial.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_RazonSocial.setBounds(559, 189, 93, 19);
		Panel_Main_Proveedores.add(Lbl_RazonSocial);

		Txt_RazonSocial = new JTextField();
		Txt_RazonSocial.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_RazonSocial.setColumns(10);
		Txt_RazonSocial.setBorder(null);
		Txt_RazonSocial.setBounds(559, 210, 155, 33);
		Panel_Main_Proveedores.add(Txt_RazonSocial);

		JSeparator separator_txtRazonSocial = new JSeparator();
		separator_txtRazonSocial.setForeground(new Color(252, 176, 66));
		separator_txtRazonSocial.setBackground(new Color(252, 176, 66));
		separator_txtRazonSocial.setBounds(559, 243, 155, 13);
		Panel_Main_Proveedores.add(separator_txtRazonSocial);

		JScrollPane scrollPane_Proveedores = new JScrollPane();
		scrollPane_Proveedores.setBounds(378, 296, 505, 221);
		Panel_Main_Proveedores.add(scrollPane_Proveedores);

		Tabla_Proveedores = new JTable();
		Tabla_Proveedores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int Fila = Tabla_Proveedores.rowAtPoint(e.getPoint());
				Txt_ID.setText(Tabla_Proveedores.getValueAt(Fila, 0).toString());
				Txt_RUC.setText(Tabla_Proveedores.getValueAt(Fila, 1).toString());
				Txt_Nombre.setText(Tabla_Proveedores.getValueAt(Fila, 2).toString());
				Txt_Telefono.setText(Tabla_Proveedores.getValueAt(Fila, 3).toString());
				Txt_Direccion.setText(Tabla_Proveedores.getValueAt(Fila, 4).toString());
				Txt_RazonSocial.setText(Tabla_Proveedores.getValueAt(Fila, 5).toString());
			}
		});
		Tabla_Proveedores.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "RUC", "NOMBRE", "TELEFONO", "DIRECCION", "RAZON SOCIAL"
			}
		));
		scrollPane_Proveedores.setViewportView(Tabla_Proveedores);

		JPanel Btn_Registrar = new JPanel();
		Btn_Registrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!"".equals(Txt_RUC.getText()) || !"".equals(Txt_Nombre.getText())
						|| !"".equals(Txt_Telefono.getText()) || !"".equals(Txt_Direccion.getText())
						|| !"".equals(Txt_RazonSocial.getText())) {
					pd.setRuc(Integer.parseInt(Txt_RUC.getText()));
					pd.setNombre(Txt_Nombre.getText());
					pd.setTelefono(Txt_Telefono.getText());
					pd.setDireccion(Txt_Direccion.getText());
					pd.setRazon(Txt_RazonSocial.getText());
					NProveedores.Registrar_Proveedores(pd);
					CleanTable();
					CleanTEXTBOX();
					Listar_Proveedores();
					JOptionPane.showMessageDialog(null, "Proveedor registrado satisfactoriamente.");
				} else {
					JOptionPane.showMessageDialog(null, "Asegurese de llenar todos los campos.");
				}
			}
		});
		Btn_Registrar.setLayout(null);
		Btn_Registrar.setBackground(new Color(252, 176, 66));
		Btn_Registrar.setBounds(378, 563, 115, 33);
		Panel_Main_Proveedores.add(Btn_Registrar);

		JLabel Lbl_Btn_Registrar = new JLabel("REGISTRAR");
		Lbl_Btn_Registrar.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Registrar.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Registrar.setBounds(10, 0, 95, 33);
		Btn_Registrar.add(Lbl_Btn_Registrar);

		JPanel Btn_Actualizar = new JPanel();
		Btn_Actualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if ("".equals(Txt_ID.getText())) {
					JOptionPane.showMessageDialog(null, "Selecione una registro, para actualizar");
				} else {

					if (!"".equals(Txt_RUC.getText()) || !"".equals(Txt_Nombre.getText())
							|| !"".equals(Txt_Telefono.getText()) || !"".equals(Txt_Direccion.getText())
							|| !"".equals(Txt_RazonSocial.getText())) {
						pd.setRuc(Integer.parseInt(Txt_RUC.getText()));
						pd.setNombre(Txt_Nombre.getText());
						pd.setTelefono(Txt_Telefono.getText());
						pd.setDireccion(Txt_Direccion.getText());
						pd.setRazon(Txt_RazonSocial.getText());
						pd.setId(Integer.parseInt(Txt_ID.getText()));
						NProveedores.Actualizar_Proveedores(pd);
						CleanTable();
						CleanTEXTBOX();
						Listar_Proveedores();
					}
				}
			}
		});
		Btn_Actualizar.setLayout(null);
		Btn_Actualizar.setBackground(new Color(252, 176, 66));
		Btn_Actualizar.setBounds(503, 563, 115, 33);
		Panel_Main_Proveedores.add(Btn_Actualizar);

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
						NProveedores.Eliminar_Proveedores(Id);
						CleanTable();
						CleanTEXTBOX();
						Listar_Proveedores();
					}
				}
			}
		});
		Btn_Eliminar.setLayout(null);
		Btn_Eliminar.setBackground(new Color(252, 176, 66));
		Btn_Eliminar.setBounds(643, 563, 115, 33);
		Panel_Main_Proveedores.add(Btn_Eliminar);

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
		Btn_Nuevo.setBounds(768, 563, 115, 33);
		Panel_Main_Proveedores.add(Btn_Nuevo);

		JLabel Lbl_Btn_Nuevo = new JLabel("NUEVO");
		Lbl_Btn_Nuevo.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Nuevo.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Nuevo.setBounds(10, 0, 95, 33);
		Btn_Nuevo.add(Lbl_Btn_Nuevo);

	}


	@Override
	public void Listar_Proveedores() {
		// TODO Auto-generated method stub
		List<Proveedor> ListarProveedores = NProveedores.Listar_Proveedores();
		Modelo = (DefaultTableModel) Tabla_Proveedores.getModel();
		Object[] OB = new Object[6];
		for (int i = 0; i < ListarProveedores.size(); i++) {
			OB[0] = ListarProveedores.get(i).getId();
			OB[1] = ListarProveedores.get(i).getRuc();
			OB[2] = ListarProveedores.get(i).getNombre();
			OB[3] = ListarProveedores.get(i).getTelefono();
			OB[4] = ListarProveedores.get(i).getDireccion();
			OB[5] = ListarProveedores.get(i).getRazon();
			Modelo.addRow(OB);
		}
		Tabla_Proveedores.setModel(Modelo);
	}


	@Override
	public void CleanTable() {
		// TODO Auto-generated method stub
		for (int i = 0; i < Modelo.getRowCount(); i++) {
			Modelo.removeRow(i);
			i = i - 1;
		}
	}


	@Override
	public void CleanTEXTBOX() {
		// TODO Auto-generated method stub
		Txt_ID.setText("");
		Txt_RUC.setText("");
		Txt_Nombre.setText("");
		Txt_Telefono.setText("");
		Txt_Direccion.setText("");
		Txt_RazonSocial.setText("");
	}
}
