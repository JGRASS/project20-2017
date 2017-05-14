package pretrazivac.gui;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;

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
		this.setSize(new Dimension(150, 221));
		this.setText(null);
		this.setOpaque(true);
		this.setContentAreaFilled(true);

	}

	public Film getFilm() {
		return film;
	}
	
	
}
