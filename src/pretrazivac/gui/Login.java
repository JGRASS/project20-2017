package pretrazivac.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel lblUsername;
	private JPasswordField pwdPassword;
	private JTextField txtUsername;
	private JLabel lblPassword;
	private JButton btnLogin;
	private JButton btnSignUp;
	private JLabel lblNoviSteKorisnik;
	private JLabel label;
	private JLabel lblIcon;

	/**
	 * Create the frame.
	 */
	public Login() {
		setForeground(Color.BLACK);
		setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/clapperboard.png")));
		setTitle("BEST MOVIES 4 YOU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblIcon());
		contentPane.add(getLblUsername());
		contentPane.add(getPwdPassword());
		contentPane.add(getTxtUsername());
		contentPane.add(getLblPassword());
		contentPane.add(getButton_1());
		contentPane.add(getBtnSignUp());
		contentPane.add(getLblNoviSteKorisnik());
		contentPane.add(getLabel());
		setResizable(false);
	}
	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username:");
			lblUsername.setForeground(Color.LIGHT_GRAY);
			lblUsername.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
			lblUsername.setBounds(549, 294, 84, 16);
		}
		return lblUsername;
	}
	private JPasswordField getPwdPassword() {
		if (pwdPassword == null) {
			pwdPassword = new JPasswordField();
			pwdPassword.setOpaque(false);
			pwdPassword.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			pwdPassword.setBackground(null);
			pwdPassword.setForeground(SystemColor.textHighlightText);
			pwdPassword.setBounds(496, 405, 191, 28);
		}
		return pwdPassword;
	}
	private JTextField getTxtUsername() {
		if (txtUsername == null) {
			txtUsername = new JTextField();
			txtUsername.setOpaque(false);
			txtUsername.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
			txtUsername.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			txtUsername.setForeground(SystemColor.textHighlightText);
			txtUsername.setBounds(495, 323, 192, 28);
			txtUsername.setColumns(10);
		}
		return txtUsername;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password:");
			lblPassword.setBackground(Color.WHITE);
			lblPassword.setForeground(Color.LIGHT_GRAY);
			lblPassword.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
			lblPassword.setBounds(549, 376, 84, 16);
		}
		return lblPassword;
	}
	private JButton getButton_1() {
		if (btnLogin == null) {
			btnLogin = new JButton("LOGIN");
			btnLogin.setMnemonic(KeyEvent.VK_ENTER);
			btnLogin.setBorder(null);
			btnLogin.setBorderPainted(false);
			btnLogin.setForeground(Color.WHITE);
			btnLogin.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 23));
			btnLogin.setIcon(new ImageIcon("E:\\data\\output\\login (1).png"));
			btnLogin.setFocusPainted(false);
			btnLogin.setContentAreaFilled(false);
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GuiControler.ulogujKorisnika(txtUsername.getText(),pwdPassword.getText());

				}
			});
			btnLogin.setBounds(523, 482, 122, 41);
		}
		return btnLogin;
	}
	
	public void postaviPrazan(){
		txtUsername.setText("");
		pwdPassword.setText("");
	}
	private JButton getBtnSignUp() {
		if (btnSignUp == null) {
			btnSignUp = new JButton("NAPRAVI NALOG");
			btnSignUp.setFocusPainted(false);
			btnSignUp.setBorderPainted(false);
			btnSignUp.setOpaque(false);
			btnSignUp.setForeground(Color.LIGHT_GRAY);
			btnSignUp.setContentAreaFilled(false);
			btnSignUp.setIcon(new ImageIcon("E:\\data\\output\\round-account-button-with-user-inside.png"));
			btnSignUp.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 15));
			btnSignUp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GuiControler.pokreniSignUpEkran();
				}
			});
			btnSignUp.setBounds(496, 632, 205, 53);
		}
		return btnSignUp;
	}
	private JLabel getLblNoviSteKorisnik() {
		if (lblNoviSteKorisnik == null) {
			lblNoviSteKorisnik = new JLabel("Novi ste korisnik?");
			lblNoviSteKorisnik.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblNoviSteKorisnik.setForeground(Color.WHITE);
			lblNoviSteKorisnik.setBounds(535, 603, 122, 16);
		}
		return lblNoviSteKorisnik;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
			label.setIcon(new ImageIcon("E:\\data\\output\\loginBack.png"));
			label.setBounds(0, 0, 1194, 865);
		}
		return label;
	}
	private JLabel getLblIcon() {
		if (lblIcon == null) {
			lblIcon = new JLabel("");
			lblIcon.setHorizontalAlignment(SwingConstants.CENTER);
			lblIcon.setIcon(new ImageIcon("E:\\data\\output\\account (1).png"));
			lblIcon.setBounds(549, 178, 73, 105);
		}
		return lblIcon;
	}
}
