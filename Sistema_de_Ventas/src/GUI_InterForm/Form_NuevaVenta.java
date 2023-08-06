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

public class Form_NuevaVenta extends JInternalFrame {
	private JTextField Txt_Codigo;
	private JTextField Txt_Descripcion;
	private JTextField Txt_Cantidad;
	private JTextField Txt_Precio;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;

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
		setBounds(100, 100, 797, 679);
		getContentPane().setLayout(null);
		
		JPanel Panel_Main_NVenta = new JPanel();
		Panel_Main_NVenta.setBounds(0, 0, 781, 649);
		getContentPane().add(Panel_Main_NVenta);
		Panel_Main_NVenta.setLayout(null);
		
		JLabel Lbl_Codigo = new JLabel("Codigo");
		Lbl_Codigo.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Codigo.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Codigo.setBounds(308, 54, 61, 19);
		Panel_Main_NVenta.add(Lbl_Codigo);
		
		Txt_Codigo = new JTextField();
		Txt_Codigo.setColumns(10);
		Txt_Codigo.setBorder(null);
		Txt_Codigo.setBounds(379, 49, 145, 33);
		Panel_Main_NVenta.add(Txt_Codigo);
		
		JSeparator separator_txtCodigo = new JSeparator();
		separator_txtCodigo.setForeground(new Color(252, 176, 66));
		separator_txtCodigo.setBackground(new Color(252, 176, 66));
		separator_txtCodigo.setBounds(379, 82, 145, 13);
		Panel_Main_NVenta.add(separator_txtCodigo);
		
		JLabel Lbl_Descripcion = new JLabel("Descripcion");
		Lbl_Descripcion.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Descripcion.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Descripcion.setBounds(278, 99, 91, 19);
		Panel_Main_NVenta.add(Lbl_Descripcion);
		
		Txt_Descripcion = new JTextField();
		Txt_Descripcion.setColumns(10);
		Txt_Descripcion.setBorder(null);
		Txt_Descripcion.setBounds(381, 94, 368, 33);
		Panel_Main_NVenta.add(Txt_Descripcion);
		
		JSeparator separator_txtDescripcion = new JSeparator();
		separator_txtDescripcion.setForeground(new Color(252, 176, 66));
		separator_txtDescripcion.setBackground(new Color(252, 176, 66));
		separator_txtDescripcion.setBounds(381, 127, 368, 13);
		Panel_Main_NVenta.add(separator_txtDescripcion);
		
		JLabel Lbl_Cantidad = new JLabel("Cantidad");
		Lbl_Cantidad.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Cantidad.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Cantidad.setBounds(292, 143, 77, 19);
		Panel_Main_NVenta.add(Lbl_Cantidad);
		
		Txt_Cantidad = new JTextField();
		Txt_Cantidad.setColumns(10);
		Txt_Cantidad.setBorder(null);
		Txt_Cantidad.setBounds(379, 138, 370, 33);
		Panel_Main_NVenta.add(Txt_Cantidad);
		
		JSeparator separator_txtCantidad = new JSeparator();
		separator_txtCantidad.setForeground(new Color(252, 176, 66));
		separator_txtCantidad.setBackground(new Color(252, 176, 66));
		separator_txtCantidad.setBounds(379, 171, 370, 13);
		Panel_Main_NVenta.add(separator_txtCantidad);
		
		JLabel Lbl_Precio = new JLabel("Precio");
		Lbl_Precio.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Precio.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Precio.setBounds(308, 186, 61, 19);
		Panel_Main_NVenta.add(Lbl_Precio);
		
		Txt_Precio = new JTextField();
		Txt_Precio.setColumns(10);
		Txt_Precio.setBorder(null);
		Txt_Precio.setBounds(379, 181, 370, 33);
		Panel_Main_NVenta.add(Txt_Precio);
		
		JSeparator separator_txtPrecio = new JSeparator();
		separator_txtPrecio.setForeground(new Color(252, 176, 66));
		separator_txtPrecio.setBackground(new Color(252, 176, 66));
		separator_txtPrecio.setBounds(379, 214, 370, 13);
		Panel_Main_NVenta.add(separator_txtPrecio);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(379, 225, 145, 33);
		Panel_Main_NVenta.add(textField);
		
		JLabel Lbl_StockDisp = new JLabel("Disponible");
		Lbl_StockDisp.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_StockDisp.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_StockDisp.setBounds(278, 230, 91, 19);
		Panel_Main_NVenta.add(Lbl_StockDisp);
		
		JSeparator separator_txtStockDisp = new JSeparator();
		separator_txtStockDisp.setForeground(new Color(252, 176, 66));
		separator_txtStockDisp.setBackground(new Color(252, 176, 66));
		separator_txtStockDisp.setBounds(379, 258, 145, 13);
		Panel_Main_NVenta.add(separator_txtStockDisp);
		
		JPanel Btn_Eliminar = new JPanel();
		Btn_Eliminar.setLayout(null);
		Btn_Eliminar.setBackground(new Color(252, 176, 66));
		Btn_Eliminar.setBounds(635, 49, 115, 33);
		Panel_Main_NVenta.add(Btn_Eliminar);
		
		JLabel Lbl_Btn_Eliminar = new JLabel("ELIMINAR");
		Lbl_Btn_Eliminar.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Eliminar.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Eliminar.setBounds(10, 0, 95, 33);
		Btn_Eliminar.add(Lbl_Btn_Eliminar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(289, 333, 482, 163);
		Panel_Main_NVenta.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO", "TOTAL"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(85);
		scrollPane.setViewportView(table);
		
		JLabel Lbl_DNI_RUC = new JLabel("DNI/RUC");
		Lbl_DNI_RUC.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_DNI_RUC.setBounds(281, 518, 70, 19);
		Panel_Main_NVenta.add(Lbl_DNI_RUC);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(281, 543, 115, 33);
		Panel_Main_NVenta.add(textField_1);
		
		JSeparator separator_txtDNI_RUC = new JSeparator();
		separator_txtDNI_RUC.setForeground(new Color(252, 176, 66));
		separator_txtDNI_RUC.setBackground(new Color(252, 176, 66));
		separator_txtDNI_RUC.setBounds(281, 576, 115, 13);
		Panel_Main_NVenta.add(separator_txtDNI_RUC);
		
		JLabel Lbl_Nombre = new JLabel("Nombre");
		Lbl_Nombre.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Nombre.setBounds(418, 518, 70, 19);
		Panel_Main_NVenta.add(Lbl_Nombre);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(418, 543, 161, 33);
		Panel_Main_NVenta.add(textField_2);
		
		JSeparator separator_txtNombre = new JSeparator();
		separator_txtNombre.setForeground(new Color(252, 176, 66));
		separator_txtNombre.setBackground(new Color(252, 176, 66));
		separator_txtNombre.setBounds(418, 576, 161, 13);
		Panel_Main_NVenta.add(separator_txtNombre);
		
		JPanel Btn_Imprimir = new JPanel();
		Btn_Imprimir.setLayout(null);
		Btn_Imprimir.setBackground(new Color(252, 172, 66));
		Btn_Imprimir.setBounds(656, 543, 115, 33);
		Panel_Main_NVenta.add(Btn_Imprimir);
		
		JLabel Lbl_Btn_Imprimir = new JLabel("IMPRIMIR");
		Lbl_Btn_Imprimir.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Imprimir.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Imprimir.setBounds(10, 0, 95, 33);
		Btn_Imprimir.add(Lbl_Btn_Imprimir);
		
		JLabel Lbl_Total = new JLabel("Total a Pagar");
		Lbl_Total.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Total.setBounds(278, 600, 124, 19);
		Panel_Main_NVenta.add(Lbl_Total);
		
		JLabel Lbl_TotalMonto = new JLabel("- - - - ");
		Lbl_TotalMonto.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_TotalMonto.setBounds(412, 600, 70, 19);
		Panel_Main_NVenta.add(Lbl_TotalMonto);

	}
}
