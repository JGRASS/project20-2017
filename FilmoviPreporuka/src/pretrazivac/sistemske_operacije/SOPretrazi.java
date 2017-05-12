package pretrazivac.sistemske_operacije;

import java.util.LinkedList;

import pretrazivac.Film;

public class SOPretrazi {
	public static LinkedList<Film> izvrsi(String naziv, int godina, String zanr, LinkedList<Film> filmovi){
		LinkedList<Film> pomocna = new LinkedList<>();
		
		for(int i=0;i<filmovi.size();i++){
			if(naziv.equals(filmovi.get(i).getNaziv()) || godina==filmovi.get(i).getGodina() || 
					zanr.equals(filmovi.get(i).getZanr())){
				pomocna.add(filmovi.get(i));
			}
		}
		return pomocna;
	}
}
