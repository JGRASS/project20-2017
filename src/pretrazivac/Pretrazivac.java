package pretrazivac;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import pretrazivac.gui.KorisnikEkran;
import pretrazivac.interfejsi.PretrazivacInterfejs;
import pretrazivac.sistemske_operacije.SOPreporuci;
import pretrazivac.sistemske_operacije.SOPretrazi;
import pretrazivac.sistemske_operacije.SOSacuvajFilmoveUFajl;
import pretrazivac.sistemske_operacije.SOSacuvajKorisnikeUFajl;
import pretrazivac.sistemske_operacije.SOSortirajPoNazivu;
import pretrazivac.sistemske_operacije.SOAzurirajDodavanjeFilma;
import pretrazivac.sistemske_operacije.SOAzurirajPoGledanosti;
import pretrazivac.sistemske_operacije.SOIzbaciKorisnika;
import pretrazivac.sistemske_operacije.SOSortirajPoGodini;
import pretrazivac.sistemske_operacije.SOSortirajPoOceni;
import pretrazivac.sistemske_operacije.SOUbaciKorisnika;
import pretrazivac.sistemske_operacije.SOUcitajFilmoveIzFajla;
import pretrazivac.sistemske_operacije.SOUcitajKorisnikeIzFajla;

/**
 * Klasa Pretrazivac predstavlja domensku klasu sa atributima i odgovarajucim metodama
 * @author Ana Colovic
 *
 */
public class Pretrazivac implements PretrazivacInterfejs{
	/**
	 * Atribut filmovi predstavlja listu filmova 
	 */
	private LinkedList<Film> filmovi;
	/**
	 * Atribut korisnici predstavlja listu korisnika
	 */
	private LinkedList<Korisnik> korisnici;
	
	/**
	 * Konstruktor koji inicijalizuje listu filmova i korisnika na preuzete vrednosti iz fajla
	 */
	public Pretrazivac() {

		filmovi = ucitajFilmoveIzFajla("filmovi.out");
		korisnici = ucitajKorisnikeIzFajla("korisnici.out");
	}

	/**
	 * Metoda vraca listu filmova
	 * @return listu filmova
	 */
	public LinkedList<Film> getFilmovi() {
		return filmovi;
	}
	/**
	 * Metoda postavlja listu filmova na unetu vrednost
	 * @param filmovi predstavlja listu filmova
	 */
	public void setFilmovi(LinkedList<Film> filmovi) {
		this.filmovi = filmovi;
	}
	/**
	 * Metoda vraca listu korisnika
	 * @return listu korisnika
	 */
	public LinkedList<Korisnik> getKorisnici() {
		return korisnici;
	}
	/**
	 * Metoda postavlja listu korisnika na unetu vrednost
	 * @param korisnici predstavlja listu korisnika
	 */
	public void setKorisnici(LinkedList<Korisnik> korisnici) {
		this.korisnici = korisnici;
	}
	@Override
	public boolean ubaciKorisnika(Korisnik k) {
		return SOUbaciKorisnika.izvrsi(korisnici, k);
	}
	@Override
	public Korisnik izbaciKorsnika(Korisnik k) {
		return SOIzbaciKorisnika.izvrsi(korisnici, k);
	}
	@Override
	public LinkedList<Film> pretrazi(String naziv, int godina, String zanr) {
		return SOPretrazi.izvrsi(naziv, godina, zanr, filmovi);
	}
	@Override
	public LinkedList<Film> preporuci(Korisnik k) {
		return SOPreporuci.izvrsi(k, korisnici, filmovi);
	}
	@Override
	public LinkedList<Film> sortirajPoNazivu() {
		return SOSortirajPoNazivu.izvrsi(filmovi);
	}
	@Override
	public LinkedList<Film> sortirajPoGodini() {
		return SOSortirajPoGodini.izvrsi(filmovi);
	}
	@Override
	public LinkedList<Film> sortirajPoOceni() {
		return SOSortirajPoOceni.izvrsi(filmovi);
	}
	@Override
	public LinkedList<Film> azurirajPoGledanosti() {
		return SOAzurirajPoGledanosti.izvrsi(filmovi);
	}

	@Override
	public LinkedList<Film> ucitajFilmoveIzFajla(String fajl) {
		return SOUcitajFilmoveIzFajla.izvrsi(fajl, filmovi);
	}

	@Override
	public LinkedList<Korisnik> ucitajKorisnikeIzFajla(String fajl) {
		return SOUcitajKorisnikeIzFajla.izvrsi(fajl, korisnici);
	}

	@Override
	public void sacuvajFilmoveUFajl(String fajl) {
		SOSacuvajFilmoveUFajl.izvrsi(filmovi, fajl);
	}

	@Override
	public void sacuvajKorisnikeUFajl(String fajl) {
		SOSacuvajKorisnikeUFajl.izvrsi(korisnici, fajl);
		
	}

	@Override
	public Film azurirajDodavanjeFilma(Film f, double ocena) {
		return SOAzurirajDodavanjeFilma.izvrsi(f, ocena, filmovi);
	}
	
}
