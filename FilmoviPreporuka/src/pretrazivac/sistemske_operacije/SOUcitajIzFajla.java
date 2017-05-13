package pretrazivac.sistemske_operacije;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import pretrazivac.Film;

public class SOUcitajIzFajla {
	public static LinkedList<Film> izvrsi(String fajl, LinkedList<Film> filmovi){
		try {
			ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fajl)));
			LinkedList<Film> filmovi1 = (LinkedList<Film>)(in.readObject());
			filmovi.clear();
			filmovi.addAll(filmovi1);
			
			in.close();
		} catch (ClassNotFoundException e) {
			filmovi = null;
		} catch(Exception e){
			throw new RuntimeException(e);
		}
		return filmovi;
	}
}
