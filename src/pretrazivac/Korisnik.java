package pretrazivac;

import java.io.Serializable;
import java.util.LinkedList;

import pretrazivac.interfejsi.KorisnikInterfejs;
import pretrazivac.sistemske_operacije.SOAzurirajPoGledanosti;
import pretrazivac.sistemske_operacije.SODodajFilm;
import pretrazivac.sistemske_operacije.SOObrisiFilm;
import pretrazivac.sistemske_operacije.SOPretrazi;
import pretrazivac.sistemske_operacije.SOSortirajPoNazivu;
import pretrazivac.sistemske_operacije.SOSortirajPoOceni;
import pretrazivac.sistemske_operacije.SOSortirajPoGodini;
/**
 * Klasa Korisnik predstavlja domensku klasu sa privatnim atributima i odgovarajucim metodama
 * @author Ana Colovic
 *
 */
public class Korisnik implements KorisnikInterfejs, Serializable{
	/**
	 * Atribut ime predstavlja ime korisnika
	 */
	private String ime;
	/**
	 * Atribut prezime predstavlja prezime korisnika
	 */
	private String prezime;
	/**
	 * Atribut username predstavlja username korisnika
	 */
	private String username;
	/**
	 * Atribut pass predstavlja sifru korisnika
	 */
	private String pass;
	/**
	 * Atribut koeficijent predstavlja koeficijent poklapanja korisnika sa ulogovanim korisnikom
	 */
	private double koeficijent;
	/**
	 * Atribut filmovi predstavlja listu filmova korisnika
	 */
	private LinkedList<Film> filmovi;
	
	
	public Korisnik() {
		super();
		filmovi = new LinkedList<Film>();
	}
	/**
	 * Metoda vraca ime korisnika
	 * @return ime korisnika kao String
	 */

	public Korisnik(String ime, String prezime,String username,String pass) {
		super();
		setIme(ime);
		setPrezime(prezime);
		setUsername(username);
		setPass(pass);
		this.koeficijent=0;
		this.filmovi= new LinkedList<Film>();
	}
	
	public String getIme() {
		return ime;
	}

	/**
	 * Metoda postavlja ime korisnika na unetu vrednost
	 * @param ime predstavlja ime korisnika kao String
	 * @throws RuntimeException
	 * <ul>
	 * <li> kada je uneto ime null vrednost
	 * </ul>
	 */
	public void setIme(String ime) throws RuntimeException{
		if(ime == null || ime.equals("")) {
			throw new RuntimeException("Niste uneli ime!");
		}
		this.ime = ime;
	}

	/**
	 * Metoda vraca prezime korisnika
	 * @return prezime korisnika kao String
	 */
	public String getPrezime() {
		return prezime;
	}

	/**
	 * Metoda postavlja prezime korisnika na unetu vrednost
	 * @param prezime predstavlja prezime korisnika kao String
	 * @throws RuntimeException
	 * <ul>
	 * <li> kada je uneto prezime null vrednost
	 * </ul>
	 */
	public void setPrezime(String prezime) throws RuntimeException{
		if(prezime == null || prezime.equals("")) {
			throw new RuntimeException("Niste uneli prezime!");
		}
		this.prezime = prezime;
	}

	/**
	 * Metoda vraca username korisnika
	 * @return username korisnika kao String
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Metoda postavlja username na unetu vrednost
	 * @param username predstavlja username korisnika kao String
	 * @throws RuntimeException 
	 * <ul>
	 * <li> kada je uneti username null vrednost
	 * <li> kada uneti username sadrzi razmak
	 * </ul>
	 */
	public void setUsername(String username) throws RuntimeException {
		if(username == null || username.equals("")) {
			throw new RuntimeException("Niste uneli username!");
		}
		if(username.contains(" ")) {
			throw new RuntimeException("Username ne sme sadrzati razmak!");
		}
		this.username = username;
	}

	/**
	 * Metoda vraca sifru korisnika
	 * @return sifru korisnika kao String
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * Metoda postavlja sifru korisnika na unetu vrednost
	 * @param pass predstavlja sifru korisnika kao String
	 * @throws RuntimeException
	 * <ul>
	 * <li> kada je uneta sifra null vrednost
	 * <li> kada je sifra kraca od 8 znakova
	 * </ul>
	 */
	public void setPass(String pass) throws RuntimeException{
		if(pass == null || pass.equals("")) {
			throw new RuntimeException("Niste uneli sifru!");
		}
		if(pass.length() < 8) {
			throw new RuntimeException("Sifra mora imati bar 8 karaktera!");
		}
		this.pass = pass;
	}
	/**
	 * Metoda vraca koeficijent preklapanja za korisnika
	 * @return koeficijent preklapanja kao double
	 */
	public double getKoeficijent() {
		return koeficijent;
	}

	/**
	 * Metoda postavlja koeficijent na unetu vrednost
	 * @param koeficijent predstavlja koeficijent preklapanja korisnika
	 */
	public void setKoeficijent(double koeficijent) {
		this.koeficijent = koeficijent;
	}

	/**
	 * Metoda vraca listu filmova korisnika
	 * @return listu filmova korisnika
	 */
	public LinkedList<Film> getFilmovi() {
		return filmovi;
	}

	/**
	 * Metoda postavlja listu filmova na unetu vrednost
	 * @param filmovi predstavlja listu filmova korisnika
	 */
	public void setFilmovi(LinkedList<Film> filmovi) {
		this.filmovi = filmovi;
	}
	
	@Override
	public boolean dodajFilm(Film f) {
		return SODodajFilm.izvrsi(f, filmovi);
	}

	@Override
	public Film obrisiFilm(Film f) {
		return SOObrisiFilm.izvrsi(f, filmovi);
	}

	@Override
	public LinkedList<Film> pretrazi(String naziv, int godina, String zanr) {
		return SOPretrazi.izvrsi(naziv, godina, zanr, filmovi);
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
	public boolean equals(Object obj) {
		Korisnik k = (Korisnik) obj;

		if(k.getUsername().equalsIgnoreCase(username) || (k.getUsername().equalsIgnoreCase(username) && k.getPass().equals(pass))){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Korisnik [ime=" + ime + ", prezime=" + prezime + ", username=" + username + "]";
	}
	@Override
	public LinkedList<Film> sortirajPoOceni() {
		return SOSortirajPoOceni.izvrsi(filmovi);
	}
	
	@Override
	public LinkedList<Film> sortirajPoPopularnosti() {
		return SOAzurirajPoGledanosti.izvrsi(filmovi);
	}
}
