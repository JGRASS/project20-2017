package pretrazivac;

import java.util.LinkedList;

import pretrazivac.interfejsi.KorisnikInterfejs;
import pretrazivac.sistemske_operacije.SODodajFilm;
import pretrazivac.sistemske_operacije.SOObrisiFilm;
import pretrazivac.sistemske_operacije.SOPretrazi;
import pretrazivac.sistemske_operacije.SOSortirajPoNazivu;
import pretrazivac.sistemske_operacije.SOSortirajPoGodini;

public class Korisnik implements KorisnikInterfejs {
	private String ime;
	private String prezime;
	private String username;
	private String pass;
	private double koeficijent;
	private LinkedList<Film> filmovi;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) throws RuntimeException{
		if(ime == null) {
			throw new RuntimeException("Niste uneli ime!");
		}
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) throws RuntimeException{
		if(prezime == null) {
			throw new RuntimeException("Niste uneli prezime!");
		}
		this.prezime = prezime;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) throws RuntimeException {
		if(username == null) {
			throw new RuntimeException("Niste uneli username!");
		}
		if(username.contains(" ")) {
			throw new RuntimeException("Username ne sme sadrzati razmak!");
		}
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) throws RuntimeException{
		if(pass == null) {
			throw new RuntimeException("Niste uneli sifru!");
		}
		if(pass.length() < 8) {
			throw new RuntimeException("Sifra mora imati bar 8 karaktera!");
		}
		this.pass = pass;
	}
	public double getKoeficijent() {
		return koeficijent;
	}

	public void setKoeficijent(double koeficijent) {
		this.koeficijent = koeficijent;
	}

	public LinkedList<Film> getFilmovi() {
		return filmovi;
	}

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
	public void ucitajIzFajla(String file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacuvajUFajl(String file) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean equals(Object obj) {
		Korisnik k = (Korisnik) obj;
		if(k.getUsername().equals(username)){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Korisnik [ime=" + ime + ", prezime=" + prezime + ", username=" + username + "]";
	}
	
	
}
