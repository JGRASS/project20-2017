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
	private JLabel lblNewLabel;
	private JLabel lblUspesno;
	private JButton btnNapraviNalog;
	private JLabel label;
	private JPasswordField passwordField;
	private JLabel lblImg;
	private JLabel lblPwd;


	/**
	 * Create the frame.
	 */
	public SignUpEkran() {
		setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/clapperboard.png")));
		setTitle("BEST MOVIES 4 YOU");
		setBounds(100, 0, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
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
		contentPane.add(getLabel());
		contentPane.add(getLblUspesno());
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
			textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			textField.setOpaque(false);
			textField.setForeground(Color.WHITE);
			textField.setBounds(461, 344, 258, 33);
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
			textField_1.setColumns(10);
			textField_1.setBounds(461, 414, 258, 33);
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
			textField_2.setColumns(10);
			textField_2.setBounds(461, 490, 258, 33);
		}
		return textField_2;
	}
	private JLabel getLblUnesiteVasePodatke() {
		if (lblUnesiteVasePodatke == null) {
			lblUnesiteVasePodatke = new JLabel("Unesite vase podatke");
			lblUnesiteVasePodatke.setHorizontalAlignment(SwingConstants.CENTER);
			lblUnesiteVasePodatke.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 19));
			lblUnesiteVasePodatke.setForeground(Color.LIGHT_GRAY);
			lblUnesiteVasePodatke.setBounds(461, 263, 258, 33);
		}
		return lblUnesiteVasePodatke;
	}
	private JLabel getLblIme() {
		if (lblIme == null) {
			lblIme = new JLabel("Ime");
			lblIme.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
			lblIme.setForeground(Color.LIGHT_GRAY);
			lblIme.setBounds(461, 321, 258, 16);
		}
		return lblIme;
	}
	private JLabel getLblPrezime() {
		if (lblPrezime == null) {
			lblPrezime = new JLabel("Prezime");
			lblPrezime.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
			lblPrezime.setForeground(Color.LIGHT_GRAY);
			lblPrezime.setBounds(461, 390, 258, 16);
		}
		return lblPrezime;
	}
	private JLabel getLblKorisnickoIme() {
		if (lblKorisnickoIme == null) {
			lblKorisnickoIme = new JLabel("Korisnicko ime");
			lblKorisnickoIme.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
			lblKorisnickoIme.setForeground(Color.LIGHT_GRAY);
			lblKorisnickoIme.setBounds(461, 461, 258, 16);
		}
		return lblKorisnickoIme;
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
			lblSifra.setForeground(Color.LIGHT_GRAY);
			lblSifra.setBounds(461, 536, 258, 16);
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
			
			btnPrikazi.setBounds(722, 565, 39, 32);
		}
		return btnPrikazi;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			lblNewLabel.setBounds(0, 0, 1182, 853);
		}
		return lblNewLabel;
	}
	public void postaviPrazan(){
		textField_2.setText("");
	}
	private JLabel getLblUspesno() {
		if (lblUspesno == null) {
			lblUspesno = new JLabel("USPESNO STE NAPRAVILI NALOG! ");
			lblUspesno.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
			lblUspesno.setForeground(Color.LIGHT_GRAY);
			lblUspesno.setVisible(false);
			lblUspesno.setHorizontalAlignment(SwingConstants.CENTER);
			lblUspesno.setBounds(0, 0, 1182, 853);
		}
		return lblUspesno;
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
			btnNapraviNalog.setBounds(476, 646, 229, 113);
		}
		return btnNapraviNalog;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
			label.setIcon(new ImageIcon(SignUpEkran.class.getResource("/images/loginBack.png")));
			label.setBounds(0, 0, 1182, 853);
		}
		return label;
	}
	private JPasswordField getPasswordField_1() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setForeground(Color.LIGHT_GRAY);
			passwordField.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
			passwordField.setOpaque(false);
			passwordField.setBounds(461, 565, 258, 33);
		}
		return passwordField;
	}
	private JLabel getLblImg() {
		if (lblImg == null) {
			lblImg = new JLabel("");
			lblImg.setIcon(new ImageIcon(SignUpEkran.class.getResource("/images/newacc128.png")));
			lblImg.setBounds(523, 120, 128, 128);
		}
		return lblImg;
	}
	private JLabel getLblPwd() {
		if (lblPwd == null) {
			lblPwd = new JLabel("");
			lblPwd.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
			lblPwd.setForeground(Color.WHITE);
			lblPwd.setBounds(461, 565, 258, 33);
		}
		return lblPwd;
	}
}
