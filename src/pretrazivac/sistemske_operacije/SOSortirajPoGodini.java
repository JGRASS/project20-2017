package pretrazivac.sistemske_operacije;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import pretrazivac.Film;
/**
 * Klasa koja predstavlja sistemsku operaciju za metodu sortirajPoGodini
 * @author Jovana Mitrovic
 *
 */
public class SOSortirajPoGodini {
	/**
	 * Metoda koja sortira listu filmova po godini
	 * @param filmovi lista fimova koje se sortira
	 * @return vraca sortiranu listu filmova
	 */
	public static LinkedList<Film> izvrsi(LinkedList<Film> filmovi) {
		Collections.sort(filmovi, new Comparator<Film>() {
			@Override
			public int compare(Film o1, Film o2) {
				return o1.getGodina() > o2.getGodina() ? -1: o1.getGodina() == o2.getGodina() ? 0: 1;
			}
		});
		return filmovi;
	}
	
	

}
