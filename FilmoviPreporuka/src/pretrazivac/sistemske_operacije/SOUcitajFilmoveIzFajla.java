package pretrazivac.sistemske_operacije;

import java.io.BufferedInputStream;
import java.io.EOFException;
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
		LinkedList<Film> filmovi1 = new LinkedList<Film>();
		try {
			ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fajl)));
			try {
				while(true) {
					Film f = (Film) in.readObject();
					filmovi1.add(f);
				}
			} catch (EOFException e) {}
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		filmovi = filmovi1;

		return filmovi;
	}
}
