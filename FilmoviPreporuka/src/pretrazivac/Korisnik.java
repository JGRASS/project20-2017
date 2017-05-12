package pretrazivac;

import java.util.LinkedList;

import pretrazivac.interfejsi.KorisnikInterfejs;

public class Korisnik implements KorisnikInterfejs {
	private String ime;
	private String prezime;
	private String username;
	private String pass;
	private int brojPreklapanja;
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
	public int getBrojPreklapanja() {
		return brojPreklapanja;
	}

	public void setBrojPreklapanja(int brojPreklapanja) {
		this.brojPreklapanja = brojPreklapanja;
	}
	
	public LinkedList<Film> getFilmovi() {
		return filmovi;
	}

	public void setFilmovi(LinkedList<Film> filmovi) {
		this.filmovi = filmovi;
	}
	
	@Override
	public boolean dodajFilm(Film f) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Film obrisiFilm(Film f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<Film> pretrazi(String naziv, int godina, String zanr) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public LinkedList<Film> sortirajPoNazivu() {
		return null;
	}

	@Override
	public LinkedList<Film> sortirajPoZanru() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ucitajIzFajla(String file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacuvajUFajl(String file) {
		// TODO Auto-generated method stub
		
	}
}
