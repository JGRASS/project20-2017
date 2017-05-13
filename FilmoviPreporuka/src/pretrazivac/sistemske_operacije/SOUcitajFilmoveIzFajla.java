package pretrazivac.sistemske_operacije;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import pretrazivac.Film;

/**
 * Klasa koja predstavlja sistemsku operaciju za metodu ucitajIzFajla
 * @author Jovana Mitrovic
 *
 */
public class SOUcitajFilmoveIzFajla {
	/**
	 * Metoda koja ucitava listu filmova iz fajla
	 * @param fajl naziv fajla iz koga se vrsi ucitavanja
	 * @param filmovi lista filmova u koju se ubacuju ucitani objekti iz fajla
	 * @return vraca azuriranu listu filmmova sa filmovima iz fajla
	 */
	public static LinkedList<Film> izvrsi(String fajl, LinkedList<Film> filmovi){
		try {
			ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fajl)));
			LinkedList<Film> filmovi1 = (LinkedList<Film>)(in.readObject());
			filmovi.clear();
			filmovi.addAll(filmovi1);
			
			in.close();
		} catch (ClassNotFoundException e) {
			filmovi = null;
		} catch(Exception e){
			throw new RuntimeException(e);
		}
		return filmovi;
	}
}
