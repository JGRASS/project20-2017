
package pretrazivac.sistemske_operacije;

import java.util.LinkedList;

import pretrazivac.Film;
/**
 * Klasa koja predstavlja sistemsku operaciju za metodu azurirajDodavanjeFilma
 * @author Ana Colovic
 *
 */
public class SOAzurirajDodavanjeFilma {
	/**
	 * Metoda koja azurira listu filmova kada je korisnik doda u svoju listu filmova
	 * @param f predstavlja film za koji se azuriraju podaci
	 * @param ocena predstavlja ocenu koju je korisnik dao filmu
	 */
	public static void izvrsi(Film f, double ocena){
		f.setOcena((f.getOcena()*f.getBrojPregleda()+ocena)/(f.getBrojPregleda()+1));
		f.setBrojPregleda(f.getBrojPregleda()+1);
	}
}
