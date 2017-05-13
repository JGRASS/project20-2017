package pretrazivac;

import java.util.LinkedList;

import pretrazivac.interfejsi.PretrazivacInterfejs;
import pretrazivac.sistemske_operacije.SOPreporuci;
import pretrazivac.sistemske_operacije.SOPretrazi;
import pretrazivac.sistemske_operacije.SOSacuvajFilmoveUFajl;
import pretrazivac.sistemske_operacije.SOSacuvajKorisnikeUFajl;
import pretrazivac.sistemske_operacije.SOSortirajPoNazivu;
import pretrazivac.sistemske_operacije.SOAzurirajPoGledanosti;
import pretrazivac.sistemske_operacije.SOIzbaciKorisnika;
import pretrazivac.sistemske_operacije.SOSortirajPoGodini;
import pretrazivac.sistemske_operacije.SOSortirajPoOceni;
import pretrazivac.sistemske_operacije.SOUbaciKorisnika;
import pretrazivac.sistemske_operacije.SOUcitajIzFajla;
import pretrazivac.sistemske_operacije.SOUcitajKorisnikeIzFajla;


public class Pretrazivac implements PretrazivacInterfejs{
	private LinkedList<Film> filmovi;
	private LinkedList<Korisnik> korisnici;
	
	public Pretrazivac() {
		filmovi = ucitajIzFajla("data/filmovi");
		korisnici = ucitajKorisnikeIzFajla("data/korisnici");
	}
	
	public LinkedList<Film> getFilmovi() {
		return filmovi;
	}
	public void setFilmovi(LinkedList<Film> filmovi) {
		this.filmovi = filmovi;
	}
	public LinkedList<Korisnik> getKorisnici() {
		return korisnici;
	}
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
	public LinkedList<Film> ucitajIzFajla(String fajl) {
		return SOUcitajIzFajla.izvrsi(fajl, filmovi);
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

}
