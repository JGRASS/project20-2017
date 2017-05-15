package pretrazivac.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import pretrazivac.Film;

public class PristupFilmu extends JButton {
	private Film film;
	
	public PristupFilmu(Film film) {
		super();
		this.film=film;
		this.setMinimumSize(new Dimension(140, 221));
		this.setMaximumSize(new Dimension(150, 221));
		this.setText(film.getNaziv());
		this.setIcon(new ImageIcon(KorisnikEkran.class.getResource(film.getImagepath())));
		this.setText(film.getNaziv());
		this.setHorizontalTextPosition(SwingConstants.CENTER);
		this.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 15));
		this.setForeground(new Color(255, 255, 255));
		this.setSize(new Dimension(150, 221));
		this.setOpaque(true);
		this.setContentAreaFilled(true);

	}

	public Film getFilm() {
		return film;
	}
	
	
}
