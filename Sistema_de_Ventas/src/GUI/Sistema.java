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

public class Sistema {

	private JFrame frame;
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema window = new Sistema();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 1250, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JDesktopPane dpnEscritorio = new JDesktopPane();
		frame.getContentPane().add(dpnEscritorio, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnuArchivo = new JMenu("Archivos");
		menuBar.add(mnuArchivo);
		
		JMenuItem mniSalir = new JMenuItem("Salir");
		mniSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int i=JOptionPane.showConfirmDialog(null, "Seguro que quiere salir?"); 
                 if(i==0) {
                     System.exit(0);
                 }
			}
		});
		mnuArchivo.add(mniSalir);
		
		JMenu mnuclientes = new JMenu("Clientes");
		menuBar.add(mnuclientes);
		
		JMenuItem mniGestionClientes = new JMenuItem("Gestionar Clientes");
		mniGestionClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Clientes clientes = new Form_Clientes();
				clientes.CleanTable();
				clientes.Listar_Clientes();
				dpnEscritorio.add(clientes);
				clientes.show();
	
				
			}
		});
		mnuclientes.add(mniGestionClientes);
		
		JMenu MnuProveedores = new JMenu("Proveedores");
		menuBar.add(MnuProveedores);
		
		JMenuItem mniGestionProveedor = new JMenuItem("Gestionar Proveedores");
		mniGestionProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Proveedores proveedores = new Form_Proveedores();
				proveedores.CleanTable();
				proveedores.Listar_Proveedores();
				dpnEscritorio.add(proveedores);
				proveedores.show();
			}
		});
		MnuProveedores.add(mniGestionProveedor);
		
		JMenu MnuProductos = new JMenu("Productos");
		menuBar.add(MnuProductos);
		
		JMenuItem mni = new JMenuItem("Gestionar Productos");
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
		
		JMenu MnuVentas = new JMenu("Ventas");
		menuBar.add(MnuVentas);
		
		JMenuItem mniVentas = new JMenuItem("Gestionar Ventas");
		mniVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Ventas ventas = new Form_Ventas();
				dpnEscritorio.add(ventas);
				ventas.show(); 
			}
		});
		MnuVentas.add(mniVentas);
		
		JMenu mniNuevasVentas = new JMenu("Nuevas Ventas");
		menuBar.add(mniNuevasVentas);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Gestionar Nuevas Ventas");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_NuevaVenta NuevaVenta = new Form_NuevaVenta();
				dpnEscritorio.add(NuevaVenta);
				NuevaVenta.show();
			}
		});
		mniNuevasVentas.add(mntmNewMenuItem);
		
		JMenu mnuConfiguracion = new JMenu("Configuración");
		menuBar.add(mnuConfiguracion);
		
		JMenuItem mniConfiguracion = new JMenuItem("Config");
		mniConfiguracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Config config = new Form_Config();
				dpnEscritorio.add(config);
				config.show();
			}
		});
		mnuConfiguracion.add(mniConfiguracion);
		
		JMenu mnuNuevosUsuarios = new JMenu("Nuevos Usuarios");
		menuBar.add(mnuNuevosUsuarios);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Gestion Nuevos Usuarios");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_RegistroUsuarios NuevosUsuarios= new Form_RegistroUsuarios();
				
				dpnEscritorio.add(NuevosUsuarios);
				NuevosUsuarios.show();
			}
			
		});
		mnuNuevosUsuarios.add(mntmNewMenuItem_1);
	}
}
