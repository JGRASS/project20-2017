package pretrazivac.sistemske_operacije;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import pretrazivac.Film;
import pretrazivac.Korisnik;

public class SOPreporuci {
	public static LinkedList<Film> izvrsi(Korisnik k, LinkedList<Korisnik> korisnici, LinkedList<Film> filmovi){
		int brojac = 0;
		double odstupanjeOdOcene=0;
		double odstupanjeOdPreklapanja = 0;
		
		LinkedList<Film> pomocna = new LinkedList<>();
		
		for(int i=0;i<korisnici.size();i++){
			if(korisnici.get(i).equals(k)==false){
				for(int j=0;j<k.getFilmovi().size();j++){
					for(int m=0;m<korisnici.get(i).getFilmovi().size();m++){
						if(k.getFilmovi().get(j).equals(korisnici.get(i).getFilmovi().get(m))){
							brojac++;
							odstupanjeOdOcene += 10-Math.abs(k.getFilmovi().get(j).getOcena()-(double)korisnici.get(i).getFilmovi().get(m).getOcena());
						}
					}
				}
			}
			odstupanjeOdPreklapanja = k.getFilmovi().size()-brojac;
			if(odstupanjeOdPreklapanja==0){
				odstupanjeOdPreklapanja=brojac;
			}
			korisnici.get(i).setKoeficijent(odstupanjeOdOcene/odstupanjeOdPreklapanja);
			brojac=0;
			odstupanjeOdOcene=0;
			odstupanjeOdPreklapanja=0;
		}
		
		Collections.sort(korisnici,new Comparator<Korisnik>() {

			@Override
			public int compare(Korisnik o1, Korisnik o2) {
				if(o1.getKoeficijent()>o2.getKoeficijent()){
					return -1;
				} else if(o1.getKoeficijent()<o2.getKoeficijent()){
					return 1;
				} else return 0;
			}
			
		});
		
		for(int i=0;i<korisnici.size();i++){
			for(int j=0;j<korisnici.get(i).getFilmovi().size();j++){
				if(korisnici.get(i).getKoeficijent()!= 0 && k.getFilmovi().contains(korisnici.get(i).getFilmovi().get(j))==false){
					pomocna.add(korisnici.get(i).getFilmovi().get(j));
				}
			}
			if(pomocna.isEmpty()==false){
				break;
			}
		}
		
		if(pomocna.isEmpty()) {
			pomocna = filmovi;
		}
		
		return pomocna;
	}
}
