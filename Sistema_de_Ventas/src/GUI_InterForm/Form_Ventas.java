package GUI_InterForm;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Form_Ventas extends JInternalFrame {
	private JTable Tabla_Ventas;

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
		
		JPanel Btn_PDF = new JPanel();
		Btn_PDF.setLayout(null);
		Btn_PDF.setBackground(new Color(252, 176, 66));
		Btn_PDF.setBounds(347, 563, 115, 33);
		Panel_Main_Ventas.add(Btn_PDF);
		
		JLabel Lbl_Btn_PDF = new JLabel("EXCEL");
		Lbl_Btn_PDF.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_PDF.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_PDF.setBounds(10, 0, 95, 33);
		Btn_PDF.add(Lbl_Btn_PDF);
		
		JLabel Lbl_TituloMain = new JLabel("RESUMEN DE VENTAS");
		Lbl_TituloMain.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_TituloMain.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		Lbl_TituloMain.setBounds(347, 33, 222, 19);
		Panel_Main_Ventas.add(Lbl_TituloMain);

	}

}
