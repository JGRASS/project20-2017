package pretrazivac;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.AssertionFailedError;

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
	
	
}
