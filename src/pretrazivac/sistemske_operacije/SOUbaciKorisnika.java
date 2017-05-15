package pretrazivac.sistemske_operacije;

import java.util.LinkedList;

import pretrazivac.Korisnik;
/**
 * Klasa koja predstavalja sistemsku operaciju za metodu ubaciKorisnika
 * @author Jovana Mitrovic
 *
 */
public class SOUbaciKorisnika {
	/**
	 * Metoda koja ubacuje korisnika na kraj liste ako on vec ne postoji u listi svih korisnika
	 * @param korisnici lista korisnika u koju se ubacuje novi korisnik
	 * @param k objekat klase Korisnik koji se ubacuje u listu sviih korisnika
	 * @return <ul>
	 * <li> true - ako je korisnik dodat u listu
	 * <li> false - ako korisnik vec postoji u listi
	 * </ul>
	 */
	public static boolean izvrsi(LinkedList<Korisnik> korisnici, Korisnik k) {
		for (int i = 0; i < korisnici.size(); i++) {
			if(korisnici.get(i).getUsername().equals(k.getUsername())) {
				return false;
			}
		}
		korisnici.addLast(k);
		return true;
	}
}
