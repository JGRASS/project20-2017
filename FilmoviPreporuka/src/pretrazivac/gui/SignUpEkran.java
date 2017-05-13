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

public class SignUpEkran extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblUnesiteVasePodatke;
	private JLabel lblIme;
	private JLabel lblPrezime;
	private JLabel lblKorisnickoIme;
	private JLabel lblSifra;
	private JButton btnPrikazi;
	private JLabel lblNewLabel;
	private JLabel lblUspesno;
	private JButton btnNapraviNalog;


	/**
	 * Create the frame.
	 */
	public SignUpEkran() {
		setBounds(100, 100, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUspesno());
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getTextField_2());
		contentPane.add(getTextField_3());
		contentPane.add(getLblUnesiteVasePodatke());
		contentPane.add(getLblIme());
		contentPane.add(getLblPrezime());
		contentPane.add(getLblKorisnickoIme());
		contentPane.add(getLblSifra());
		contentPane.add(getBtnPrikazi());
		contentPane.add(getBtnNapraviNalog());
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(461, 344, 258, 33);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(461, 414, 258, 33);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(461, 490, 258, 33);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(461, 562, 258, 33);
		}
		return textField_3;
	}
	private JLabel getLblUnesiteVasePodatke() {
		if (lblUnesiteVasePodatke == null) {
			lblUnesiteVasePodatke = new JLabel("Unesite vase podatke");
			lblUnesiteVasePodatke.setBounds(510, 235, 135, 33);
		}
		return lblUnesiteVasePodatke;
	}
	private JLabel getLblIme() {
		if (lblIme == null) {
			lblIme = new JLabel("Ime");
			lblIme.setBounds(461, 321, 56, 16);
		}
		return lblIme;
	}
	private JLabel getLblPrezime() {
		if (lblPrezime == null) {
			lblPrezime = new JLabel("Prezime");
			lblPrezime.setBounds(461, 390, 56, 16);
		}
		return lblPrezime;
	}
	private JLabel getLblKorisnickoIme() {
		if (lblKorisnickoIme == null) {
			lblKorisnickoIme = new JLabel("Korisnicko ime");
			lblKorisnickoIme.setBounds(461, 461, 91, 16);
		}
		return lblKorisnickoIme;
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(461, 536, 56, 16);
		}
		return lblSifra;
	}
	private JButton getBtnPrikazi() {
		if (btnPrikazi == null) {
			btnPrikazi = new JButton("o");
			btnPrikazi.setBounds(731, 566, 39, 25);
		}
		return btnPrikazi;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
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
			lblUspesno.setVisible(false);
			lblUspesno.setHorizontalAlignment(SwingConstants.CENTER);
			lblUspesno.setBounds(0, 0, 1182, 853);
		}
		return lblUspesno;
	}
	private JButton getBtnNapraviNalog() {
		if (btnNapraviNalog == null) {
			btnNapraviNalog = new JButton("NAPRAVI NALOG");
			btnNapraviNalog.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GuiControler.napraviNoviNalog(textField.getText(),textField_1.getText(), textField_2.getText(), textField_3.getText());
					lblUspesno.setVisible(true);
				}
			});
			btnNapraviNalog.setBounds(520, 652, 148, 25);
		}
		return btnNapraviNalog;
	}
}
