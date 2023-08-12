package GUI_InterForm;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Config.Conexion;
import Config.RegistrarUserLogin;
import GUI.Login;
import Mod_Consultas.Usuarios;

public class Form_RegistrarUser extends JInternalFrame {
	Usuarios USER = new Usuarios(); 
	RegistrarUserLogin RUserLogin = new RegistrarUserLogin();
	Conexion Cnxn = new Conexion();
	private JPanel contentPane;
	private JTextField Txt_Usuario;
	private JPasswordField Txt_Password;
	private JTextField Txt_Correo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_RegistrarUser frame = new Form_RegistrarUser();
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
	public Form_RegistrarUser() {
		setTitle("Registro - Nuevos Usuarios");
		setClosable(true);
		setBounds(100, 100, 520, 650);
		getContentPane().setLayout(null);
		
		JPanel Panel_main_login = new JPanel();
		Panel_main_login.setBounds(0, 0, 505, 611);
		getContentPane().add(Panel_main_login);
		Panel_main_login.setLayout(null);
		JLabel Lbl_Resfistrarse = new JLabel("REGISTRATE");
		Lbl_Resfistrarse.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Resfistrarse.setLabelFor(this);
		Lbl_Resfistrarse.setFont(new Font("Roboto Black", Font.PLAIN, 20));
		Lbl_Resfistrarse.setBounds(145, 181, 221, 36);
		Panel_main_login.add(Lbl_Resfistrarse);
		
		JLabel Lbl_Usuario = new JLabel("USUARIO");
		Lbl_Usuario.setFont(new Font("Roboto", Font.PLAIN, 17));
		Lbl_Usuario.setBounds(44, 244, 189, 21);
		Panel_main_login.add(Lbl_Usuario);
		
		Txt_Usuario = new JTextField();
		Txt_Usuario.setFont(new Font("Roboto Light", Font.PLAIN, 16));
		Txt_Usuario.setBorder(null);
		Txt_Usuario.setBounds(44, 276, 410, 36);
		Panel_main_login.add(Txt_Usuario);
		Txt_Usuario.setColumns(10);
		
		JLabel Lbl_Password = new JLabel("CONTRASEÑA");
		Lbl_Password.setFont(new Font("Roboto", Font.PLAIN, 17));
		Lbl_Password.setBounds(44, 428, 189, 21);
		Panel_main_login.add(Lbl_Password);
		
		Txt_Password = new JPasswordField();
		Txt_Password.setFont(new Font("Roboto Light", Font.PLAIN, 16));
		Txt_Password.setBorder(null);
		Txt_Password.setBounds(44, 460, 410, 36);
		Panel_main_login.add(Txt_Password);
		
		JSeparator separator_Usuario = new JSeparator();
		separator_Usuario.setForeground(new Color(243, 113, 56));
		separator_Usuario.setBackground(new Color(243, 113, 56));
		separator_Usuario.setBounds(44, 314, 410, 11);
		Panel_main_login.add(separator_Usuario);
		
		JSeparator separator_Password = new JSeparator();
		separator_Password.setForeground(new Color(243, 113, 56));
		separator_Password.setBackground(new Color(243, 113, 56));
		separator_Password.setBounds(44, 498, 410, 11);
		Panel_main_login.add(separator_Password);
		
		JLabel Icon_login = new JLabel("");
		Icon_login.setIcon(new ImageIcon(Login.class.getResource("/Img/user (1).png")));
		Icon_login.setBounds(191, 35, 128, 135);
		Panel_main_login.add(Icon_login);
		
		JPanel Btn_Registrar = new JPanel();
		Btn_Registrar.addMouseListener(new MouseAdapter() {
			
		/*LA SIGUIENTE LINEA CAMBIA EL COLOR DEL PANEL UTILIZADO COMO BOTON,
		 * A UNO MAS CLARO PARA HACER VER QUE ES CLICKEABLE	*/
			@Override
			public void mouseEntered(MouseEvent e) {
				Btn_Registrar.setBackground(new Color(245,142,99));
			}
			
		/*REGRESA EL PANEL A SU COLOR ORIGINAL*/	
			@Override
			public void mouseExited(MouseEvent e) {
				Btn_Registrar.setBackground(new Color(243, 113, 56));
			}
			
		/*ACCION AL HACER CLICK AQUI*/
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!"".equals(Txt_Usuario.getText()) || !"".equals(Txt_Correo.getText()) || Txt_Password.getPassword().length > 0) {
				    USER.setNombre(Txt_Usuario.getText());
				    USER.setCorreo(Txt_Correo.getText());
				    USER.setPass(new String(Txt_Password.getPassword())); // Convierte el arreglo de caracteres a una cadena
				    RUserLogin.Registrar_Usuarios(USER);
				    JOptionPane.showMessageDialog(null, "Usuario Registrado Exitosamente!");
				    dispose();
				} else {
				    JOptionPane.showMessageDialog(null, "Debe Completar los campos");
				}
			}
		});
		Btn_Registrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Btn_Registrar.setBackground(new Color(243, 113, 56));
		Btn_Registrar.setBounds(166, 533, 167, 50);
		Panel_main_login.add(Btn_Registrar);
		Btn_Registrar.setLayout(null);
		
		JLabel Lbl_Btn_Registrarse = new JLabel("REGISTRAR");
		Lbl_Btn_Registrarse.setForeground(Color.WHITE);
		Lbl_Btn_Registrarse.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Btn_Registrarse.setFont(new Font("Roboto", Font.PLAIN, 16));
		Lbl_Btn_Registrarse.setBounds(38, 11, 91, 28);
		Btn_Registrar.add(Lbl_Btn_Registrarse);
		
		JLabel Lbl_Correo = new JLabel("CORREO ELECTRONICO");
		Lbl_Correo.setFont(new Font("Dialog", Font.PLAIN, 17));
		Lbl_Correo.setBounds(44, 336, 189, 21);
		Panel_main_login.add(Lbl_Correo);
		
		Txt_Correo = new JTextField();
		Txt_Correo.setFont(new Font("Dialog", Font.PLAIN, 16));
		Txt_Correo.setBorder(null);
		Txt_Correo.setBounds(44, 368, 410, 36);
		Panel_main_login.add(Txt_Correo);
		
		JSeparator separator_Correo = new JSeparator();
		separator_Correo.setForeground(new Color(243, 113, 56));
		separator_Correo.setBackground(new Color(243, 113, 56));
		separator_Correo.setBounds(44, 406, 410, 11);
		Panel_main_login.add(separator_Correo);
	}

}
