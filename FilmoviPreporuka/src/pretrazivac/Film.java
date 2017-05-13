package pretrazivac;

import java.util.GregorianCalendar;

public class Film {
	private String naziv;
	private String zanr;
	private int godina;
	private double ocena;
	private int brojPregleda;
	private String imagepath;
	private String trailerpath;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) throws RuntimeException{
		if(naziv == null) {
			throw new RuntimeException("Niste uneli naziv filma!");
		}
		this.naziv = naziv;

	}
	public String getZanr() {
		return zanr;
	}
	public void setZanr(String zanr) throws RuntimeException{
		if(zanr == null) {
			throw new RuntimeException("Niste uneli zanr filma!");
		}
		this.zanr = zanr;
	}
	public int getGodina() {
		return godina;
	}
	public void setGodina(int godina) throws RuntimeException {
		if(godina < 1900 || godina > new GregorianCalendar().get(GregorianCalendar.YEAR)) {
			throw new RuntimeException("Ne postoji film iz ove godine!");
		}
		this.godina = godina;
	}
	public double getOcena() {
		return ocena;
	}
	public void setOcena(double ocena) throws RuntimeException {
		if(ocena<1 || ocena>10) {
			throw new RuntimeException("Ocena mora biti u opsegu od 1 do 10!");
		}
		this.ocena = ocena;
	}
	public int getBrojPregleda() {
		return brojPregleda;
	}
	public void setBrojPregleda(int brojPregleda) {
		this.brojPregleda = brojPregleda;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) throws RuntimeException{
		if(imagepath == null) {
			throw new RuntimeException("Niste uneli sliku!");
		}
		this.imagepath = imagepath;
	}
	public String getTrailerpath() {
		return trailerpath;
	}
	public void setTrailerpath(String trailerpath) throws RuntimeException{
		if(trailerpath == null) {
			throw new RuntimeException("Niste uneli trailer");
		}
		this.trailerpath = trailerpath;
	}
	@Override
	public String toString() {
		return "Film [ocena=" + ocena + "]";
	}
	
	
	
	
}
