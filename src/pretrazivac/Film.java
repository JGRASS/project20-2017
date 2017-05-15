package pretrazivac;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 * Klasa Film predstavlja domensku klasu koja sadrzi atribute Filma i njegove gettere i settere
 * @author Ana Colovic
 *
 */
public class Film implements Serializable{
	/**
	 * Atribut naziv predstavlja naziv filma
	 */
	private String naziv;
	/**
	 * Atribut zanr predstavlja zanr filma
	 */
	private String zanr;
	/**
	 * Atribut godina predstavlja godinu kada je film izasao
	 */
	private int godina;
	/**
	 * Atribut ocena prestavlja ocenu filma od strane korisnika
	 */
	private double ocena;
	/**
	 * Atribut brojPregleda se odnosi na to koliko je puta film pregledan od strane korisnika
	 */
	private int brojPregleda;
	/**
	 * Atribut imagepath predstavlja putanju do slike filma
	 */
	private String imagepath;
	/**
	 * Atribut trailerpath predstavlja putanju do trejlera filma
	 */
	private String trailerpath;
	
	/**
	 * Metoda vraca naziv filma
	 * @return naziv filma kao String
	 */
	public String getNaziv() {
		return naziv;
	}
	/**
	 * Metoda postavlja naziv filma na uneti naziv
	 * @param naziv predstavlja naziv film kao String
	 * @throws RuntimeException
	 * <ul>
	 * <li> kada je uneti naziv null vrednost
	 * </ul>
	 */
	public void setNaziv(String naziv) throws RuntimeException{
		if(naziv == null) {
			throw new RuntimeException("Niste uneli naziv filma!");
		}
		this.naziv = naziv;

	}
	/**
	 * Metoda vraca zanr filma
	 * @return zanr filma kao String
	 */
	public String getZanr() {
		return zanr;
	}
	/**
	 * Metoda postavlja zanr filma na unetu vrednost
	 * @param zanr predstavlja zanr filma kao String
	 * @throws RuntimeException
	 * <ul>
	 * <li> kada je uneti zanr filma null vrednost
	 * </ul>
	 */
	public void setZanr(String zanr) throws RuntimeException{
		if(zanr == null) {
			throw new RuntimeException("Niste uneli zanr filma!");
		}
		this.zanr = zanr;
	}
	/**
	 * Metoda vraca godinu kada je film izasao
	 * @return godinu kao int
	 */
	public int getGodina() {
		return godina;
	}
	/**
	 * Metoda postavlja vrednost godine na unetu vrednost
	 * @param godina predstavlja godinu kada je film izasao
	 * @throws RuntimeException
	 * <ul>
	 * <li> kada je uneta godina manja od 1900
	 * <li> kada je uneta godina veca od trenutna godine
	 * </ul>
	 */
	public void setGodina(int godina) throws RuntimeException {
		if(godina < 1900 || godina > new GregorianCalendar().get(GregorianCalendar.YEAR)) {
			throw new RuntimeException("Ne postoji film iz ove godine!");
		}
		this.godina = godina;
	}
	/**
	 * Metoda vraca ocenu filma
	 * @return ocena filma kao double
	 */
	public double getOcena() {
		return ocena;
	}
	/**
	 * Metoda postavlja ocenu na unetu vrednost
	 * @param ocena predstavlja ocenu filma od strane korisnika
	 * @throws RuntimeException
	 * <ul>
	 * <li> kada ocena nije izmedju 1 i 10
	 * </ul>
	 */
	public void setOcena(double ocena) throws RuntimeException {
		if(ocena<0 || ocena>10) {
			throw new RuntimeException("Ocena mora biti u opsegu od 1 do 10!");
		}
		this.ocena = ocena;
	}
	/**
	 * Metoda vraca broj pregleda filma
	 * @return broj pregleda kao int
	 */
	public int getBrojPregleda() {
		return brojPregleda;
	}
	/**
	 * Metoda postavlja broj pregleda na unetu vrednost
	 * @param brojPregleda predstavlja broj pregleda filma
	 */
	public void setBrojPregleda(int brojPregleda) {
		this.brojPregleda = brojPregleda;
	}
	/**
	 * Metoda vraca putanju do slike filma
	 * @return putanju do slike filma kao String
	 */
	public String getImagepath() {
		return imagepath;
	}
	/**
	 * Metoda postavlja putanju do slike na unetu vrednost
	 * @param imagepath predstavlja putanju do slike kao String
	 * @throws RuntimeException 
	 * <ul>
	 * <li> kada je uneta putanja null vrednost
	 * </ul>
	 */
	public void setImagepath(String imagepath) throws RuntimeException{
		if(imagepath == null) {
			throw new RuntimeException("Niste uneli sliku!");
		}
		this.imagepath = imagepath;
	}
	/**
	 * Metoda vraca putanju do slike
	 * @return putanju do slike kao String
	 */
	public String getTrailerpath() {
		return trailerpath;
	}
	/**
	 * Metoda postavlja putanju do trejelra na unetu vrednost
	 * @param trailerpath predstavlja putanju do trejlera filma
	 * @throws RuntimeException
	 * <ul>
	 * <li>kada je uneta putanja null vrednost
	 * </ul>
	 */
	public void setTrailerpath(String trailerpath) throws RuntimeException{
		if(trailerpath == null) {
			throw new RuntimeException("Niste uneli trailer");
		}
		this.trailerpath = trailerpath;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Film f = (Film) obj;
		if(f.getGodina()==godina && f.getNaziv().equalsIgnoreCase(naziv) && f.getZanr().equals(zanr)){
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Film [naziv=" + naziv + ", zanr=" + zanr + ", godina=" + godina + ", ocena=" + ocena + ", brojPregleda="
				+ brojPregleda + "]";
	}
	
}
