package pretrazivac.sistemske_operacije;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import pretrazivac.Film;
/**
 * Klasa koja predstavlja sistemsku operaciju za metodu sortirajPoNazivu
 * @author Jovana Mitrovic
 *
 */
public class SOSortirajPoNazivu {
	/**
	 * Metoda koja sortira listu filmova po nazivu
	 * @param filmovi lista filmova koja se sortira
	 * @return vraca sortiranu listu filmova
	 */
	public static LinkedList<Film> izvrsi(LinkedList<Film> filmovi){
		Collections.sort(filmovi,new Comparator<Film>() {

			@Override
			public int compare(Film o1, Film o2) {
				return o1.getNaziv().compareTo(o2.getNaziv());
			}
			
		});
		return filmovi;
	}
}
