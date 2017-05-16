package pretrazivac.sistemske_operacije;

import java.util.LinkedList;

import pretrazivac.Film;

public class SOAzurirajDodavanjeFilma {
	public static Film izvrsi(Film f, double ocena, LinkedList<Film> filmovi){
		for(int i=0;i<filmovi.size();i++){
			if(filmovi.get(i).equals(f)){
				filmovi.get(i).setOcena(((filmovi.get(i).getOcena()*filmovi.get(i).getBrojPregleda()+ocena)/filmovi.get(i).getBrojPregleda()+1));
				filmovi.get(i).setBrojPregleda(filmovi.get(i).getBrojPregleda()+1);
				f.setOcena(ocena);
				f.setBrojPregleda(filmovi.get(i).getBrojPregleda());
			}
		} 
		return f;
	}
}
