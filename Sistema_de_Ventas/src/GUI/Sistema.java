package GUI;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Sistema extends JFrame {

	private JPanel contentPane;
	private JTextField Txt_Codigo;
	private JTextField Txt_Descripcion;
	private JTextField Txt_Canidad;
	private JTextField Txt_Precio;
	private JTextField Txt_StockDisp;
	private JTable table;
	private JTextField Txt_DNI_RUC;
	private JTextField Txt_Nombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema frame = new Sistema();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public Sistema() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Panel_main_sistema = new JPanel();
		Panel_main_sistema.setBackground(new Color(240, 240, 240));
		Panel_main_sistema.setBounds(0, 0, 1284, 683);
		contentPane.add(Panel_main_sistema);
		Panel_main_sistema.setLayout(null);
		
		JPanel Panel_menu = new JPanel();
		Panel_menu.setBackground(new Color(252, 174, 66));
		Panel_menu.setBounds(0, 0, 264, 725);
		Panel_main_sistema.add(Panel_menu);
		Panel_menu.setLayout(null);
		
		JPanel Btn_NuevaVenta = new JPanel();
		Btn_NuevaVenta.addMouseListener(new MouseAdapter() {
		/*LA SIGUIENTE LINEA CAMBIA EL COLOR DEL PANEL UTILIZADO COMO BOTON,
		 * A UNO MAS CLARO PARA HACER VER QUE ES CLICKEABLE	*/
			@Override
			public void mouseEntered(MouseEvent e) {
				Btn_NuevaVenta.setBackground(new Color(253,196,111));
			}
			
		/*REGRESA EL PANEL A SU COLOR ORIGINAL*/	
			@Override
			public void mouseExited(MouseEvent e) {
				Btn_NuevaVenta.setBackground(new Color(252, 176, 66));
			}
		});
		Btn_NuevaVenta.setBackground(new Color(252, 176, 66));
		Btn_NuevaVenta.setBounds(0, 225, 264, 66);
		Panel_menu.add(Btn_NuevaVenta);
		Btn_NuevaVenta.setLayout(null);
		
		JLabel Lbl_Btn_NuevaVenta = new JLabel("NUEVA VENTA");
		Lbl_Btn_NuevaVenta.setIcon(new ImageIcon(Sistema.class.getResource("/Img/carrito-de-compras.png")));
		Lbl_Btn_NuevaVenta.setFont(new Font("Roboto", Font.PLAIN, 18));
		Lbl_Btn_NuevaVenta.setBounds(32, 11, 161, 43);
		Btn_NuevaVenta.add(Lbl_Btn_NuevaVenta);
		
		JPanel Btn_Clientes = new JPanel();
		Btn_Clientes.addMouseListener(new MouseAdapter() {
		/*LA SIGUIENTE LINEA CAMBIA EL COLOR DEL PANEL UTILIZADO COMO BOTON,
		 * A UNO MAS CLARO PARA HACER VER QUE ES CLICKEABLE	*/
			@Override
			public void mouseEntered(MouseEvent e) {
				Btn_Clientes.setBackground(new Color(253,196,111));
			}
			
		/*REGRESA EL PANEL A SU COLOR ORIGINAL*/	
			@Override
			public void mouseExited(MouseEvent e) {
				Btn_Clientes.setBackground(new Color(252, 176, 66));
			}
		});
		Btn_Clientes.setBackground(new Color(252, 176, 66));
		Btn_Clientes.setBounds(0, 302, 264, 65);
		Panel_menu.add(Btn_Clientes);
		Btn_Clientes.setLayout(null);
		
		JLabel Lbl_Btn_Clientes = new JLabel("CLIENTES");
		Lbl_Btn_Clientes.setIcon(new ImageIcon(Sistema.class.getResource("/Img/atencion-al-cliente.png")));
		Lbl_Btn_Clientes.setFont(new Font("Roboto", Font.PLAIN, 18));
		Lbl_Btn_Clientes.setBounds(33, 11, 118, 43);
		Btn_Clientes.add(Lbl_Btn_Clientes);
		
		JPanel Btn_Proveedores = new JPanel();
		Btn_Proveedores.addMouseListener(new MouseAdapter() {
		/*LA SIGUIENTE LINEA CAMBIA EL COLOR DEL PANEL UTILIZADO COMO BOTON,
		 * A UNO MAS CLARO PARA HACER VER QUE ES CLICKEABLE	*/
			@Override
			public void mouseEntered(MouseEvent e) {
				Btn_Proveedores.setBackground(new Color(253,196,111));
			}
			
		/*REGRESA EL PANEL A SU COLOR ORIGINAL*/	
			@Override
			public void mouseExited(MouseEvent e) {
				Btn_Proveedores.setBackground(new Color(252, 176, 66));
			}
		});
		Btn_Proveedores.setBackground(new Color(252, 176, 66));
		Btn_Proveedores.setBounds(0, 378, 264, 67);
		Panel_menu.add(Btn_Proveedores);
		Btn_Proveedores.setLayout(null);
		
		JLabel Lbl_Btn_Proveedores = new JLabel("PROVEEDORES");
		Lbl_Btn_Proveedores.setIcon(new ImageIcon(Sistema.class.getResource("/Img/gestion-de-la-relacion-con-el-cliente.png")));
		Lbl_Btn_Proveedores.setFont(new Font("Roboto", Font.PLAIN, 18));
		Lbl_Btn_Proveedores.setBounds(33, 11, 157, 43);
		Btn_Proveedores.add(Lbl_Btn_Proveedores);
		
		JPanel Btn_Productos = new JPanel();
		Btn_Productos.addMouseListener(new MouseAdapter() {
		/*LA SIGUIENTE LINEA CAMBIA EL COLOR DEL PANEL UTILIZADO COMO BOTON,
		 * A UNO MAS CLARO PARA HACER VER QUE ES CLICKEABLE	*/
			@Override
			public void mouseEntered(MouseEvent e) {
				Btn_Productos.setBackground(new Color(253,196,111));
			}
			
		/*REGRESA EL PANEL A SU COLOR ORIGINAL*/	
			@Override
			public void mouseExited(MouseEvent e) {
				Btn_Productos.setBackground(new Color(252, 176, 66));
			}
		});
		Btn_Productos.setBackground(new Color(252, 176, 66));
		Btn_Productos.setBounds(0, 456, 264, 66);
		Panel_menu.add(Btn_Productos);
		Btn_Productos.setLayout(null);
		
		JLabel Lbl_Btn_Productos = new JLabel("PRODUCTOS");
		Lbl_Btn_Productos.setIcon(new ImageIcon(Sistema.class.getResource("/Img/inventario.png")));
		Lbl_Btn_Productos.setFont(new Font("Roboto", Font.PLAIN, 18));
		Lbl_Btn_Productos.setBounds(36, 11, 159, 43);
		Btn_Productos.add(Lbl_Btn_Productos);
		
		JPanel Btn_Ventas = new JPanel();
		Btn_Ventas.addMouseListener(new MouseAdapter() {
		/*LA SIGUIENTE LINEA CAMBIA EL COLOR DEL PANEL UTILIZADO COMO BOTON,
		 * A UNO MAS CLARO PARA HACER VER QUE ES CLICKEABLE	*/
			@Override
			public void mouseEntered(MouseEvent e) {
				Btn_Ventas.setBackground(new Color(253,196,111));
			}
			
		/*REGRESA EL PANEL A SU COLOR ORIGINAL*/	
			@Override
			public void mouseExited(MouseEvent e) {
				Btn_Ventas.setBackground(new Color(252, 176, 66));
			}
		});
		Btn_Ventas.setBackground(new Color(252, 176, 66));
		Btn_Ventas.setBounds(0, 533, 264, 64);
		Panel_menu.add(Btn_Ventas);
		Btn_Ventas.setLayout(null);
		
		JLabel Lbl_Btn_Ventas = new JLabel("VENTAS");
		Lbl_Btn_Ventas.setIcon(new ImageIcon(Sistema.class.getResource("/Img/ventas.png")));
		Lbl_Btn_Ventas.setFont(new Font("Roboto", Font.PLAIN, 18));
		Lbl_Btn_Ventas.setBounds(38, 11, 110, 43);
		Btn_Ventas.add(Lbl_Btn_Ventas);
		
		JPanel Btn_Config = new JPanel();
		Btn_Config.addMouseListener(new MouseAdapter() {
		/*LA SIGUIENTE LINEA CAMBIA EL COLOR DEL PANEL UTILIZADO COMO BOTON,
		 * A UNO MAS CLARO PARA HACER VER QUE ES CLICKEABLE	*/
			@Override
			public void mouseEntered(MouseEvent e) {
				Btn_Config.setBackground(new Color(253,196,111));
			}
			
		/*REGRESA EL PANEL A SU COLOR ORIGINAL*/	
			@Override
			public void mouseExited(MouseEvent e) {
				Btn_Config.setBackground(new Color(252, 176, 66));
			}
		});
		Btn_Config.setBackground(new Color(252, 176, 66));
		Btn_Config.setBounds(0, 608, 264, 64);
		Panel_menu.add(Btn_Config);
		Btn_Config.setLayout(null);
		
		JLabel Lbl_Btn_Config = new JLabel("CONFIG");
		Lbl_Btn_Config.setIcon(new ImageIcon(Sistema.class.getResource("/Img/configuraciones.png")));
		Lbl_Btn_Config.setFont(new Font("Roboto", Font.PLAIN, 18));
		Lbl_Btn_Config.setBounds(40, 11, 116, 42);
		Btn_Config.add(Lbl_Btn_Config);
		
		JTabbedPane TabbedPane_ventanas = new JTabbedPane(JTabbedPane.TOP);
		TabbedPane_ventanas.setBounds(264, 219, 1020, 463);
		Panel_main_sistema.add(TabbedPane_ventanas);
		
		JPanel PanelVentana_NuevaVenta = new JPanel();
		TabbedPane_ventanas.addTab("", new ImageIcon(Sistema.class.getResource("/Img/carrito-de-compras.png")), PanelVentana_NuevaVenta, null);
		PanelVentana_NuevaVenta.setLayout(null);
		
		JLabel Lbl_Codigo = new JLabel("Codigo");
		Lbl_Codigo.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Codigo.setBounds(28, 23, 70, 19);
		PanelVentana_NuevaVenta.add(Lbl_Codigo);
		
		Txt_Codigo = new JTextField();
		Txt_Codigo.setBorder(null);
		Txt_Codigo.setBounds(28, 48, 142, 33);
		PanelVentana_NuevaVenta.add(Txt_Codigo);
		Txt_Codigo.setColumns(10);
		
		JSeparator separator_txtCodigo = new JSeparator();
		separator_txtCodigo.setBackground(new Color(252, 176, 66));
		separator_txtCodigo.setForeground(new Color(252, 176, 66));
		separator_txtCodigo.setBounds(28, 81, 142, 13);
		PanelVentana_NuevaVenta.add(separator_txtCodigo);
		
		JLabel Lbl_Descripcion = new JLabel("Descripcion");
		Lbl_Descripcion.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Descripcion.setBounds(213, 23, 91, 19);
		PanelVentana_NuevaVenta.add(Lbl_Descripcion);
		
		Txt_Descripcion = new JTextField();
		Txt_Descripcion.setColumns(10);
		Txt_Descripcion.setBorder(null);
		Txt_Descripcion.setBounds(213, 48, 230, 33);
		PanelVentana_NuevaVenta.add(Txt_Descripcion);
		
		JSeparator separator_txtDescripcion = new JSeparator();
		separator_txtDescripcion.setForeground(new Color(252, 176, 66));
		separator_txtDescripcion.setBackground(new Color(252, 176, 66));
		separator_txtDescripcion.setBounds(213, 81, 230, 13);
		PanelVentana_NuevaVenta.add(separator_txtDescripcion);
		
		JLabel Lbl_Cantidad = new JLabel("Cantidad");
		Lbl_Cantidad.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Cantidad.setBounds(480, 23, 70, 19);
		PanelVentana_NuevaVenta.add(Lbl_Cantidad);
		
		Txt_Canidad = new JTextField();
		Txt_Canidad.setColumns(10);
		Txt_Canidad.setBorder(null);
		Txt_Canidad.setBounds(480, 48, 98, 33);
		PanelVentana_NuevaVenta.add(Txt_Canidad);
		
		JSeparator separator_txtCantidad = new JSeparator();
		separator_txtCantidad.setForeground(new Color(252, 176, 66));
		separator_txtCantidad.setBackground(new Color(252, 176, 66));
		separator_txtCantidad.setBounds(480, 81, 98, 13);
		PanelVentana_NuevaVenta.add(separator_txtCantidad);
		
		Txt_Precio = new JTextField();
		Txt_Precio.setColumns(10);
		Txt_Precio.setBorder(null);
		Txt_Precio.setBounds(611, 48, 101, 33);
		PanelVentana_NuevaVenta.add(Txt_Precio);
		
		JSeparator separator_txtPrecio = new JSeparator();
		separator_txtPrecio.setForeground(new Color(252, 176, 66));
		separator_txtPrecio.setBackground(new Color(252, 176, 66));
		separator_txtPrecio.setBounds(611, 81, 101, 13);
		PanelVentana_NuevaVenta.add(separator_txtPrecio);
		
		JLabel Lbl_Precio = new JLabel("Precio");
		Lbl_Precio.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Precio.setBounds(611, 23, 70, 19);
		PanelVentana_NuevaVenta.add(Lbl_Precio);
		
		Txt_StockDisp = new JTextField();
		Txt_StockDisp.setColumns(10);
		Txt_StockDisp.setBorder(null);
		Txt_StockDisp.setBounds(745, 48, 100, 33);
		PanelVentana_NuevaVenta.add(Txt_StockDisp);
		
		JSeparator separator_txtStockDisp = new JSeparator();
		separator_txtStockDisp.setForeground(new Color(252, 176, 66));
		separator_txtStockDisp.setBackground(new Color(252, 176, 66));
		separator_txtStockDisp.setBounds(745, 81, 100, 13);
		PanelVentana_NuevaVenta.add(separator_txtStockDisp);
		
		JLabel Lbl_StockDisp = new JLabel("Stock Disponible");
		Lbl_StockDisp.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_StockDisp.setBounds(745, 23, 126, 19);
		PanelVentana_NuevaVenta.add(Lbl_StockDisp);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 105, 953, 219);
		PanelVentana_NuevaVenta.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO", "TOTAL"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(92);
		scrollPane.setViewportView(table);
		
		JLabel Lbl_DNI_RUC = new JLabel("DNI/RUC");
		Lbl_DNI_RUC.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_DNI_RUC.setBounds(28, 335, 70, 19);
		PanelVentana_NuevaVenta.add(Lbl_DNI_RUC);
		
		Txt_DNI_RUC = new JTextField();
		Txt_DNI_RUC.setColumns(10);
		Txt_DNI_RUC.setBorder(null);
		Txt_DNI_RUC.setBounds(28, 360, 115, 33);
		PanelVentana_NuevaVenta.add(Txt_DNI_RUC);
		
		JSeparator separator_txtDNI_RUC = new JSeparator();
		separator_txtDNI_RUC.setForeground(new Color(252, 176, 66));
		separator_txtDNI_RUC.setBackground(new Color(252, 176, 66));
		separator_txtDNI_RUC.setBounds(28, 393, 115, 13);
		PanelVentana_NuevaVenta.add(separator_txtDNI_RUC);
		
		JLabel Lbl_Nombre = new JLabel("Nombre");
		Lbl_Nombre.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Nombre.setBounds(185, 335, 70, 19);
		PanelVentana_NuevaVenta.add(Lbl_Nombre);
		
		Txt_Nombre = new JTextField();
		Txt_Nombre.setColumns(10);
		Txt_Nombre.setBorder(null);
		Txt_Nombre.setBounds(185, 360, 218, 33);
		PanelVentana_NuevaVenta.add(Txt_Nombre);
		
		JSeparator separator_txtNombre = new JSeparator();
		separator_txtNombre.setForeground(new Color(252, 176, 66));
		separator_txtNombre.setBackground(new Color(252, 176, 66));
		separator_txtNombre.setBounds(185, 393, 218, 13);
		PanelVentana_NuevaVenta.add(separator_txtNombre);
		
		JPanel Btn_Imprimir = new JPanel();
		Btn_Imprimir.setBounds(435, 360, 115, 33);
		Btn_Imprimir.setBackground(new Color(128, 255, 0));
		PanelVentana_NuevaVenta.add(Btn_Imprimir);
		Btn_Imprimir.setLayout(null);
		
		JLabel Lbl_Btn_Imprimir = new JLabel("IMPRIMIR");
		Lbl_Btn_Imprimir.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Imprimir.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Imprimir.setBounds(10, 0, 95, 33);
		Btn_Imprimir.add(Lbl_Btn_Imprimir);
		
		JLabel Lbl_Total = new JLabel("Total a Pagar");
		Lbl_Total.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Total.setBounds(777, 365, 124, 19);
		PanelVentana_NuevaVenta.add(Lbl_Total);
		
		JLabel Lbl_TotalMonto = new JLabel("- - - - ");
		Lbl_TotalMonto.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_TotalMonto.setBounds(911, 365, 70, 19);
		PanelVentana_NuevaVenta.add(Lbl_TotalMonto);
		
		JPanel Btn_Eliminar = new JPanel();
		Btn_Eliminar.setLayout(null);
		Btn_Eliminar.setBackground(new Color(252, 176, 66));
		Btn_Eliminar.setBounds(866, 48, 115, 33);
		PanelVentana_NuevaVenta.add(Btn_Eliminar);
		
		JLabel Lbl_Btn_Eliminar = new JLabel("ELIMINAR");
		Lbl_Btn_Eliminar.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Eliminar.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Eliminar.setBounds(10, 0, 95, 33);
		Btn_Eliminar.add(Lbl_Btn_Eliminar);
		
		JPanel panel_1 = new JPanel();
		TabbedPane_ventanas.addTab("", new ImageIcon(Sistema.class.getResource("/Img/atencion-al-cliente.png")), panel_1, null);
		
		JPanel panel_2 = new JPanel();
		TabbedPane_ventanas.addTab("", new ImageIcon(Sistema.class.getResource("/Img/gestion-de-la-relacion-con-el-cliente.png")), panel_2, null);
		
		JPanel panel_3 = new JPanel();
		TabbedPane_ventanas.addTab("", new ImageIcon(Sistema.class.getResource("/Img/inventario.png")), panel_3, null);
		
		JPanel panel_4 = new JPanel();
		TabbedPane_ventanas.addTab("", new ImageIcon(Sistema.class.getResource("/Img/ventas.png")), panel_4, null);
		
		JPanel panel_5 = new JPanel();
		TabbedPane_ventanas.addTab("", new ImageIcon(Sistema.class.getResource("/Img/configuraciones.png")), panel_5, null);
		panel_5.setLayout(null);
		
		
	}
}