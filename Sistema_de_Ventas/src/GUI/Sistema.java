package GUI;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import rsscalelabel.RSScaleLabel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import java.awt.Font;

public class Sistema extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 1194, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Panel_main_sistema = new JPanel();
		Panel_main_sistema.setBackground(new Color(240, 240, 240));
		Panel_main_sistema.setBounds(0, 0, 1190, 683);
		contentPane.add(Panel_main_sistema);
		Panel_main_sistema.setLayout(null);
		
		JLabel Img_Sistema_main = new JLabel("");
		Img_Sistema_main.setDisabledIcon(null);
		Img_Sistema_main.setHorizontalAlignment(SwingConstants.CENTER);
		Img_Sistema_main.setHorizontalTextPosition(SwingConstants.CENTER);
		Img_Sistema_main.setIgnoreRepaint(true);
		Img_Sistema_main.setIcon(new ImageIcon(Sistema.class.getResource("/Img/img_sistema.jpg")));
		Img_Sistema_main.setBounds(190, 0, 1058, 219);
		Panel_main_sistema.add(Img_Sistema_main);
		
		JPanel Panel_menu = new JPanel();
		Panel_menu.setBackground(new Color(252, 174, 66));
		Panel_menu.setBounds(0, 0, 264, 725);
		Panel_main_sistema.add(Panel_menu);
		Panel_menu.setLayout(null);
		
		JPanel Btn_NuevaVenta = new JPanel();
		Btn_NuevaVenta.setBounds(0, 225, 264, 53);
		Panel_menu.add(Btn_NuevaVenta);
		Btn_NuevaVenta.setLayout(null);
		
		JLabel Lbl_Btn_NuevaVenta = new JLabel("NUEVA VENTA");
		Lbl_Btn_NuevaVenta.setFont(new Font("Roboto", Font.PLAIN, 18));
		Lbl_Btn_NuevaVenta.setBounds(68, 11, 119, 31);
		Btn_NuevaVenta.add(Lbl_Btn_NuevaVenta);
		
		JPanel Btn_Clientes = new JPanel();
		Btn_Clientes.setBounds(0, 302, 264, 53);
		Panel_menu.add(Btn_Clientes);
		Btn_Clientes.setLayout(null);
		
		JLabel Lbl_Btn_Clientes = new JLabel("CLIENTES");
		Lbl_Btn_Clientes.setFont(new Font("Roboto", Font.PLAIN, 18));
		Lbl_Btn_Clientes.setBounds(86, 11, 82, 31);
		Btn_Clientes.add(Lbl_Btn_Clientes);
		
		JPanel Btn_Proveedores = new JPanel();
		Btn_Proveedores.setBounds(0, 378, 264, 53);
		Panel_menu.add(Btn_Proveedores);
		Btn_Proveedores.setLayout(null);
		
		JLabel Lbl_Btn_Proveedores = new JLabel("PROVEEDORES");
		Lbl_Btn_Proveedores.setFont(new Font("Roboto", Font.PLAIN, 18));
		Lbl_Btn_Proveedores.setBounds(69, 11, 121, 31);
		Btn_Proveedores.add(Lbl_Btn_Proveedores);
		
		JPanel Btn_Productos = new JPanel();
		Btn_Productos.setBounds(0, 456, 264, 53);
		Panel_menu.add(Btn_Productos);
		Btn_Productos.setLayout(null);
		
		JLabel Lbl_Btn_Productos = new JLabel("PRODUCTOS");
		Lbl_Btn_Productos.setFont(new Font("Roboto", Font.PLAIN, 18));
		Lbl_Btn_Productos.setBounds(76, 11, 119, 31);
		Btn_Productos.add(Lbl_Btn_Productos);
		
		JPanel Btn_Ventas = new JPanel();
		Btn_Ventas.setBounds(0, 533, 264, 53);
		Panel_menu.add(Btn_Ventas);
		Btn_Ventas.setLayout(null);
		
		JLabel Lbl_Btn_Ventas = new JLabel("VENTAS");
		Lbl_Btn_Ventas.setFont(new Font("Roboto", Font.PLAIN, 18));
		Lbl_Btn_Ventas.setBounds(96, 11, 68, 31);
		Btn_Ventas.add(Lbl_Btn_Ventas);
		
		JPanel Btn_Config = new JPanel();
		Btn_Config.setBounds(0, 608, 264, 53);
		Panel_menu.add(Btn_Config);
		Btn_Config.setLayout(null);
		
		JLabel Lbl_Btn_Config = new JLabel("CONFIG");
		Lbl_Btn_Config.setFont(new Font("Roboto", Font.PLAIN, 18));
		Lbl_Btn_Config.setBounds(98, 11, 64, 31);
		Btn_Config.add(Lbl_Btn_Config);
		
		JTabbedPane TabbedPane_ventanas = new JTabbedPane(JTabbedPane.TOP);
		TabbedPane_ventanas.setBounds(264, 219, 916, 463);
		Panel_main_sistema.add(TabbedPane_ventanas);
		
		JPanel panel = new JPanel();
		TabbedPane_ventanas.addTab("New tab", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		TabbedPane_ventanas.addTab("New tab", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		TabbedPane_ventanas.addTab("New tab", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		TabbedPane_ventanas.addTab("New tab", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		TabbedPane_ventanas.addTab("New tab", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		TabbedPane_ventanas.addTab("New tab", null, panel_5, null);
		
		
	}
}
