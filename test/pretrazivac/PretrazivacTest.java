package pretrazivac;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
	public void testPretraziPoSvemu(){
		Film f3 = new Film();
		f3.setNaziv("Love");
		f3.setGodina(2016);
		f3.setBrojPregleda(1);
		f3.setImagepath("/data/filmovi.dat");
		f3.setOcena(6);
		f3.setZanr("komedija");
		f3.setTrailerpath("/data/filmovi.dat");
		
		assertEquals(f3, p.pretrazi("Love", 2016, "komedija").get(0));
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
		
		Film f3 = new Film();
		f3.setNaziv("Love");
		f3.setGodina(2016);
		f3.setBrojPregleda(1);
		f3.setImagepath("/data/filmovi.dat");
		f3.setOcena(6);
		f3.setZanr("komedija");
		f3.setTrailerpath("/data/filmovi.dat");
		
		LinkedList<Film> filmici = p.pretrazi(null, 2016, null);
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
		
		Film f2 = new Film();
		f2.setNaziv("Taken 2");
		f2.setGodina(2014);
		f2.setBrojPregleda(1);
		f2.setImagepath("/data/filmovi.dat");
		f2.setOcena(9);
		f2.setZanr("horor");
		f2.setTrailerpath("/data/filmovi.dat");
		
		LinkedList<Film> filmici = p.pretrazi("Taken", 0, null);
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
		
		Film f2 = new Film();
		f2.setNaziv("Taken 2");
		f2.setGodina(2014);
		f2.setBrojPregleda(1);
		f2.setImagepath("/data/filmovi.dat");
		f2.setOcena(9);
		f2.setZanr("horor");
		f2.setTrailerpath("/data/filmovi.dat");
		
		LinkedList<Film> filmici = p.pretrazi(null, 0, "horor");
		assertTrue(filmici.contains(f1) && filmici.contains(f2));
	}
}
