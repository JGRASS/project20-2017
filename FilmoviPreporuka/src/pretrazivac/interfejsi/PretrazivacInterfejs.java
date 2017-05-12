package pretrazivac.interfejsi;

import java.util.LinkedList;

import pretrazivac.Film;
import pretrazivac.Korisnik;

public interface PretrazivacInterfejs {
	public boolean ubaciKorisnika(Korisnik k);
	public Korisnik izbaciKorsnika(Korisnik k);
	public LinkedList<Film> pretrazi(String naziv, int godina, String zanr);
	public LinkedList<Film> preporuci(Korisnik k);
	public LinkedList<Film> sortirajPoAbecedi();
	public LinkedList<Film> sortirajPoGodini();
	public LinkedList<Film> sortirajPoOceni();
	public LinkedList<Film> azurirajPoGledanosti();
	
	public LinkedList<Film> ucitajFilmoveIzFajla(String fajl);
	public LinkedList<Korisnik> ucitajKorisnikeIzFajla(String fajl);
	public void sacuvajFilmoveUFajl(String fajl);
	public void sacuvajKorisnikeUFajl(String fajl);
	
}
