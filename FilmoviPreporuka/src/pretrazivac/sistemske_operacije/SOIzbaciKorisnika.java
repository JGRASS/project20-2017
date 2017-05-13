package pretrazivac.sistemske_operacije;

import java.util.LinkedList;
import pretrazivac.Korisnik;

/**
 * Klasa koja predstavlja sistemsku operaciju za metodu izbaciKorisnika
 * @author Jovana Mitrovic
 *
 */
public class SOIzbaciKorisnika {
	
	/**
	 * Metoda koja izbacuje korisnika izliste svih korisinika
	 * @param korisnici lista korisnika iz koje se izbacuje korisnik
	 * @param k objekat klase Korisnik koji se izbacuje iz liste korisnika
	 * @return vraca korisnika koji je izbacen iz liste
	 */
	public static Korisnik izvrsi(LinkedList<Korisnik> korisnici, Korisnik k) {
		korisnici.remove(k);
		return k;
	}

}
