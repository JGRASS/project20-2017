package pretrazivac;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import junit.framework.AssertionFailedError;
import pretrazivac.sistemske_operacije.SOAzurirajPoGledanosti;
import pretrazivac.sistemske_operacije.SOSacuvajKorisnikeUFajl;
import pretrazivac.sistemske_operacije.SOSortirajPoGodini;
import pretrazivac.sistemske_operacije.SOSortirajPoNazivu;
import pretrazivac.sistemske_operacije.SOSortirajPoOceni;

public class PretrazivacTest {
	Pretrazivac p;
	
	@Before
	public void setUp() throws Exception {
		p = new Pretrazivac();
	}

	@After
	public void tearDown() throws Exception {
		p=null;
	}
	

	@Test
	public void testUbaciKorisnika(){
		Korisnik k = new Korisnik();
		k.setIme("Jovana");
		k.setPrezime("Mirovic");
		k.setUsername("jovanam");
		k.setKoeficijent(0);
		k.setPass("jovanam96");
		k.setFilmovi(null);
		assertTrue(p.ubaciKorisnika(k));
	}
	
	@Test
	public void testUbaciKorisnikaIsti(){
		Korisnik k = new Korisnik();
		k.setIme("jovana");
		k.setPrezime("Mirovic");
		k.setUsername("admin");
		k.setKoeficijent(0);
		k.setPass("jovanam96");
		k.setFilmovi(null);
		assertFalse(p.ubaciKorisnika(k));
	}
	
	@Test
	public void testSortirajPoNazivu() {
		Film f1 = new Film();
		f1.setNaziv("La la land");
		f1.setGodina(2016);
		f1.setZanr("comedy, drama, music");
		f1.setBrojPregleda(0);
		f1.setOcena(0);
		f1.setImagepath("/images/LaLaLand.jpg");
		f1.setTrailerpath("https://www.youtube.com/watch?v=0pdqf4P9MB8");
		
		Film f2 = new Film();
		f2.setNaziv("Memento");
		f2.setGodina(2000);
		f2.setZanr("mystery, thriller");
		f2.setBrojPregleda(0);
		f2.setOcena(0);
		f2.setImagepath("/images/Memento.jpg");
		f2.setTrailerpath("https://www.youtube.com/watch?v=0vS0E9bBSL0");		
		
		assertTrue(p.sortirajPoNazivu().indexOf(f1)<p.sortirajPoNazivu().indexOf(f2));
	}
	
	@Test
	public void testSortirajPoGodini() {
		Film f1 = new Film();
		f1.setNaziv("La la land");
		f1.setGodina(2016);
		f1.setZanr("comedy, drama, music");
		f1.setBrojPregleda(0);
		f1.setOcena(0);
		f1.setImagepath("/images/LaLaLand.jpg");
		f1.setTrailerpath("https://www.youtube.com/watch?v=0pdqf4P9MB8");
		
		Film f2 = new Film();
		f2.setNaziv("Memento");
		f2.setGodina(2000);
		f2.setZanr("mystery, thriller");
		f2.setBrojPregleda(0);
		f2.setOcena(0);
		f2.setImagepath("/images/Memento.jpg");
		f2.setTrailerpath("https://www.youtube.com/watch?v=0vS0E9bBSL0");
		
		assertTrue(p.sortirajPoGodini().indexOf(f1)<p.sortirajPoGodini().indexOf(f2));
	}
	
	@Test
	public void testSortirajPoOceni() {
		LinkedList<Film> filmovi = new LinkedList<Film>();
		Film f1 = new Film();
		f1.setNaziv("La la land");
		f1.setGodina(2016);
		f1.setZanr("comedy, drama, music");
		f1.setBrojPregleda(0);
		f1.setOcena(8);
		f1.setImagepath("/images/LaLaLand.jpg");
		f1.setTrailerpath("https://www.youtube.com/watch?v=0pdqf4P9MB8");
		filmovi.add(f1);
		
		Film f2 = new Film();
		f2.setNaziv("Memento");
		f2.setGodina(2000);
		f2.setZanr("mystery, thriller");
		f2.setBrojPregleda(0);
		f2.setOcena(10);
		f2.setImagepath("/images/Memento.jpg");
		f2.setTrailerpath("https://www.youtube.com/watch?v=0vS0E9bBSL0");
		filmovi.add(f2);
		
		p.setFilmovi(filmovi);
		
		assertTrue(p.sortirajPoOceni().indexOf(f1)>p.sortirajPoOceni().indexOf(f2));
	}
	
	@Test
	public void testAzurirajPoGledanosti() {
		LinkedList<Film> filmovi = new LinkedList<Film>();
		Film f1 = new Film();
		f1.setNaziv("La la land");
		f1.setGodina(2016);
		f1.setZanr("comedy, drama, music");
		f1.setBrojPregleda(5);
		f1.setOcena(0);
		f1.setImagepath("/images/LaLaLand.jpg");
		f1.setTrailerpath("https://www.youtube.com/watch?v=0pdqf4P9MB8");
		filmovi.add(f1);
		
		Film f2 = new Film();
		f2.setNaziv("Memento");
		f2.setGodina(2000);
		f2.setZanr("mystery, thriller");
		f2.setBrojPregleda(9);
		f2.setOcena(0);
		f2.setImagepath("/images/Memento.jpg");
		f2.setTrailerpath("https://www.youtube.com/watch?v=0vS0E9bBSL0");
		filmovi.add(f2);
		
		p.setFilmovi(filmovi);
		
		assertTrue(p.azurirajPoGledanosti().indexOf(f1)>p.azurirajPoGledanosti().indexOf(f2));
	}
	
	@Test
	public void testPreporuciNemaPreklapanja() {
		LinkedList<Korisnik> korisnici = new LinkedList<Korisnik>();
		
		LinkedList<Film> filmovi1 = new LinkedList<Film>();
		Film f1 = new Film();
		f1.setNaziv("La la land");
		f1.setGodina(2016);
		f1.setZanr("comedy, drama, music");
		f1.setBrojPregleda(5);
		f1.setOcena(0);
		f1.setImagepath("/images/LaLaLand.jpg");
		f1.setTrailerpath("https://www.youtube.com/watch?v=0pdqf4P9MB8");
		filmovi1.add(f1);
		
		Film f2 = new Film();
		f2.setNaziv("Memento");
		f2.setGodina(2000);
		f2.setZanr("mystery, thriller");
		f2.setBrojPregleda(9);
		f2.setOcena(0);
		f2.setImagepath("/images/Memento.jpg");
		f2.setTrailerpath("https://www.youtube.com/watch?v=0vS0E9bBSL0");
		filmovi1.add(f2);
		
		Korisnik k1 = new Korisnik();
		k1.setIme("Jovana");
		k1.setPrezime("Mitrovic");
		k1.setUsername("jovana");
		k1.setPass("jovanamitrovic");
		k1.setKoeficijent(0);
		k1.setFilmovi(filmovi1);
		korisnici.add(k1);
		
		LinkedList<Film> filmovi2 = new LinkedList<Film>();
		
		Film f3 = new Film();
		f3.setNaziv("Lion");
		f3.setGodina(2016);
		f3.setZanr("biography, drama");
		f3.setBrojPregleda(0);
		f3.setOcena(0);
		f3.setImagepath("/images/Lion.jpg");
		f3.setTrailerpath("https://www.youtube.com/watch?v=-RNI9o06vqo");
		filmovi2.add(f3);
		
		Film f4 = new Film();
		f4.setNaziv("The Prestige");
		f4.setGodina(2006);
		f4.setZanr("mystery, drama, sci-fi");
		f4.setBrojPregleda(0);
		f4.setOcena(0);
		f4.setImagepath("/images/ThePrestige.jpg");
		f4.setTrailerpath("https://www.youtube.com/watch?v=o4gHCmTQDVI");
		filmovi2.add(f4);
		
		Korisnik k2 = new Korisnik();
		k2.setIme("Ana");
		k2.setPrezime("Colovic");
		k2.setUsername("ana");
		k2.setPass("anacolovic");
		k2.setKoeficijent(0);
		k2.setFilmovi(filmovi2);
		korisnici.add(k2);
		
		p.setKorisnici(korisnici);
		
		LinkedList<Film> expected = new LinkedList<Film>();
		for (int i = 0; i < p.getFilmovi().size(); i++) {
			if(k1.getFilmovi().contains(p.getFilmovi().get(i)) == false) {
				expected.add(p.getFilmovi().get(i));
			}
			if(expected.size()==10) {
				break;
			}
		}
		assertEquals(10, p.preporuci(k1).size());
		assertEquals(expected, p.preporuci(k1));
	}
	
	@Test
	public void preporuci() {
		LinkedList<Korisnik> korisnici = new LinkedList<Korisnik>();
		
		LinkedList<Film> filmovi1 = new LinkedList<Film>();
		Film f1 = new Film();
		f1.setNaziv("La la land");
		f1.setGodina(2016);
		f1.setZanr("comedy, drama, music");
		f1.setBrojPregleda(5);
		f1.setOcena(7);
		f1.setImagepath("/images/LaLaLand.jpg");
		f1.setTrailerpath("https://www.youtube.com/watch?v=0pdqf4P9MB8");
		filmovi1.add(f1);
		Korisnik k1 = new Korisnik();
		k1.setIme("Jovana");
		k1.setPrezime("Mitrovic");
		k1.setUsername("jovana");
		k1.setPass("jovanamitrovic");
		k1.setKoeficijent(0);
		k1.setFilmovi(filmovi1);
		korisnici.add(k1);
		
		LinkedList<Film> filmovi2 = new LinkedList<Film>();
		Film f2 = new Film();
		f2.setNaziv("Memento");
		f2.setGodina(2000);
		f2.setZanr("mystery, thriller");
		f2.setBrojPregleda(9);
		f2.setOcena(0);
		f2.setImagepath("/images/Memento.jpg");
		f2.setTrailerpath("https://www.youtube.com/watch?v=0vS0E9bBSL0");
		filmovi2.add(f2);
		Film f3 = new Film();
		f3.setNaziv("Lion");
		f3.setGodina(2016);
		f3.setZanr("biography, drama");
		f3.setBrojPregleda(0);
		f3.setOcena(0);
		f3.setImagepath("/images/Lion.jpg");
		f3.setTrailerpath("https://www.youtube.com/watch?v=-RNI9o06vqo");
		filmovi2.add(f3);
		Film f4 = new Film();
		f4.setNaziv("La la land");
		f4.setGodina(2016);
		f4.setZanr("comedy, drama, music");
		f4.setBrojPregleda(5);
		f4.setOcena(7);
		f4.setImagepath("/images/LaLaLand.jpg");
		f4.setTrailerpath("https://www.youtube.com/watch?v=0pdqf4P9MB8");
		filmovi2.add(f4);
		Korisnik k2 = new Korisnik();
		k2.setIme("Ana");
		k2.setPrezime("Colovic");
		k2.setUsername("ana");
		k2.setPass("anacolovic");
		k2.setKoeficijent(0);
		k2.setFilmovi(filmovi2);
		korisnici.add(k2);
		
		LinkedList<Film> filmovi3 = new LinkedList<Film>();
		Film f5 = new Film();
		f5.setNaziv("La la land");
		f5.setGodina(2016);
		f5.setZanr("comedy, drama, music");
		f5.setBrojPregleda(5);
		f5.setOcena(9);
		f5.setImagepath("/images/LaLaLand.jpg");
		f5.setTrailerpath("https://www.youtube.com/watch?v=0pdqf4P9MB8");
		filmovi3.add(f5);
		Film f6 = new Film();
		f6.setNaziv("Inception");
		f6.setGodina(2010);
		f6.setZanr("action, adventure, sci-fi");
		f6.setBrojPregleda(0);
		f6.setOcena(0);
		f6.setImagepath("/images/Inception.jpg");
		f6.setTrailerpath("https://www.youtube.com/watch?v=YoHD9XEInc0");
		filmovi3.add(f6);
		filmovi3.add(f5);
		Korisnik k3 = new Korisnik();
		k3.setIme("Nikola");
		k3.setPrezime("Nedeljkovic");
		k3.setUsername("nikola");
		k3.setPass("nikolanedeljkovic");
		k3.setKoeficijent(0);
		k3.setFilmovi(filmovi3);
		korisnici.add(k3);
		
		p.setKorisnici(korisnici);
		
		LinkedList<Film> expected = new LinkedList<Film>();
		expected.add(f2);
		expected.add(f3);
		expected.add(f6);
		
		p.setFilmovi(p.azurirajPoGledanosti());
		for (int i = 0; i < p.getFilmovi().size(); i++) {
			if(expected.contains(p.getFilmovi().get(i))==false) {
				expected.addLast(p.getFilmovi().get(i));
			}
			if(expected.size()==10) {
				break;
			}
		}
		
		assertEquals(expected.size(),10);
		assertEquals(expected, p.preporuci(k1));
	}

	public void testIzbaciKorisnika(){
		Korisnik k = new Korisnik();
		k.setIme("Jovana");
		k.setPrezime("Mirovic");
		k.setUsername("jovanam");
		k.setKoeficijent(0);
		k.setPass("jovanam96");
		k.setFilmovi(null);
		p.ubaciKorisnika(k);
		assertEquals(k, p.izbaciKorsnika(k));
	}
	
	@Test
	public void testPretraziPoSvemu(){
		Film f1 = new Film();
		f1.setNaziv("Taken");
		f1.setGodina(2008);
		f1.setBrojPregleda(0);
		f1.setImagepath("/images/Taken.jpg");
		f1.setOcena(0);
		f1.setZanr("action, thriller");
		f1.setTrailerpath("https://www.youtube.com/watch?v=uPJVJBm9TPA");
		assertTrue(p.pretrazi("taken", 2008, "action").contains(f1));
	}
	
	@Test
	public void testPretraziPoGodini(){
		Film f1 = new Film();
		f1.setNaziv("Taken");
		f1.setGodina(2008);
		f1.setBrojPregleda(0);
		f1.setImagepath("/images/Taken.jpg");
		f1.setOcena(0);
		f1.setZanr("action, thriller");
		f1.setTrailerpath("https://www.youtube.com/watch?v=uPJVJBm9TPA");
		
		Film f8 = new Film();
		f8.setNaziv("The Dark Knight");
		f8.setGodina(2008);
		f8.setZanr("action, crime, drama");
		f8.setBrojPregleda(0);
		f8.setOcena(0);
		f8.setImagepath("/images/TheDarkKnight.jpg");
		f8.setTrailerpath("https://www.youtube.com/watch?v=EXeTwQWrcwY");
		
		assertTrue(p.pretrazi(null, 2008, null).contains(f1) && p.pretrazi(null, 2008, null).contains(f8));
	}
	
	@Test
	public void testPretraziPoNazivu(){
		Film f4 = new Film();
		f4.setNaziv("The Prestige");
		f4.setGodina(2006);
		f4.setZanr("mystery, drama, sci-fi");
		f4.setBrojPregleda(0);
		f4.setOcena(0);
		f4.setImagepath("/images/ThePrestige.jpg");
		f4.setTrailerpath("https://www.youtube.com/watch?v=o4gHCmTQDVI");
		
		assertTrue(p.pretrazi("he",0, null).contains(f4));
	}
	
	@Test
	public void testPretraziPoZanru(){
		Film f4 = new Film();
		f4.setNaziv("The Prestige");
		f4.setGodina(2006);
		f4.setZanr("mystery, drama, sci-fi");
		f4.setBrojPregleda(0);
		f4.setOcena(0);
		f4.setImagepath("/images/ThePrestige.jpg");
		f4.setTrailerpath("https://www.youtube.com/watch?v=o4gHCmTQDVI");
		
		assertTrue(p.pretrazi(null, 0, "drama").contains(f4));
	}
	
	@Test
	public void testUcitajISacuvajKorisnikeUFajla() {
		LinkedList<Korisnik> korisnici = new LinkedList<Korisnik>();
		
		LinkedList<Film> filmovi1 = new LinkedList<Film>();
		Film f1 = new Film();
		f1.setNaziv("La la land");
		f1.setGodina(2016);
		f1.setZanr("comedy, drama, music");
		f1.setBrojPregleda(5);
		f1.setOcena(0);
		f1.setImagepath("/images/LaLaLand.jpg");
		f1.setTrailerpath("https://www.youtube.com/watch?v=0pdqf4P9MB8");
		filmovi1.add(f1);
		Korisnik k1 = new Korisnik();
		k1.setIme("Jovana");
		k1.setPrezime("Mitrovic");
		k1.setUsername("jovana");
		k1.setPass("jovanamitrovic");
		k1.setKoeficijent(0);
		k1.setFilmovi(filmovi1);
		korisnici.add(k1);
		p.setKorisnici(korisnici);
		p.sacuvajKorisnikeUFajl("test.out");
		assertEquals(korisnici, p.ucitajKorisnikeIzFajla("test.out"));
	}
	
	@Test
	public void testUcitajISacuvajFilmoveUFajl() {
		LinkedList<Film> filmovi = new LinkedList<Film>();
		Film f1 = new Film();
		f1.setNaziv("Taken");
		f1.setGodina(2008);
		f1.setBrojPregleda(0);
		f1.setImagepath("/images/Taken.jpg");
		f1.setOcena(0);
		f1.setZanr("action, thriller");
		f1.setTrailerpath("https://www.youtube.com/watch?v=uPJVJBm9TPA");
		filmovi.add(f1);
		p.setFilmovi(filmovi);
		p.sacuvajFilmoveUFajl("test.out");
		assertEquals(filmovi, p.ucitajFilmoveIzFajla("test.out"));
	}
	
	@Test
	public void testAzurirajDodavanjeFilma(){
		Film f1 = p.getFilmovi().get(1);
		p.azurirajDodavanjeFilma(f1, 10);
		int index = p.getFilmovi().indexOf(f1);
		assertTrue(f1.getOcena()==p.getFilmovi().get(index).getOcena() && f1.getBrojPregleda()==p.getFilmovi().get(index).getBrojPregleda());
	}
	
	@Test
	public void testAzurirajDodavanjeFilmaVise(){
		Film f1 = p.getFilmovi().get(1);
		p.azurirajDodavanjeFilma(f1, 10);
		p.azurirajDodavanjeFilma(f1, 8);
		int index = p.getFilmovi().indexOf(f1);
		assertTrue(f1.getOcena()==p.getFilmovi().get(index).getOcena() && f1.getBrojPregleda()==p.getFilmovi().get(index).getBrojPregleda());
	}

	@Test
	public void testResetujKoeficijente() {
		LinkedList<Korisnik> korisnici = new LinkedList<Korisnik>();
		LinkedList<Film> filmovi1 = new LinkedList<Film>();
		Film f1 = new Film();
		f1.setNaziv("La la land");
		f1.setGodina(2016);
		f1.setZanr("comedy, drama, music");
		f1.setBrojPregleda(5);
		f1.setOcena(0);
		f1.setImagepath("/images/LaLaLand.jpg");
		f1.setTrailerpath("https://www.youtube.com/watch?v=0pdqf4P9MB8");
		filmovi1.add(f1);
		Korisnik k1 = new Korisnik();
		k1.setIme("Jovana");
		k1.setPrezime("Mitrovic");
		k1.setUsername("jovana");
		k1.setPass("jovanamitrovic");
		k1.setKoeficijent(7);
		k1.setFilmovi(filmovi1);
		korisnici.add(k1);
		
		LinkedList<Film> filmovi2 = new LinkedList<Film>();
		Film f2 = new Film();
		f2.setNaziv("Memento");
		f2.setGodina(2000);
		f2.setZanr("mystery, thriller");
		f2.setBrojPregleda(9);
		f2.setOcena(0);
		f2.setImagepath("/images/Memento.jpg");
		f2.setTrailerpath("https://www.youtube.com/watch?v=0vS0E9bBSL0");
		filmovi2.add(f2);
		Film f3 = new Film();
		f3.setNaziv("Lion");
		f3.setGodina(2016);
		f3.setZanr("biography, drama");
		f3.setBrojPregleda(0);
		f3.setOcena(0);
		f3.setImagepath("/images/Lion.jpg");
		f3.setTrailerpath("https://www.youtube.com/watch?v=-RNI9o06vqo");
		filmovi2.add(f3);
		Film f4 = new Film();
		f4.setNaziv("La la land");
		f4.setGodina(2016);
		f4.setZanr("comedy, drama, music");
		f4.setBrojPregleda(5);
		f4.setOcena(7);
		f4.setImagepath("/images/LaLaLand.jpg");
		f4.setTrailerpath("https://www.youtube.com/watch?v=0pdqf4P9MB8");
		filmovi2.add(f4);
		Korisnik k2 = new Korisnik();
		k2.setIme("Ana");
		k2.setPrezime("Colovic");
		k2.setUsername("ana");
		k2.setPass("anacolovic");
		k2.setKoeficijent(9);
		k2.setFilmovi(filmovi2);
		korisnici.add(k2);
		
		p.setKorisnici(korisnici);
		korisnici.get(0).setKoeficijent(0);
		korisnici.get(1).setKoeficijent(0);
		
		assertEquals(korisnici, p.resetujKoeficijent());
		
	}
}