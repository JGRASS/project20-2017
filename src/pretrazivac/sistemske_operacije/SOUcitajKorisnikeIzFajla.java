package pretrazivac.sistemske_operacije;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import pretrazivac.Film;
import pretrazivac.Korisnik;
import pretrazivac.gui.Login;
/**
 * Klasa koja predstavlja sistemsku operaciju za metodu ucitajKorisnikaIzFajla
 * @author Jovana Mitrovic
 *
 */
public class SOUcitajKorisnikeIzFajla {
	/**
	 * Metoda koja ucitava korisnike iz fajla
	 * @param fajl naziv fajla iz koga se vrsi ucitavanje
	 * @param korisnici lista korisnika u koju se ubacuju ucitani objekti iz fajla
	 * @return vraca azuriranu listu korisnika sa korisnicima iz fajla
	 */
	public static LinkedList<Korisnik> izvrsi(String fajl, LinkedList<Korisnik> korisnici){
		LinkedList<Korisnik> korisnici1 = new LinkedList<Korisnik>();
		try {
			ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fajl)));
			try {
				while(true) {
					Korisnik k= (Korisnik) in.readObject();
					korisnici1.add(k);
				}
			} catch (EOFException e) {}
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		korisnici = korisnici1;

		return korisnici;
	}
}
