package pretrazivac.sistemske_operacije;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import pretrazivac.Film;
import pretrazivac.Korisnik;

public class SOUcitajKorisnikeIzFajla {
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
