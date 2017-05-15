package pretrazivac.sistemske_operacije;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import pretrazivac.Film;

/**
 * Klasa koja predstavlja sistemsku operaciju za metodu szurirajPoGledanosti
 * @author Jovana Mitrovic
 *
 */
public class SOAzurirajPoGledanosti {
	
	/**
	 * Metoda koja azurira listu filmovi po gledanosti u opadajucem redosledu
	 * @param filmovi kao parametar prosledjuje listu nasih filmova
	 * @return vrata listu azuriranih filmova
	 */
	public static LinkedList<Film> izvrsi(LinkedList<Film> filmovi) {
		Collections.sort(filmovi, new Comparator<Film>() {
			@Override
			public int compare(Film o1, Film o2) {
				return o1.getBrojPregleda() > o2.getBrojPregleda() ? -1: o1.getBrojPregleda() == o2.getBrojPregleda() ? 0: 1;
			}
		});
		return filmovi;
	}
}
