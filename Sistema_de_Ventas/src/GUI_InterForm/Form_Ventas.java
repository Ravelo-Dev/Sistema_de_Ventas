package GUI_InterForm;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import Config.VentasBD;
import Mod_Consultas.Proveedor;
import Mod_Consultas.Ventas;

public class Form_Ventas extends JInternalFrame {
	private JTable Tabla_Ventas;
	DefaultTableModel Modelo = new DefaultTableModel();
	Ventas V = new Ventas();
    VentasBD VBD = new VentasBD();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Ventas frame = new Form_Ventas();
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
	public Form_Ventas() {
		setClosable(true);
		setBounds(100, 100, 950, 682);
		getContentPane().setLayout(null);
		
		JPanel Panel_Main_Ventas = new JPanel();
		Panel_Main_Ventas.setBounds(0, 0, 934, 652);
		getContentPane().add(Panel_Main_Ventas);
		Panel_Main_Ventas.setLayout(null);
		
		JPanel PanelLateral_Ventas = new JPanel();
		PanelLateral_Ventas.setBackground(new Color(252, 176, 66));
		PanelLateral_Ventas.setBounds(0, 0, 317, 652);
		Panel_Main_Ventas.add(PanelLateral_Ventas);
		
		JScrollPane scrollPane_Ventas = new JScrollPane();
		scrollPane_Ventas.setBounds(347, 89, 554, 427);
		Panel_Main_Ventas.add(scrollPane_Ventas);
		
		Tabla_Ventas = new JTable();
		Tabla_Ventas.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID ", "CLIENTE", "VENDEDOR", "TOTAL"
			}
		));
		scrollPane_Ventas.setViewportView(Tabla_Ventas);
		
		JLabel Lbl_TituloMain = new JLabel("RESUMEN DE VENTAS");
		Lbl_TituloMain.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_TituloMain.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		Lbl_TituloMain.setBounds(347, 33, 222, 19);
		Panel_Main_Ventas.add(Lbl_TituloMain);

	}
	
	public void Listar_Ventas() {
		List<Ventas> ListarVentas = VBD.Listar_Ventas();
		Modelo = (DefaultTableModel) Tabla_Ventas.getModel();
		Object[] OB = new Object[4];
		for (int i = 0; i < ListarVentas.size(); i++) {
			OB[0] = ListarVentas.get(i).getId();
			OB[1] = ListarVentas.get(i).getCliente();
			OB[2] = ListarVentas.get(i).getVendedor();
			OB[3] = ListarVentas.get(i).getTotal();
			Modelo.addRow(OB);
		}
		Tabla_Ventas.setModel(Modelo);
	}
	
	public void CleanTable() {
		// TODO Auto-generated method stub
		for (int i = 0; i < Modelo.getRowCount(); i++) {
			Modelo.removeRow(i);
			i = i - 1;
		}
	}

}
