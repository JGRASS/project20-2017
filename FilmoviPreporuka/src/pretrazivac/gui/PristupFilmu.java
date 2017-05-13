package pretrazivac.gui;

import java.awt.Dimension;

import javax.swing.JButton;

import pretrazivac.Film;

public class PristupFilmu extends JButton {
	private Film film;
	
	public PristupFilmu(Film film) {
		super();
		this.film=film;
		this.setMinimumSize(new Dimension(150, 300));
		this.setText(film.getNaziv());
	}

	public Film getFilm() {
		return film;
	}
	
	
}
