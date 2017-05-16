package pretrazivac.sistemske_operacije;

import java.util.LinkedList;

import pretrazivac.Film;

public class SOAzurirajDodavanjeFilma {
	public static void izvrsi(Film f, double ocena){
		f.setOcena((f.getOcena()*f.getBrojPregleda()+ocena)/(f.getBrojPregleda()+1));
		f.setBrojPregleda(f.getBrojPregleda()+1);
	}
}
