package pretrazivac.sistemske_operacije;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import pretrazivac.Korisnik;

public class SOSacuvajKorisnikeUFajl {

	public static void izvrsi(LinkedList<Korisnik> korisnici, String fajl) {
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fajl)));
			
			out.writeObject(korisnici);
			out.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
