package pretrazivac.sistemske_operacije;

import java.util.LinkedList;

import pretrazivac.Film;

public class SODodajFilm {
	public static boolean izvrsi(Film f, LinkedList<Film> filmovi){
		if(filmovi.contains(f)) return false;
		for(int i=0;i<filmovi.size();i++){
			if(f.getOcena()>=filmovi.get(i).getOcena()){
				filmovi.add(i, f);
				return true;
			}
		}
		filmovi.addLast(f);
		return true;
	}
}
