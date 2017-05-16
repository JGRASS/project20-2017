package pretrazivac.sistemske_operacije;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import pretrazivac.Film;

/**
 * Klasa koja predstavlja sistemsku operaciju za metodu sacuvajFilmoveUFajl
 * @author Jovana Mitrovic
 *
 */
public class SOSacuvajFilmoveUFajl {
	
	/**
	 * Metoda koja cuva listu filmova u fajl
	 * @param filmovi lista filmova koji se cuvaju u fajl
	 * @param fajl naziv fajla u kome se cuvaju fimovi
	 */
	public static void izvrsi(LinkedList<Film> filmovi, String fajl) {
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fajl)));
			
			for (int i = 0; i < filmovi.size(); i++) {
				out.writeObject(filmovi.get(i));
			}
			out.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
	
}
