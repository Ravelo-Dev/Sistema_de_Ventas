package GUI_InterForm;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Config.*;
import Mod_Consultas.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class Form_Productos extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Productos prd = new Productos();
	ProductosBD NProductos = new ProductosBD();
	DefaultTableModel Modelo = new DefaultTableModel();
	private JTextField Txt_ID;
	private JTextField Txt_Codigo;
	private JTextField Txt_Descripcion;
	private JTextField Txt_Cantidad;
	private JTextField Txt_Precio;
	private JTable Tabla_Productos;
	private JComboBox<String> CBox_Proveedores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Productos frame = new Form_Productos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Listar_Productos() {
		List<Productos> ListarProductos = NProductos.Listar_Productos();
		Modelo = (DefaultTableModel) Tabla_Productos.getModel();
		Object[] OB = new Object[6];
		for (int i = 0; i < ListarProductos.size(); i++) {
			OB[0] = ListarProductos.get(i).getId();
			OB[1] = ListarProductos.get(i).getCodigo();
			OB[2] = ListarProductos.get(i).getNombre();
			OB[3] = ListarProductos.get(i).getProveedor();
			OB[4] = ListarProductos.get(i).getStock();
			OB[5] = ListarProductos.get(i).getPrecio();
			Modelo.addRow(OB);
		}
		Tabla_Productos.setModel(Modelo);
	}

	public void CleanTable() {
		for (int i = 0; i < Modelo.getRowCount(); i++) {
			Modelo.removeRow(i);
			i = i - 1;
		}
	}

	public void CleanTEXTBOX() {
		Txt_ID.setText("");
		Txt_Codigo.setText("");
		Txt_Descripcion.setText("");
		CBox_Proveedores.setSelectedItem("");
		Txt_Cantidad.setText("");
		Txt_Precio.setText("");
	}

	/**
	 * Create the frame.
	 */
	public Form_Productos() {
		setClosable(true);
		setBounds(100, 100, 950, 682);
		getContentPane().setLayout(null);
		
		JPanel Panel_Main_Productos = new JPanel();
		Panel_Main_Productos.setBounds(0, 0, 934, 652);
		getContentPane().add(Panel_Main_Productos);
		Panel_Main_Productos.setLayout(null);
		
		JLabel Lbl_Codigo = new JLabel("Codigo");
		Lbl_Codigo.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Codigo.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Codigo.setBounds(374, 109, 55, 19);
		Panel_Main_Productos.add(Lbl_Codigo);
		
		Txt_ID = new JTextField();
		Txt_ID.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_ID.setColumns(4);
		Txt_ID.setBorder(null);
		Txt_ID.setBounds(0, 0, 0, 0);
		Panel_Main_Productos.add(Txt_ID);
		
		Txt_Codigo = new JTextField();
		Txt_Codigo.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Codigo.setColumns(10);
		Txt_Codigo.setBorder(null);
		Txt_Codigo.setBounds(374, 139, 145, 33);
		Panel_Main_Productos.add(Txt_Codigo);
		
		JSeparator separator_txtCodigo = new JSeparator();
		separator_txtCodigo.setForeground(new Color(252, 176, 66));
		separator_txtCodigo.setBackground(new Color(252, 176, 66));
		separator_txtCodigo.setBounds(374, 172, 145, 13);
		Panel_Main_Productos.add(separator_txtCodigo);
		
		JLabel Lbl_Descripcion = new JLabel("Descripcion");
		Lbl_Descripcion.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Descripcion.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Descripcion.setBounds(554, 109, 84, 19);
		Panel_Main_Productos.add(Lbl_Descripcion);
		
		Txt_Descripcion = new JTextField();
		Txt_Descripcion.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Descripcion.setColumns(10);
		Txt_Descripcion.setBorder(null);
		Txt_Descripcion.setBounds(554, 139, 200, 33);
		Panel_Main_Productos.add(Txt_Descripcion);
		
		JSeparator separator_txtDescripcion = new JSeparator();
		separator_txtDescripcion.setForeground(new Color(252, 176, 66));
		separator_txtDescripcion.setBackground(new Color(252, 176, 66));
		separator_txtDescripcion.setBounds(554, 172, 200, 13);
		Panel_Main_Productos.add(separator_txtDescripcion);
		
		JLabel Lbl_Cantidad = new JLabel("Cantidad");
		Lbl_Cantidad.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Cantidad.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Cantidad.setBounds(790, 109, 70, 19);
		Panel_Main_Productos.add(Lbl_Cantidad);
		
		Txt_Cantidad = new JTextField();
		Txt_Cantidad.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Cantidad.setColumns(10);
		Txt_Cantidad.setBorder(null);
		Txt_Cantidad.setBounds(789, 139, 90, 33);
		Panel_Main_Productos.add(Txt_Cantidad);
		
		JSeparator separator_txtCantidad = new JSeparator();
		separator_txtCantidad.setForeground(new Color(252, 176, 66));
		separator_txtCantidad.setBackground(new Color(252, 176, 66));
		separator_txtCantidad.setBounds(789, 172, 90, 13);
		Panel_Main_Productos.add(separator_txtCantidad);
		
		JLabel Lbl_Precio = new JLabel("Precio");
		Lbl_Precio.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Precio.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Precio.setBounds(374, 192, 50, 19);
		Panel_Main_Productos.add(Lbl_Precio);
		
		Txt_Precio = new JTextField();
		Txt_Precio.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Precio.setColumns(10);
		Txt_Precio.setBorder(null);
		Txt_Precio.setBounds(374, 222, 145, 33);
		Panel_Main_Productos.add(Txt_Precio);
		
		JSeparator separator_txtPrecio = new JSeparator();
		separator_txtPrecio.setForeground(new Color(252, 176, 66));
		separator_txtPrecio.setBackground(new Color(252, 176, 66));
		separator_txtPrecio.setBounds(374, 255, 145, 13);
		Panel_Main_Productos.add(separator_txtPrecio);
		
		JLabel Lbl_Proveedores = new JLabel("Proveedores");
		Lbl_Proveedores.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Proveedores.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Proveedores.setBounds(554, 192, 90, 19);
		Panel_Main_Productos.add(Lbl_Proveedores);
		
		CBox_Proveedores = new JComboBox<String>();
		CBox_Proveedores.setEditable(true);
		CBox_Proveedores.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		CBox_Proveedores.setBounds(554, 222, 200, 33);
		Panel_Main_Productos.add(CBox_Proveedores);
		
		NProductos.Consultar_Proveedor(CBox_Proveedores);
		
		JSeparator separator_txtProveedores = new JSeparator();
		separator_txtProveedores.setForeground(new Color(252, 176, 66));
		separator_txtProveedores.setBackground(new Color(252, 176, 66));
		separator_txtProveedores.setBounds(554, 255, 200, 13);
		Panel_Main_Productos.add(separator_txtProveedores);
		
		JScrollPane scrollPane_Productos = new JScrollPane();
		scrollPane_Productos.setBounds(374, 279, 505, 225);
		Panel_Main_Productos.add(scrollPane_Productos);
		
		Tabla_Productos = new JTable();
		Tabla_Productos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int Fila = Tabla_Productos.rowAtPoint(e.getPoint());
				Txt_ID.setText(Tabla_Productos.getValueAt(Fila, 0).toString());
				Txt_Codigo.setText(Tabla_Productos.getValueAt(Fila, 1).toString());
				Txt_Descripcion.setText(Tabla_Productos.getValueAt(Fila, 2).toString());
				CBox_Proveedores.setSelectedItem(Tabla_Productos.getValueAt(Fila, 3));
				Txt_Cantidad.setText(Tabla_Productos.getValueAt(Fila, 4).toString());
				Txt_Precio.setText(Tabla_Productos.getValueAt(Fila, 5).toString());
			}
		});
		Tabla_Productos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "CODIGO", "DESCRIPCION", "PROVEEDOR", "STOCK", "PRECIO"
			}
		));
		Tabla_Productos.getColumnModel().getColumn(2).setPreferredWidth(86);
		scrollPane_Productos.setViewportView(Tabla_Productos);
		
		JPanel Btn_Registrar = new JPanel();
		Btn_Registrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!"".equals(Txt_Codigo.getText()) || !"".equals(Txt_Descripcion.getText()) || !"".equals(CBox_Proveedores.getSelectedItem()) 
						|| !"".equals(Txt_Cantidad.getText()) || !"".equals(Txt_Precio.getText())) {
					prd.setCodigo(Txt_Codigo.getText());
					prd.setNombre(Txt_Descripcion.getText());
					prd.setProveedor(CBox_Proveedores.getSelectedItem().toString());
					prd.setStock(Integer.parseInt(Txt_Cantidad.getText()));
					prd.setPrecio(Double.parseDouble(Txt_Precio.getText()));
					NProductos.Registrar_Productos(prd);
					CleanTable();
					CleanTEXTBOX();
					Listar_Productos();
					JOptionPane.showMessageDialog(null, "Producto registrado con exito");
				}else {
					JOptionPane.showMessageDialog(null, "Los campos estan vacios!");
				}
			}
		});
		Btn_Registrar.setLayout(null);
		Btn_Registrar.setBackground(new Color(252, 176, 66));
		Btn_Registrar.setBounds(374, 528, 115, 33);
		Panel_Main_Productos.add(Btn_Registrar);
		
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

					if (!"".equals(Txt_Codigo.getText()) || !"".equals(Txt_Descripcion.getText())
							|| !"".equals(CBox_Proveedores.getSelectedItem()) || !"".equals(Txt_Cantidad.getText())
							|| !"".equals(Txt_Precio.getText())) {
						prd.setCodigo(Txt_Codigo.getText());
						prd.setNombre(Txt_Descripcion.getText());
						prd.setProveedor(CBox_Proveedores.getSelectedItem().toString());
						prd.setStock(Integer.parseInt(Txt_Cantidad.getText()));
						prd.setPrecio(Double.parseDouble(Txt_Cantidad.getText()));
						prd.setId(Integer.parseInt(Txt_ID.getText()));
						NProductos.Actualizar_Productos(prd);
						CleanTable();
						CleanTEXTBOX();
						Listar_Productos();
					}
				}
			}
		});
		Btn_Actualizar.setLayout(null);
		Btn_Actualizar.setBackground(new Color(252, 176, 66));
		Btn_Actualizar.setBounds(506, 528, 115, 33);
		Panel_Main_Productos.add(Btn_Actualizar);
		
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
						NProductos.Eliminar_Productos(Id);
						CleanTable();
						CleanTEXTBOX();
						Listar_Productos();
					}
				}
			}
		});
		Btn_Eliminar.setLayout(null);
		Btn_Eliminar.setBackground(new Color(252, 176, 66));
		Btn_Eliminar.setBounds(639, 528, 115, 33);
		Panel_Main_Productos.add(Btn_Eliminar);
		
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
		Btn_Nuevo.setBounds(764, 528, 115, 33);
		Panel_Main_Productos.add(Btn_Nuevo);
		
		JLabel Lbl_Btn_Nuevo = new JLabel("NUEVO");
		Lbl_Btn_Nuevo.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Nuevo.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Nuevo.setBounds(10, 0, 95, 33);
		Btn_Nuevo.add(Lbl_Btn_Nuevo);
		
		JPanel Btn_Excel = new JPanel();
		Btn_Excel.setLayout(null);
		Btn_Excel.setBackground(new Color(252, 176, 66));
		Btn_Excel.setBounds(374, 572, 115, 33);
		Panel_Main_Productos.add(Btn_Excel);
		
		JLabel Lbl_Btn_Excel = new JLabel("EXCEL");
		Lbl_Btn_Excel.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Excel.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Excel.setBounds(10, 0, 95, 33);
		Btn_Excel.add(Lbl_Btn_Excel);
		
		JPanel PanelLateral_Productos = new JPanel();
		PanelLateral_Productos.setBackground(new Color(252, 176, 66));
		PanelLateral_Productos.setBounds(0, 0, 317, 652);
		Panel_Main_Productos.add(PanelLateral_Productos);
		
		JLabel Lbl_TituloMain = new JLabel("REGISTRA LOS PRODUCTOS");
		Lbl_TituloMain.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_TituloMain.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		Lbl_TituloMain.setBounds(374, 30, 247, 19);
		Panel_Main_Productos.add(Lbl_TituloMain);
		
		

	}
}
