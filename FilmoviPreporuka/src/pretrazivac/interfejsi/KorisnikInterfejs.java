package pretrazivac.interfejsi;

import java.util.LinkedList;

import pretrazivac.Film;

public interface KorisnikInterfejs {
	public boolean dodajFilm(Film f);
	public Film obrisiFilm(Film f);
	public LinkedList<Film> pretrazi(String naziv, int godina, String zanr);
	public LinkedList<Film> sortirajPoNazivu();
	public LinkedList<Film> sortirajPoGodini();
	
}
