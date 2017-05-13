package pretrazivac.sistemske_operacije;

import java.util.LinkedList;

import pretrazivac.Korisnik;

public class SOIzbaciKorisnika {
	
	public static Korisnik izvrsi(LinkedList<Korisnik> korisnici, Korisnik k) {
		korisnici.remove(k);
		return k;
	}

}
