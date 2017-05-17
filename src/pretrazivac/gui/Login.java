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
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import javax.swing.border.SoftBevelBorder;
import java.awt.Cursor;

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
	private JPanel panel;
	private JButton btnX;

	/**
	 * Create the frame.
	 */
	public Login() {
		setUndecorated(true);
		setForeground(Color.BLACK);
		setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/clapperboard.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1194, 720);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setVisible(true);
		contentPane.setLayout(null);
		contentPane.add(getPanel_1());
		contentPane.add(getTxtUsername());
		contentPane.add(getLblIcon());
		contentPane.add(getLblUsername());
		contentPane.add(getPwdPassword());
		contentPane.add(getLblPassword());
		contentPane.add(getButton_1());
		contentPane.add(getBtnSignUp());
		contentPane.add(getLblNoviSteKorisnik());
		contentPane.add(getLabel());
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				txtUsername.requestFocusInWindow();
			}

		});
	}
	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username:");
			lblUsername.setForeground(Color.LIGHT_GRAY);
			lblUsername.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
			lblUsername.setBounds(564, 221, 84, 16);
		}
		return lblUsername;
	}
	private JPasswordField getPwdPassword() {
		if (pwdPassword == null) {
			pwdPassword = new JPasswordField();
			pwdPassword.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode()==KeyEvent.VK_ENTER){
						GuiControler.ulogujKorisnika(txtUsername.getText(), pwdPassword.getText());
					}
				}
			});
			pwdPassword.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
			pwdPassword.setCaretColor(Color.RED);
			pwdPassword.setOpaque(false);
			pwdPassword.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			pwdPassword.setBackground(null);
			pwdPassword.setForeground(SystemColor.textHighlightText);
			pwdPassword.setBounds(511, 332, 191, 28);
		}
		return pwdPassword;
	}
	private JTextField getTxtUsername() {
		if (txtUsername == null) {
			txtUsername = new JTextField();
			txtUsername.setCaretColor(Color.RED);
			txtUsername.setOpaque(false);
			txtUsername.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
			txtUsername.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			txtUsername.setForeground(SystemColor.textHighlightText);
			txtUsername.setBounds(510, 250, 192, 28);
			txtUsername.setColumns(10);
			txtUsername.setVisible(true);		
			txtUsername.requestFocusInWindow();

			
			
		}
		return txtUsername;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password:");
			lblPassword.setBackground(Color.WHITE);
			lblPassword.setForeground(Color.LIGHT_GRAY);
			lblPassword.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
			lblPassword.setBounds(564, 303, 84, 16);
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
			btnLogin.setIcon(new ImageIcon(Login.class.getResource("/images/login (1).png")));
			btnLogin.setFocusPainted(false);
			btnLogin.setContentAreaFilled(false);
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GuiControler.ulogujKorisnika(txtUsername.getText(),pwdPassword.getText());

				}
			});
			btnLogin.setBounds(538, 409, 122, 41);
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
			btnSignUp.setIcon(new ImageIcon(Login.class.getResource("/images/newacc.png")));
			btnSignUp.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 15));
			btnSignUp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GuiControler.pokreniSignUpEkran();
				}
			});
			btnSignUp.setBounds(511, 559, 205, 53);
		}
		return btnSignUp;
	}
	private JLabel getLblNoviSteKorisnik() {
		if (lblNoviSteKorisnik == null) {
			lblNoviSteKorisnik = new JLabel("Novi ste korisnik?");
			lblNoviSteKorisnik.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblNoviSteKorisnik.setForeground(Color.WHITE);
			lblNoviSteKorisnik.setBounds(550, 530, 122, 16);
		}
		return lblNoviSteKorisnik;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");

			label.setIcon(new ImageIcon(Login.class.getResource("/images/loginBack.png")));

			label.setBounds(0, 0, 1194, 720);
		}
		return label;
	}
	private JLabel getLblIcon() {
		if (lblIcon == null) {
			lblIcon = new JLabel("");
			lblIcon.setHorizontalAlignment(SwingConstants.CENTER);
			lblIcon.setIcon(new ImageIcon(Login.class.getResource("/images/account (1).png")));
			lblIcon.setBounds(564, 105, 73, 105);
		}
		return lblIcon;
	}
	private JPanel getPanel_1() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
			panel.setBackground(Color.DARK_GRAY);
			panel.setBounds(0, 0, 1194, 21);
			panel.setLayout(null);
			panel.add(getBtnX());
			
			JLabel lblBestMovies = new JLabel("Best movies 4 you: Login");
			lblBestMovies.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
			lblBestMovies.setForeground(Color.LIGHT_GRAY);
			lblBestMovies.setBounds(534, 2, 140, 19);
			panel.add(lblBestMovies);
		}
		return panel;
	}
	private JButton getBtnX() {
		if (btnX == null) {
			btnX = new JButton("X");
			btnX.setBorderPainted(false);
			btnX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnX.setFocusPainted(false);
			btnX.setContentAreaFilled(false);
			btnX.setForeground(Color.WHITE);
			btnX.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
			btnX.setBackground(null);
			btnX.setBounds(1155, 0, 39, 20);
		}
		return btnX;
	}
}
