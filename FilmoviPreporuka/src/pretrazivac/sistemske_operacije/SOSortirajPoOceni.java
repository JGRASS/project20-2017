package pretrazivac.sistemske_operacije;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import pretrazivac.Film;

public class SOSortirajPoOceni {
	
	public static LinkedList<Film> izvrsi(LinkedList<Film> filmovi) {
		Collections.sort(filmovi, new Comparator<Film>() {
			@Override
			public int compare(Film o1, Film o2) {
				return o1.getOcena() > o2.getOcena() ? -1: o1.getOcena() == o2.getOcena() ? 0: 1;
			}
		});
		return filmovi;
	}

}
