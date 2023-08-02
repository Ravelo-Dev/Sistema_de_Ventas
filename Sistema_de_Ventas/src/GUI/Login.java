package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField Txt_Usuario;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Img_Verde_Login = new JLabel("");
		Img_Verde_Login.setIcon(new ImageIcon(Login.class.getResource("/Img/Verde_login.jpeg")));
		Img_Verde_Login.setBounds(505, 0, 319, 485);
		contentPane.add(Img_Verde_Login);
		
		JPanel Panel_main_login = new JPanel();
		Panel_main_login.setBounds(0, 0, 505, 485);
		contentPane.add(Panel_main_login);
		Panel_main_login.setLayout(null);
		
		JLabel Lbl_IniciarSesion = new JLabel("INICIAR SESION");
		Lbl_IniciarSesion.setFont(new Font("Roboto Black", Font.PLAIN, 20));
		Lbl_IniciarSesion.setBounds(56, 160, 152, 14);
		Panel_main_login.add(Lbl_IniciarSesion);
		
		JLabel Lbl_Usuario = new JLabel("USUARIO");
		Lbl_Usuario.setFont(new Font("Roboto", Font.PLAIN, 17));
		Lbl_Usuario.setBounds(56, 215, 101, 14);
		Panel_main_login.add(Lbl_Usuario);
		
		Txt_Usuario = new JTextField();
		Txt_Usuario.setBounds(56, 240, 386, 36);
		Panel_main_login.add(Txt_Usuario);
		Txt_Usuario.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(56, 332, 386, 36);
		Panel_main_login.add(textField);
		
		JLabel Lbl_Password = new JLabel("USUARIO");
		Lbl_Password.setFont(new Font("Roboto", Font.PLAIN, 17));
		Lbl_Password.setBounds(56, 307, 101, 14);
		Panel_main_login.add(Lbl_Password);
	}
}
