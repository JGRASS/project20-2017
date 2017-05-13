package pretrazivac.sistemske_operacije;

import java.util.LinkedList;

import pretrazivac.Film;

/**
 * Klasa koja predstavlja sistemsku operaciju za metodu dodajFilm
 * @author Jovana Mitrovic
 *
 */
public class SODodajFilm {
	
	/**
	 * Metoda koja dodaje film na kraj liste ukoliko se taj film ne nalazi vec u prosledjejnoj listi
	 * @param f objekat klase Film koji se dodaje u listu
	 * @param filmovi lista filmova u koju se dodaje film
	 * @return <ul>
	 * <li> true - ako je film dodat u listu
	 * <li> false - ako vec postoji ddati film u listi
	 * </ul>
	 */
	public static boolean izvrsi(Film f, LinkedList<Film> filmovi){
		if(filmovi.contains(f)) return false;
		for(int i=0;i<filmovi.size();i++){
			if(f.getOcena()>=filmovi.get(i).getOcena()){
				filmovi.add(i, f);
				return true;
			}
		}
		filmovi.addLast(f);
		return true;
	}
}
