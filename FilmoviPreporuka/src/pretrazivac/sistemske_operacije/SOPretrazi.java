package pretrazivac.sistemske_operacije;

import java.util.LinkedList;

import pretrazivac.Film;

/**
 * Klasa koja predstavlja sistemsku operaciju za metodu pretrazi
 * @author Jovana Mitrovic
 *
 */
public class SOPretrazi {
	
	/**
	 * Metoda koja pretrazuje listu filmova
	 * @param naziv naziv filma  koji se pretrazuje kao String
	 * @param godina godina filma koja se pretrazuje kao int
	 * @param zanr zanr filma koji se prerazuje kao String
	 * @param filmovi lista filmova u okviru koje se vrsi pretrazivanje
	 * @return vraca listu filmova u kojoj se nalaze filmovi koji odgovaraju pretrazi
	 */
	public static LinkedList<Film> izvrsi(String naziv, int godina, String zanr, LinkedList<Film> filmovi){
		LinkedList<Film> pomocna = new LinkedList<>();
		
		for(int i=0;i<filmovi.size();i++){
			if((naziv!=null && filmovi.get(i).getNaziv().contains(naziv)) || godina==filmovi.get(i).getGodina() || 
					(zanr!=null && filmovi.get(i).getZanr().contains(zanr))){
				pomocna.add(filmovi.get(i));
			}
		}
		return pomocna;
	}
}
