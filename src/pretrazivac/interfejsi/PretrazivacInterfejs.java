package pretrazivac.interfejsi;

import java.util.LinkedList;

import pretrazivac.Film;
import pretrazivac.Korisnik;
/**
 * Interfejs PretrazivacInterfejs koji sadrzi svoje metode
 * @author Jovana Mitrovic
 *
 */
public interface PretrazivacInterfejs {
	/**
	 * 	Metoda koja ubacuje korisnika na kraj liste svih korisnika ukoliko vec ne postoji
	 * @param k objekat klase Korisnik koji se ubacuje u listu
	 * @return <ul>
	 * <li> true - ako je korisnik dodat u listu
	 * <li> false - ako vec postoji dati korisnik u listi
	 * </ul>
	 */
	public boolean ubaciKorisnika(Korisnik k);
	/**
	 * Metoda koja izbacuje korisnika iz liste svih korisnika
	 * @param k objekat klase Korisnik koji se izbacuje iz liste
	 * @return vraca izbacenog korisnika
	 */
	public Korisnik izbaciKorsnika(Korisnik k);
	/**
	 * Metoda koja pretrazuje listu filmova
	 * @param naziv naziv filma koji se pretrazuje kao String
	 * @param godina godina filma koja se pretrazuje kao int
	 * @param zanr zanr filma koji se pretrazuje kao Stirng
	 * @return vraca listu filmova koji odgovaraju pretrazi
	 */
	public LinkedList<Film> pretrazi(String naziv, int godina, String zanr);
	/**
	 * Metoda koja preporucuje korisniku listu filmova 
	 * @param k objekat klase Korisnik kome se preporucuju filmovi
	 * @return vraca listu preporucenih filmova
	 */
	public LinkedList<Film> preporuci(Korisnik k);
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
	 * Metoda koja azurira listu filmova po gledanosti
	 * @return vraca azuriranu listu filmova
	 */
	public LinkedList<Film> azurirajPoGledanosti();
	/**
	 * Metoda koja ucitava filmove iz fajla
	 * @param fajl naziv fajla iz koga se vrsi ucitavanje 
	 * @return vraca azuriranu listu filmova 
	 */
	public LinkedList<Film> ucitajFilmoveIzFajla(String fajl);
	/**
	 * Metoda koja ucitava korisnike iz fajla
	 * @param fajl naziv fajla iz koga se vrsi ucitavanje 
	 * @return vraca azuriranu listu korisnika
	 */
	public LinkedList<Korisnik> ucitajKorisnikeIzFajla(String fajl);
	/**
	 * Metoda koja cuva filmove u fajl
	 * @param fajl naziv fajla u kome se cuvaju filmovi
	 */
	public void sacuvajFilmoveUFajl(String fajl);
	/**
	 * Metoda koja cuva korisnike u fajl
	 * @param fajl naziv fajla u kome se cuvaju korisnici 
	 */
	public void sacuvajKorisnikeUFajl(String fajl);
	public void azurirajDodavanjeFilma(Film f, double ocena);
}
