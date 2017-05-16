package pretrazivac.gui;


import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pretrazivac.Film;
import java.awt.Dimension;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class FilmEkran extends JFrame {
	private Film film;
	private JPanel contentPane;
	private JLabel lblSlika;
	private JLabel lblBackimage;
	private JLabel lblTitle;
	private JTextArea txtrDescription;
	private JButton btnGledajFilm;
	private JButton btnTrailer;
	/**
	 * Create the frame
	 */
	public FilmEkran(Film film) {
		this.film=film;
		setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/clapperboard.png")));
		setTitle("BEST MOVIES 4 YOU");
		setBounds(100, 100, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSlika());
		contentPane.add(getLblTitle());
		contentPane.add(getTxtrDescription());
		contentPane.add(getBtnGledajFilm());
		contentPane.add(getBtnTrailer());
		contentPane.add(getLblBackimage());
		setResizable(false);
	}
	
	private JLabel getLblSlika() {
		if (lblSlika == null) {
			lblSlika = new Slika();
			System.out.println("|"+film.getNaziv()+film.getImagepath());
			lblSlika.setIcon(new ImageIcon(FilmEkran.class.getResource(film.getImagepath().substring(0, film.getImagepath().indexOf(".")) + "1.jpg")));
			lblSlika.setBounds(183, 222, 250, 369);
		}
		return lblSlika;
	}
	private JLabel getLblBackimage() {
		if (lblBackimage == null) {
			lblBackimage = new JLabel("");
			lblBackimage.setIcon(new ImageIcon(FilmEkran.class.getResource("/images/loginBack.png")));
			lblBackimage.setBounds(0, 0, 1194, 865);
		}
		return lblBackimage;
	}
	private JLabel getLblTitle() {
		if (lblTitle == null) {
			lblTitle = new JLabel(film.getNaziv());
			lblTitle.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 56));
			lblTitle.setForeground(Color.LIGHT_GRAY);
			lblTitle.setBounds(475, 94, 600, 86);
		}
		return lblTitle;
	}
	private JTextArea getTxtrDescription() {
		if (txtrDescription == null) {
			txtrDescription = new JTextArea();
			String s=String.format("Godina: %d\nZanr:     %s\n\nOcena: %.2f\nBroj pregleda: %d", film.getGodina(), film.getZanr(), film.getOcena(), film.getBrojPregleda());
			txtrDescription.setOpaque(false);
			txtrDescription.setText(s);
			txtrDescription.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 21));
			txtrDescription.setForeground(Color.WHITE);
			txtrDescription.setBounds(445, 222, 397, 154);
		}
		return txtrDescription;
	}
	private JButton getBtnGledajFilm() {
		if (btnGledajFilm == null) {
			btnGledajFilm = new JButton("GLEDAJ FILM");
			btnGledajFilm.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
			btnGledajFilm.setContentAreaFilled(false);
			btnGledajFilm.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
			btnGledajFilm.setBackground(Color.DARK_GRAY);
			btnGledajFilm.setForeground(Color.WHITE);
			btnGledajFilm.setIcon(new ImageIcon(FilmEkran.class.getResource("/images/login.png")));
			btnGledajFilm.setBounds(445, 619, 147, 51);
		}
		return btnGledajFilm;
	}
	private JButton getBtnTrailer() {
		if (btnTrailer == null) {
			btnTrailer = new JButton("Trailer");
			btnTrailer.setContentAreaFilled(false);
			btnTrailer.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
			btnTrailer.setIcon(new ImageIcon(FilmEkran.class.getResource("/images/clapperboard1.png")));
			btnTrailer.setForeground(Color.LIGHT_GRAY);
			btnTrailer.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 13));
			btnTrailer.setBounds(445, 564, 86, 33);
		}
		return btnTrailer;
	}
}
