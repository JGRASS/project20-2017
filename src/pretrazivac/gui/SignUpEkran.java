package pretrazivac.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.SoftBevelBorder;

public class SignUpEkran extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblUnesiteVasePodatke;
	private JLabel lblIme;
	private JLabel lblPrezime;
	private JLabel lblKorisnickoIme;
	private JLabel lblSifra;
	private JButton btnPrikazi;
	private JButton btnNapraviNalog;
	private JLabel label;
	private JPasswordField passwordField;
	private JLabel lblImg;
	private JLabel lblPwd;
	private JPanel panel;
	private JButton button;
	private JLabel lblBestMovies;


	/**
	 * Create the frame.
	 */
	public SignUpEkran() {
		setUndecorated(true);
		setResizable(false);
		setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/clapperboard.png")));
		setTitle("BEST MOVIES 4 YOU");
		setBounds(100, 0, 1194, 720);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getTextField_2());
		contentPane.add(getLblUnesiteVasePodatke());
		contentPane.add(getLblIme());
		contentPane.add(getLblPrezime());
		contentPane.add(getLblKorisnickoIme());
		contentPane.add(getLblSifra());
		contentPane.add(getBtnPrikazi());
		contentPane.add(getBtnNapraviNalog());
		contentPane.add(getPasswordField_1());
		contentPane.add(getLblPwd());
		contentPane.add(getLblImg());
		contentPane.add(getPanel());
		contentPane.add(getLabel());
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
			textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			textField.setOpaque(false);
			textField.setCaretColor(Color.RED);
			textField.setForeground(Color.WHITE);
			textField.setBounds(459, 279, 258, 33);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
			textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			textField_1.setOpaque(false);
			textField_1.setForeground(Color.WHITE);
			textField_1.setCaretColor(Color.RED);
			textField_1.setColumns(10);
			textField_1.setBounds(459, 349, 258, 33);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
			textField_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			textField_2.setOpaque(false);
			textField_2.setForeground(Color.WHITE);
			textField_2.setCaretColor(Color.RED);
			textField_2.setColumns(10);
			textField_2.setBounds(459, 425, 258, 33);
		}
		return textField_2;
	}
	private JLabel getLblUnesiteVasePodatke() {
		if (lblUnesiteVasePodatke == null) {
			lblUnesiteVasePodatke = new JLabel("Unesite vase podatke");
			lblUnesiteVasePodatke.setHorizontalAlignment(SwingConstants.CENTER);
			lblUnesiteVasePodatke.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 19));
			lblUnesiteVasePodatke.setForeground(Color.LIGHT_GRAY);
			lblUnesiteVasePodatke.setBounds(459, 198, 258, 33);
		}
		return lblUnesiteVasePodatke;
	}
	private JLabel getLblIme() {
		if (lblIme == null) {
			lblIme = new JLabel("Ime");
			lblIme.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
			lblIme.setForeground(Color.LIGHT_GRAY);
			lblIme.setBounds(459, 256, 258, 16);
		}
		return lblIme;
	}
	private JLabel getLblPrezime() {
		if (lblPrezime == null) {
			lblPrezime = new JLabel("Prezime");
			lblPrezime.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
			lblPrezime.setForeground(Color.LIGHT_GRAY);
			lblPrezime.setBounds(459, 325, 258, 16);
		}
		return lblPrezime;
	}
	private JLabel getLblKorisnickoIme() {
		if (lblKorisnickoIme == null) {
			lblKorisnickoIme = new JLabel("Korisnicko ime");
			lblKorisnickoIme.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
			lblKorisnickoIme.setForeground(Color.LIGHT_GRAY);
			lblKorisnickoIme.setBounds(459, 396, 258, 16);
		}
		return lblKorisnickoIme;
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
			lblSifra.setForeground(Color.LIGHT_GRAY);
			lblSifra.setBounds(459, 471, 258, 16);
		}
		return lblSifra;
	}
	private JButton getBtnPrikazi() {
		if (btnPrikazi == null) {
			btnPrikazi = new JButton("");
			btnPrikazi.setContentAreaFilled(false);
			btnPrikazi.setFocusPainted(false);
			btnPrikazi.setBorderPainted(false);
			btnPrikazi.setIcon(new ImageIcon(SignUpEkran.class.getResource("/images/eye.png")));
			btnPrikazi.addMouseListener(new MouseAdapter() {
				String text;
				@Override
				public void mousePressed(MouseEvent arg0) {
					text=passwordField.getText();
					passwordField.setText("");
					lblPwd.setText(text);
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					lblPwd.setText("");
					passwordField.setText(text);
					
				}
			});
			
			btnPrikazi.setBounds(720, 500, 39, 32);
		}
		return btnPrikazi;
	}
	public void postaviPrazan(boolean sve){
		if(sve){
			textField.setText("");
			textField_1.setText("");
			textField_2.setText("");
			passwordField.setText("");
		}
		else
			textField_2.setText("");
	}
	private JButton getBtnNapraviNalog() {
		if (btnNapraviNalog == null) {
			btnNapraviNalog = new JButton("NAPRAVI NALOG");
			btnNapraviNalog.setContentAreaFilled(false);
			btnNapraviNalog.setBorderPainted(false);
			btnNapraviNalog.setForeground(Color.WHITE);
			btnNapraviNalog.setHorizontalTextPosition(SwingConstants.CENTER);
			btnNapraviNalog.setVerticalTextPosition(SwingConstants.BOTTOM);
			btnNapraviNalog.setIcon(new ImageIcon(SignUpEkran.class.getResource("/images/tick.png")));
			btnNapraviNalog.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
			btnNapraviNalog.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GuiControler.napraviNoviNalog(textField.getText(),textField_1.getText(), textField_2.getText(), passwordField.getText());
				}
			});
			btnNapraviNalog.setBounds(474, 581, 229, 113);
		}
		return btnNapraviNalog;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
			label.setIcon(new ImageIcon(SignUpEkran.class.getResource("/images/loginBack.png")));
			label.setBounds(0, 0, 1194, 720);
		}
		return label;
	}
	private JPasswordField getPasswordField_1() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setForeground(Color.LIGHT_GRAY);
			passwordField.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
			passwordField.setOpaque(false);
			passwordField.setBounds(459, 500, 258, 33);
			passwordField.setCaretColor(Color.RED);
			passwordField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode()==KeyEvent.VK_ENTER)
						GuiControler.napraviNoviNalog(textField.getText(),textField_1.getText(), textField_2.getText(), passwordField.getText());

				}
			});
		}
		return passwordField;
	}
	private JLabel getLblImg() {
		if (lblImg == null) {
			lblImg = new JLabel("");
			lblImg.setIcon(new ImageIcon(SignUpEkran.class.getResource("/images/newacc128.png")));
			lblImg.setBounds(521, 55, 128, 128);
		}
		return lblImg;
	}
	private JLabel getLblPwd() {
		if (lblPwd == null) {
			lblPwd = new JLabel("");
			lblPwd.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
			lblPwd.setForeground(Color.WHITE);
			lblPwd.setBounds(459, 500, 258, 33);
		}
		return lblPwd;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
			panel.setBackground(Color.DARK_GRAY);
			panel.setBounds(0, 0, 1194, 23);
			panel.setLayout(null);
			panel.add(getButton());
			panel.add(getLblBestMovies());
		}
		return panel;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("< Vrati se nazad");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GuiControler.ugasiSignUpEkran();
				}
			});
			button.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
			button.setForeground(Color.WHITE);
			button.setFocusPainted(false);
			button.setContentAreaFilled(false);
			button.setBorderPainted(false);
			button.setBounds(1060, 0, 145, 23);
		}
		return button;
	}
	private JLabel getLblBestMovies() {
		if (lblBestMovies == null) {
			lblBestMovies = new JLabel("Best movies 4 you: Napravi novi korisnicki nalog");
			lblBestMovies.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
			lblBestMovies.setForeground(Color.LIGHT_GRAY);
			lblBestMovies.setBounds(472, 2, 236, 18);
		}
		return lblBestMovies;
	}
}
