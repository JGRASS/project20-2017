package pretrazivac.sistemske_operacije;

import java.util.LinkedList;

import pretrazivac.Korisnik;
/**
 * Ova klasa predstavlja sistemsku operaciju za metodu resetujKoeficijent
 * @author Ana Colovic
 */
public class SOResetujKoeficijent {
	/**
	 * Metoda koja resetuje koefecijente korisnika na vrednost 0
	 * @param korisnici predstavlja listu korisnika
	 * @return listu korisnika sa resetovanim koeficijentima za svakog korisnika iz liste
	 */
	public static LinkedList<Korisnik> izvrsi(LinkedList<Korisnik> korisnici){
		for(int i=0;i<korisnici.size();i++){
			korisnici.get(i).setKoeficijent(0);
		}
		return korisnici;
	}
}
