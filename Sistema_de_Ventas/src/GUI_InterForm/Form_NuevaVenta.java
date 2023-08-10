package GUI_InterForm;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Form_NuevaVenta extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField Txt_Codigo;
	private JTextField Txt_Descripcion;
	private JTextField Txt_Cantidad;
	private JTextField Txt_Precio;
	private JTextField Txt_Disponible;
	private DefaultTableModel Tabla_NVenta;
	private JTextField Txt_DNI_RUC;
	private JTextField Txt_Nombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_NuevaVenta frame = new Form_NuevaVenta();
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
	public Form_NuevaVenta() {
		setClosable(true);
		setBounds(100, 100, 950, 682);
		getContentPane().setLayout(null);
		
		JPanel Panel_Main_NVenta = new JPanel();
		Panel_Main_NVenta.setBounds(0, 0, 934, 652);
		getContentPane().add(Panel_Main_NVenta);
		Panel_Main_NVenta.setLayout(null);
		
		JLabel Lbl_Codigo = new JLabel("Codigo");
		Lbl_Codigo.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Codigo.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Codigo.setBounds(378, 106, 55, 19);
		Panel_Main_NVenta.add(Lbl_Codigo);
		
		Txt_Codigo = new JTextField();
		Txt_Codigo.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Codigo.setColumns(10);
		Txt_Codigo.setBorder(null);
		Txt_Codigo.setBounds(378, 128, 145, 33);
		Panel_Main_NVenta.add(Txt_Codigo);
		
		JSeparator separator_txtCodigo = new JSeparator();
		separator_txtCodigo.setForeground(new Color(252, 176, 66));
		separator_txtCodigo.setBackground(new Color(252, 176, 66));
		separator_txtCodigo.setBounds(378, 161, 145, 13);
		Panel_Main_NVenta.add(separator_txtCodigo);
		
		JLabel Lbl_Descripcion = new JLabel("Descripcion");
		Lbl_Descripcion.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Descripcion.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Descripcion.setBounds(560, 106, 84, 19);
		Panel_Main_NVenta.add(Lbl_Descripcion);
		
		Txt_Descripcion = new JTextField();
		Txt_Descripcion.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Descripcion.setColumns(10);
		Txt_Descripcion.setBorder(null);
		Txt_Descripcion.setBounds(559, 128, 159, 33);
		Panel_Main_NVenta.add(Txt_Descripcion);
		
		JSeparator separator_txtDescripcion = new JSeparator();
		separator_txtDescripcion.setForeground(new Color(252, 176, 66));
		separator_txtDescripcion.setBackground(new Color(252, 176, 66));
		separator_txtDescripcion.setBounds(559, 161, 159, 13);
		Panel_Main_NVenta.add(separator_txtDescripcion);
		
		JLabel Lbl_Cantidad = new JLabel("Cantidad");
		Lbl_Cantidad.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Cantidad.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Cantidad.setBounds(751, 106, 77, 19);
		Panel_Main_NVenta.add(Lbl_Cantidad);
		
		Txt_Cantidad = new JTextField();
		Txt_Cantidad.addKeyListener(new KeyAdapter() {
			private Object modelo;

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(!"".equals(Txt_Cantidad.getText())) {
						String codigo = Txt_Codigo.getText();
						String descripcion = Txt_Descripcion.getText();
						int Cantidad = Integer.parseInt(Txt_Precio.getText());
						double precio = Double.parseDouble(Txt_Precio.getText());
						double total = Cantidad * precio;
						int Stock = Integer.parseInt(Txt_Disponible.getText());
						if(Stock >= Cantidad) {
							int item = item + 1;
							modelo = Tabla_NVenta.getTableModelListeners();
							ArrayList lista = new ArrayList();
							lista.add(item);
							lista.add(codigo);
							lista.add(descripcion);
							lista.add(Cantidad);
							lista.add(precio);
							lista.add(total);
							ñ
							Object[] TotalList = new Object[5];
							♫
							
						}
					}
				}
			}
		});
		Txt_Cantidad.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Cantidad.setColumns(10);
		Txt_Cantidad.setBorder(null);
		Txt_Cantidad.setBounds(751, 128, 122, 33);
		Panel_Main_NVenta.add(Txt_Cantidad);
		
		JSeparator separator_txtCantidad = new JSeparator();
		separator_txtCantidad.setForeground(new Color(252, 176, 66));
		separator_txtCantidad.setBackground(new Color(252, 176, 66));
		separator_txtCantidad.setBounds(751, 161, 122, 13);
		Panel_Main_NVenta.add(separator_txtCantidad);
		
		JLabel Lbl_Precio = new JLabel("Precio");
		Lbl_Precio.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Precio.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Precio.setBounds(378, 178, 50, 19);
		Panel_Main_NVenta.add(Lbl_Precio);
		
		Txt_Precio = new JTextField();
		Txt_Precio.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Precio.setColumns(10);
		Txt_Precio.setBorder(null);
		Txt_Precio.setBounds(378, 199, 145, 33);
		Panel_Main_NVenta.add(Txt_Precio);
		
		JSeparator separator_txtPrecio = new JSeparator();
		separator_txtPrecio.setForeground(new Color(252, 176, 66));
		separator_txtPrecio.setBackground(new Color(252, 176, 66));
		separator_txtPrecio.setBounds(378, 232, 145, 13);
		Panel_Main_NVenta.add(separator_txtPrecio);
		
		Txt_Disponible = new JTextField();
		Txt_Disponible.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Disponible.setColumns(10);
		Txt_Disponible.setBorder(null);
		Txt_Disponible.setBounds(560, 199, 158, 33);
		Panel_Main_NVenta.add(Txt_Disponible);
		
		JLabel Lbl_StockDisp = new JLabel("Disponible");
		Lbl_StockDisp.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_StockDisp.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_StockDisp.setBounds(560, 178, 77, 19);
		Panel_Main_NVenta.add(Lbl_StockDisp);
		
		JSeparator separator_txtStockDisp = new JSeparator();
		separator_txtStockDisp.setForeground(new Color(252, 176, 66));
		separator_txtStockDisp.setBackground(new Color(252, 176, 66));
		separator_txtStockDisp.setBounds(560, 232, 158, 13);
		Panel_Main_NVenta.add(separator_txtStockDisp);
		
		JPanel Btn_Eliminar = new JPanel();
		Btn_Eliminar.setLayout(null);
		Btn_Eliminar.setBackground(new Color(252, 176, 66));
		Btn_Eliminar.setBounds(378, 272, 115, 33);
		Panel_Main_NVenta.add(Btn_Eliminar);
		
		JLabel Lbl_Btn_Eliminar = new JLabel("ELIMINAR");
		Lbl_Btn_Eliminar.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Eliminar.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Eliminar.setBounds(10, 0, 95, 33);
		Btn_Eliminar.add(Lbl_Btn_Eliminar);
		
		JScrollPane scrollPane_NVenta = new JScrollPane();
		scrollPane_NVenta.setBounds(379, 348, 497, 163);
		Panel_Main_NVenta.add(scrollPane_NVenta);
		
		Tabla_NVenta = new JTable();
		Tabla_NVenta.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO", "TOTAL"
			}
		));
		Tabla_NVenta.getColumnModel().getColumn(1).setPreferredWidth(85);
		scrollPane_NVenta.setViewportView(Tabla_NVenta);
		
		JLabel Lbl_DNI_RUC = new JLabel("DNI/RUC");
		Lbl_DNI_RUC.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_DNI_RUC.setBounds(378, 521, 70, 19);
		Panel_Main_NVenta.add(Lbl_DNI_RUC);
		
		Txt_DNI_RUC = new JTextField();
		Txt_DNI_RUC.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_DNI_RUC.setColumns(10);
		Txt_DNI_RUC.setBorder(null);
		Txt_DNI_RUC.setBounds(378, 546, 115, 33);
		Panel_Main_NVenta.add(Txt_DNI_RUC);
		
		JSeparator separator_txtDNI_RUC = new JSeparator();
		separator_txtDNI_RUC.setForeground(new Color(252, 176, 66));
		separator_txtDNI_RUC.setBackground(new Color(252, 176, 66));
		separator_txtDNI_RUC.setBounds(378, 579, 115, 13);
		Panel_Main_NVenta.add(separator_txtDNI_RUC);
		
		JLabel Lbl_Nombre = new JLabel("Nombre");
		Lbl_Nombre.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Nombre.setBounds(526, 521, 70, 19);
		Panel_Main_NVenta.add(Lbl_Nombre);
		
		Txt_Nombre = new JTextField();
		Txt_Nombre.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Nombre.setColumns(10);
		Txt_Nombre.setBorder(null);
		Txt_Nombre.setBounds(526, 546, 161, 33);
		Panel_Main_NVenta.add(Txt_Nombre);
		
		JSeparator separator_txtNombre = new JSeparator();
		separator_txtNombre.setForeground(new Color(252, 176, 66));
		separator_txtNombre.setBackground(new Color(252, 176, 66));
		separator_txtNombre.setBounds(526, 579, 161, 13);
		Panel_Main_NVenta.add(separator_txtNombre);
		
		JPanel Btn_Imprimir = new JPanel();
		Btn_Imprimir.setLayout(null);
		Btn_Imprimir.setBackground(new Color(252, 172, 66));
		Btn_Imprimir.setBounds(758, 547, 115, 33);
		Panel_Main_NVenta.add(Btn_Imprimir);
		
		JLabel Lbl_Btn_Imprimir = new JLabel("IMPRIMIR");
		Lbl_Btn_Imprimir.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Imprimir.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Imprimir.setBounds(10, 0, 95, 33);
		Btn_Imprimir.add(Lbl_Btn_Imprimir);
		
		JLabel Lbl_Total = new JLabel("Total a Pagar");
		Lbl_Total.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Total.setBounds(381, 609, 124, 19);
		Panel_Main_NVenta.add(Lbl_Total);
		
		JLabel Lbl_TotalMonto = new JLabel("- - - - ");
		Lbl_TotalMonto.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_TotalMonto.setBounds(515, 609, 70, 19);
		Panel_Main_NVenta.add(Lbl_TotalMonto);
		
		JPanel PanelLateral_NVenta = new JPanel();
		PanelLateral_NVenta.setBackground(new Color(252, 176, 66));
		PanelLateral_NVenta.setBounds(0, 0, 317, 652);
		Panel_Main_NVenta.add(PanelLateral_NVenta);
		
		JLabel Lbl_TituloMain = new JLabel("REGISTRA UNA NUEVA VENTA");
		Lbl_TituloMain.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_TituloMain.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		Lbl_TituloMain.setBounds(378, 29, 265, 19);
		Panel_Main_NVenta.add(Lbl_TituloMain);

	}
}

