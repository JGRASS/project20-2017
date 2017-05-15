package pretrazivac;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;

public class KorisnikTest {
	Korisnik k;
	
	@Before
	public void setUp() throws Exception {
		k = new Korisnik();
	}

	@After
	public void tearDown() throws Exception {
		k=null;
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetImeNull(){
		k.setIme(null);
	}
	
	@Test
	public void testSetIme(){
		k.setIme("Ana");
		assertEquals("Ana",k.getIme());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrezimeNull(){
		k.setPrezime(null);
	}
	
	@Test
	public void testSetPrezime(){
		k.setPrezime("Colovic");
		assertEquals("Colovic",k.getPrezime());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetUsernameNull(){
		k.setUsername(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetUsernameRazmak(){
		k.setUsername("Ana Colovic");
	}
	
	@Test
	public void testSetUsername(){
		k.setUsername("AnaColovic");
		assertEquals("AnaColovic",k.getUsername());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPassNull(){
		k.setPass(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPassKratka(){
		k.setPass("123");
	}
	
	@Test
	public void testSetPass(){
		k.setPass("AnaColovic");
		assertEquals("AnaColovic", k.getPass());
	}
	
	@Test
	public void testDodajFilmPraznaLista(){
		Film f1 = new Film();
		f1.setNaziv("Taken");
		f1.setGodina(2008);
		f1.setBrojPregleda(1);
		f1.setImagepath("/data/filmovi.dat");
		f1.setOcena(9);
		f1.setZanr("triler");
		f1.setTrailerpath("/data/filmovi.dat");
	
		assertTrue(k.dodajFilm(f1));
	}
	
	@Test
	public void testDodajFilmIsti(){
		Film f1 = new Film();
		f1.setNaziv("Taken");
		f1.setGodina(2008);
		f1.setBrojPregleda(1);
		f1.setImagepath("/data/filmovi.dat");
		f1.setOcena(9);
		f1.setZanr("triler");
		f1.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f1);
		
		Film f2 = new Film();
		f2.setNaziv("Taken");
		f2.setGodina(2008);
		f2.setBrojPregleda(1);
		f2.setImagepath("/data/filmovi.dat");
		f2.setOcena(9);
		f2.setZanr("triler");
		f2.setTrailerpath("/data/filmovi.dat");
		
		assertFalse(k.dodajFilm(f2));
	}
	
	@Test
	public void testDodajFilm(){
		Film f1 = new Film();
		f1.setNaziv("Taken");
		f1.setGodina(2008);
		f1.setBrojPregleda(1);
		f1.setImagepath("/data/filmovi.dat");
		f1.setOcena(6);
		f1.setZanr("triler");
		f1.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f1);
		
		Film f2 = new Film();
		f2.setNaziv("Horror");
		f2.setGodina(2015);
		f2.setBrojPregleda(1);
		f2.setImagepath("/data/filmovi.dat");
		f2.setOcena(9);
		f2.setZanr("horor");
		f2.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f2);
		
		Film f3 = new Film();
		f3.setNaziv("Love");
		f3.setGodina(2016);
		f3.setBrojPregleda(1);
		f3.setImagepath("/data/filmovi.dat");
		f3.setOcena(6);
		f3.setZanr("komedija");
		f3.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f3);
		
		assertEquals(f3, k.getFilmovi().get(1));
	}

	@Test
	public void testObrisiFilm(){
		Film f3 = new Film();
		f3.setNaziv("Love");
		f3.setGodina(2016);
		f3.setBrojPregleda(1);
		f3.setImagepath("/data/filmovi.dat");
		f3.setOcena(6);
		f3.setZanr("komedija");
		f3.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f3);
		
		assertEquals(f3, k.obrisiFilm(f3));
	}
	
	@Test
	public void testSortirajPoNazivu(){
		Film f1 = new Film();
		f1.setNaziv("Taken");
		f1.setGodina(2008);
		f1.setBrojPregleda(1);
		f1.setImagepath("/data/filmovi.dat");
		f1.setOcena(6);
		f1.setZanr("triler");
		f1.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f1);
		
		Film f2 = new Film();
		f2.setNaziv("Horror");
		f2.setGodina(2015);
		f2.setBrojPregleda(1);
		f2.setImagepath("/data/filmovi.dat");
		f2.setOcena(9);
		f2.setZanr("horor");
		f2.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f2);
		
		Film f3 = new Film();
		f3.setNaziv("Love");
		f3.setGodina(2016);
		f3.setBrojPregleda(1);
		f3.setImagepath("/data/filmovi.dat");
		f3.setOcena(6);
		f3.setZanr("komedija");
		f3.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f3);
		
		Film[] filmovi = new Film[3];
		filmovi[0]=k.sortirajPoNazivu().get(0);
		filmovi[1]=k.sortirajPoNazivu().get(1);
		filmovi[2]=k.sortirajPoNazivu().get(2);
		
		assertArrayEquals(new Film[]{f2,f3,f1}, filmovi);
	}
	
	@Test
	public void testSortirajPoGodini(){
		Film f1 = new Film();
		f1.setNaziv("Taken");
		f1.setGodina(2016);
		f1.setBrojPregleda(1);
		f1.setImagepath("/data/filmovi.dat");
		f1.setOcena(6);
		f1.setZanr("triler");
		f1.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f1);
		
		Film f2 = new Film();
		f2.setNaziv("Horror");
		f2.setGodina(2003);
		f2.setBrojPregleda(1);
		f2.setImagepath("/data/filmovi.dat");
		f2.setOcena(9);
		f2.setZanr("horor");
		f2.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f2);
		
		Film f3 = new Film();
		f3.setNaziv("Love");
		f3.setGodina(2014);
		f3.setBrojPregleda(1);
		f3.setImagepath("/data/filmovi.dat");
		f3.setOcena(6);
		f3.setZanr("komedija");
		f3.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f3);
		
		Film[] filmovi = new Film[3];
		filmovi[0]=k.sortirajPoGodini().get(0);
		filmovi[1]=k.sortirajPoGodini().get(1);
		filmovi[2]=k.sortirajPoGodini().get(2);
		
		assertArrayEquals(new Film[]{f1,f3,f2}, filmovi);
	}
	@Test
	public void testPretraziPoSvemu(){
		Film f1 = new Film();
		f1.setNaziv("Taken");
		f1.setGodina(2008);
		f1.setBrojPregleda(1);
		f1.setImagepath("/data/filmovi.dat");
		f1.setOcena(6);
		f1.setZanr("triler drama horor");
		f1.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f1);
		
		Film f2 = new Film();
		f2.setNaziv("Horror");
		f2.setGodina(2015);
		f2.setBrojPregleda(1);
		f2.setImagepath("/data/filmovi.dat");
		f2.setOcena(9);
		f2.setZanr("horor");
		f2.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f2);
		
		Film f3 = new Film();
		f3.setNaziv("Love");
		f3.setGodina(2016);
		f3.setBrojPregleda(1);
		f3.setImagepath("/data/filmovi.dat");
		f3.setOcena(6);
		f3.setZanr("komedija");
		f3.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f3);
		
		assertEquals(f3, k.pretrazi("Love", 2016, "komedija").get(0));
	}
	
	@Test
	public void testPretraziPoGodini(){
		Film f1 = new Film();
		f1.setNaziv("Taken");
		f1.setGodina(2016);
		f1.setBrojPregleda(1);
		f1.setImagepath("/data/filmovi.dat");
		f1.setOcena(6);
		f1.setZanr("triler drama horor");
		f1.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f1);
		
		Film f2 = new Film();
		f2.setNaziv("Horror");
		f2.setGodina(2014);
		f2.setBrojPregleda(1);
		f2.setImagepath("/data/filmovi.dat");
		f2.setOcena(9);
		f2.setZanr("horor");
		f2.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f2);
		
		Film f3 = new Film();
		f3.setNaziv("Love");
		f3.setGodina(2016);
		f3.setBrojPregleda(1);
		f3.setImagepath("/data/filmovi.dat");
		f3.setOcena(6);
		f3.setZanr("komedija");
		f3.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f3);
		
		LinkedList<Film> filmici = k.pretrazi(null, 2016, null);
		assertTrue(filmici.contains(f1) && filmici.contains(f3));
	}
	
	@Test
	public void testPretraziPoNazivu(){
		Film f1 = new Film();
		f1.setNaziv("Taken");
		f1.setGodina(2016);
		f1.setBrojPregleda(1);
		f1.setImagepath("/data/filmovi.dat");
		f1.setOcena(6);
		f1.setZanr("triler drama horor");
		f1.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f1);
		
		Film f2 = new Film();
		f2.setNaziv("Taken 2");
		f2.setGodina(2014);
		f2.setBrojPregleda(1);
		f2.setImagepath("/data/filmovi.dat");
		f2.setOcena(9);
		f2.setZanr("horor");
		f2.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f2);
		
		Film f3 = new Film();
		f3.setNaziv("Love");
		f3.setGodina(2016);
		f3.setBrojPregleda(1);
		f3.setImagepath("/data/filmovi.dat");
		f3.setOcena(6);
		f3.setZanr("komedija");
		f3.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f3);
		
		LinkedList<Film> filmici = k.pretrazi("Taken", 0, null);
		assertTrue(filmici.contains(f1) && filmici.contains(f2));
	}
	
	@Test
	public void testPretraziPoZanru(){
		Film f1 = new Film();
		f1.setNaziv("Taken");
		f1.setGodina(2016);
		f1.setBrojPregleda(1);
		f1.setImagepath("/data/filmovi.dat");
		f1.setOcena(6);
		f1.setZanr("triler drama horor");
		f1.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f1);
		
		Film f2 = new Film();
		f2.setNaziv("Taken 2");
		f2.setGodina(2014);
		f2.setBrojPregleda(1);
		f2.setImagepath("/data/filmovi.dat");
		f2.setOcena(9);
		f2.setZanr("horor");
		f2.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f2);
		
		Film f3 = new Film();
		f3.setNaziv("Love");
		f3.setGodina(2016);
		f3.setBrojPregleda(1);
		f3.setImagepath("/data/filmovi.dat");
		f3.setOcena(6);
		f3.setZanr("komedija");
		f3.setTrailerpath("/data/filmovi.dat");
		k.dodajFilm(f3);
		
		LinkedList<Film> filmici = k.pretrazi(null, 0, "horor");
		assertTrue(filmici.contains(f1) && filmici.contains(f2));
	}
	
	@Test
	public void testEqualsTrue(){
		k.setUsername("AnaCola");
		Korisnik korisnik = new Korisnik();
		korisnik.setUsername("anacola");
		assertTrue(k.equals(korisnik));
	}
	
	@Test
	public void testEqualsFalse(){
		k.setUsername("AnaCola");
		Korisnik korisnik = new Korisnik();
		korisnik.setUsername("ana123cola");
		assertFalse(k.equals(korisnik));
	}
	
}
