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

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel lblUsername;
	private JPasswordField pwdPassword;
	private JTextField txtUsername;
	private JLabel lblPassword;
	private JButton btnLogin;
	private JButton btnSignUp;
	private JLabel lblNoviSteKorisnik;

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUsername());
		contentPane.add(getPwdPassword());
		contentPane.add(getTxtUsername());
		contentPane.add(getLblPassword());
		contentPane.add(getButton_1());
		contentPane.add(getBtnSignUp());
		contentPane.add(getLblNoviSteKorisnik());
		setResizable(false);
	}
	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username:");
			lblUsername.setBounds(463, 296, 84, 16);
		}
		return lblUsername;
	}
	private JPasswordField getPwdPassword() {
		if (pwdPassword == null) {
			pwdPassword = new JPasswordField();
			pwdPassword.setBounds(463, 399, 191, 28);
		}
		return pwdPassword;
	}
	private JTextField getTxtUsername() {
		if (txtUsername == null) {
			txtUsername = new JTextField();
			txtUsername.setBounds(462, 325, 192, 28);
			txtUsername.setColumns(10);
		}
		return txtUsername;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password:");
			lblPassword.setBounds(463, 376, 84, 16);
		}
		return lblPassword;
	}
	private JButton getButton_1() {
		if (btnLogin == null) {
			btnLogin = new JButton("LOGIN");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GuiControler.ulogujKorisnika(txtUsername.getText(),pwdPassword.getText());

				}
			});
			btnLogin.setBounds(510, 500, 97, 25);
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
			btnSignUp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GuiControler.pokreniSignUpEkran();
				}
			});
			btnSignUp.setBounds(484, 574, 156, 25);
		}
		return btnSignUp;
	}
	private JLabel getLblNoviSteKorisnik() {
		if (lblNoviSteKorisnik == null) {
			lblNoviSteKorisnik = new JLabel("Novi ste korisnik?");
			lblNoviSteKorisnik.setBounds(510, 555, 122, 16);
		}
		return lblNoviSteKorisnik;
	}
}
