package pretrazivac.sistemske_operacije;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import pretrazivac.Film;
import pretrazivac.Korisnik;
/**
 * Klasa koja prestavlja sistemsku operaciju za metodu ucitajKorisnikaIzFajla
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
		try {
			ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fajl)));
			LinkedList<Korisnik> korisnici1 = (LinkedList<Korisnik>)(in.readObject());
			korisnici.clear();
			korisnici.addAll(korisnici1);
			
			in.close();
		} catch (ClassNotFoundException e) {
			korisnici = null;
		} catch(Exception e){
			throw new RuntimeException(e);
		}
		return korisnici;
	}
}
