package GUI_InterForm;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPCell;

import Config.ClientesBD;
import Config.ProductosBD;
import Config.VentasBD;
import Interface.Operaciones_NuevaVenta;
import Mod_Consultas.Clientes;
import Mod_Consultas.Detalles;
import Mod_Consultas.Productos;
import Mod_Consultas.Ventas;
import javax.swing.ImageIcon;


public class Form_NuevaVenta extends JInternalFrame implements Operaciones_NuevaVenta{
	
	 
	private static final long serialVersionUID = 1L;
	private JTextField Txt_Codigo;
	private JTextField Txt_Descripcion;
	private JTextField Txt_Cantidad;
	private JTextField Txt_Precio;
	private JTextField Txt_Disponible;
	private JTable Tabla_NVenta;
	private JTextField Txt_DNI_RUC;
	private JTextField Txt_Nombre;
	JLabel Lbl_Vendedor;
	JLabel Lbl_TotalMonto;
	int item;
	double TotalPagar = 0.00;
   
    
    ProductosBD proBD = new ProductosBD();
    Productos prod = new Productos();
    Ventas V = new Ventas();
    VentasBD VBD = new VentasBD();
    Detalles DT = new Detalles();
    Clientes cl = new Clientes();
    ClientesBD cliente = new ClientesBD();
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel TMP = new DefaultTableModel();
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
		Txt_Codigo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(!"".equals(Txt_Codigo.getText())) {
						String codigo = Txt_Codigo.getText();
						prod = proBD.Buscar_Producto(codigo);
						if(prod.getNombre() != null) {
							Txt_Descripcion.setText("" + prod.getNombre());
							Txt_Precio.setText("" + prod.getPrecio());
							Txt_Disponible.setText("" + prod.getStock());
							Txt_Cantidad.requestFocus();
						}else {
							CleanTEXTBOX();
							Txt_Codigo.requestFocus();
						}
							
					}else {
						JOptionPane.showMessageDialog(null, "Ingrese el codigo del producto");
						Txt_Codigo.requestFocus();
					}
				}
			}
			
		});
		Txt_Codigo.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_Codigo.setColumns(10);
		Txt_Codigo.setBorder(null);
		Txt_Codigo.setBounds(378, 128, 145, 33);
		Panel_Main_NVenta.add(Txt_Codigo);
		
		JSeparator separator_txtCodigo = new JSeparator();
		separator_txtCodigo.setForeground(new Color(252, 176, 66));
		separator_txtCodigo.setBackground(new Color(243, 113, 56));
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
		separator_txtDescripcion.setBackground(new Color(243, 113, 56));
		separator_txtDescripcion.setBounds(559, 161, 159, 13);
		Panel_Main_NVenta.add(separator_txtDescripcion);
		
		JLabel Lbl_Cantidad = new JLabel("Cantidad");
		Lbl_Cantidad.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Cantidad.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Cantidad.setBounds(751, 106, 77, 19);
		Panel_Main_NVenta.add(Lbl_Cantidad);
		
		Txt_Cantidad = new JTextField();
		Txt_Cantidad.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(!"".equals(Txt_Cantidad.getText())){
						String codigo = Txt_Codigo.getText();
						String descripcion = Txt_Descripcion.getText();
						int cantidad = Integer.parseInt(Txt_Cantidad.getText());
						double precio = Double.parseDouble(Txt_Precio.getText());
						double total = cantidad * precio;
						int stock = Integer.parseInt(Txt_Disponible.getText());
						
						if (stock >= cantidad) {
							item = item + 1;
							TMP = (DefaultTableModel) Tabla_NVenta.getModel();
							
							for (int i = 0; i < Tabla_NVenta.getRowCount(); i++) {
								
								if (Tabla_NVenta.getValueAt(i, 1).equals(Txt_Descripcion.getText())) {
									JOptionPane.showMessageDialog(null,"El Producto ya esta registrado");
									return;
								}
							}
							ArrayList lista = new ArrayList();
							lista.add(item);
							lista.add(codigo);
							lista.add(descripcion);
							lista.add(cantidad);
							lista.add(precio);
							lista.add(total);
							
							Object[] O =  new Object[5];
							O[0] = lista.get(1);
							O[1] = lista.get(2);
							O[2] = lista.get(3);
							O[3] = lista.get(4);
							O[4] = lista.get(5);
							TMP.addRow(O);
							Tabla_NVenta.setModel(TMP);
							Total_A_Pagar();
							CleanTEXTBOX();
							Txt_Codigo.requestFocus();
						}else {
							JOptionPane.showMessageDialog(null,"Cantidad stock no disponible");
						}
					}else {
						JOptionPane.showMessageDialog(null,"Ingrese la cantidad");
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
		separator_txtCantidad.setBackground(new Color(243, 113, 56));
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
		separator_txtPrecio.setBackground(new Color(243, 113, 56));
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
		separator_txtStockDisp.setBackground(new Color(243, 113, 56));
		separator_txtStockDisp.setBounds(560, 232, 158, 13);
		Panel_Main_NVenta.add(separator_txtStockDisp);
		
		JPanel Btn_Eliminar = new JPanel();
		Btn_Eliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modelo = (DefaultTableModel) Tabla_NVenta.getModel();
				modelo.removeRow(Tabla_NVenta.getSelectedRow());
				Total_A_Pagar();
				Txt_Codigo.requestFocus();
			}
		});
	
		Btn_Eliminar.setLayout(null);
		Btn_Eliminar.setBackground(new Color(243, 113, 56));
		Btn_Eliminar.setBounds(384, 273, 139, 40);
		Panel_Main_NVenta.add(Btn_Eliminar);
		
		JLabel Lbl_Btn_Eliminar = new JLabel("ELIMINAR");
		Lbl_Btn_Eliminar.setIcon(new ImageIcon("C:\\Users\\maycol\\Downloads\\close.png"));
		Lbl_Btn_Eliminar.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Eliminar.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Eliminar.setBounds(10, 0, 119, 41);
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
		
		JLabel Lbl_DNI_RUC = new JLabel("DNI/RNC");
		Lbl_DNI_RUC.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_DNI_RUC.setBounds(378, 521, 70, 19);
		Panel_Main_NVenta.add(Lbl_DNI_RUC);
		
		Txt_DNI_RUC = new JTextField();
		Txt_DNI_RUC.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(!"".equals(Txt_DNI_RUC.getText())) {
						int dni = Integer.parseInt(Txt_DNI_RUC.getText());
						cl = cliente.BuscarClientes(dni);
						if(cl.getNombre() != null) {
							Txt_Nombre.setText("" + cl.getNombre());

						}else {
							Txt_DNI_RUC.setText("");
							JOptionPane.showMessageDialog(null,"El cliente no existe.");
						}
					}
				}

			}			

		});
		Txt_DNI_RUC.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		Txt_DNI_RUC.setColumns(10);
		Txt_DNI_RUC.setBorder(null);
		Txt_DNI_RUC.setBounds(378, 546, 115, 33);
		Panel_Main_NVenta.add(Txt_DNI_RUC);
		
		JSeparator separator_txtDNI_RUC = new JSeparator();
		separator_txtDNI_RUC.setForeground(new Color(252, 176, 66));
		separator_txtDNI_RUC.setBackground(new Color(243, 113, 56));
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
		separator_txtNombre.setBackground(new Color(243, 113, 56));
		separator_txtNombre.setBounds(526, 579, 161, 13);
		Panel_Main_NVenta.add(separator_txtNombre);
		
		JPanel Btn_Imprimir = new JPanel();
		Btn_Imprimir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegistrarVenta();
				RegistrarDetalle();
				ActualizarStock();
				PDF();
				CleanTable();
				Txt_DNI_RUC.setText("");
				Txt_Nombre.setText("");
			}
		});
		Btn_Imprimir.setLayout(null);
		Btn_Imprimir.setBackground(new Color(243, 113, 56));
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
		
		Lbl_TotalMonto = new JLabel("- - - - ");
		Lbl_TotalMonto.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_TotalMonto.setBounds(515, 609, 70, 19);
		Panel_Main_NVenta.add(Lbl_TotalMonto);
		
		JPanel PanelLateral_NVenta = new JPanel();
		PanelLateral_NVenta.setBackground(new Color(243, 113, 56));
		PanelLateral_NVenta.setBounds(0, 0, 368, 652);
		Panel_Main_NVenta.add(PanelLateral_NVenta);
		PanelLateral_NVenta.setLayout(null);
		
		Lbl_Vendedor = new JLabel("");
		Lbl_Vendedor.setIcon(new ImageIcon(Form_NuevaVenta.class.getResource("/Img/LosSocios_Design_FormNuevaVentas (1).png")));
		Lbl_Vendedor.setBounds(0, 0, 368, 652);
		Lbl_Vendedor.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Vendedor.setFont(new Font("Roboto", Font.PLAIN, 16));
		PanelLateral_NVenta.add(Lbl_Vendedor);
		
		JLabel Lbl_TituloMain = new JLabel("REGISTRA UNA NUEVA VENTA");
		Lbl_TituloMain.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_TituloMain.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		Lbl_TituloMain.setBounds(378, 29, 265, 19);
		Panel_Main_NVenta.add(Lbl_TituloMain);

	}

	@Override
	public void Total_A_Pagar() {
		// TODO Auto-generated method stub
		TotalPagar = 0.00;
		int NumFila = Tabla_NVenta.getRowCount();
		for (int i = 0; i < NumFila; i++) {
			double Cal = Double.parseDouble(String.valueOf(Tabla_NVenta.getModel().getValueAt(i, 4)));
			TotalPagar  = TotalPagar + Cal;
		}
		Lbl_TotalMonto.setText(String.format("%.2f", TotalPagar));
	}



	@Override
	public void RegistrarVenta() {
		// TODO Auto-generated method stub
		String Cliente = Txt_Nombre.getText();
		String Vendedor = Lbl_Vendedor.getText();
		Double Monto = TotalPagar;
		V.setCliente(Cliente);
		V.setVendedor(Vendedor);
		V.setTotal(Monto);
		VBD.Registrar_Venta(V);
	}



	@Override
	public void RegistrarDetalle() {
		// TODO Auto-generated method stub
		int Id = VBD.ID_Venta();
		for (int i = 0; i < Tabla_NVenta.getRowCount(); i++) {
			String codigo =  Tabla_NVenta.getValueAt(i, 0).toString();
			int cantidad = Integer.parseInt(Tabla_NVenta.getValueAt(i, 2).toString());
			double precio = Double.parseDouble(Tabla_NVenta.getValueAt(i, 3).toString());
			DT.setCod_Producto(codigo);
			DT.setCantidad(cantidad);
			DT.setPrecio(precio);
			DT.setId_Venta(Id);
			VBD.Registrar_Detalle(DT);
			
		}
	}



	@Override
	public void ActualizarStock() {
		// TODO Auto-generated method stub
		for (int i = 0; i < Tabla_NVenta.getRowCount(); i++) {
			String codigo =  Tabla_NVenta.getValueAt(i, 0).toString();
			int cantidad = Integer.parseInt(Tabla_NVenta.getValueAt(i, 2).toString());
			prod = proBD.Buscar_Producto(codigo);
			int StockActual = prod.getStock() - cantidad;
			VBD.Actualizar_STOCK(StockActual, codigo);
		}
	}



	@Override
	public void CleanTEXTBOX() {
		// TODO Auto-generated method stub
		Txt_Codigo.setText("");
		Txt_Descripcion.setText("");
		Txt_Cantidad.setText("");
		Txt_Disponible.setText("");
		Txt_Precio.setText("");
	}



	@Override
	public void CleanTable() {
		// TODO Auto-generated method stub
		TMP = (DefaultTableModel) Tabla_NVenta.getModel();
		int Fila = Tabla_NVenta.getRowCount();
		for (int i = 0; i < Fila; i++) {
			TMP.removeRow(0);
		}
	}



	@Override
	public void PDF() {
		// TODO Auto-generated method stub
		try {
			FileOutputStream Archivo;
			File file = new File("src/PDF/Venta.pdf");
			Archivo = new FileOutputStream(file);
			Document Doc = new Document();
			PdfWriter.getInstance(Doc, Archivo);
			Doc.open();
			
			Image img = Image.getInstance("src/Img/carrito-de-compras.png");
			
			Paragraph fecha = new Paragraph();
			Font negrita = new Font(Font.SANS_SERIF, 12, Font.BOLD);
			fecha.add(Chunk.NEWLINE);
			Date dt = new Date();
			fecha.add("Factura: \n" + "Fecha: " + new SimpleDateFormat("dd-MM-yyyy").format(dt) + "\n\n");
			
			PdfPTable Encabezado = new PdfPTable(4);
			Encabezado.setWidthPercentage(100);
			Encabezado.getDefaultCell().setBorder(0);
			float[] ColumnaEncabezado = new float[] {20f, 30f, 70f, 40f};
			Encabezado.setWidths(ColumnaEncabezado);
			Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
			
			img.scaleToFit(50f, 50f);
			Encabezado.addCell(img);
			

			String RNC = "8162023";
			String Nom = "LOS SOCIOS BOUTIQUE";
			String Tel = "829-792-9978";
			String Dir = "Santo Domingo, RD";
			
			Encabezado.addCell("");
			Encabezado.addCell("RNC: " + RNC + "\nNombre: " + Nom + "\nTelefono: " + Tel + "\nDireccion: " + Dir);
			Encabezado.addCell(fecha);
			Doc.add(Encabezado);
			
			Paragraph cliente = new Paragraph();
			cliente.add(Chunk.NEWLINE);
			cliente.add("DATOS CLIENTE" + "\n\n");
			Doc.add(cliente);
			
			PdfPTable TablaCliente = new PdfPTable(2);
			TablaCliente.setWidthPercentage(100);
			TablaCliente.getDefaultCell().setBorder(0);
			float[] ColumnaCliente = new float[] {20f, 50f};
			TablaCliente.setWidths(ColumnaCliente);
			TablaCliente.setHorizontalAlignment(Element.ALIGN_LEFT);
			
			PdfPCell cli1 = new PdfPCell(new Phrase("DNI/RNC"));
			PdfPCell cli2 = new PdfPCell(new Phrase("Nombre"));

			cli1.setBorder(0);
			cli2.setBorder(0);
	
			TablaCliente.addCell(cli1);
			TablaCliente.addCell(cli2);
			
			TablaCliente.addCell(Txt_DNI_RUC.getText());
			TablaCliente.addCell(Txt_Nombre.getText());
			
			Doc.add(TablaCliente);
			
			//PRODUCTOS
			
			Paragraph product = new Paragraph();
			product.add(Chunk.NEWLINE);
			product.add("\nDATOS DE LA COMPRA" + "\n\n");
			Doc.add(product);
			
			PdfPTable TablaProduct = new PdfPTable(4);
			TablaProduct.setWidthPercentage(100);
			TablaProduct.getDefaultCell().setBorder(0);
			float[] ColumnaProduct = new float[] {10f, 50f, 15f, 20f};
			TablaProduct.setWidths(ColumnaProduct);
			TablaProduct.setHorizontalAlignment(Element.ALIGN_LEFT);
			
			PdfPCell pro1 = new PdfPCell(new Phrase("Cant."));
			PdfPCell pro2 = new PdfPCell(new Phrase("Descripcion"));
			PdfPCell pro3 = new PdfPCell(new Phrase("Precio U."));
			PdfPCell pro4 = new PdfPCell(new Phrase("Precio Total"));

			pro1.setBorder(0);
			pro2.setBorder(0);
			pro3.setBorder(0);
			pro4.setBorder(0);
	
			TablaProduct.addCell(pro1);
			TablaProduct.addCell(pro2);
			TablaProduct.addCell(pro3);
			TablaProduct.addCell(pro4);
			
			for (int i = 0; i < Tabla_NVenta.getRowCount(); i++) {
				String Producto = Tabla_NVenta.getValueAt(i, 1).toString();
				String Cantidad = Tabla_NVenta.getValueAt(i, 2).toString();
				String Precio = Tabla_NVenta.getValueAt(i, 3).toString();
				String Total = Tabla_NVenta.getValueAt(i, 4).toString();
				
				TablaProduct.addCell(Cantidad);
				TablaProduct.addCell(Producto);
				TablaProduct.addCell(Precio);
				TablaProduct.addCell(Total);
				
			}
			Doc.add(TablaProduct);
			
			
			Paragraph Info = new Paragraph();
			Info.add(Chunk.NEWLINE);
			Info.add("Total a Pagar: " + TotalPagar);
			Info.setAlignment(Element.ALIGN_RIGHT);
			Doc.add(Info);
			
			Paragraph Firma = new Paragraph();
			Firma.add(Chunk.NEWLINE);
			Firma.add("Firma\n\n");
			Firma.add("---------------");
			Firma.setAlignment(Element.ALIGN_CENTER);
			Doc.add(Firma);
			
		
			Doc.close();
			Archivo.close();
			
			Desktop.getDesktop().open(file);
		} catch (Exception e){
			System.out.println(e.toString());
		}
	}
}

