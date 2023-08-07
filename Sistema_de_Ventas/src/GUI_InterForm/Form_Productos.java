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
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Form_Productos extends JInternalFrame {
	private JTextField Txt_Codigo;
	private JTextField Txt_Descripcion;
	private JTextField Txt_Cantidad;
	private JTextField Txt_Precio;
	private JTable Tabla_Productos;

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
		
		JComboBox CBox_Proveedores = new JComboBox();
		CBox_Proveedores.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		CBox_Proveedores.setBounds(554, 222, 200, 33);
		Panel_Main_Productos.add(CBox_Proveedores);
		
		JSeparator separator_txtProveedores = new JSeparator();
		separator_txtProveedores.setForeground(new Color(252, 176, 66));
		separator_txtProveedores.setBackground(new Color(252, 176, 66));
		separator_txtProveedores.setBounds(554, 255, 200, 13);
		Panel_Main_Productos.add(separator_txtProveedores);
		
		JScrollPane scrollPane_Productos = new JScrollPane();
		scrollPane_Productos.setBounds(374, 279, 505, 225);
		Panel_Main_Productos.add(scrollPane_Productos);
		
		Tabla_Productos = new JTable();
		Tabla_Productos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"CODIGO", "DESCRIPCION", "STOCK", "PRECIO", "PROVEEDOR"
			}
		));
		Tabla_Productos.getColumnModel().getColumn(1).setPreferredWidth(86);
		scrollPane_Productos.setViewportView(Tabla_Productos);
		
		JPanel Btn_Guardar = new JPanel();
		Btn_Guardar.setLayout(null);
		Btn_Guardar.setBackground(new Color(252, 176, 66));
		Btn_Guardar.setBounds(374, 528, 115, 33);
		Panel_Main_Productos.add(Btn_Guardar);
		
		JLabel Lbl_Btn_Guardar = new JLabel("GUARDAR");
		Lbl_Btn_Guardar.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Guardar.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Guardar.setBounds(10, 0, 95, 33);
		Btn_Guardar.add(Lbl_Btn_Guardar);
		
		JPanel Btn_Actualizar = new JPanel();
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
