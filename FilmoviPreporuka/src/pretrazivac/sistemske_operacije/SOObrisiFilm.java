package pretrazivac.sistemske_operacije;

import java.util.LinkedList;

import pretrazivac.Film;

public class SOObrisiFilm {
	public static Film izvrsi(Film f, LinkedList<Film> filmovi){
		filmovi.remove(f);
		return f;
	}
}
