package pretrazivac.interfejsi;

import java.util.LinkedList;

import pretrazivac.Film;

/**
 * Interfejs KorisnikInterfejs koji sadrzi svoje metode
 * @author Jovana Mitrovic
 *
 */
public interface KorisnikInterfejs {
	/**
	 * Metoda koja dodaje film u listu filmova
	 * @param f objekat klase Film koji se dodaje u listu
	 * @return <ul>
	 * <li> true - ako je film dodat u listu
	 * <li> false - ako vec postoji ddati film u listi
	 * </ul>
	 */
	public boolean dodajFilm(Film f);
	/**
	 * Metoda koja brise film iz liste filmova
	 * @param f objekat klase Film koji se brise iz liste
	 * @return vraca obrisanog korisnika
	 */
	public Film obrisiFilm(Film f);
	/**
	 * Metoda koja pretrazuje listu filmova
	 * @param naziv naziv filma koji se pretrazuje kao String
	 * @param godina godina filma koja se pretrazuje kao int
	 * @param zanr zanr filma koji se pretrazuje kao Stirng
	 * @return vraca listu filmova koji odgovaraju pretrazi
	 */
	public LinkedList<Film> pretrazi(String naziv, int godina, String zanr);
	/**
	 * Metoda koja sortira listu filmova po nazivu
	 * @return vraca sortiranu listu filmova
	 */
	public LinkedList<Film> sortirajPoNazivu();
	/**
	 * Metoda koja sortira listu filmova po godini
	 * @return vraca sortiranu listu filmova
	 */
	public LinkedList<Film> sortirajPoGodini();
	
	/**
	 * Metoda koja sortira listu filmova po oceni
	 * @return vraca sortiranu listu filmova
	 */
	public LinkedList<Film> sortirajPoOceni();
	
	/**
	 * Metoda koja sortira listu filmova po popularnosti
	 * @return vraca sortiranu listu filmova
	 */
	public LinkedList<Film> sortirajPoPopularnosti();
	
	
}
