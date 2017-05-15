package pretrazivac.sistemske_operacije;

import java.util.LinkedList;

import pretrazivac.Film;


/**
 * Klasa koja predstavlja sistemsku operaciju za metodu ObrisiFIlm
 * @author Jovana Mitrovic
 *
 */
public class SOObrisiFilm {
	
	/**
	 * Metoda koja brise film iz liste filmova korisnika
	 * @param f objekat klase Film koji se brise iz liste filmova
	 * @param filmovi lista filmova iz koje se brise prosledeni film
	 * @return vraca film koji je izbacen iz liste
	 */
	public static Film izvrsi(Film f, LinkedList<Film> filmovi){
		filmovi.remove(f);
		return f;
	}
}
