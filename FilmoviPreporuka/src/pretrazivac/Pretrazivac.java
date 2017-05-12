package pretrazivac;

import java.util.LinkedList;

import pretrazivac.interfejsi.PretrazivacInterfejs;

public class Pretrazivac implements PretrazivacInterfejs{
	private LinkedList<Film> filmovi;
	private LinkedList<Korisnik> korisnici;
	
	public Pretrazivac() {
		filmovi = ucitajFilmoveIzFajla("data/filmovi");
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
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Korisnik izbaciKorsnika(Korisnik k) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public LinkedList<Film> pretrazi(String naziv, int godina, String zanr) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public LinkedList<Film> preporuci(Korisnik k) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public LinkedList<Film> sortirajPoAbecedi() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public LinkedList<Film> sortirajPoGodini() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public LinkedList<Film> sortirajPoOceni() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public LinkedList<Film> azurirajPoGledanosti() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<Film> ucitajFilmoveIzFajla(String fajl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<Korisnik> ucitajKorisnikeIzFajla(String fajl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sacuvajFilmoveUFajl(String fajl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacuvajKorisnikeUFajl(String fajl) {
		// TODO Auto-generated method stub
		
	}
}
