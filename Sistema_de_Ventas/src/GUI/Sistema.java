package GUI;


import java.awt.EventQueue;

import javax.swing.JFrame;
//import javax.swing.JPanel;

import GUI_InterForm.*;


import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Config.*;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;

public class Sistema {

	private JFrame frmSistemaDeVentaboutique;
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema window = new Sistema();
					window.frmSistemaDeVentaboutique.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sistema() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSistemaDeVentaboutique = new JFrame();
		frmSistemaDeVentaboutique.setTitle("Sistema de Venta-Boutique los Socios");
		frmSistemaDeVentaboutique.setBounds(100, 100, 1250, 800);
		frmSistemaDeVentaboutique.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSistemaDeVentaboutique.setLocationRelativeTo(null);
		
		JDesktopPane dpnEscritorio = new JDesktopPane();
		frmSistemaDeVentaboutique.getContentPane().add(dpnEscritorio, BorderLayout.CENTER);
		dpnEscritorio.setLayout(null);
		
		JLabel lbl_img_main = new JLabel("New label");
		lbl_img_main.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_img_main.setIcon(new ImageIcon(Sistema.class.getResource("/Img/LosSocios_VentanaPrincipal.png")));
		lbl_img_main.setBounds(0, 0, 1234, 723);
		dpnEscritorio.add(lbl_img_main);
		
		JMenuBar menuBar = new JMenuBar();
		frmSistemaDeVentaboutique.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Gestión de Transacciones");
		mnNewMenu.setHorizontalAlignment(SwingConstants.RIGHT);
		mnNewMenu.setBackground(new Color(240, 240, 240));
		mnNewMenu.setIcon(new ImageIcon(Sistema.class.getResource("/Img/gestion-de-la-relacion-con-el-cliente.png")));
		menuBar.add(mnNewMenu);
		
		JMenuItem mniGestionClientes = new JMenuItem("Clientes");
		mniGestionClientes.setIcon(new ImageIcon(Sistema.class.getResource("/Img/atencion-al-cliente.png")));
		mnNewMenu.add(mniGestionClientes);
		mniGestionClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Clientes clientes = new Form_Clientes();
				clientes.CleanTable();
				clientes.Listar_Clientes();
				dpnEscritorio.add(clientes);
				clientes.show();
	
				
			}
		});
		
		JMenuItem MniNuevaVenta = new JMenuItem("Nuevas Ventas");
		MniNuevaVenta.setIcon(new ImageIcon(Sistema.class.getResource("/Img/carrito-de-compras.png")));
		mnNewMenu.add(MniNuevaVenta);
		MniNuevaVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_NuevaVenta NuevaVenta = new Form_NuevaVenta();
				dpnEscritorio.add(NuevaVenta);
				NuevaVenta.show();
			}
		});
		
		JMenuItem mniVentas = new JMenuItem(" Ventas");
		mniVentas.setIcon(new ImageIcon(Sistema.class.getResource("/Img/ventas.png")));
		mnNewMenu.add(mniVentas);
		mniVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Ventas ventas = new Form_Ventas();
				ventas.CleanTable();
				ventas.Listar_Ventas();
				dpnEscritorio.add(ventas);
				ventas.show(); 
			}
		});
		
		JMenuItem mniGestionProveedor = new JMenuItem("Proveedores");
		mniGestionProveedor.setIcon(new ImageIcon(Sistema.class.getResource("/Img/proveedor.png")));
		mnNewMenu.add(mniGestionProveedor);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Nuevos Usuarios");
		mntmNewMenuItem_1.setIcon(new ImageIcon(Sistema.class.getResource("/Img/nuevo.png")));
		mnNewMenu.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_RegistrarUser NuevosUsuarios= new Form_RegistrarUser();
				
				dpnEscritorio.add(NuevosUsuarios);
				NuevosUsuarios.show();
			}
			
		});
		mniGestionProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Proveedores proveedores = new Form_Proveedores();
				proveedores.CleanTable();
				proveedores.Listar_Proveedores();
				dpnEscritorio.add(proveedores);
				proveedores.show();
			}
		});
		
		JMenu MnuProductos = new JMenu("Gestión de Productos");
		MnuProductos.setIcon(new ImageIcon(Sistema.class.getResource("/Img/inventario.png")));
		menuBar.add(MnuProductos);
		
		JMenuItem mni = new JMenuItem(" Productos");
		mni.setIcon(new ImageIcon(Sistema.class.getResource("/Img/bienes.png")));
		mni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Productos GestionProductos = new Form_Productos();
				GestionProductos.CleanTable();
				GestionProductos.Listar_Productos();
				dpnEscritorio.add(GestionProductos);
				GestionProductos.show();
			}
		});
		MnuProductos.add(mni);
		
		JMenu mnuConfiguracion = new JMenu("Información y Configuración");
		mnuConfiguracion.setIcon(new ImageIcon(Sistema.class.getResource("/Img/configuraciones.png")));
		menuBar.add(mnuConfiguracion);
		
		JMenu mnNewMenu_1 = new JMenu("Acerca de");
		mnuConfiguracion.add(mnNewMenu_1);
		
		JMenuItem mniConfiguracion = new JMenuItem("La Empresa");
		mnNewMenu_1.add(mniConfiguracion);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("El Desarrollador");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mniSalir = new JMenuItem("Salir");
		mnNewMenu_1.add(mniSalir);
		mniSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int i=JOptionPane.showConfirmDialog(null, "Seguro que quiere salir?"); 
                 if(i==0) {
                     System.exit(0);
                 }
			}
		});
		mniConfiguracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Config config = new Form_Config();
				dpnEscritorio.add(config);
				config.show();
			}
		});
	}
}
