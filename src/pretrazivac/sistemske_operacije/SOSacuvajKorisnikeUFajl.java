package pretrazivac.sistemske_operacije;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import pretrazivac.Korisnik;

/**
 * Klasa koja predstavlja sistemsku operaciju za metodu sacuvajKorisnikaUFajl
 * @author Jovana Mitrovic
 *
 */
public class SOSacuvajKorisnikeUFajl {
	/**
	 * Metoda koja cuva listu korisnika u fajl
	 * @param korisnici lista korisnika koji se cuvaju u fajl
	 * @param fajl naziv fajla u kome se cuvaju korisnici
	 */
	public static void izvrsi(LinkedList<Korisnik> korisnici, String fajl) {
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fajl)));
			for (int i = 0; i < korisnici.size(); i++) {
				out.writeObject(korisnici.get(i));
			}
			out.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
