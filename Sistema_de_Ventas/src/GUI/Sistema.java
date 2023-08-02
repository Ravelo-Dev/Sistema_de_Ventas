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
		setBounds(100, 100, 1194, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Panel_main_sistema = new JPanel();
		Panel_main_sistema.setBackground(new Color(240, 240, 240));
		Panel_main_sistema.setBounds(0, 0, 1190, 691);
		contentPane.add(Panel_main_sistema);
		Panel_main_sistema.setLayout(null);
		
		JLabel Img_Sistema_main = new JLabel("");
		Img_Sistema_main.setDisabledIcon(null);
		Img_Sistema_main.setHorizontalAlignment(SwingConstants.CENTER);
		Img_Sistema_main.setHorizontalTextPosition(SwingConstants.CENTER);
		Img_Sistema_main.setIgnoreRepaint(true);
		Img_Sistema_main.setIcon(new ImageIcon(Sistema.class.getResource("/Img/img_sistema.jpg")));
		Img_Sistema_main.setBounds(204, 0, 1044, 230);
		Panel_main_sistema.add(Img_Sistema_main);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(252, 174, 66));
		panel.setBounds(0, 0, 264, 691);
		Panel_main_sistema.add(panel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(264, 230, 916, 461);
		Panel_main_sistema.add(tabbedPane);
		
		
	}
}
