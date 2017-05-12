package pretrazivac.sistemske_operacije;

import java.util.LinkedList;

import pretrazivac.Korisnik;

public class SOUbaciKorisnika {
	
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
