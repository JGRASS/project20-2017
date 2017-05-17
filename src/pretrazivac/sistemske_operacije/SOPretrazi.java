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
		LinkedList<Film> pomocna = (LinkedList<Film>) filmovi.clone();
		if(naziv==null || naziv.equals("")  && godina==0 && (zanr==null || zanr.equals("")))
			return filmovi;
		for(int i=0;i<pomocna.size();i++){
			if((naziv!=null && !naziv.equals("")) && pomocna.get(i).getNaziv().toLowerCase().contains(naziv.toLowerCase())==false){ 
				pomocna.remove(pomocna.get(i));
				i--;
				continue;
			}
			if(godina!=0 && pomocna.get(i).getGodina()!=godina){
				pomocna.remove(pomocna.get(i));
				i--;
				continue;
			}
			if(zanr!=null && !zanr.equals("") && !pomocna.get(i).getZanr().toLowerCase().contains(zanr.toLowerCase())){
				pomocna.remove(pomocna.get(i));
				i--;
			}
		}
		return pomocna;
	}
}
