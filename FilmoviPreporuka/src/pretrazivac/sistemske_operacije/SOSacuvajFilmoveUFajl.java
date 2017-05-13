package pretrazivac.sistemske_operacije;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import pretrazivac.Film;

public class SOSacuvajFilmoveUFajl {

	public static void izvrsi(LinkedList<Film> filmovi, String fajl) {
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fajl)));
			
			out.writeObject(filmovi);
			out.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
	
}
